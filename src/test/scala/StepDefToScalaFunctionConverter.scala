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
import scala.io.Source
import scala.util.matching.Regex

object StepDefToScalaFunctionConverter {

  private val headerPattern: Regex =
    "(?s)(Given|When|Then|And)\\s*\\((.+?)\\)\\s*\\{".r

  private def unquote(rawPattern: String): String = {
    val trimmed = rawPattern.trim
    if (trimmed.startsWith("\"\"\"") && trimmed.endsWith("\"\"\"")) {
      trimmed.substring(3, trimmed.length - 3)
    } else if (trimmed.startsWith("\"") && trimmed.endsWith("\"")) {
      trimmed.substring(1, trimmed.length - 1)
    } else {
      trimmed
    }
  }

  private def findMatchingBrace(s: String, openIndex: Int): Int = {
    var i     = openIndex + 1
    var depth = 1
    while (i < s.length) {
      s.charAt(i) match {
        case '{' => depth += 1
        case '}' =>
          depth -= 1
          if (depth == 0) return i
        case _   =>
      }
      i += 1
    }
    -1
  }

  private val paramArrowRegex: Regex                                  = """(?s)^\s*\(([^\)]*)\)\s*=>\s*""".r
  private def stripParamArrow(body: String): (String, Option[String]) =
    paramArrowRegex.findFirstMatchIn(body) match {
      case Some(m) =>
        val params = m.group(1).trim
        (body.substring(m.end).trim, if (params.nonEmpty) Some(params) else None)
      case None    =>
        (body.trim, None)
    }

  private def stepTextToMethodName(stepType: String, stepText: String): String = {
    val cleaned = stepText
      .replaceAll("""[\^$":]""", "") // remove regex markers and colons
      .replaceAll("""\(\.\*\)""", "X") // replace (.*) with X
      .replaceAll("""\s+""", " ")
      .trim

    val words = cleaned.split("\\s+").toList
    val base  = (stepType.toLowerCase :: words).map(_.capitalize).mkString
    s"${base.head.toLower}${base.tail}"
  }

  private def indentBody(body: String, indent: String = "    "): String =
    body.linesIterator
      .map {
        case "" => ""
        case ln => indent + ln
      }
      .mkString("\n")

  private def replaceDriverDot(body: String): String =
    body.replaceAll("""\bdriver\.""", "Driver.instance.")

  private def extractHelperDefs(source: String, firstHeaderIdx: Int): String = {
    val prefix     = source.substring(0, firstHeaderIdx)
    val helperDefs = prefix.linesIterator
      .filter { ln =>
        val t = ln.trim
        (t.startsWith("def ") || t.startsWith("private def")) &&
        !t.contains("=>") // exclude step defs
      }
      .mkString("\n")
    helperDefs
  }

  def convertFile(inputFile: File, outputDir: File): Unit = {
    println(s"Processing file: ${inputFile.getName}")
    val inputStr = Source.fromFile(inputFile).mkString

    // Extract imports
    val importLines =
      inputStr.linesIterator.filter(_.trim.startsWith("import")).mkString("\n")

    // Find first step def
    val firstHeaderIdx = headerPattern.findFirstMatchIn(inputStr).map(_.start).getOrElse(inputStr.length)

    // Extract top-level vals/vars
    val prefix       = inputStr.substring(0, firstHeaderIdx)
    val topLevelDefs = prefix.linesIterator
      .filter { ln =>
        val t = ln.trim
        (t.startsWith("val ") || t.startsWith("var ") || t.startsWith("private val") || t.startsWith("private var"))
      }
      .mkString("\n")

    // Extract helper defs
    val helperDefs = extractHelperDefs(inputStr, firstHeaderIdx)

    val headers = headerPattern.findAllMatchIn(inputStr).toList
    if (headers.isEmpty) {
      println(s"⚠️ Skipping ${inputFile.getName} - No step patterns found.")
      return
    }

    val className   = inputFile.getName.stripSuffix(".scala") + "Steps"
    val outputFile  = new File(outputDir, className + ".scala")
    val specBuilder = new StringBuilder

    // Start with imports
    if (importLines.nonEmpty) {
      specBuilder ++= importLines + "\n\n"
    }

    specBuilder ++=
      s"""object $className {
         |
         |""".stripMargin

    // Add preserved vals/vars
    if (topLevelDefs.nonEmpty) {
      specBuilder ++= topLevelDefs + "\n\n"
    }

    // Add helper defs
    if (helperDefs.nonEmpty) {
      specBuilder ++= helperDefs + "\n\n"
    }

    // Process each step def
    headers.foreach { m =>
      val stepType       = m.group(1)
      val stepPatternRaw = m.group(2)
      val stepTextRaw    = unquote(stepPatternRaw)
      val openBraceIndex = m.end - 1
      val closeIndex     = findMatchingBrace(inputStr, openBraceIndex)

      if (closeIndex == -1) {
        println(s"⚠️ Could not find matching closing brace in ${inputFile.getName}; skipping step [$stepTextRaw].")
      } else {
        val rawBody                   = inputStr.substring(openBraceIndex + 1, closeIndex)
        val (bodyStripped, paramsOpt) = stripParamArrow(rawBody)
        val bodyReplaced              = replaceDriverDot(bodyStripped)
        val bodyIndented              = indentBody(bodyReplaced)

        val methodName = stepTextToMethodName(stepType, stepTextRaw)
        val params     = paramsOpt.map(p => s"($p)").getOrElse("()")

        // Main method
        specBuilder ++=
          s"""  // $stepTextRaw
             |  def $methodName$params: Unit = {
             |$bodyIndented
             |  }
             |
             |""".stripMargin

        // If DataTable step -> generate overload
        paramsOpt.foreach { paramsStr =>
          if (paramsStr.contains("DataTable")) {
            val overloadBody =
              s"""    links.foreach { case (text, url) =>
                 |      val driverWait: WebDriverWait =
                 |        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
                 |      driverWait.until(
                 |        ExpectedConditions.elementToBeClickable(
                 |          Driver.instance.findElement(By.id(url))
                 |        )
                 |      )
                 |      verifyLinkById(url, text)
                 |    }""".stripMargin

            specBuilder ++=
              s"""  // Overload for ScalaTest (no DataTable, accepts varargs)
                 |  def $methodName(links: (String, String)*): Unit = {
                 |$overloadBody
                 |  }
                 |
                 |""".stripMargin
          }
        }
      }
    }

    specBuilder ++= "}\n"

    val writer = new PrintWriter(outputFile)
    writer.write(specBuilder.toString())
    writer.close()

    println(s"✅ Converted ${inputFile.getName} → ${outputFile.getName}")
  }

  def convertFolder(inputDir: String, outputDir: File): Unit = {
    val in = new File(inputDir)
    if (!in.exists() || !in.isDirectory) {
      println(s"ERROR: Input directory $inputDir not found or not a directory.")
      System.exit(2)
    }
    if (!outputDir.exists()) outputDir.mkdirs()

    in.listFiles().filter(f => f.isFile && f.getName.endsWith(".scala")).foreach { file =>
      convertFile(file, outputDir)
    }
  }

  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      println("Usage: StepDefToScalaFunctionConverter <stepdefs_folder> <target_folder>")
      System.exit(1)
    }
    val stepdefsFolder = args(0)
    val targetFolder   = args(1)

    println(s"Starting conversion from $stepdefsFolder to $targetFolder...")
    convertFolder(stepdefsFolder, new File(targetFolder))
    println("Conversion finished.")
  }
}
