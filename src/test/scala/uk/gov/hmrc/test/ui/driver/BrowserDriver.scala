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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import uk.gov.hmrc.webdriver.SingletonDriver

trait BrowserDriver extends LazyLogging {
  private val browserOrError: String = sys.props.getOrElse("browser", "'browser' System property not set. This is required")
  logger.info(s"Instantiating Browser: $browserOrError")

  implicit lazy val driver: WebDriver = browserOrError match {
    case "chrome" =>
      val options = new ChromeOptions
      options.addArguments("--remote-allow-origins=*")
      SingletonDriver.getInstance(Some(options))
    case "firefox" => SingletonDriver.getInstance()
    case _ => throw new RuntimeException("Browser unknown or not set!")
  }
}
