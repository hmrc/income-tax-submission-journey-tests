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

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.conf.TaxYearHelper
import uk.gov.hmrc.test.ui.pages.CommonPage._
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, CommonPage}

class CommonStepDef extends Steps with TaxYearHelper{

  val serviceName = "Update and submit an Income Tax Return"
  val testOnlyViewAndChangeServiceName = "Your client’s Income Tax details"
  val viewAndChangeServiceName = "Business Tax account"
  val viewAndChangeServiceNameAgent = "Your client’s Income Tax details"
  val govUkExtension = "GOV.UK"
  val selfEmployment = "income-tax-self-employment-frontend"
  val pensions = "Update and submit an Income Tax Return - site.govuk - Update and submit an Income Tax Return"

  Then("""^the user should be redirected to the "(.*)" page$""") { (title: String) =>
    driver.getTitle.replace("\u00A0", " ") should be(s"$title - $serviceName - $govUkExtension")
  }

  Then("""^the user is redirected to the "(.*)" "(.*)" "(.*)" page$""") { (title: String, taxYear : String,titleCont: String) =>
    val expectedTaxYear = replaceTaxYear(taxYear)
    driver.getTitle.replace("\u00A0", " ") should be(s"$title $expectedTaxYear $titleCont - $serviceName - $govUkExtension")
  }

  Then("""^the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page$""") { (title: String, taxYearPrevious: String, taxYear: String,  titleCont: String) =>
    val expectedTaxYear = replaceTaxYear(taxYear)
    val taxYearMinusTwo = replaceTaxYear(taxYearPrevious)
    driver.getTitle.replace("\u00A0", " ") should be(s"$title $taxYearMinusTwo to $expectedTaxYear $titleCont - $serviceName - $govUkExtension")
  }

  Then("""^the user should be redirected to V&C "(.*)" page$""") { (title: String) =>
    driver.getTitle should be(s"$title")
  }

  Then("""^the user should be redirected to the "(.*)" page on the View and Change service$""") { (title: String) =>
    driver.getTitle should be(s"$title - $viewAndChangeServiceName - $govUkExtension")
  }

  Then("""^the user should be redirected to V&C "(.*)" page on the View and Change service$""") { (title: String) =>
    driver.getTitle should be(s"$title")
  }

  Then("""^the user should be redirected to the "(.*)" agent page on the View and Change service$""") { (title: String) =>
    driver.getTitle should be(s"$title - $viewAndChangeServiceNameAgent - $govUkExtension")
  }

  Then("""^the user should be redirected to V&C "(.*)" agent page on the View and Change service$""") { (title: String) =>
    driver.getTitle should be(s"$title")
  }

  Then("""^the user should be taken to the "(.*)" test-only page on the View and Change service$""") { (title: String) =>
    driver.getTitle should be(s"$title - $testOnlyViewAndChangeServiceName - $govUkExtension")
  }

  Then("""^the user should be taken to V&C "(.*C)" test-only page on the View and Change service$""") { (title: String) =>
    driver.getTitle should be(s"$title")
  }

  When("""^the user goes back to the previous page in their browser's history$""") { () =>
    CommonPage.navigateBack()
  }

  When("""^the user clicks on the (.*) link$""") { linkName: String =>
    CommonPage.clickOnLink(linkName)
  }

  When("""^the user selects the (.*) radio button$""") { radioButtonIdentifier: String =>
    CommonPage.clickOnRadioButton(radioButtonIdentifier)
  }

  When("""^the user selects the (.*) radio button and clicks the (.*) button$""") { (radioButtonIdentifier: String, buttonTitle: String) =>
    CommonPage.clickOnRadioButton(radioButtonIdentifier)
    CommonPage.clickOnButton(buttonTitle)
  }

  When("""^the user deselects the (.*) radio button$""") { radioButtonIdentifier: String =>
    CommonPage.deselectRadioButton(radioButtonIdentifier)
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

  When("""^the user clicks the (.*), (.*) and (.*) checkboxes$""") {
    (checkboxTitle: String, checkboxTitleTwo: String, checkboxTitleThree: String) =>
    CommonPage.clickOnCheckbox(checkboxTitle)
    CommonPage.clickOnCheckbox(checkboxTitleTwo)
    CommonPage.clickOnCheckbox(checkboxTitleThree)
  }

  When("""^the user clicks all checkbox options and selects (.*)""") { (buttonTitle: String) =>
    val allCheckboxIds = List("value_0", "value_1", "value_2", "value_3", "value_4", "value_5", "value_6", "value_7")
    allCheckboxIds.foreach(id => driver.findElement(By.id(id)).click())
    CommonPage.clickOnButton(buttonTitle)
  }


  When("""^the user clicks the (.*) dropdown and selects (.*)$""") { (dropdownTitle: String, dropdownValue: String) =>
    CommonPage.clickOnDropdown(dropdownTitle, dropdownValue)
  }

  When("""^the user clicks both the (.*) and (.*) checkboxes$""") { (checkbox1Title: String, checkbox2Title: String) =>
    CommonPage.clickOnCheckbox(checkbox1Title)
    CommonPage.clickOnCheckbox(checkbox2Title)
  }

  When("""^the user clicks the (.*) tailoring option$""") { (checkboxTitle: String) =>
    CommonPage.attemptToClickOnCheckbox(checkboxTitle)
  }

  When("""^the user selects the (.*) field and enters a value of (.*)$""") { (valueTextBox: String, value: String) =>
    CommonPage.enterValue(valueTextBox, value)
  }

  Then("""^the user should see the (.*) field with the value of (.*)$""") { (valueTextBox: String, expectedValue: String) =>
    CommonPage.checkValue(valueTextBox, expectedValue) shouldEqual (true)
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
      case "untaxed interest" => s"http://localhost:9308/update-and-submit-income-tax-return/personal-income/$taxYear/interest/untaxed-uk-interest"
      case "employment summary" => s"http://localhost:9317/update-and-submit-income-tax-return/employment-income/$taxYear/employment-summary"
      case "interest check your answers" => s"http://localhost:9308/update-and-submit-income-tax-return/personal-income/$taxYear/interest/check-interest"
      case "V&C login page" => "http://localhost:9081/report-quarterly/income-and-expenses/view/test-only/custom-login"
      case "final tax overview" => s"http://localhost:9302/update-and-submit-income-tax-return/$taxYearEOY/income-tax-return-overview"
      case "tax view" => s"http://localhost:9302/update-and-submit-income-tax-return/$taxYear/income-tax-return-overview"
      case "tax overview for individuals" => "http://localhost:9081/report-quarterly/income-and-expenses/view/tax-overview"
      case "tax overview for agents" => "http://localhost:9081/report-quarterly/income-and-expenses/view/agents/tax-overview"
      case "auth login" => AuthLoginPage.url
      //TODO remove pension summary pages when link on overview page is created
      case "pensions summary page" => s"http://localhost:9321/update-and-submit-income-tax-return/pensions/$taxYearEOY/pensions-summary"
      case "pensions summary page in year" => s"http://localhost:9321/update-and-submit-income-tax-return/pensions/$taxYear/pensions-summary"
      //TODO remove URl when tailor you return is hooked with submission frontend
      case "Tailor return start" => s"http://localhost:10007/update-and-submit-income-tax-return/tailored-return/$taxYearEOY/start"
      case "QA Tailor return start" => s"https://www.qa.tax.service.gov.uk/update-and-submit-income-tax-return/tailored-return/$taxYearEOY/start"
      case "Payments into pensions" => s"http://localhost:10007/update-and-submit-income-tax-return/tailored-return/$taxYearEOY/payments-pensions"
      case "Rental income" => s"http://localhost:10007/update-and-submit-income-tax-return/tailored-return/$taxYearEOY/property-pensions-investments/rental-income"
      case _ => fail("Invalid url input parameter")
    }
    driver.navigate().to(expectedUrl)
  }

  Given("""^the user (.*) is selected on V&C page$""") { (nino: String) =>
    selectDropDownOptionByValue("nino", nino)
  }

  Given("""^the agent checkbox on V&C page is selected$""") { () =>
    clickOnAgentCheckbox()
  }

  Given("""^the user clicks the Login button on the V&C page$""") { () =>
    clickOnButton("vcLoginButton")
  }

  Then("""^the user navigates to the (.*) page for (.*)$""") { (url: String, taxYear: String) =>
    val expectedTaxYear = replaceTaxYear(taxYear)
    val expectedUrl: String = url match {
      case "Test only clear data" => s"http://localhost:10007/update-and-submit-income-tax-return/tailored-return/test-only/$expectedTaxYear/clear-data"
      case "Test only add data"   => s"http://localhost:10007/update-and-submit-income-tax-return/tailored-return/test-only/$expectedTaxYear/add-data"
      case _ => fail("Invalid url input parameter")
    }
    driver.navigate().to(expectedUrl)
  }

  Then("""^the user navigates to the current page with tax year "(.*)"$""") { (taxYear: Int) =>
    val currentUrl = driver.getCurrentUrl
    val newUrl = currentUrl.replace("2023", s"$taxYear")
    driver.navigate().to(newUrl)
  }

  Then("""^the user can click the (.*) link and it navigates to the (.*) page$""") { (linkName: String, url: String) =>
    val selector: By = load("Clickable " + linkName)

    val expectedUrl: String = url match {
      case "employment summary" => "http://localhost:9317/update-and-submit-income-tax-return/employment-income/2023/employment-summary"
      case _ => fail("Invalid url input parameter")
    }

    driver.findElement(selector).getAttribute("href") shouldBe expectedUrl
  }

  Given("""^no employment data exists$""") { () =>
    if (elementExists(CommonPage.load("Employments list item"))) {
      while (elementExists(CommonPage.load("remove employment"))) {
        clickOn(CommonPage.load("remove employment")) // Click remove employment link
        clickOn(CommonPage.load("Remove employer")) // Click remove employer button
      }
    }
  }

  Given("""^no expenses data exists$""") { () =>
    if (elementExists(CommonPage.load("Expenses list item"))) {
      if (elementExists(CommonPage.load("remove expenses"))) {
        CommonPage.clickOnLink("remove expenses")
        CommonPage.clickOnButton("Remove expenses")
      }
    }
  }

  Given("""^no cis deductions data exists$""") { () =>
    val contractor = CommonPage.load("first contractor")
    while (elementExists(contractor)) {
      clickOn(contractor)
      val removeLink = CommonPage.load("first month remove")
      while (elementExists(removeLink)) {
        clickOn(removeLink)
        clickOn(CommonPage.load("Remove period"))
      }
      clickOn(CommonPage.load("cis deductions"))
    }
  }

  Given("""no claims exist""") { () =>
    val selector = CommonPage.load("first view")
    while (elementExists(selector)) {
      clickOn(selector)
      clickOn(CommonPage.load("remove claim"))
      clickOn(CommonPage.load("Remove claim"))
    }
  }

  Given("""the existing data in service (.*) is cleared for nino (.*)$""") { (serviceName: String, nino: String) =>
    val expectedUrl: String = serviceName match {
      case "pensions" => s"http://localhost:9322/test-only/income-tax-pensions/test-clear-all-data/$nino"
      case _ => fail("Invalid url input parameter")
    }
    driver.navigate().to(expectedUrl)
  }

  Then("""^the (.*) is displayed$""") { (valueElement: String) =>
    val selector = CommonPage.load(valueElement)
    elementExists(selector)
  }

  When("""^the user clicks on the change scheme link in position (.*)$""") { position: String =>
    CommonPage.clickBySelector(s"div > dl > div:nth-child($position) > dd.hmrc-add-to-a-list__change > a")
  }

  Then("""^the user should be redirected to the "(.*)" page under self employment$""") { (title: String) =>
    driver.getTitle.replace("\u00A0", " ") should be(s"$title - $selfEmployment - $govUkExtension")
  }

  Then("""^the user should be redirected to the "(.*)" page for pensions$""") { (title: String) =>
    driver.getTitle.replace("\u00A0", " ") should be(s"$title - $pensions - $govUkExtension")
  }

}
