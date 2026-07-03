/*
 * Copyright 2025 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package findyourninumberacceptancetests.utils

import java.io.{File, PrintWriter}
import java.util.regex.{Matcher, Pattern}
import scala.io.Source
import scala.util.Using
import scala.collection.immutable.ArraySeq
import scala.jdk.CollectionConverters._

object InjectStepDefsIntoSpecs {

  // === CONFIGURATION (mutable for CLI overrides) ===
  var autoChooseBest: Boolean = false
  var matchThreshold: Double  = 0.45

  // === REGEXES ===
  private val stepLinePattern    = """^(\s*)(Given|When|Then|And)\("(.+)"\).*""".r
  private val stepCommentPattern = """^\s*//\s*\^?(.*?)\$?\s*$""".r
  private val defPattern         = """^\s*def\s+([A-Za-z0-9_]+)\s*(\(([^)]*)\))?\s*[:=].*""".r

  // === MODEL ===
  case class StepDef(
    patternRaw: String,
    method: String,
    params: Seq[String],
    sourceFile: String
  ) {
    // normalized pattern for token matching (remove anchors, wildcards, quotes)
    lazy val normalizedPattern: String =
      StepDef.cleanPatternForMatching(patternRaw)

    // xName similar to your old script: pattern -> function-ish name (lowercased)
    lazy val xName: String =
      StepDef.patternToXFunctionName(patternRaw)

    // cached compiled regex (if pattern compiles)
    lazy val compiledPattern: Option[Pattern] =
      StepDef.buildPattern(patternRaw)
  }

  object StepDef {
    // remove anchors and reduce (.*) to placeholder for token matching
    def cleanPatternForMatching(raw: String): String =
      raw
        .replaceAll("""^\^""", "")
        .replaceAll("""\$$""", "")
        .replaceAll("""\(\.\*\)""", "X")
        .replaceAll("""\(\.\+\)""", "X")
        .replaceAll("""["']""", "")
        .replaceAll("[^A-Za-z0-9\\sX]", " ")
        .replaceAll("\\s+", " ")
        .trim
        .toLowerCase

    def patternToXFunctionName(pattern: String): String = {
      val cleaned = cleanPatternForMatching(pattern)
        .replaceAll("X", " x ") // keep separators if placeholders exist
        .replaceAll("\\s+", " ")
        .trim
      if (cleaned.isEmpty) ""
      else cleaned
    }

    def buildPattern(raw: String): Option[Pattern] = try {
      val stripped = raw.replaceAll("""^\^|\$$""", "")
      val replaced = stripped.replaceAll("""\(\.\*\)|\(\.\+\)""", "(.+?)")
      Some(Pattern.compile("^" + replaced + "$", Pattern.CASE_INSENSITIVE))
    } catch {
      case _: Throwable => None
    }
  }

  // === UTILITIES ===

  private def listScalaFilesRecursive(dir: File): Seq[File] = {
    val files = Option(dir.listFiles()).map(ArraySeq.unsafeWrapArray).getOrElse(ArraySeq.empty[File])
    files.flatMap {
      case d if d.isDirectory                => listScalaFilesRecursive(d)
      case f if f.getName.endsWith(".scala") => Seq(f)
      case _                                 => Seq.empty
    }
  }

  private def normalize(s: String): String =
    s.toLowerCase
      .replaceAll("""["'()]""", "")
      .replaceAll("""[^\p{Alnum}\s]""", " ")
      .replaceAll("\\s+", " ")
      .trim

  private def tokenScore(a: String, b: String): Double = {
    val aTokens = normalize(a).split(" ").filter(_.nonEmpty)
    if (aTokens.isEmpty) return 0.0
    val bNorm   = normalize(b)
    val matches = aTokens.count(tok => bNorm.contains(tok))
    matches.toDouble / aTokens.length
  }

  private def fuzzyNameScore(a: String, b: String): Double = {
    // split on 'x' placeholder tokens (like original behaviour)
    val parts  = a.toLowerCase.split("x").map(_.trim).filter(_.nonEmpty)
    if (parts.isEmpty) return 0.0
    val bLower = b.toLowerCase
    val hits   = parts.count(p => p.nonEmpty && bLower.contains(p))
    hits.toDouble / parts.length
  }

  private def extractGroups(m: Matcher): Seq[String] =
    if (m == null) Seq.empty else (1 to m.groupCount()).map(i => Option(m.group(i)).getOrElse("").trim)

  private def placeholderForParam(param: String): String = {
    val parts = param.split(":").map(_.trim)
    if (parts.length >= 2) {
      val t = parts(1).toLowerCase
      if (t.contains("string")) "\"\""
      else if (t.contains("int") || t.contains("long") || t.contains("double")) "0"
      else "null"
    } else "\"\""
  }

  // === SCORING ===
  private def matchScore(sd: StepDef, stepText: String): Double = {
    val regexMatch = sd.compiledPattern.exists(_.matcher(stepText).matches())
    val tokenSim   = tokenScore(sd.normalizedPattern, stepText)
    val nameSim    = fuzzyNameScore(sd.xName, stepText)
    val base       = (if (regexMatch) 1.0 else tokenSim) * 0.7 + nameSim * 0.3
    // small boost if name appears inside step
    if (
      base < 0.6 && sd.xName.nonEmpty &&
      stepText.toLowerCase.replaceAll("\\s+", "").contains(sd.xName.replaceAll("\\s+", ""))
    )
      0.85
    else base
  }

  // === LOADING STEP DEFS ===
  def loadStepDefs(stepDefsDir: File): Seq[StepDef] = {
    if (!stepDefsDir.exists() || !stepDefsDir.isDirectory) return Seq.empty

    // scan files (non-recursive to match old behaviour; change if you want recursion)
//    val files = Option(stepDefsDir.listFiles()).map(ArraySeq.unsafeWrapArray).getOrElse(ArraySeq.empty[File])
    val files = listScalaFilesRecursive(stepDefsDir)
    files.filter(_.getName.endsWith(".scala")).flatMap { file =>
      val lines                          = Using.resource(Source.fromFile(file))(_.getLines().toList)
      var currentPattern: Option[String] = None
      val defs                           = scala.collection.mutable.ArrayBuffer[StepDef]()

      lines.foreach {
        case stepCommentPattern(p)                                     => currentPattern = Some(p.trim)
        case defPattern(name, _, paramsRaw) if currentPattern.nonEmpty =>
          val paramsSeq = Option(paramsRaw).map(_.split(",").map(_.trim).filter(_.nonEmpty).toSeq).getOrElse(Seq.empty)
          defs += StepDef(currentPattern.get, name, paramsSeq, file.getName)
          currentPattern = None
        case _                                                         =>
      }
      defs.toSeq
    }
  }

  // === PROCESS A SINGLE SPEC FILE ===
  def processSpecFile(specFile: File, stepDefsDir: File, outputDir: File): Unit = {
    val stepDefs = loadStepDefs(stepDefsDir)
    println(s"Loaded ${stepDefs.size} step-defs from ${stepDefsDir.getName}")

    val lines = Using.resource(Source.fromFile(specFile))(_.getLines().toList)
    val out   = new StringBuilder

    for (line <- lines) line match {
      case stepLinePattern(indent, kw, text) =>
        out ++= line + "\n"

        val scored = stepDefs
          .map(sd => (sd, matchScore(sd, text)))
          .filter(_._2 >= matchThreshold)
          .sortBy(-_._2)

        if (scored.isEmpty) {
          out ++= s"$indent  // ⚠️ No step-def match found for: $text\n\n"
        } else {
          val best       = scored.head
          val regexOpt   = best._1.compiledPattern
          val matcherOpt = regexOpt.map(_.matcher(text)).filter(_.matches())
          val args       = matcherOpt.map(extractGroups).getOrElse(Seq.empty)

          val call =
            if (best._1.params.isEmpty) s"${best._1.method}()"
            else if (args.nonEmpty) s"${best._1.method}(${args.map(a => "\"" + a + "\"").mkString(", ")})"
            else s"${best._1.method}(${best._1.params.map(placeholderForParam).mkString(", ")})"

          if (autoChooseBest)
            out ++= s"$indent  $call  // auto-chosen (score=${"%.2f".format(best._2)}, ${best._1.sourceFile})\n"
          else
            out ++= s"$indent  // Possible match (best=${"%.2f".format(best._2)})\n$indent  $call\n"

          // show other candidate matches for review
          val others = scored.tail
          if (others.nonEmpty) {
            out ++= s"$indent  // --- Other possible matches ---\n"
            others.foreach { case (cand, score) =>
              out ++= s"$indent  // ${cand.method}() [${"%.2f".format(score)}] (${cand.sourceFile}) pattern: ${cand.patternRaw}\n"
            }
          }
          out ++= "\n"
        }

      case other =>
        out ++= other + "\n"
    }

    if (!outputDir.exists()) outputDir.mkdirs()
    val outFile = new File(outputDir, specFile.getName)
    Using.resource(new PrintWriter(outFile)) { pw =>
      pw.write(out.toString)
    }
    println(s"✅ Processed ${specFile.getName}")
  }

  // === PROCESS DIRECTORY ===
  def processFolder(specDir: String, stepDefsDir: String, outputDir: String): Unit = {
    val in      = new File(specDir)
    val out     = new File(outputDir)
    if (!out.exists()) out.mkdirs()
    val stepDir = new File(stepDefsDir)
    // use non-recursive listing to match the previous script; change as needed
    val list    = Option(in.listFiles()).map(ArraySeq.unsafeWrapArray).getOrElse(ArraySeq.empty[File])
    list.filter(_.getName.endsWith(".scala")).foreach { f =>
      processSpecFile(f, stepDir, out)
    }
  }

  // === CLI ENTRYPOINT ===
  def main(args: Array[String]): Unit = {
    if (args.length < 3) {
      println(
        "Usage: InjectStepDefsIntoSpecs <spec_folder> <stepdefs_folder> <output_folder> [--threshold 0.7] [--auto-choose-best]"
      )
      System.exit(1)
    }

    val specs = args(0)
    val steps = args(1)
    val out   = args(2)

    // parse optional args: --threshold <value>, --auto-choose-best
    var i = 3
    while (i < args.length)
      args(i) match {
        case "--threshold" if i + 1 < args.length && args(i + 1).matches("[0-9.]+") =>
          matchThreshold = args(i + 1).toDouble
          i += 2
        case "--auto-choose-best"                                                   =>
          autoChooseBest = true
          i += 1
        case other                                                                  =>
          println(s"Unknown arg: $other")
          i += 1
      }

    println(s"Starting injection (threshold=$matchThreshold, autoChooseBest=$autoChooseBest)...")
    processFolder(specs, steps, out)
    println("✅ Injection complete.")
  }
}
