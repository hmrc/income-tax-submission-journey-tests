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

package uk.gov.hmrc.test.ui.specs

import uk.gov.hmrc.test.ui.specs.tags.MVP
import uk.gov.hmrc.test.ui.steps.AuthStepDefSteps._
import uk.gov.hmrc.test.ui.steps.CommonStepDefSteps._

@MVP
class StateBenefitsSpec extends BaseSpec {

  val individualLoginDetails: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/EOY/start"),
    Map("Credential Strength" -> "strong"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Individual"),
    Map("Nino" -> "AC160000B"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567890")
  )

  val agentUser: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/test-only/EOY/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890"),
    Map("Credential Strength" -> "strong"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Agent"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567890"),
    Map("Enrolment Key 2" -> "HMRC-AS-AGENT"),
    Map("Identifier Name 2" -> "AgentReferenceNumber"),
    Map("Identifier Value 2" -> "XARN1234567")
  )

  Feature("State Benefits Journeys - Income Tax Submission") {
  //-------------------------------Job Seekers Allowance---------------------------------//
  //--------------------------------------Individual-------------------------------------//
    Scenario("Individual User with pre populated State Benefits data - In Year Deductions") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Jobseeker’s Allowance link")
      whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

      When("the user clicks on the first view link")
      whenTheUserClicksOnTheXLink("first view")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks the state benefit save and continue button")
      whenTheUserClicksTheXButton("state benefit save and continue")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

    }

    Scenario("Individual User adds Jobseeker’s Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Jobseeker’s Allowance link")
      whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

      When("the user selects the Yes, claim Jobseeker's Allowance radio button")
      whenTheUserSelectsTheXRadioButton("Yes, claim Jobseeker's Allowance")

      And("the user clicks the continue, missing claim button")
      whenTheUserClicksTheXButton("continue, missing claim")

      Then("the user should be redirected to the When did you start getting Jobseeker’s Allowance? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did you start getting Jobseeker’s Allowance?")

      When("the user selects the claim day field and enters a value of 01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "01")

      And("the user selects the claim month field and enters a value of 10")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "10")

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the Did this claim end between 1 October TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "1 October TaxYearMinusTwo", "5 April EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")

      And("the user selects the claim month field and enters a value of 03")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "03")

      And("the user selects the claim year field and enters a value of EOY")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the Did you have any tax taken off your Jobseeker’s Allowance between 1 October TaxYearMinusTwo and 2 March EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did you have any tax taken off your Jobseeker’s Allowance", "1 October TaxYearMinusTwo", "2 March EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much Jobseeker’s Allowance did you get between 1 October TaxYearMinusTwo and 2 March EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much Jobseeker’s Allowance did you get", "1 October TaxYearMinusTwo", "2 March EOY")

      When("the user selects the amount field and enters a value of 1100.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "1100.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much tax was taken off your Jobseeker’s Allowance between 1 October TaxYearMinusTwo and 2 March EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much tax was taken off your Jobseeker’s Allowance", "1 October TaxYearMinusTwo", "2 March EOY")

      When("the user selects the amount field and enters a value of 100.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks the state benefit save and continue button")
      whenTheUserClicksTheXButton("state benefit save and continue")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

      When("the user clicks on the first view link")
      whenTheUserClicksOnTheXLink("first view")

      When("the user clicks on the remove claim link")
      whenTheUserClicksOnTheXLink("remove claim")

      Then("the user should be redirected to the Are you sure you want to remove this Jobseeker’s Allowance claim? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this Jobseeker’s Allowance claim?")

      When("the user clicks the Remove claim button")
      whenTheUserClicksTheXButton("Remove claim")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

    }

    Scenario("Individual User edits Jobseeker’s Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Jobseeker’s Allowance link")
      whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

      When("the user clicks on the first view link")
      whenTheUserClicksOnTheXLink("first view")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change start date link")
      whenTheUserClicksOnTheXLink("state benefit change start date")

      Then("the user should be redirected to the When did you start getting Jobseeker’s Allowance? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did you start getting Jobseeker’s Allowance?")

      When("the user selects the claim day field and enters a value of 04")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")

      And("the user selects the claim month field and enters a value of 08")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "08")

      And("the user selects the claim year field and enters a value of 2022")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "2022")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change end date question link")
      whenTheUserClicksOnTheXLink("state benefit change end date question")

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "6 April TaxYearMinusTwo", "5 April EOY")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change end date question link")
      whenTheUserClicksOnTheXLink("state benefit change end date question")

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "6 April TaxYearMinusTwo", "5 April EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 04")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")

      And("the user selects the claim month field and enters a value of 11")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "11")

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change end date link")
      whenTheUserClicksOnTheXLink("state benefit change end date")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 04")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")

      And("the user selects the claim month field and enters a value of 03")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "03")

      And("the user selects the claim year field and enters a value of EOY")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change tax taken question link")
      whenTheUserClicksOnTheXLink("state benefit change tax taken question")

      Then("the user will be redirected to the Did you have any tax taken off your Jobseeker’s Allowance between 6 April TaxYearMinusTwo and 4 March EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did you have any tax taken off your Jobseeker’s Allowance", "6 April TaxYearMinusTwo", "4 March EOY")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change amount link")
      whenTheUserClicksOnTheXLink("state benefit change amount")

      Then("the user will be redirected to the How much Jobseeker’s Allowance did you get between 6 April TaxYearMinusTwo and 4 March EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much Jobseeker’s Allowance did you get", "6 April TaxYearMinusTwo", "4 March EOY")

      When("the user selects the amount field and enters a value of 510.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "510.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change tax taken question link")
      whenTheUserClicksOnTheXLink("state benefit change tax taken question")

      Then("the user will be redirected to the Did you have any tax taken off your Jobseeker’s Allowance between 6 April TaxYearMinusTwo and 4 March EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did you have any tax taken off your Jobseeker’s Allowance", "6 April TaxYearMinusTwo", "4 March EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much tax was taken off your Jobseeker’s Allowance between 6 April TaxYearMinusTwo and 4 March EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much tax was taken off your Jobseeker’s Allowance", "6 April TaxYearMinusTwo", "4 March EOY")

      When("the user selects the amount field and enters a value of 100.23")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.23")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      And("the user clicks the state benefit save and continue button")
      whenTheUserClicksTheXButton("state benefit save and continue")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

    }

    Scenario("Individual User checks flow is correct for EOY") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Jobseeker’s Allowance link")
      whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

      When("the user selects the Yes, claim Jobseeker's Allowance radio button")
      whenTheUserSelectsTheXRadioButton("Yes, claim Jobseeker's Allowance")

      And("the user clicks the continue, missing claim button")
      whenTheUserClicksTheXButton("continue, missing claim")

      Then("the user should be redirected to the When did you start getting Jobseeker’s Allowance? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did you start getting Jobseeker’s Allowance?")

      When("the user selects the claim day field and enters a value of 01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "01")

      And("the user selects the claim month field and enters a value of 07")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "07")

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the Did this claim end between 1 July TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "1 July TaxYearMinusTwo", "5 April EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")

      And("the user selects the claim month field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")

      And("the user selects the claim year field and enters a value of EOY")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the Did you have any tax taken off your Jobseeker’s Allowance between 1 July TaxYearMinusTwo and 2 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did you have any tax taken off your Jobseeker’s Allowance", "1 July TaxYearMinusTwo", "2 February EOY")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much Jobseeker’s Allowance did you get between 1 July TaxYearMinusTwo and 2 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much Jobseeker’s Allowance did you get", "1 July TaxYearMinusTwo", "2 February EOY")

      When("the user selects the amount field and enters a value of 110.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user goes back to the previous page in their browser's history")
      whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      And("the user goes back to the previous page in their browser's history")
      whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user will be redirected to the Did you have any tax taken off your Jobseeker’s Allowance between 1 July TaxYearMinusTwo and 2 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did you have any tax taken off your Jobseeker’s Allowance", "1 July TaxYearMinusTwo", "2 February EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much tax was taken off your Jobseeker’s Allowance between 1 July TaxYearMinusTwo and 2 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much tax was taken off your Jobseeker’s Allowance", "1 July TaxYearMinusTwo", "2 February EOY")

      When("the user selects the amount field and enters a value of 100.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

    }
  //--------------------------------------Agent--------------------------------------//
    Scenario("Agent User with pre populated State benefits data - Check client’s State benefits In Year Deductions") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Jobseeker’s Allowance link")
      whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

      When("the user clicks on the first view link")
      whenTheUserClicksOnTheXLink("first view")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks the state benefit save and continue button")
      whenTheUserClicksTheXButton("state benefit save and continue")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

    }

    Scenario("Agent User adds Jobseeker’s Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Jobseeker’s Allowance link")
      whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

      When("the user selects the Yes, claim Jobseeker's Allowance radio button")
      whenTheUserSelectsTheXRadioButton("Yes, claim Jobseeker's Allowance")

      And("the user clicks the continue, missing claim button")
      whenTheUserClicksTheXButton("continue, missing claim")

      Then("the user should be redirected to the When did your client start getting Jobseeker’s Allowance? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did your client start getting Jobseeker’s Allowance?")

      When("the user selects the claim day field and enters a value of 01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "01")

      And("the user selects the claim month field and enters a value of 11")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "11")

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the Did this claim end between 1 November TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "1 November TaxYearMinusTwo", "5 April EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")

      And("the user selects the claim month field and enters a value of 03")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "03")

      And("the user selects the claim year field and enters a value of EOY")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the Did your client have any tax taken off their Jobseeker’s Allowance between 1 November TaxYearMinusTwo and 2 March EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did your client have any tax taken off their Jobseeker’s Allowance", "1 November TaxYearMinusTwo", "2 March EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much Jobseeker’s Allowance did your client get between 1 November TaxYearMinusTwo and 2 March EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much Jobseeker’s Allowance did your client get", "1 November TaxYearMinusTwo", "2 March EOY")

      When("the user selects the amount field and enters a value of 110.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much tax was taken off your client’s Jobseeker’s Allowance between 1 November TaxYearMinusTwo and 2 March EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much tax was taken off your client’s Jobseeker’s Allowance", "1 November TaxYearMinusTwo", "2 March EOY")

      When("the user selects the amount field and enters a value of 100.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks the state benefit save and continue button")
      whenTheUserClicksTheXButton("state benefit save and continue")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

      When("the user clicks on the state benefit back link")
      whenTheUserClicksOnTheXLink("state benefit back")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

      When("the user clicks on the first view link")
      whenTheUserClicksOnTheXLink("first view")

      When("the user clicks on the remove claim link")
      whenTheUserClicksOnTheXLink("remove claim")

      Then("the user should be redirected to the Are you sure you want to remove this Jobseeker’s Allowance claim? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this Jobseeker’s Allowance claim?")

      When("the user clicks the Remove claim button")
      whenTheUserClicksTheXButton("Remove claim")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

    }

    Scenario("Agent User edits Jobseeker’s Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Jobseeker’s Allowance link")
      whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

      When("the user clicks on the first view link")
      whenTheUserClicksOnTheXLink("first view")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change start date link")
      whenTheUserClicksOnTheXLink("state benefit change start date")

      Then("the user should be redirected to the When did your client start getting Jobseeker’s Allowance? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did your client start getting Jobseeker’s Allowance?")

      When("the user selects the claim day field and enters a value of 04")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")

      And("the user selects the claim month field and enters a value of 08")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "08")

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change end date question link")
      whenTheUserClicksOnTheXLink("state benefit change end date question")

      Then("the user will be redirected to the Did this claim end between 4 August TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "4 August TaxYearMinusTwo", "5 April EOY")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change end date question link")
      whenTheUserClicksOnTheXLink("state benefit change end date question")

      Then("the user will be redirected to the Did this claim end between 4 August TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "4 August TaxYearMinusTwo", "5 April EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 04")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")

      And("the user selects the claim month field and enters a value of 11")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "11")

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change end date link")
      whenTheUserClicksOnTheXLink("state benefit change end date")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 04")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")

      And("the user selects the claim month field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")

      And("the user selects the claim year field and enters a value of EOY")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change tax taken question link")
      whenTheUserClicksOnTheXLink("state benefit change tax taken question")

      Then("the user will be redirected to the Did your client have any tax taken off their Jobseeker’s Allowance between 4 August TaxYearMinusTwo and 4 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did your client have any tax taken off their Jobseeker’s Allowance", "4 August TaxYearMinusTwo", "4 February EOY")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change amount link")
      whenTheUserClicksOnTheXLink("state benefit change amount")

      Then("the user will be redirected to the How much Jobseeker’s Allowance did your client get between 4 August TaxYearMinusTwo and 4 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much Jobseeker’s Allowance did your client get", "4 August TaxYearMinusTwo", "4 February EOY")

      When("the user selects the amount field and enters a value of 510.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "510.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      When("the user clicks on the state benefit change tax taken question link")
      whenTheUserClicksOnTheXLink("state benefit change tax taken question")

      Then("the user will be redirected to the Did your client have any tax taken off their Jobseeker’s Allowance between 4 August TaxYearMinusTwo and 4 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did your client have any tax taken off their Jobseeker’s Allowance", "4 August TaxYearMinusTwo", "4 February EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much tax was taken off your client’s Jobseeker’s Allowance between 4 August TaxYearMinusTwo and 4 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much tax was taken off your client’s Jobseeker’s Allowance", "4 August TaxYearMinusTwo", "4 February EOY")

      When("the user selects the amount field and enters a value of 100.23")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.23")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")

      And("the user clicks the state benefit save and continue button")
      whenTheUserClicksTheXButton("state benefit save and continue")

      Then("the user should be redirected to the Jobseeker’s Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")

    }
  //-----------------------------Employment Support Allowance-----------------------------//
  //--------------------------------------Individual--------------------------------------//
       Scenario("Individual User with pre populated State Benefits data - Employment Support Allowance - In Year Deductions") {
         When("the user logs into the service with the following details")
           givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)
    
         Then("the user should be redirected to Update and submit an Income Tax Return page")
           thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")
    
         When("the user clicks the continue button")
           whenTheUserClicksTheXButton("continue")
    
         Then("the user should be redirected to the Your Income Tax Return page")
           thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")
    
         When("the user clicks on the State benefits link")
           whenTheUserClicksOnTheXLink("State benefits")
    
         Then("the user should be redirected to the State benefits page")
           thenTheUserShouldBeRedirectedToTheXPage("State benefits")
    
         When("the user clicks on the Employment and Support Allowance link")
           whenTheUserClicksOnTheXLink("Employment and Support Allowance")
    
         Then("the user should be redirected to the Employment and Support Allowance page")
           thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")
    
         When("the user clicks on the first view link")
           whenTheUserClicksOnTheXLink("first view")
    
         Then("the user should be redirected to the Review Employment and Support Allowance claim page")
           thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")
    
         When("the user clicks the state benefit save and continue button")
           whenTheUserClicksTheXButton("state benefit save and continue")
    
         Then("the user should be redirected to the Employment and Support Allowance page")
           thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")
    
       }

    Scenario("Individual User adds Employment and Support Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Employment and Support Allowance link")
      whenTheUserClicksOnTheXLink("Employment and Support Allowance")

      Then("the user should be redirected to the Employment and Support Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")

      When("the user selects the Yes, claim Employment and Support Allowance radio button")
      whenTheUserSelectsTheXRadioButton("Yes, claim Employment and Support Allowance")

      And("the user clicks the continue, missing claim button")
      whenTheUserClicksTheXButton("continue, missing claim")

      Then("the user should be redirected to the When did you start getting Employment and Support Allowance? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did you start getting Employment and Support Allowance?")

      When("the user selects the claim day field and enters a value of 01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "01")

      And("the user selects the claim month field and enters a value of 01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "01")

      And("the user selects the claim year field and enters a value of 2023")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "2023")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "6 April TaxYearMinusTwo", "5 April EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")

      And("the user selects the claim month field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")

      And("the user selects the claim year field and enters a value of EOY")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the Did you have any tax taken off your Employment and Support Allowance between 6 April TaxYearMinusTwo and 2 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did you have any tax taken off your Employment and Support Allowance", "6 April TaxYearMinusTwo", "2 February EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much Employment and Support Allowance did you get between 6 April TaxYearMinusTwo and 2 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much Employment and Support Allowance did you get", "6 April TaxYearMinusTwo", "2 February EOY")

      When("the user selects the amount field and enters a value of 1130.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "1130.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much tax was taken off your Employment and Support Allowance between 6 April TaxYearMinusTwo and 2 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much tax was taken off your Employment and Support Allowance", "6 April TaxYearMinusTwo", "2 February EOY")

      When("the user selects the amount field and enters a value of 130.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "130.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks the state benefit save and continue button")
      whenTheUserClicksTheXButton("state benefit save and continue")

      Then("the user should be redirected to the Employment and Support Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")

      When("the user clicks on the first view link")
      whenTheUserClicksOnTheXLink("first view")

      And("the user clicks on the remove claim link")
      whenTheUserClicksOnTheXLink("remove claim")

      Then("the user should be redirected to the Are you sure you want to remove this Employment and Support Allowance claim? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this Employment and Support Allowance claim?")

      When("the user clicks the Remove claim button")
      whenTheUserClicksTheXButton("Remove claim")

      Then("the user should be redirected to the Employment and Support Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")

    }

    Scenario("Individual User edits Employment and Support Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Employment and Support Allowance link")
      whenTheUserClicksOnTheXLink("Employment and Support Allowance")

      Then("the user should be redirected to the Employment and Support Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")

      When("the user clicks on the first view link")
      whenTheUserClicksOnTheXLink("first view")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change start date link")
      whenTheUserClicksOnTheXLink("state benefit change start date")

      Then("the user should be redirected to the When did you start getting Employment and Support Allowance? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did you start getting Employment and Support Allowance?")

      When("the user selects the claim day field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")

      And("the user selects the claim month field and enters a value of 05")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "05")

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change end date question link")
      whenTheUserClicksOnTheXLink("state benefit change end date question")

      Then("the user will be redirected to the Did this claim end between 2 May TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "2 May TaxYearMinusTwo", "5 April EOY")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change end date question link")
      whenTheUserClicksOnTheXLink("state benefit change end date question")

      Then("the user will be redirected to the Did this claim end between 2 May TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "2 May TaxYearMinusTwo", "5 April EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 03")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "03")

      And("the user selects the claim month field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")

      And("the user selects the claim year field and enters a value of EOY")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change end date link")
      whenTheUserClicksOnTheXLink("state benefit change end date")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 04")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")

      And("the user selects the claim month field and enters a value of 04")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "04")

      And("the user selects the claim year field and enters a value of EOY")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change tax taken question link")
      whenTheUserClicksOnTheXLink("state benefit change tax taken question")

      Then("the user will be redirected to the Did you have any tax taken off your Employment and Support Allowance between 2 May TaxYearMinusTwo and 4 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did you have any tax taken off your Employment and Support Allowance", "2 May TaxYearMinusTwo", "4 April EOY")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change amount link")
      whenTheUserClicksOnTheXLink("state benefit change amount")

      Then("the user will be redirected to the How much Employment and Support Allowance did you get between 2 May TaxYearMinusTwo and 4 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much Employment and Support Allowance did you get", "2 May TaxYearMinusTwo", "4 April EOY")

      When("the user selects the amount field and enters a value of 5100.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "5100.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change tax taken question link")
      whenTheUserClicksOnTheXLink("state benefit change tax taken question")

      Then("the user will be redirected to the Did you have any tax taken off your Employment and Support Allowance between 2 May TaxYearMinusTwo and 4 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did you have any tax taken off your Employment and Support Allowance", "2 May TaxYearMinusTwo", "4 April EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much tax was taken off your Employment and Support Allowance between 2 May TaxYearMinusTwo and 4 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much tax was taken off your Employment and Support Allowance", "2 May TaxYearMinusTwo", "4 April EOY")

      When("the user selects the amount field and enters a value of 100.23")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.23")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      And("the user clicks the state benefit save and continue button")
      whenTheUserClicksTheXButton("state benefit save and continue")

      Then("the user should be redirected to the Employment and Support Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")

    }
  //--------------------------------------Agent--------------------------------------//
       Scenario("Agent User with pre populated State benefits data - Employer Support Allowance - Check client’s State benefits In Year Deductions") {
         When("the user logs into the service with the following details")
            givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)
    
         Then("the user should be redirected to Update and submit an Income Tax Return page")
           thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")
    
         When("the user clicks the continue button")
           whenTheUserClicksTheXButton("continue")
    
         Then("the user should be redirected to the Your client’s Income Tax Return page")
           thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")
    
         When("the user clicks on the State benefits link")
           whenTheUserClicksOnTheXLink("State benefits")
    
         Then("the user should be redirected to the State benefits page")
           thenTheUserShouldBeRedirectedToTheXPage("State benefits")
    
         When("the user clicks on the Employment and Support Allowance link")
           whenTheUserClicksOnTheXLink("Employment and Support Allowance")
    
         Then("the user should be redirected to the Employment and Support Allowance page")
           thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")
    
         When("the user clicks on the first view link")
           whenTheUserClicksOnTheXLink("first view")
    
         Then("the user should be redirected to the Review Employment and Support Allowance claim page")
           thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")
    
         When("the user clicks the state benefit save and continue button")
           whenTheUserClicksTheXButton("state benefit save and continue")
    
         Then("the user should be redirected to the Employment and Support Allowance page")
           thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")
    
       }

    Scenario("Agent User adds Employment and Support Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Employment and Support Allowance link")
      whenTheUserClicksOnTheXLink("Employment and Support Allowance")

      Then("the user should be redirected to the Employment and Support Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")

      When("the user selects the Yes, claim Employment and Support Allowance radio button")
      whenTheUserSelectsTheXRadioButton("Yes, claim Employment and Support Allowance")

      And("the user clicks the continue, missing claim button")
      whenTheUserClicksTheXButton("continue, missing claim")

      Then("the user should be redirected to the When did your client start getting Employment and Support Allowance? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did your client start getting Employment and Support Allowance?")

      When("the user selects the claim day field and enters a value of 01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "01")

      And("the user selects the claim month field and enters a value of 01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "01")

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "6 April TaxYearMinusTwo", "5 April EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")

      And("the user selects the claim month field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")

      And("the user selects the claim year field and enters a value of EOY")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the Did your client have any tax taken off their Employment and Support Allowance between 6 April TaxYearMinusTwo and 2 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did your client have any tax taken off their Employment and Support Allowance", "6 April TaxYearMinusTwo", "2 February EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much Employment and Support Allowance did your client get between 6 April TaxYearMinusTwo and 2 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much Employment and Support Allowance did your client get", "6 April TaxYearMinusTwo", "2 February EOY")

      When("the user selects the amount field and enters a value of 1310.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "1310.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much tax was taken off your client’s Employment and Support Allowance between 6 April TaxYearMinusTwo and 2 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much tax was taken off your client’s Employment and Support Allowance", "6 April TaxYearMinusTwo", "2 February EOY")

      When("the user selects the amount field and enters a value of 500.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "500.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks the state benefit save and continue button")
      whenTheUserClicksTheXButton("state benefit save and continue")

      Then("the user should be redirected to the Employment and Support Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")

    }

    Scenario("Agent User edits Employment and Support Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)


      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the State benefits link")
      whenTheUserClicksOnTheXLink("State benefits")

      Then("the user should be redirected to the State benefits page")
      thenTheUserShouldBeRedirectedToTheXPage("State benefits")

      When("the user clicks on the Employment and Support Allowance link")
      whenTheUserClicksOnTheXLink("Employment and Support Allowance")

      Then("the user should be redirected to the Employment and Support Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")

      When("the user clicks on the first view link")
      whenTheUserClicksOnTheXLink("first view")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change start date link")
      whenTheUserClicksOnTheXLink("state benefit change start date")

      Then("the user should be redirected to the When did your client start getting Employment and Support Allowance? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did your client start getting Employment and Support Allowance?")

      When("the user selects the claim day field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")

      And("the user selects the claim month field and enters a value of 01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "01")

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change end date question link")
      whenTheUserClicksOnTheXLink("state benefit change end date question")

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "6 April TaxYearMinusTwo", "5 April EOY")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change end date question link")
      whenTheUserClicksOnTheXLink("state benefit change end date question")

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did this claim end", "6 April TaxYearMinusTwo", "5 April EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 03")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "03")

      And("the user selects the claim month field and enters a value of 07")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "07")

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change end date link")
      whenTheUserClicksOnTheXLink("state benefit change end date")

      Then("the user should be redirected to the When did this claim end? page")
      thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")

      When("the user selects the claim day field and enters a value of 04")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")

      And("the user selects the claim month field and enters a value of 02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")

      And("the user selects the claim year field and enters a value of EOY")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change tax taken question link")
      whenTheUserClicksOnTheXLink("state benefit change tax taken question")

      Then("the user will be redirected to the Did your client have any tax taken off their Employment and Support Allowance between 6 April TaxYearMinusTwo and 4 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did your client have any tax taken off their Employment and Support Allowance", "6 April TaxYearMinusTwo", "4 February EOY")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change amount link")
      whenTheUserClicksOnTheXLink("state benefit change amount")

      Then("the user will be redirected to the How much Employment and Support Allowance did your client get between 6 April TaxYearMinusTwo and 4 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much Employment and Support Allowance did your client get", "6 April TaxYearMinusTwo", "4 February EOY")

      When("the user selects the amount field and enters a value of 5100.02")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "5100.02")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      When("the user clicks on the state benefit change tax taken question link")
      whenTheUserClicksOnTheXLink("state benefit change tax taken question")

      Then("the user will be redirected to the Did your client have any tax taken off their Employment and Support Allowance between 6 April TaxYearMinusTwo and 4 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("Did your client have any tax taken off their Employment and Support Allowance", "6 April TaxYearMinusTwo", "4 February EOY")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user will be redirected to the How much tax was taken off your client’s Employment and Support Allowance between 6 April TaxYearMinusTwo and 4 February EOY page")
      thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("How much tax was taken off your client’s Employment and Support Allowance", "6 April TaxYearMinusTwo", "4 February EOY")

      When("the user selects the amount field and enters a value of 100.23")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.23")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
      thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")

      And("the user clicks the state benefit save and continue button")
      whenTheUserClicksTheXButton("state benefit save and continue")

      Then("the user should be redirected to the Employment and Support Allowance page")
      thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")

    }
  }
}