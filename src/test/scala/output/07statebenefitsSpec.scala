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

import specsteps.AuthStepDefSteps._
import specsteps.CYAStepDefSteps._
import specsteps.CommonStepDefSteps._
import specs.BaseSpec
import uk.gov.hmrc.ui.specs.tags.ExampleTag

class statebenefitsSpec extends BaseSpec {

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

  Feature("State Benefits Journeys - Income Tax Submission") {

    Scenario("Individual User with pre populated State Benefits data - In Year Deductions", ExampleTag) {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(
          individualLoginDetails
        )  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Jobseeker’s Allowance link")
        whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first view link")
        whenTheUserClicksOnTheXLink("first view")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the state benefit save and continue button")
        whenTheUserClicksTheXButton("state benefit save and continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User adds Jobseeker’s Allowance in session data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Jobseeker’s Allowance link")
        whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Yes, claim Jobseeker's Allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim Jobseeker's Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue, missing claim button")
        whenTheUserClicksTheXButton("continue, missing claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did you start getting Jobseeker’s Allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did you start getting Jobseeker’s Allowance?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 01")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "01")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 10")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "10")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 1 October TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 03")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "03")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of EOY")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did you have any tax taken off your Jobseeker’s Allowance between 1 October TaxYearMinusTwo and 2 March EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much Jobseeker’s Allowance did you get between 1 October TaxYearMinusTwo and 2 March EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 1100.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "1100.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much tax was taken off your Jobseeker’s Allowance between 1 July TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 100.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the state benefit save and continue button")
        whenTheUserClicksTheXButton("state benefit save and continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first view link")
        whenTheUserClicksOnTheXLink("first view")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks on the remove claim link")
        whenTheUserClicksOnTheXLink("remove claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Are you sure you want to remove this Jobseeker’s Allowance claim? page")
        thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this Jobseeker’s Allowance claim?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the Remove claim button")
        whenTheUserClicksTheXButton("Remove claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User edits Jobseeker’s Allowance in session data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Jobseeker’s Allowance link")
        whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first view link")
        whenTheUserClicksOnTheXLink("first view")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change start date link")
        whenTheUserClicksOnTheXLink("state benefit change start date")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did you start getting Jobseeker’s Allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did you start getting Jobseeker’s Allowance?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 04")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 08")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "08")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of 2022")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "2022")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date question link")
        whenTheUserClicksOnTheXLink("state benefit change end date question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date question link")
        whenTheUserClicksOnTheXLink("state benefit change end date question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 04")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "11")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date link")
        whenTheUserClicksOnTheXLink("state benefit change end date")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 04")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 03")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "03")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of EOY")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change tax taken question link")
        whenTheUserClicksOnTheXLink("state benefit change tax taken question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did you have any tax taken off your Jobseeker’s Allowance between 6 April TaxYearMinusTwo and 4 March EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change amount link")
        whenTheUserClicksOnTheXLink("state benefit change amount")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much Jobseeker’s Allowance did you get between 6 April TaxYearMinusTwo and 4 March EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 510.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "510.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change tax taken question link")
        whenTheUserClicksOnTheXLink("state benefit change tax taken question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did you have any tax taken off your Jobseeker’s Allowance between 6 April TaxYearMinusTwo and 4 March EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much tax was taken off your Jobseeker’s Allowance between 6 April TaxYearMinusTwo and 4 March EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 100.23")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.23")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the state benefit save and continue button")
        whenTheUserClicksTheXButton("state benefit save and continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User checks flow is correct for EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Jobseeker’s Allowance link")
        whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Yes, claim Jobseeker's Allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim Jobseeker's Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue, missing claim button")
        whenTheUserClicksTheXButton("continue, missing claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did you start getting Jobseeker’s Allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did you start getting Jobseeker’s Allowance?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 01")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "01")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 07")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "07")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 1 July TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of EOY")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did you have any tax taken off your Jobseeker’s Allowance between 1 July TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much Jobseeker’s Allowance did you get between 1 July TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      And("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user will be redirected to the Did you have any tax taken off your Jobseeker’s Allowance between 1 July TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much tax was taken off your Jobseeker’s Allowance between 1 July TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 100.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent User with pre populated State benefits data - Check client’s State benefits In Year Deductions") {
      When("the user logs into the service with the following details")
      //TODO agent login
//        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Jobseeker’s Allowance link")
        whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first view link")
        whenTheUserClicksOnTheXLink("first view")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the state benefit save and continue button")
        whenTheUserClicksTheXButton("state benefit save and continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent User adds Jobseeker’s Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      //TODO agent login
        //givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Jobseeker’s Allowance link")
        whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Yes, claim Jobseeker's Allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim Jobseeker's Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue, missing claim button")
        whenTheUserClicksTheXButton("continue, missing claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your client start getting Jobseeker’s Allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client start getting Jobseeker’s Allowance?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 01")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "01")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "11")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 1 November TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 03")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "03")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of EOY")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did your client have any tax taken off their Jobseeker’s Allowance between 1 November TaxYearMinusTwo and 2 March EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much Jobseeker’s Allowance did your client get between 1 November TaxYearMinusTwo and 2 March EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much tax was taken off your client’s Jobseeker’s Allowance between 1 November TaxYearMinusTwo and 2 March EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 100.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the state benefit save and continue button")
        whenTheUserClicksTheXButton("state benefit save and continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit back link")
        whenTheUserClicksOnTheXLink("state benefit back")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first view link")
        whenTheUserClicksOnTheXLink("first view")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks on the remove claim link")
        whenTheUserClicksOnTheXLink("remove claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Are you sure you want to remove this Jobseeker’s Allowance claim? page")
        thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this Jobseeker’s Allowance claim?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the Remove claim button")
        whenTheUserClicksTheXButton("Remove claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent User edits Jobseeker’s Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      //TODO agent login

      //        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Jobseeker’s Allowance link")
        whenTheUserClicksOnTheXLink("Jobseeker’s Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first view link")
        whenTheUserClicksOnTheXLink("first view")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change start date link")
        whenTheUserClicksOnTheXLink("state benefit change start date")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your client start getting Jobseeker’s Allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client start getting Jobseeker’s Allowance?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 04")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 08")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "08")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date question link")
        whenTheUserClicksOnTheXLink("state benefit change end date question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 4 August TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date question link")
        whenTheUserClicksOnTheXLink("state benefit change end date question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 4 August TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 04")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "11")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date link")
        whenTheUserClicksOnTheXLink("state benefit change end date")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 04")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of EOY")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change tax taken question link")
        whenTheUserClicksOnTheXLink("state benefit change tax taken question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did your client have any tax taken off their Jobseeker’s Allowance between 4 August TaxYearMinusTwo and 4 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change amount link")
        whenTheUserClicksOnTheXLink("state benefit change amount")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much Jobseeker’s Allowance did your client get between 4 August TaxYearMinusTwo and 4 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 510.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "510.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change tax taken question link")
        whenTheUserClicksOnTheXLink("state benefit change tax taken question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did your client have any tax taken off their Jobseeker’s Allowance between 4 August TaxYearMinusTwo and 4 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much tax was taken off your client’s Jobseeker’s Allowance between 4 August TaxYearMinusTwo and 4 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 100.23")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.23")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Jobseeker’s Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Jobseeker’s Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the state benefit save and continue button")
        whenTheUserClicksTheXButton("state benefit save and continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Jobseeker’s Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Jobseeker’s Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

//    Scenario("Individual User with pre populated State Benefits data - In Year Deductions") {
//      When("the user logs into the service with the following details")
//        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)  // auto-chosen (score=1.00, AuthStepDefSteps.scala)
//
//      Then("the user should be redirected to Update and submit an Income Tax Return page")
//        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
//        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
//        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page
//
//      When("the user clicks the continue button")
//        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//
//      Then("the user should be redirected to the Your Income Tax Return page")
//        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
//        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
//        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page
//
//      When("the user clicks on the State benefits link")
//        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//
//      Then("the user should be redirected to the State benefits page")
//        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
//
//      When("the user clicks on the Employment and Support Allowance link")
//        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//
//      Then("the user should be redirected to the Employment and Support Allowance page")
//        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
//
//      When("the user clicks on the first view link")
//        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//
//      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
//        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
//
//      When("the user clicks the state benefit save and continue button")
//        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//
//      Then("the user should be redirected to the Employment and Support Allowance page")
//        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
//
//    }

    Scenario("Individual User adds Employment and Support Allowance in session data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Employment and Support Allowance link")
        whenTheUserClicksOnTheXLink("Employment and Support Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Employment and Support Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Yes, claim Employment and Support Allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim Employment and Support Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue, missing claim button")
        whenTheUserClicksTheXButton("continue, missing claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did you start getting Employment and Support Allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did you start getting Employment and Support Allowance?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 01")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "01")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 01")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "01")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of 2023")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "2023")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of EOY")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did you have any tax taken off your Employment and Support Allowance between 6 April TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much Employment and Support Allowance did you get between 6 April TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 1130.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "1130.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much tax was taken off your Employment and Support Allowance between 6 April TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 130.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "130.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the state benefit save and continue button")
        whenTheUserClicksTheXButton("state benefit save and continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Employment and Support Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first view link")
        whenTheUserClicksOnTheXLink("first view")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks on the remove claim link")
        whenTheUserClicksOnTheXLink("remove claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Are you sure you want to remove this Employment and Support Allowance claim? page")
        thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this Employment and Support Allowance claim?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the Remove claim button")
        whenTheUserClicksTheXButton("Remove claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Employment and Support Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User edits Employment and Support Allowance in session data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualLoginDetails)  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Employment and Support Allowance link")
        whenTheUserClicksOnTheXLink("Employment and Support Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Employment and Support Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first view link")
        whenTheUserClicksOnTheXLink("first view")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change start date link")
        whenTheUserClicksOnTheXLink("state benefit change start date")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did you start getting Employment and Support Allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did you start getting Employment and Support Allowance?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "05")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date question link")
        whenTheUserClicksOnTheXLink("state benefit change end date question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 2 May TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date question link")
        whenTheUserClicksOnTheXLink("state benefit change end date question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 2 May TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 03")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "03")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of EOY")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date link")
        whenTheUserClicksOnTheXLink("state benefit change end date")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 04")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 04")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "04")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of EOY")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change tax taken question link")
        whenTheUserClicksOnTheXLink("state benefit change tax taken question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did you have any tax taken off your Employment and Support Allowance between 2 May TaxYearMinusTwo and 4 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change amount link")
        whenTheUserClicksOnTheXLink("state benefit change amount")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much Employment and Support Allowance did you get between 2 May TaxYearMinusTwo and 4 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 5100.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "5100.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change tax taken question link")
        whenTheUserClicksOnTheXLink("state benefit change tax taken question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did you have any tax taken off your Employment and Support Allowance between 2 May TaxYearMinusTwo and 4 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much tax was taken off your Employment and Support Allowance between 2 May TaxYearMinusTwo and 4 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 100.23")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.23")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the state benefit save and continue button")
        whenTheUserClicksTheXButton("state benefit save and continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Employment and Support Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

//    Scenario("Agent User with pre populated State benefits data - Check client’s State benefits In Year Deductions") {
//      When("the user logs into the service with the following details")
//      //TODO agent login
//      //        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)
//
//      Then("the user should be redirected to Update and submit an Income Tax Return page")
//        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
//        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
//        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page
//
//      When("the user clicks the continue button")
//        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//
//      Then("the user should be redirected to the Your client’s Income Tax Return page")
//        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
//        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
//        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page
//
//      When("the user clicks on the State benefits link")
//        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//
//      Then("the user should be redirected to the State benefits page")
//        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
//
//      When("the user clicks on the Employment and Support Allowance link")
//        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//
//      Then("the user should be redirected to the Employment and Support Allowance page")
//        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
//
//      When("the user clicks on the first view link")
//        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//
//      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
//        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
//
//      When("the user clicks the state benefit save and continue button")
//        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
//
//      Then("the user should be redirected to the Employment and Support Allowance page")
//        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
//        // --- Other possible matches ---
//        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
//
//    }

    Scenario("Agent User adds Employment and Support Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      //TODO agent login
      //        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Employment and Support Allowance link")
        whenTheUserClicksOnTheXLink("Employment and Support Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Employment and Support Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Yes, claim Employment and Support Allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim Employment and Support Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue, missing claim button")
        whenTheUserClicksTheXButton("continue, missing claim")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your client start getting Employment and Support Allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client start getting Employment and Support Allowance?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 01")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "01")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 01")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "01")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 1 November TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of EOY")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did your client have any tax taken off their Employment and Support Allowance between 6 April TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much Employment and Support Allowance did your client get between 6 April TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 1310.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "1310.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much tax was taken off your client’s Employment and Support Allowance between 6 April TaxYearMinusTwo and 2 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 500.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "500.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the state benefit save and continue button")
        whenTheUserClicksTheXButton("state benefit save and continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Employment and Support Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent User edits Employment and Support Allowance in session data EOY") {
      When("the user logs into the service with the following details")
      //TODO agent login

//      givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the State benefits link")
        whenTheUserClicksOnTheXLink("State benefits")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the State benefits page")
        thenTheUserShouldBeRedirectedToTheXPage("State benefits")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Employment and Support Allowance link")
        whenTheUserClicksOnTheXLink("Employment and Support Allowance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Employment and Support Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first view link")
        whenTheUserClicksOnTheXLink("first view")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change start date link")
        whenTheUserClicksOnTheXLink("state benefit change start date")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your client start getting Employment and Support Allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client start getting Employment and Support Allowance?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 01")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "01")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date question link")
        whenTheUserClicksOnTheXLink("state benefit change end date question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date question link")
        whenTheUserClicksOnTheXLink("state benefit change end date question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did this claim end between 6 April TaxYearMinusTwo and 5 April EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 03")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "03")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 07")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "07")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of TaxYearMinusTwo")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "TaxYearMinusTwo")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change end date link")
        whenTheUserClicksOnTheXLink("state benefit change end date")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did this claim end? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did this claim end?")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the claim day field and enters a value of 04")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim day", "04")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim month field and enters a value of 02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim month", "02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the claim year field and enters a value of EOY")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("claim year", "EOY")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change tax taken question link")
        whenTheUserClicksOnTheXLink("state benefit change tax taken question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did your client have any tax taken off their Employment and Support Allowance between 6 April TaxYearMinusTwo and 4 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change amount link")
        whenTheUserClicksOnTheXLink("state benefit change amount")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much Employment and Support Allowance did your client get between 6 April TaxYearMinusTwo and 4 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 5100.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "5100.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the state benefit change tax taken question link")
        whenTheUserClicksOnTheXLink("state benefit change tax taken question")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the Did your client have any tax taken off their Employment and Support Allowance between 6 April TaxYearMinusTwo and 4 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user will be redirected to the How much tax was taken off your client’s Employment and Support Allowance between 6 April TaxYearMinusTwo and 4 February EOY page")
        thenTheUserWillBeRedirectedToTheXBetweenXAndXPage("", "", "")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserShouldBeRedirectedToXPage() [0.76] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 100.23")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.23")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Review Employment and Support Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Review Employment and Support Allowance claim")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the state benefit save and continue button")
        whenTheUserClicksTheXButton("state benefit save and continue")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Employment and Support Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Employment and Support Allowance")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }
  }
}
