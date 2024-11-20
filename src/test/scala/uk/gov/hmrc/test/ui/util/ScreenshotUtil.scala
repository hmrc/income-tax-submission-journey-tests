/*
 * Copyright 2024 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.util

import io.cucumber.scala.Scenario
import org.openqa.selenium.{OutputType, TakesScreenshot, WebDriver}

import java.io.{BufferedOutputStream, File, FileOutputStream}
import scala.util.{Failure, Success, Try}

object ScreenshotUtil {

  val targetFolder: File = new File("./target")
  val screenshotsDir: File = new File(targetFolder.getCanonicalPath + "/screenshots")

  def clearOldScreenshots(): Unit = {
    if (screenshotsDir.exists()) {
      screenshotsDir.delete()
    }
  }

  def makeScenarioDir(scenario: Scenario): Try[File] = {
    makeScreenshotsFolder().flatMap { screenshotsDir =>
      val scenarioDir = new File(screenshotsDir.getCanonicalPath + "/" + scenario.getName)
      mkDir(scenarioDir)
    }
  }

  def takeScreenshot(folder: File, name: String)(implicit driver: WebDriver): Try[File] = {
    val screenshotBytes: Array[Byte] = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.BYTES)
    val screenshotFile: File = new File(folder.getCanonicalPath + "/" + name + ".png")
    val os: BufferedOutputStream = new BufferedOutputStream(new FileOutputStream(screenshotFile.getCanonicalFile))

    Try {
      os.write(screenshotBytes)
    } match {
      case Success(_) => Success(screenshotFile)
      case Failure(exception) => Failure[File](exception)
    }
  }

  private def makeScreenshotsFolder(): Try[File] = {
    for {
      _ <- mkDir(targetFolder)
      screenshotDir <- mkDir(screenshotsDir)
    } yield screenshotDir
  }

  private def mkDir(dir: File): Try[File] = {
    if (dir.exists()) Success(dir) else {
      val isCreated = dir.mkdir()

      if (isCreated) Success(dir) else {
        println(s"couldn't make dir: ${dir.getCanonicalPath} ")
        Failure(new Exception(s"Failed to create folder: ${dir.getCanonicalPath}"))
      }
    }
  }

}
