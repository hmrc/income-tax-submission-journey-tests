/*
 * Copyright 2022 HM Revenue & Customs
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
import uk.gov.hmrc.test.ui.pages.CommonPage.load
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, CommonPage}

class CommonStepDef extends BaseStepDef {

  val serviceName = "Update and submit an Income Tax Return"
  val testOnlyViewAndChangeServiceName = "Your client’s Income Tax details"
  val viewAndChangeServiceName = "Business Tax account"
  val govUkExtension = "GOV.UK"

  Then("""^the user should be redirected to the "(.*)" page$""") { (title: String) =>
    driver.getTitle should be(s"$title - $serviceName - $govUkExtension")
  }

  Then("""^the user should be redirected to the "(.*)" page on the View and Change service$""") { (title: String) =>
    driver.getTitle should be(s"$title - $viewAndChangeServiceName - $govUkExtension")
  }

  Then("""^the user should be taken to the "(.*)" test-only page on the View and Change service$""") { (title: String) =>
    driver.getTitle should be(s"$title - $testOnlyViewAndChangeServiceName - $govUkExtension")
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

  When("""^the user clicks the (.*) checkbox$""") { checkboxTitle: String =>
    CommonPage.clickOnCheckbox(checkboxTitle)
  }

  When("""^the user clicks both the (.*) and (.*) checkboxes$""") { (checkbox1Title: String, checkbox2Title: String) =>
    CommonPage.clickOnCheckbox(checkbox1Title)
    CommonPage.clickOnCheckbox(checkbox2Title)
  }

  When("""^the user selects the (.*) field and enters a value of (.*)$""") { (valueTextBox: String, value: String) =>
    CommonPage.enterValue(valueTextBox, value)
  }

  Then("""^the user should see the correct (.*) url$""") { (url: String) =>
    val expectedUrl: (String, String) = url match {
      case "Accessibility Statement" => ("Accessibility statement", "/accessibility-statement/income-tax-submission")
      case "sign out" => ("Sign out", "/update-and-submit-income-tax-return/sign-out")
      case "personal income sign out" => ("Sign out", "/update-and-submit-income-tax-return/personal-income/sign-out")
      case "Authorise you as an agent" => ("authorise you as their agent (opens in new tab)", "https://www.gov.uk/guidance/client-authorisation-an-overview")
      case "employment sign out" => ("Sign out", "/update-and-submit-income-tax-return/employment-income/sign-out")
      case _ => fail("Invalid url input parameter")
    }
    driver.findElement(By.linkText(expectedUrl._1)).getAttribute("href") should include(expectedUrl._2)
  }

  Then("""^the user navigates to the (.*) page$""") { (url: String) =>
    val expectedUrl: String = url match {
      case "untaxed interest" => "http://localhost:9308/update-and-submit-income-tax-return/personal-income/2023/interest/untaxed-uk-interest"
      case "employment summary" => "http://localhost:9317/update-and-submit-income-tax-return/employment-income/2023/employment-summary"
      case "interest check your answers" => "http://localhost:9308/update-and-submit-income-tax-return/personal-income/2023/interest/check-interest"
      case "final tax overview" => "http://localhost:9302/update-and-submit-income-tax-return/2022/income-tax-return-overview"
      case "tax overview for individuals" => "http://localhost:9081/report-quarterly/income-and-expenses/view/tax-overview"
      case "tax overview for agents" => "http://localhost:9081/report-quarterly/income-and-expenses/view/agents/tax-overview"
      case "auth login" => AuthLoginPage.url
      case _ => fail("Invalid url input parameter")
    }
    driver.navigate().to(expectedUrl)
  }

  Then("""^the user navigates to the current page with tax year "(.*)"$""") { (taxYear: Int) =>
    val currentUrl = driver.getCurrentUrl
    val newUrl = currentUrl.replace("2023", s"$taxYear")
    driver.navigate().to(newUrl)
  }

  Then("""^the user cannot click the (.*) link$""") { linkName: String =>
    val selector: By = load("Unclickable " + linkName)
    driver.findElement(selector).getAttribute("href") shouldBe null
  }

}
