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

package specs.selfEmployment

import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import specs.BaseSpec
import specsteps.AuthStepDefSteps.givenTheUserLogsIntoTheServiceWithTheFollowingDetails
import specsteps.CommonStepDefSteps._
import uk.gov.hmrc.test.ui.pages.CommonPageOld.{taxYearEOY, taxYearMinusTwo}

class SelfEmploymentAccrualAccountingJourneySpec extends BaseSpec {

  private val individualUser: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/EOY/start"),
    Map("Credential Strength" -> "strong"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Individual"),
    Map("Nino" -> "BB000002A"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567890")
  )

  override def beforeEach(): Unit = {
    startBrowser()
    Given("the user logs into the service with the following details")
    thenTheUserNavigatesToTheXPage("auth login")
    givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

    And("clicks continue on the Update and submit an Income Tax Return page")
    thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")
    whenTheUserClicksTheXButton("continue")

    Then("the user should be redirected to the Your Income Tax Return page")
    thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")
  }

  Feature("Self Employment Accrual Accounting Journey") {

    Scenario("1 - Individual - Add section and review self-employments") {
      When("the user clicks on the addSections link")
        whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addSelfEmployment tailoring option")
        whenTheUserClicksTheXTailoringOption("addSelfEmployment")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Self Employment link")
        whenTheUserClicksOnTheXLink("Self Employment")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

    }

    Scenario("2 - Individual - Self-employment abroad") {
      When("the user clicks on the Self Employment link")
        whenTheUserClicksOnTheXLink("Self Employment")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Review self-employments link")
        whenTheUserClicksOnTheXLink("Review self-employments")

      Then("the user should be redirected to the Check your self-employment details page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your self-employment details")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button")
        whenTheUserSelectsTheXRadioButton("Yes, I’ve completed this section")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Industry sectors and working abroad link")
        whenTheUserClicksOnTheXLink("Industry sectors and working abroad")

      Then("the user should be redirected to the Were you a farmer or market gardener? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Were you a farmer or market gardener?")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Did you get over half of your profit from literary or creative works? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Did you get over half of your profit from literary or creative works?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your details page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your details")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

    }

    Scenario("3 - Individual - Income and expenses") {
      When("the user clicks on the Self Employment link")
        whenTheUserClicksOnTheXLink("Self Employment")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Self-employment Income link")
        whenTheUserClicksOnTheXLink("Self-employment Income")

      Then("the user should be redirected to the Income not counted as turnover page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Income not counted as turnover")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the How much non-turnover income did you get? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much non-turnover income did you get?")

      And("the user selects the Amount-field field and enters a value of 20000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "20000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Your turnover page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Your turnover")

      And("the user selects the Amount-field field and enters a value of 50000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "50000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Is there any other self-employment income you need to tell us about? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Is there any other self-employment income you need to tell us about?")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the How much other self-employment income did you get? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much other self-employment income did you get?")

      And("the user selects the Amount-field field and enters a value of 100000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "100000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Turnover exempt from tax page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Turnover exempt from tax")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the How much of your turnover is exempt from being taxed as profit? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of your turnover is exempt from being taxed as profit?")

      And("the user selects the Amount-field field and enters a value of 120,000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "120,000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Trading allowance page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Trading allowance")

      When("the user selects the Use the trading allowance radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Use the trading allowance", "Continue")

      Then("the user should be redirected to the Trading allowance for income under £1,000 page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Trading allowance for income under £1,000")

      When("the user selects the second radio button radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("second radio button", "Continue")

      Then("the user should be redirected to the How much trading allowance do you want to use? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much trading allowance do you want to use?")

      And("the user selects the Amount-field field and enters a value of 999")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "999")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your income page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your income")

      When("the user clicks on the Do you want to use trading allowance or declare expense link")
        whenTheUserClicksOnTheXLink("Do you want to use trading allowance or declare expense")

      When("the user selects the Declare expenses radio button")
        whenTheUserSelectsTheXRadioButton("Declare expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your income page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your income")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

    }

    Scenario("4 - Individual - Expenses categories") {
      When("the user clicks on the Self Employment link")
        whenTheUserClicksOnTheXLink("Self Employment")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Self-employment Expenses categories link")
        whenTheUserClicksOnTheXLink("Self-employment Expenses categories")

      Then("the user should be redirected to the How will you report your expenses? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How will you report your expenses?")

      When("the user selects the second radio button radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("second radio button", "Continue")

      Then("the user should be redirected to the Office supplies page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Office supplies")

      When("the user selects the second radio button radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("second radio button", "Continue")

      Then("the user should be redirected to the Goods to sell or use page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Goods to sell or use")

      When("the user selects the second radio button radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("second radio button", "Continue")

      Then("the user should be redirected to the Repairs and maintenance page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Repairs and maintenance")

      When("the user selects the second radio button radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("second radio button", "Continue")

      Then("the user should be redirected to the Did you work from home? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Did you work from home?")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Did you work from your own business premises? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Did you work from your own business premises?")

      When("the user selects the second radio button radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("second radio button", "Continue")

      Then("the user should be redirected to the Travel and accommodation for work page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Travel and accommodation for work")

      When("the user selects the third radio button radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("third radio button", "Continue")

      Then("the user should be redirected to the Advertising or marketing page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Advertising or marketing")

      When("the user selects the second radio button radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("second radio button", "Continue")

      Then("the user should be redirected to the Entertainment costs page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Entertainment costs")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Staff, construction industry and professional services expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Staff, construction industry and professional services expenses")

      When("the user clicks the following checkboxes")
        whenTheUserClicksTheFollowingCheckboxes(Seq("first option", "second option", "third option"))

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Disallowable staff costs page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Disallowable staff costs")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Disallowable construction industry subcontractors costs page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Disallowable construction industry subcontractors costs")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Disallowable professional fees page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Disallowable professional fees")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Financial expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Financial expenses")

      When("the user clicks the following checkboxes")
        whenTheUserClicksTheFollowingCheckboxes(Seq("first option", "second option", "third option"))

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Is any of your interest on bank and other business loans disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Is any of your interest on bank and other business loans disallowable?")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Are any of your bank, credit card and other financial charges disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Are any of your bank, credit card and other financial charges disallowable?")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Are any of your irrecoverable debts disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Are any of your irrecoverable debts disallowable?")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Depreciation and loss or profit on the sale of assets page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Depreciation and loss or profit on the sale of assets")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Other expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Other expenses")

      When("the user selects the second radio button radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("second radio button", "Continue")

      Then("the user should be redirected to the Check your expenses categories page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your expenses categories")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Office supplies link")
        whenTheUserClicksOnTheXLink("Office supplies")

      Then("the user should be redirected to the How much did you spend on office supplies? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on office supplies?")

      And("the user selects the Amount-field field and enters a value of 3000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "3000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £3,000.89 you spent on office supplies is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £3,000.89 you spent on office supplies is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your office supplies expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your office supplies expenses")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Goods to sell or use link")
        whenTheUserClicksOnTheXLink("Goods to sell or use")

      Then("the user should be redirected to the Were you a taxi, minicab or road haulage industry driver? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Were you a taxi, minicab or road haulage industry driver?")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the How much did you spend on goods to sell or use? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on goods to sell or use?")

      And("the user selects the Amount-field field and enters a value of 7,677.00")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "7,677.00")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £7,677.00 you spent on goods to sell or use is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £7,677.00 you spent on goods to sell or use is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your goods to sell or use expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your goods to sell or use expenses")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Repairs and maintenance link")
        whenTheUserClicksOnTheXLink("Repairs and maintenance")

      Then("the user should be redirected to the How much did you spend on repairs and maintenance? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on repairs and maintenance?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £1,677.57 you spent on repairs and maintenance is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £1,677.57 you spent on repairs and maintenance is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your repairs and maintenance costs page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your repairs and maintenance costs")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Workplace running costs (including working from home) link")
        whenTheUserClicksOnTheXLink("Workplace running costs (including working from home)")

      Then("the user should be redirected to the Did you work from home for more than 25 hours a month? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Did you work from home for more than 25 hours a month?")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the How much did you work from home? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you work from home?")

      And("the user selects the 25 - 50 hours field and enters a value of 5")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("25 - 50 hours", "5")

      And("the user selects the 51 - 100 hours field and enters a value of 5")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("51 - 100 hours", "5")

      And("the user selects the 101 hours or more field and enters a value of 2")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("101 hours or more", "2")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Your flat rate for working from home is £192 page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Your flat rate for working from home is £192")

      When("the user selects the Actual costs radio button")
        whenTheUserSelectsTheXRadioButton("Actual costs")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Working-from-home expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPage("Working-from-home expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Your working-from-home expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPage("Your working-from-home expenses")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Did you live at your business premises? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Did you live at your business premises?")

      When("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Business premises expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPage("Business premises expenses")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £1,000.89 you spent on business premises expenses is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPage("How much of the £1,000.89 you spent on business premises expenses is disallowable?")

      And("the user selects the Amount-field field and enters a value of 900.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "900.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How many months did someone live at your business premises? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How many months did someone live at your business premises?")

      And("the user selects the 1 person field and enters a value of 5")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("1 person", "5")

      And("the user selects the 2 people field and enters a value of 5")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("2 people", "5")

      And("the user selects the 3 or more people field and enters a value of 2")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("3 or more people", "2")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Your personal use amount for living at your business premises is £5,550 page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Your personal use amount for living at your business premises is £5,550")

      When("the user selects the Actual costs radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Actual costs", "Continue")

      Then("the user should be redirected to the How much are you claiming as your personal use amount? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much are you claiming as your personal use amount?")

      And("the user selects the Amount-field field and enters a value of 600.67")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "600.67")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your workplace running costs page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your workplace running costs")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Advertising or marketing link")
        whenTheUserClicksOnTheXLink("Advertising or marketing")

      Then("the user should be redirected to the How much did you spend on advertising or marketing? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on advertising or marketing?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £1,677.57 you spent on advertising or marketing is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £1,677.57 you spent on advertising or marketing is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your advertising or marketing expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your advertising or marketing expenses")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Entertainment costs link")
        whenTheUserClicksOnTheXLink("Entertainment costs")

      Then("the user should be redirected to the How much did you spend on entertainment? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on entertainment?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your entertainment expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your entertainment expenses")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Staff costs link")
        whenTheUserClicksOnTheXLink("Staff costs")

      Then("the user should be redirected to the How much did you spend on staff costs? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on staff costs?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £1,677.57 you spent on staff costs is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £1,677.57 you spent on staff costs is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your staff costs page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your staff costs")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Construction industry subcontractors link")
        whenTheUserClicksOnTheXLink("Construction industry subcontractors")

      Then("the user should be redirected to the How much did you spend on construction industry expenses? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on construction industry expenses?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £1,677.57 you spent on construction industry expenses is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £1,677.57 you spent on construction industry expenses is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your construction industry subcontractors expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your construction industry subcontractors expenses")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Professional fess link")
        whenTheUserClicksOnTheXLink("Professional fess")

      Then("the user should be redirected to the How much did you spend on professional fees? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on professional fees?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £1,677.57 you spent on professional fees is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £1,677.57 you spent on professional fees is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your professional fees page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your professional fees")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Interest paid on bank and other business loans link")
        whenTheUserClicksOnTheXLink("Interest paid on bank and other business loans")

      Then("the user should be redirected to the How much did you spend on interest on bank and other business loans? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on interest on bank and other business loans?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £1,677.57 you spent on interest on bank and other business loans is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £1,677.57 you spent on interest on bank and other business loans is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your interest paid on loans expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your interest paid on loans expenses")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Bank, credit card and other financial charges link")
        whenTheUserClicksOnTheXLink("Bank, credit card and other financial charges")

      Then("the user should be redirected to the How much did you spend on bank, credit card and other financial charges? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on bank, credit card and other financial charges?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £1,677.57 you spent on bank, credit card and other financial charges is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £1,677.57 you spent on bank, credit card and other financial charges is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your financial charges expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your financial charges expenses")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Irrecoverable debt link")
        whenTheUserClicksOnTheXLink("Irrecoverable debt")

      Then("the user should be redirected to the What is the value of the irrecoverable debts you’ve written off? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("What is the value of the irrecoverable debts you’ve written off?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £1,677.57 you’re claiming in irrecoverable debts is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £1,677.57 you’re claiming in irrecoverable debts is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your irrecoverable debts page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your irrecoverable debts")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Depreciation costs link")
        whenTheUserClicksOnTheXLink("Depreciation costs")

      Then("the user should be redirected to the How much are you claiming in depreciation costs? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much are you claiming in depreciation costs?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your depreciation costs page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your depreciation costs")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Other expenses link")
        whenTheUserClicksOnTheXLink("Other expenses")

      Then("the user should be redirected to the How much did you spend on other expenses? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you spend on other expenses?")

      And("the user selects the Amount-field field and enters a value of 1,677.57")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,677.57")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of the £1,677.57 you spent on other expenses is disallowable? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the £1,677.57 you spent on other expenses is disallowable?")

      And("the user selects the Amount-field field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1000.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your other expenses page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your other expenses")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Allowances for vehicles, equipment and buildings link")
        whenTheUserClicksOnTheXLink("Allowances for vehicles, equipment and buildings")

      Then("the user should be redirected to the Allowances for vehicles, equipment and buildings page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Allowances for vehicles, equipment and buildings")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Choose which allowances you want to claim page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Choose which allowances you want to claim")

      And("the user clicks all checkboxes")
        whenTheUserClicksAllCheckboxes()

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      When("the user clicks on the Zero-emission cars link")
        whenTheUserClicksOnTheXLink("Zero-emission cars")

      Then("the user should be redirected to the Zero-emission cars page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Zero-emission cars")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Zero-emission car allowance page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Zero-emission car allowance")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the What was the total cost of the car, in pounds? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("What was the total cost of the car, in pounds?")

      And("the user selects the Amount-field field and enters a value of 1,000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Did you only use the car for your self-employment? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Did you only use the car for your self-employment?")

      And("the user selects the no radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("no", "Continue")

      Then("the user should be redirected to the How much did you use the car outside your self-employment? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you use the car outside your self-employment?")

      And("the user selects the 10 percent radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("10 percent", "Continue")

      Then("the user should be redirected to the How much of your car’s cost do you want to claim under the 100% allowance? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of your car’s cost do you want to claim under the 100% allowance?")

      And("the user selects the full cost radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("full cost", "Continue")

      Then("the user should be redirected to the Check your answers page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your answers")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Zero-emission goods vehicles link")
        whenTheUserClicksOnTheXLink("Zero-emission goods vehicles")

      Then("the user should be redirected to the Zero-emission goods vehicles page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Zero-emission goods vehicles")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Zero-emission goods vehicle allowance page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Zero-emission goods vehicle allowance")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the What was the total cost of the vehicle, in pounds? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("What was the total cost of the vehicle, in pounds?")

      And("the user selects the Amount-field field and enters a value of 1,000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Did you only use the vehicle for your self-employment? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Did you only use the vehicle for your self-employment?")

      And("the user selects the no radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("no", "Continue")

      Then("the user should be redirected to the How much did you use the vehicle outside your self-employment? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much did you use the vehicle outside your self-employment?")

      And("the user selects the 10 percent radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("10 percent", "Continue")

      Then("the user should be redirected to the How much of the vehicle’s cost do you want to claim under this 100% allowance? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of the vehicle’s cost do you want to claim under this 100% allowance?")

      And("the user selects the full cost radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("full cost", "Continue")

      Then("the user should be redirected to the Check your answers page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your answers")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Structures and buildings allowance link")
        whenTheUserClicksOnTheXLink("Structures and buildings allowance")

      Then("the user should be redirected to the Structures and buildings allowance page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Structures and buildings allowance")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Can you still claim? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Can you still claim?")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Qualifying use page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Qualifying use")

      And("the user selects the QualifyingUse Day field and enters a value of 24")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("QualifyingUse Day", "24")

      And("the user selects the QualifyingUse Month field and enters a value of 09")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("QualifyingUse Month", "09")

      And("the user selects the QualifyingUse Year field and enters a value of 2021")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("QualifyingUse Year", "2021")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the What was the total qualifying expenditure on this building? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("What was the total qualifying expenditure on this building?")

      And("the user selects the Amount-field field and enters a value of 1,456.54")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,456.54")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Where is the new structure or building located? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Where is the new structure or building located?")

      And("the user selects the Building name field and enters a value of Self-Employment Business ONE")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building name", "Self-Employment Business ONE")

      And("the user selects the Building number field and enters a value of 24")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building number", "24")

      And("the user selects the Postcode field and enters a value of BN1 1AA")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Postcode", "BN1 1AA")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Claim amount page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Claim amount")

      And("the user selects the Amount-field field and enters a value of 1,124.78")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,124.78")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the New structures or buildings page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("New structures or buildings")

      And("the user selects the no radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("no", "Continue")

      Then("the user should be redirected to the Can you still claim? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Can you still claim?")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Claim amount page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Claim amount")

      And("the user selects the Amount-field field and enters a value of 999")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "999")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your answers")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Freeport sites link")
        whenTheUserClicksOnTheXLink("Freeport sites")

      Then("the user should be redirected to the Special tax sites allowance page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Special tax sites allowance")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Date construction started page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Date construction started")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the When was the earliest contract entered into? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("When was the earliest contract entered into?")

      And("the user selects the Construction start Day field and enters a value of 24")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Construction start Day", "24")

      And("the user selects the Construction start Month field and enters a value of 09")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Construction start Month", "09")

      And("the user selects the Construction start Year field and enters a value of 2021")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Construction start Year", "2021")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Qualifying use page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Qualifying use")

      And("the user selects the Qualifying start Day field and enters a value of 24")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Qualifying start Day", "24")

      And("the user selects the Qualifying start Month field and enters a value of 09")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Qualifying start Month", "09")

      And("the user selects the Qualifying start Year field and enters a value of 2021")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Qualifying start Year", "2021")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the What was the total qualifying expenditure on this building? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("What was the total qualifying expenditure on this building?")

      And("the user selects the Amount-field field and enters a value of 999")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "999")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Where is the special tax site located? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Where is the special tax site located?")

      And("the user selects the Building name field and enters a value of Self-Employment Business ONE")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building name", "Self-Employment Business ONE")

      And("the user selects the Building number field and enters a value of 24")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building number", "24")

      And("the user selects the Postcode field and enters a value of BN1 1AA")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Postcode", "BN1 1AA")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much enhanced structures and buildings allowance do you want to claim? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much enhanced structures and buildings allowance do you want to claim?")

      And("the user selects the Amount-field field and enters a value of 1,000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the New special tax site structures or buildings page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("New special tax site structures or buildings")

      And("the user selects the no radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("no", "Continue")

      Then("the user should be redirected to the Do you have a continuing claim for enhanced structures and buildings allowance? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Do you have a continuing claim for enhanced structures and buildings allowance?")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Do you want to continue to claim this allowance for an existing site? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Do you want to continue to claim this allowance for an existing site?")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Claim amount page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Claim amount")

      And("the user selects the Amount-field field and enters a value of 999")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "999")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your answers")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Annual investment allowance link")
        whenTheUserClicksOnTheXLink("Annual investment allowance")

      Then("the user should be redirected to the Annual investment allowance page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Annual investment allowance")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the How much annual investment allowance do you want to claim? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much annual investment allowance do you want to claim?")

      And("the user selects the Amount-field field and enters a value of 1,000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your answers")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Writing down allowance link")
        whenTheUserClicksOnTheXLink("'Writing down' allowance")

      Then("the user should be redirected to the ‘Writing down’ allowance page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("‘Writing down’ allowance")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Special rate (6%) pool page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Special rate (6%) pool")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Claim amount page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Claim amount")

      And("the user selects the Amount-field field and enters a value of 1,000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Main rate (18%) pool page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Main rate (18%) pool")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Claim amount page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Claim amount")

      And("the user selects the Amount-field field and enters a value of 999")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "999")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Single asset pools page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Single asset pools")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Claim amount for single asset pools page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Claim amount for single asset pools")

      And("the user selects the Amount-field field and enters a value of 999")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "999")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your answers")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Balancing allowance link")
        whenTheUserClicksOnTheXLink("Balancing allowance")

      Then("the user should be redirected to the Do you have a balancing allowance to report? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Do you have a balancing allowance to report?")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the How much is the total of your balancing allowances? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much is the total of your balancing allowances?")

      And("the user selects the Amount-field field and enters a value of 1,000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your answers")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Balancing charge link")
        whenTheUserClicksOnTheXLink("Balancing charge")

      Then("the user should be redirected to the Do you have a balancing charge to report? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Do you have a balancing charge to report?")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the How much is the total of your balancing charges? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much is the total of your balancing charges?")

      And("the user selects the Amount-field field and enters a value of 1,000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your answers")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Work out your adjusted profit or loss link")
        whenTheUserClicksOnTheXLink("Work out your adjusted profit or loss")

      Then("the user should be redirected to the Goods and services for your own use page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Goods and services for your own use")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the What was the market value of the goods and services you provided? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("What was the market value of the goods and services you provided?")

      And("the user selects the Amount-field field and enters a value of 567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "567")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Net business loss: £200 page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Net business loss: £200")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Claim a loss relief page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Claim a loss relief")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Loss for the taxYearMinusTwo to EOY tax year page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment(s"Loss for the $taxYearMinusTwo to $taxYearEOY tax year")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      Then("the user should be redirected to the Did Circus Performer A1 have any unused losses in previous years? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Did Circus Performer A1 have any unused losses in previous years?")

      And("the user selects the yes radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("yes", "Continue")

      And("the user selects the Amount-field field and enters a value of 1,456")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "1,456")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the When you reported the loss page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("When you reported the loss")

      When("the user clicks the following checkboxes")
        whenTheUserClicksTheFollowingCheckboxes(Seq("fifth option"))

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your answers")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      And("the user should be redirected to the Adjusted loss: £100 page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Adjusted loss: £100")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button and clicks the Continue button")
        whenTheUserSelectsTheXRadioButtonAndClicksTheXButton("Yes, I’ve completed this section", "Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

    }
  }
}
