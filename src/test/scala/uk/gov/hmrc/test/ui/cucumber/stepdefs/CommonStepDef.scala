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

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, CommonPage}
import uk.gov.hmrc.test.ui.pages.CommonPage.load

class CommonStepDef extends BaseStepDef {

  val serviceName = "Update and submit an Income Tax Return"
  val govUkExtension = "GOV.UK"

  Then("""^the user should be redirected to the "(.*)" page$""") { (title: String) =>
    driver.getTitle should be(s"$title - $serviceName - $govUkExtension")
  }

  When("""^the user clicks on the (.*) link$""") { linkName: String =>
    CommonPage.clickOnLink(linkName)
  }

  When("""^the user selects the (.*) radio button$""") { radioButtonIdentifier: String =>
    CommonPage.clickOnRadioButton(radioButtonIdentifier)
  }

  When("""^the user selects the (.*) radio button: (.*)$""") { (radioButtonIdentifier: String, buttonName: String) =>
    CommonPage.clickOnRadioButton(radioButtonIdentifier)
  }

  When("""^the user clicks the (.*) button$""") { buttonTitle: String =>
    CommonPage.clickOnButton(buttonTitle)
  }

  When("""^the user selects the (.*) field and enters a value of (.*)$""") { (valueTextBox: String, value: String) =>
    CommonPage.enterValue(valueTextBox, value)
  }

  Then( """^the user should see the correct (.*) url$""") { ( url: String) =>
    val expectedUrl: (String, String) = url match {
      case "Accessibility Statement" => ("Accessibility statement", "/accessibility-statement/income-tax-submission")
      case "sign out" => ("Sign out", "/income-through-software/return/sign-out")
      case "personal income sign out" => ("Sign out", "/income-through-software/return/personal-income/sign-out")
      case "View estimation" => ("View estimation", "/income-through-software/return/2022/calculate")
      case "Authorise you as an agent" => ("authorise you as their agent (opens in new tab)", "https://www.gov.uk/guidance/client-authorisation-an-overview")
      case "employment sign out" => ("Sign out", "/income-through-software/return/employment-income/sign-out")
      case _ => fail("Invalid url input parameter")
    }
    driver.findElement(By.linkText(expectedUrl._1)).getAttribute("href") should include (expectedUrl._2)
  }

  Then("""^the user navigates to the (.*) page$""") { (url: String) =>
    val expectedUrl: String = url match {
      case "untaxed interest" => "http://localhost:9308/income-through-software/return/personal-income/2022/interest/untaxed-uk-interest"
      case "employment summary" => "http://localhost:9317/income-through-software/return/employment-income/2022/employment-summary"
      case "interest check your answers" => "http://localhost:9308/income-through-software/return/personal-income/2022/interest/check-interest"
      case "auth login" => AuthLoginPage.url
      case _ => fail("Invalid url input parameter")
    }
    driver.navigate().to(expectedUrl)
  }

  Then("""^the user navigates to the current page with tax year "(.*)"$""") { (taxYear: Int) =>
    val currentUrl = driver.getCurrentUrl
    val newUrl = currentUrl.replace("2022", s"$taxYear")
    driver.navigate().to(newUrl)
  }

  Then("""^the user cannot click the (.*) link$""") { linkName: String =>
    val selector: By = load("Unclickable " + linkName)
    driver.findElement(selector).getAttribute("href") shouldBe null
  }
}
