/*
 * Copyright 2021 HM Revenue & Customs
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

import org.openqa.selenium.{By, JavascriptExecutor}
import uk.gov.hmrc.test.ui.pages.CommonPage
import uk.gov.hmrc.test.ui.pages.CommonPage.takeScreenShot

class CommonStepDef extends BaseStepDef {

  val serviceName = "Update and submit an Income Tax Return"
  val govUkExtension = "GOV.UK"

  Then("""^the user should be redirected to the "(.*)" page$""") { (title: String) =>
    driver.getTitle should be(s"$title - $serviceName - $govUkExtension")
  }

  When("""^the user clicks on the (.*) link$""") { linkName: String =>
    CommonPage.clickOnLink(linkName)
  }

  When("""^the user selects the (.*) radio button$""") { radioButtonBoolean: String =>
    CommonPage.clickOnRadioButton(radioButtonBoolean)
  }

  When("""^the user clicks the (.*) button$""") { buttonTitle: String =>
    CommonPage.clickOnButton(buttonTitle)
  }

  When("""^the user selects the (.*) field and enters a value of (.*)$""") { (valueTextBox: String, value: String) =>
    CommonPage.enterValue(valueTextBox, value)
  }

  Then( """^the user should see the correct Accessibility Statement url$""") { () =>
    val expectedHref = "/accessibility-statement/income-tax-submission"
    driver.findElement(By.linkText("Accessibility statement")).getAttribute("href") should include (expectedHref)
  }


  And( """^the user should see the correct sign out url$""") { () =>
    val expectedHref = "/income-through-software/return/sign-out"
    driver.findElement(By.linkText("Sign out")).getAttribute("href") should include (expectedHref)
  }

  And( """^the user should see the correct personal income sign out url$""") { () =>
    val expectedHref = "/income-through-software/return/personal-income/sign-out"
    driver.findElement(By.linkText("Sign out")).getAttribute("href") should include (expectedHref)
  }

  And( """^the user should see the correct View estimation url$""") { () =>
    val href = driver.findElement(By.linkText("View estimation")).getAttribute("href").contains("/income-through-software/return/2022/calculate")
    href shouldBe true
  }

  And("""^I take screenshots of the (.*), (.*)$""") { (languageDirectory: String, fileName: String) =>
    val jsx: JavascriptExecutor = driver.asInstanceOf[JavascriptExecutor]

    val scrollHeight = jsx.executeScript("return (document.body || document.documentElement).scrollHeight").toString.toInt
    var windowHeight = jsx.executeScript("return window.innerHeight").toString.toInt
    var screenshotCount = 1

    def windowScroll(sHeight: Int, wHeight: Int): AnyVal = {
      (sHeight, wHeight) match {
        case (sH, wH) if sH > wH =>
          takeScreenShot(fileName + s" Part $screenshotCount", languageDirectory)
          screenshotCount += 1
          jsx.executeScript(s"window.scrollTo(0, $windowHeight)")
          windowHeight += jsx.executeScript("return window.innerHeight").toString.toInt
          windowScroll(sHeight, windowHeight)
        case _ =>
          takeScreenShot(fileName + s" Part $screenshotCount", languageDirectory)
          screenshotCount += 1
      }
      windowScroll(scrollHeight, windowHeight)
    }
  }

}
