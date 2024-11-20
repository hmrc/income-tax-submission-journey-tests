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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import io.cucumber.scala._
import org.openqa.selenium._
import uk.gov.hmrc.selenium.webdriver.{Browser, Driver}
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.util.{ScreenshotUtil, TimeMachine}

object BaseStepDef extends ScalaDsl with EN with Browser with BrowserDriver {

  BeforeAll {
    startBrowser()
    ScreenshotUtil.clearOldScreenshots()
    Driver.instance.manage().deleteAllCookies()
  }

  After { scenario: Scenario =>
    if (scenario.isFailed) {
      val screenshotName = scenario.getName.replaceAll(" ", "_")
      val screenshot = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.BYTES)
      scenario.attach(screenshot, "image/png", screenshotName)
    }
  }

  AfterStep(tagExpression = "@screenshots") { scenario: Scenario =>
    val pageName = s"${TimeMachine.getEpochString} - ${driver.getTitle.replaceFirst("- GOV.UK", "")}"

    ScreenshotUtil.makeScenarioDir(scenario).map { scenarioFolder =>
        ScreenshotUtil.takeScreenshot(scenarioFolder, pageName)
    }
  }

  AfterAll {
    quitBrowser()
  }

}
