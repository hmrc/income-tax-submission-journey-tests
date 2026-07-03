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

import scala.util.matching.Regex
import java.io.{File, PrintWriter}
import scala.io.Source

object FeatureToScalaSpecConverter {

  private val featurePattern: Regex         = """(?i)^\s*Feature:\s*(.*)""".r
  private val scenarioPattern: Regex        = """(?i)^\s*Scenario:\s*(.*)""".r
  private val scenarioOutlinePattern: Regex = """(?i)^\s*Scenario Outline:\s*(.*)""".r
  private val stepPattern: Regex            = """(?i)^\s*(Given|When|Then|And)\s+(.*)""".r
  private val examplesPattern: Regex        = """(?i)^\s*Examples:\s*""".r
  private val examplesRowPattern: Regex     = """^\s*\|\s*(.+)\s*\|\s*$""".r

  def cleanStepText(raw: String): String = {
    val text                = raw.trim
    val withoutInlineQuotes = text.replaceAll("\"([^\"]+)\"", "$1").replaceAll("'([^']+)'", "$1")
    withoutInlineQuotes.replaceAll("\\s+", " ").trim
  }

  def substitutePlaceholders(text: String, headers: Seq[String], values: Seq[String]): String = {
    var result = text
    headers.zip(values).foreach { case (h, v) =>
      result = result.replaceAll(s"<$h>", v)
    }
    result
  }

  def convertFile(inputFile: File, outputDir: File): Unit = {
    println(s"Processing feature: ${inputFile.getName}")
    val lines = Source.fromFile(inputFile).getLines().toList

    var featureTitle: String = ""
    val scenarios            = scala.collection.mutable.ArrayBuffer[(String, Seq[(String, String)])]()

    var currentScenario: Option[String]   = None
    var currentSteps                      = Seq.empty[(String, String)]
    var outlineHeaders: Seq[String]       = Nil
    var outlineExamples: Seq[Seq[String]] = Nil
    var inExamplesBlock                   = false

    def flushScenario(): Unit = {
      currentScenario.foreach { t =>
        if (outlineHeaders.nonEmpty && outlineExamples.nonEmpty) {
          // Expand Scenario Outline
          outlineExamples.foreach { row =>
            val expandedSteps = currentSteps.map { case (kw, text) =>
              kw -> substitutePlaceholders(text, outlineHeaders, row)
            }
            val titleSuffix   = outlineHeaders.zip(row).map { case (h, v) => s"$h=$v" }.mkString(", ")
            scenarios += (s"$t [$titleSuffix]" -> expandedSteps)
          }
        } else {
          scenarios += (t -> currentSteps)
        }
      }
      currentScenario = None
      currentSteps = Seq.empty
      outlineHeaders = Nil
      outlineExamples = Nil
      inExamplesBlock = false
    }

    lines.foreach {
      case featurePattern(title) =>
        featureTitle = title.trim

      case scenarioPattern(title) =>
        flushScenario()
        currentScenario = Some(title.trim)

      case scenarioOutlinePattern(title) =>
        flushScenario()
        currentScenario = Some(title.trim)

      case stepPattern(keyword, text) =>
        currentSteps = currentSteps :+ (keyword.capitalize -> cleanStepText(text))

      case examplesPattern()          =>
        inExamplesBlock = true

      case examplesRowPattern(row) if inExamplesBlock =>
        val cells = row.split("\\|").map(_.trim).filter(_.nonEmpty).toSeq
        if (outlineHeaders.isEmpty) outlineHeaders = cells
        else outlineExamples :+= cells

      case _ =>
    }

    flushScenario()

    val baseName   = inputFile.getName.stripSuffix(".feature").replaceAll("[^A-Za-z0-9]", "")
    val className  = if (baseName.endsWith("Spec")) baseName else baseName + "Spec"
    val outputFile = new File(outputDir, className + ".scala")

    val sb = new StringBuilder
    sb ++=
      s"""import org.scalatest.matchers.should.Matchers
         |import org.scalatest.featurespec.AnyFeatureSpec
         |
         |class $className extends AnyFeatureSpec with Matchers {
         |
         |  Feature("$featureTitle") {
         |""".stripMargin

    for ((scenarioTitle, steps) <- scenarios) {
      sb ++=
        s"""
           |    Scenario("$scenarioTitle") {
           |""".stripMargin

      for ((kw, text) <- steps)
        sb ++= s"""      $kw("$text")\n"""

      sb ++= "    }\n"
    }

    sb ++= "  }\n}\n"

    val writer = new PrintWriter(outputFile)
    writer.write(sb.toString())
    writer.close()

    println(s"✅ Converted ${inputFile.getName} → ${outputFile.getName}")
  }

  def convertFolder(inputDir: String, outputDir: String): Unit = {
    val inDir  = new File(inputDir)
    val outDir = new File(outputDir)
    if (!outDir.exists()) outDir.mkdirs()

    inDir.listFiles().filter(_.isFile).foreach { file =>
      if (file.getName.endsWith(".feature")) {
        convertFile(file, outDir)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      println("Usage: FeatureToScalaSpecConverter <features_folder> <specs_folder>")
      System.exit(1)
    }

    val inputDir  = args(0)
    val outputDir = args(1)

    println(s"Starting feature conversion from $inputDir to $outputDir...")
    convertFolder(inputDir, outputDir)
    println("Feature conversion finished.")
  }
}
