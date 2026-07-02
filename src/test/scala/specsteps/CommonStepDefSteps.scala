/*
 * Copyright 2026 HM Revenue & Customs
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

package specsteps

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import uk.gov.hmrc.selenium.component.PageObject
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.conf.TaxYearHelper
import uk.gov.hmrc.test.ui.pages.CommonPageOld._
import uk.gov.hmrc.test.ui.pages.{AdditionalInfoPageOld, AuthLoginPageOld, BasePageOld, CommonPageOld}

object CommonStepDefSteps extends PageObject {

  val serviceName = "Update and submit an Income Tax Return"
  val testOnlyViewAndChangeServiceName = "Your client’s Income Tax details"
  val viewAndChangeServiceName = "Business Tax account"
  val viewAndChangeServiceNameAgent = "Your client’s Income Tax details"
  val govUkExtension = "GOV.UK"
  val selfEmployment = "Update and submit an Income Tax Return"
  val pensions = "Update and submit an Income Tax Return - site.govuk - Update and submit an Income Tax Return"

  // ^the user should be redirected to the "(.*)" page$
  def thenTheUserShouldBeRedirectedToTheXPage(title: String): Unit = {
    Driver.instance.getTitle.replace("\u00A0", " ") should be(s"$title - $serviceName - $govUkExtension")
  }

  // ^the user should be redirected to "(.*)" page$
  def thenTheUserShouldBeRedirectedToXPage(title: String): Unit = {
    Driver.instance.getTitle.replace("\u00A0", " ") should be(s"$title - $govUkExtension")
  }

  // ^the user will be redirected to the "(.*)" between (.*) and (.*) page$
  def thenTheUserWillBeRedirectedToTheXBetweenXAndXPage(partialTitle: String, taxYearPrevious: String, taxYear: String): Unit = {
    val expectedTaxYear = replaceTaxYear(taxYear)
          val previousTaxYear = replaceTaxYear(taxYearPrevious)

          val fullTitle = s"$partialTitle between $previousTaxYear and $expectedTaxYear?"
          val expectedTitle = s"$fullTitle - $serviceName - $govUkExtension"

          Driver.instance.getTitle.replace("\u00A0", " ") should be(expectedTitle)
  }

  // ^the user is redirected to the "(.*)" "(.*)" "(.*)" page$
  def thenTheUserIsRedirectedToTheXXXPage(title: String, taxYear: String, titleCont: String): Unit = {
    val expectedTaxYear = replaceTaxYear(taxYear)
        Driver.instance.getTitle.replace("\u00A0", " ") should be(s"$title $expectedTaxYear $titleCont - $serviceName - $govUkExtension")
  }

  // ^the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page$
  def thenTheUserIsThenRedirectedToTheXXXXPage(title: String, taxYearPrevious: String, taxYear: String, titleCont: String): Unit = {
    val expectedTaxYear = replaceTaxYear(taxYear)
        val taxYearMinusTwo = replaceTaxYear(taxYearPrevious)
        Driver.instance.getTitle.replace("\u00A0", " ") should be(s"$title $taxYearMinusTwo to $expectedTaxYear $titleCont - $serviceName - $govUkExtension")
  }

  // ^the user should be redirected to V&C "(.*)" page$
  def thenTheUserShouldBeRedirectedToVandCXPage(title: String): Unit = {
    Driver.instance.getTitle should be(s"$title")
  }

  // ^the user should be redirected to the "(.*)" page on the View and Change service$
  def thenTheUserShouldBeRedirectedToTheXPageOnTheViewAndChangeService(title: String): Unit = {
    Driver.instance.getTitle should be(s"$title - $viewAndChangeServiceName - $govUkExtension")
  }

  // ^the user should be redirected to V&C "(.*)" page on the View and Change service$
  def thenTheUserShouldBeRedirectedToVandCXPageOnTheViewAndChangeService(title: String): Unit = {
    Driver.instance.getTitle should be(s"$title")
  }

  // ^the user should be redirected to the "(.*)" agent page on the View and Change service$
  def thenTheUserShouldBeRedirectedToTheXAgentPageOnTheViewAndChangeService(title: String): Unit = {
    Driver.instance.getTitle should be(s"$title - $viewAndChangeServiceNameAgent - $govUkExtension")
  }

  // ^the user should be redirected to V&C "(.*)" agent page on the View and Change service$
  def thenTheUserShouldBeRedirectedToVandCXAgentPageOnTheViewAndChangeService(title: String): Unit = {
    Driver.instance.getTitle should be(s"$title")
  }

  // ^the user should be taken to the "(.*)" test-only page on the View and Change service$
  def thenTheUserShouldBeTakenToTheXTestonlyPageOnTheViewAndChangeService(title: String): Unit = {
    Driver.instance.getTitle should be(s"$title - $testOnlyViewAndChangeServiceName - $govUkExtension")
  }

  // ^the user should be taken to V&C "(.*C)" test-only page on the View and Change service$
  def thenTheUserShouldBeTakenToVandCXTestonlyPageOnTheViewAndChangeService(title: String): Unit = {
    Driver.instance.getTitle should be(s"$title")
  }

  // ^the user goes back to the previous page in their browser's history$
  def whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory(): Unit = {
    CommonPageOld.navigateBack()
  }

  // ^the user clicks on the (.*) link$
  def whenTheUserClicksOnTheXLink(): Unit = {
    linkName: String =>
      CommonPageOld.clickOnLink(linkName)
  }
  def whenTheUserClicksOnTheXLink(linkName: String): Unit = {
    CommonPageOld.clickOnLink(linkName)
  }

  // ^the user selects the (.*) radio button$
  def whenTheUserSelectsTheXRadioButton(): Unit = {
    radioButtonIdentifier: String =>
      CommonPageOld.clickOnRadioButton(radioButtonIdentifier)
  }
  def whenTheUserSelectsTheXRadioButton(radioButtonIdentifier: String): Unit = {
        CommonPageOld.clickOnRadioButton(radioButtonIdentifier)
  }

  // ^the user selects the (.*) radio button and clicks the (.*) button$
  def whenTheUserSelectsTheXRadioButtonAndClicksTheXButton(radioButtonIdentifier: String, buttonTitle: String): Unit = {
    CommonPageOld.clickOnRadioButton(radioButtonIdentifier)
        CommonPageOld.clickOnButton(buttonTitle)
  }

  // ^the user deselects the (.*) radio button$
  def whenTheUserDeselectsTheXRadioButton(): Unit = {
    radioButtonIdentifier: String =>
      CommonPageOld.deselectRadioButton(radioButtonIdentifier)
  }
  def whenTheUserDeselectsTheXRadioButton(radioButtonIdentifier: String): Unit = {
    CommonPageOld.deselectRadioButton(radioButtonIdentifier)
  }

  // ^the user selects the (.*) radio button: (.*)$
  def whenTheUserSelectsTheXRadioButtonX(radioButtonIdentifier: String, buttonName: String): Unit = {
    CommonPageOld.clickOnRadioButton(radioButtonIdentifier)
  }

  // ^the user clicks the (.*) button$
  def whenTheUserClicksTheXButton(): Unit = {
    buttonTitle: String =>
      CommonPageOld.clickOnButton(buttonTitle)
  }
  def whenTheUserClicksTheXButton(buttonTitle: String): Unit = {
    CommonPageOld.clickOnButton(buttonTitle)
  }

  // ^the user clicks the (.*) checkbox$
  def whenTheUserClicksTheXCheckbox(): Unit = { //old
    checkboxTitle: String =>
      CommonPageOld.clickOnCheckbox(checkboxTitle)
  }
  def whenTheUserClicksTheXCheckbox(checkboxTitle: String): Unit = {
    CommonPageOld.clickOnCheckbox(checkboxTitle)
  }

  // ^the user clicks the following checkboxes:$
  def whenTheUserClicksTheFollowingCheckboxes(checkboxTitles:  Seq[String]): Unit = {
    checkboxTitles.foreach { checkboxTitle =>
          CommonPageOld.clickOnCheckbox(checkboxTitle)
        }
  }

  // Overload for ScalaTest (no DataTable, accepts varargs)
//  def whenTheUserClicksTheFollowingCheckboxes(links: (String, String)*): Unit = {
//    links.foreach { case (text, url) =>
//      fluentWait.until(ExpectedConditions.elementToBeClickable(
//          Driver.instance.findElement(By.id(url))
//        )
//      )
//      verifyLinkById(url, text)
//    }
//  }

  // ^the user clicks all checkboxes$
  def whenTheUserClicksAllCheckboxes(): Unit = {
    CommonPageOld.clickAllCheckboxes()
  }

  // ^the user clicks the (.*) dropdown and selects (.*)$
  def whenTheUserClicksTheXDropdownAndSelectsX(dropdownTitle: String, dropdownValue: String): Unit = {
    dropdownValue match {
          case "5 January" =>
            CommonPageOld.clickOnDropdown(dropdownTitle, dropdownValue + " " + taxYearEOY)
          case _ =>
            CommonPageOld.clickOnDropdown(dropdownTitle, dropdownValue + " " + taxYearMinusTwo)
        }
  }

  // ^the user clicks both the (.*) and (.*) checkboxes$
  def whenTheUserClicksBothTheXAndXCheckboxes(checkbox1Title: String, checkbox2Title: String): Unit = {
    CommonPageOld.clickOnCheckbox(checkbox1Title)
        CommonPageOld.clickOnCheckbox(checkbox2Title)
  }

  // ^the user clicks the (.*) tailoring option$
  def whenTheUserClicksTheXTailoringOption(checkboxTitle: String): Unit = {
    CommonPageOld.attemptToClickOnCheckbox(checkboxTitle)
  }

  // ^the user selects the (.*) field and enters a value of (.*)$
  def whenTheUserSelectsTheXFieldAndEntersAValueOfX(valueTextBox: String, value: String): Unit = {
    if (value == "EOY" || value ==  "TaxYearMinusTwo") {
          val year: String = replaceTaxYear(value)
          CommonPageOld.enterValue(valueTextBox, year)
        } else {
          CommonPageOld.enterValue(valueTextBox, value)
        }
  }

  // ^the user should see the (.*) field with the value of (.*)$
  def thenTheUserShouldSeeTheXFieldWithTheValueOfX(valueTextBox: String, expectedValue: String): Unit = {
    CommonPageOld.checkValue(valueTextBox, expectedValue) shouldEqual true
  }

  // ^the user should see the correct (.*) url$
  def thenTheUserShouldSeeTheCorrectXUrl(url: String): Unit = {
    val expectedUrl: (String, String) = url match {
          case "Accessibility Statement" => ("Accessibility statement", "/accessibility-statement/income-tax-submission")
          case "sign out" => ("Sign out", "/update-and-submit-income-tax-return/sign-out")
          case "personal income sign out" => ("Sign out", "/update-and-submit-income-tax-return/personal-income/sign-out")
          case "Authorise you as an agent" => ("authorise you as their agent (opens in new tab)", "https://www.gov.uk/guidance/client-authorisation-an-overview")
          case "employment sign out" => ("Sign out", "/update-and-submit-income-tax-return/employment-income/sign-out")
          case _ => fail("Invalid url input parameter")
        }
        Driver.instance.findElement(By.linkText(expectedUrl._1)).getAttribute("href") should include(expectedUrl._2)
  }

  // ^the user navigates to the (.*) page$
  def thenTheUserNavigatesToTheXPage(url: String): Unit = {
    val expectedUrl: String = url match {
          case "untaxed interest" => s"http://localhost:9308/update-and-submit-income-tax-return/personal-income/$taxYear/interest/untaxed-uk-interest"
          case "employment summary" => s"http://localhost:9317/update-and-submit-income-tax-return/employment-income/$taxYear/employment-summary"
          case "interest check your answers" => s"http://localhost:9308/update-and-submit-income-tax-return/personal-income/$taxYear/interest/check-interest"
          case "V&C login page" => "http://localhost:9081/report-quarterly/income-and-expenses/view/test-only/custom-login"
          case "final tax overview" => s"http://localhost:9302/update-and-submit-income-tax-return/$taxYearEOY/income-tax-return-overview"
          case "tax view" => s"http://localhost:9302/update-and-submit-income-tax-return/$taxYear/income-tax-return-overview"
          case "tax overview for individuals" => "http://localhost:9081/report-quarterly/income-and-expenses/view/tax-overview"
          case "tax overview for agents" => "http://localhost:9081/report-quarterly/income-and-expenses/view/agents/tax-overview"
          case "auth login" => AuthLoginPageOld.url
          //TODO remove pension summary pages when link on overview page is created
          case "pensions summary page" => s"http://localhost:9321/update-and-submit-income-tax-return/pensions/$taxYearEOY/pensions-summary"
          case "pensions summary page in year" => s"http://localhost:9321/update-and-submit-income-tax-return/pensions/$taxYear/pensions-summary"
          //TODO remove URl when tailor you return is hooked with submission frontend
          case "Tailor return start" => s"http://localhost:10007/update-and-submit-income-tax-return/tailored-return/$taxYearEOY/start"
          case "QA Tailor return start" => s"https://www.qa.tax.service.gov.uk/update-and-submit-income-tax-return/tailored-return/$taxYearEOY/start"
          case "Payments into pensions" => s"http://localhost:10007/update-and-submit-income-tax-return/tailored-return/$taxYearEOY/payments-pensions"
          case "Rental income" => s"http://localhost:10007/update-and-submit-income-tax-return/tailored-return/$taxYearEOY/property-pensions-investments/rental-income"
          //TODO: Remove the below when the Business Tax Reliefs have been added to Tailor Return and Tax Return Overview
          case "Post-cessation trade relief" => AdditionalInfoPageOld.postCessationTradeReliefUrl(taxYear)
          case "Non-deductible Loan Interest relief" => AdditionalInfoPageOld.nonDeductibleLoanInterestReliefUrl(taxYear)
          case "Qualifying loan interest relief" => AdditionalInfoPageOld.qualifyingLoanInterestReliefUrl(taxYear)
          case _ => fail("Invalid url input parameter")
        }
        Driver.instance.navigate().to(expectedUrl)
  }

  // ^the user (.*) is selected on V&C page$
  def givenTheUserXIsSelectedOnVandCPage(nino: String): Unit = {
    selectDropDownOptionByValue("nino", nino)
  }

  // ^the agent checkbox on V&C page is selected$
  def givenTheAgentCheckboxOnVandCPageIsSelected(): Unit = {
    clickOnAgentCheckbox()
  }

  // ^the user clicks the Login button on the V&C page$
  def givenTheUserClicksTheLoginButtonOnTheVandCPage(): Unit = {
    clickOnButton("vcLoginButton")
  }

  // ^the user navigates to the (.*) page for (.*)$
  def thenTheUserNavigatesToTheXPageForX(url: String, taxYear: String): Unit = {
    val expectedTaxYear = replaceTaxYear(taxYear)
        val expectedUrl: String = url match {
          case "Test only clear data" => s"http://localhost:10007/update-and-submit-income-tax-return/tailored-return/test-only/$expectedTaxYear/clear-data"
          case "Test only add data"   => s"http://localhost:10007/update-and-submit-income-tax-return/tailored-return/test-only/$expectedTaxYear/add-data"
          case _ => fail("Invalid url input parameter")
        }
        Driver.instance.navigate().to(expectedUrl)
  }

  // ^the user navigates to the current page with tax year "(.*)"$
  def thenTheUserNavigatesToTheCurrentPageWithTaxYearX(taxYear: Int): Unit = {
    val currentUrl = Driver.instance.getCurrentUrl
        val newUrl = currentUrl.replace("2023", s"$taxYear")
        Driver.instance.navigate().to(newUrl)
  }

  // ^the user can click the (.*) link and it navigates to the (.*) page$
  def thenTheUserCanClickTheXLinkAndItNavigatesToTheXPage(linkName: String, url: String): Unit = {
    val selector: By = load("Clickable " + linkName)

        val expectedUrl: String = url match {
          case "employment summary" => "http://localhost:9317/update-and-submit-income-tax-return/employment-income/2023/employment-summary"
          case _ => fail("Invalid url input parameter")
        }

        Driver.instance.findElement(selector).getAttribute("href") shouldBe expectedUrl
  }

  // ^no employment data exists$
  def givenNoEmploymentDataExists(): Unit = {
    if (elementExists(CommonPageOld.load("Employments list item"))) {
          while (elementExists(CommonPageOld.load("remove employment"))) {
            clickOn(CommonPageOld.load("remove employment")) // Click remove employment link
            clickOn(CommonPageOld.load("Remove employer")) // Click remove employer button
          }
        }
  }

  // ^no expenses data exists$
  def givenNoExpensesDataExists(): Unit = {
    if (elementExists(CommonPageOld.load("Expenses list item"))) {
          if (elementExists(CommonPageOld.load("remove expenses"))) {
            CommonPageOld.clickOnLink("remove expenses")
            CommonPageOld.clickOnButton("Remove expenses")
          }
        }
  }

  // ^no cis deductions data exists$
  def givenNoCisDeductionsDataExists(): Unit = {
    val contractor = CommonPageOld.load("first contractor")
        while (elementExists(contractor)) {
          clickOn(contractor)
          val removeLink = CommonPageOld.load("first month remove")
          while (elementExists(removeLink)) {
            clickOn(removeLink)
            clickOn(CommonPageOld.load("Remove period"))
          }
          clickOn(CommonPageOld.load("cis deductions"))
        }
  }

  // no claims exist
  def givenNoClaimsExist(): Unit = {
    val selector = CommonPageOld.load("first view")
        while (elementExists(selector)) {
          clickOn(selector)
          clickOn(CommonPageOld.load("remove claim"))
          clickOn(CommonPageOld.load("Remove claim"))
        }
  }

  // the existing data in service (.*) is cleared for nino (.*)$
  def givenTheExistingDataInServiceXIsClearedForNinoX(serviceName: String, nino: String): Unit = {
    val expectedUrl: String = serviceName match {
          case "pensions" => s"http://localhost:9322/test-only/income-tax-pensions/test-clear-all-data/$nino"
          case _ => fail("Invalid url input parameter")
        }
        Driver.instance.navigate().to(expectedUrl)
  }

  // ^the (.*) is displayed$
  def thenTheXIsDisplayed(valueElement: String): Unit = {
    val selector = CommonPageOld.load(valueElement)
        elementExists(selector)
  }

  // ^the user clicks on the change scheme link in position (.*)$
  def whenTheUserClicksOnTheChangeSchemeLinkInPositionX(): Unit = {
    position: String =>
        CommonPageOld.clickBySelector(s"div > dl > div:nth-child($position) > dd.hmrc-add-to-a-list__change > a")
  }

  // ^the user should be redirected to the "(.*)" page under self employment$
  def thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment(title: String): Unit = {

    Driver.instance.getTitle.replace("\u00A0", " ") should be(s"$title - $selfEmployment - $govUkExtension")
  }

  // ^the user should be redirected to the "(.*)" page for pensions$
  def thenTheUserShouldBeRedirectedToTheXPageForPensions(title: String): Unit = {
    Driver.instance.getTitle.replace("\u00A0", " ") should be(s"$title - $pensions - $govUkExtension")
  }

  // ^the user visits Gains gateway$
  def thenTheUserVisitsGainsGateway(): Unit = {
    Driver.instance.navigate().to("http://localhost:10005/update-and-submit-income-tax-return/additional-information/2024/gains/gains-gateway")
  }

}
