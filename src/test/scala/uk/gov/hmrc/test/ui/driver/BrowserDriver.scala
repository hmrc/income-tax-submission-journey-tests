/*
 * Copyright 2023 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.driver

import com.typesafe.scalalogging.LazyLogging
import org.apache.commons.io.FileUtils
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.support.events.{EventFiringDecorator, WebDriverListener}
import org.openqa.selenium.{By, Dimension, OutputType, WebDriver}
import uk.gov.hmrc.webdriver.SingletonDriver

import java.io.File
import java.lang.reflect.Method

class ScreenshotListener extends WebDriverListener {

  private var maybePreviousUrl: Option[String] = None

  override def afterAnyWebDriverCall(driver: WebDriver, method: Method, args: Array[AnyRef], result: Any): Unit = {
    val currentUrl = driver.getCurrentUrl

    if (maybePreviousUrl != Some(currentUrl)) {
      driver.manage().window().setSize(new Dimension(1920, 100_000))
      val bodyElement = driver.findElement(By.tagName("body"))
      if (bodyElement.getRect.height > 0) {
        val srcFile: File = bodyElement.getScreenshotAs(OutputType.FILE)

        val lastSegmentAndQueryString = currentUrl.drop(currentUrl.lastIndexOf('/'))
        val destFile = new File(f"target/screenshots$lastSegmentAndQueryString.png")

        FileUtils.copyFile(srcFile, destFile)
      }

      maybePreviousUrl = Some(currentUrl)
    }
  }

}

trait BrowserDriver extends LazyLogging {
  private val browserOrError: String = sys.props.getOrElse("browser", "'browser' System property not set. This is required")
  private val shouldScreenshot = sys.props.get("screenshots").contains("true")
  logger.info(s"Instantiating Browser: $browserOrError")
  implicit lazy val driver: WebDriver = {
    browserOrError match {
      case "chrome" =>
        val options = new ChromeOptions
        if (shouldScreenshot) {
          val listener = new ScreenshotListener()
          options.addArguments("--remote-allow-origins=*", "headless")
          new EventFiringDecorator(listener).decorate(SingletonDriver.getInstance(Some(options)))
        }
        else {
          options.addArguments("--remote-allow-origins=*")
          SingletonDriver.getInstance(Some(options))
        }
      case _ => SingletonDriver.getInstance()
    }
  }

}
