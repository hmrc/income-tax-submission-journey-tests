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

class cisSpec extends BaseSpec {

  Feature("Construction Industry Scheme (CIS) Journeys - Income Tax Submission") {

    Scenario("Individual User with pre populated CIS data - Check contractor's CIS In Year Deductions") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks on the first contractor link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the return to cis summary link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the second contractor link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the return to cis summary link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the cis return to overview link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

    }

    Scenario("Individual User make changes in CYA page for EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks on the third contractor link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first month change link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change labour link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPageForPensions() [0.79] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page for pensions
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 100.11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.11")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change cis deduction link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 250.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "250.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change cost of materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User adds CIS in session data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks the Add another contractor button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the Employer Reference Number field and enters a value of 123/4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/4567")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPageForPensions() [0.79] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page for pensions
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User adds another CIS deductions data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks the third contractor button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the Tax month ending dropdown and selects 5 October")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 October")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPageForPensions() [0.79] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page for pensions
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User - Check back links for adding new contractor EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks the Add another contractor button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the Employer Reference Number field and enters a value of 123/4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/4567")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPageForPensions() [0.79] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page for pensions
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 2000.05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "2000.05")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.05")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPageForPensions() [0.79] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page for pensions
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User - Check back links for adding new CIS deductions for existing contractor EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks the third contractor button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the Tax month ending dropdown and selects 5 October")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 October")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPageForPensions() [0.79] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page for pensions
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.05")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPageForPensions() [0.79] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page for pensions
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual user adds new CIS deductions data to a contractor with no existing CIS history EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks the third contractor button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the Tax month ending dropdown and selects 5 January")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 January")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPageForPensions() [0.79] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page for pensions
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 2000.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "2000.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change end of tax month link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change labour link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPageForPensions() [0.79] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page for pensions
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 100.11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.11")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change cis deduction link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 520.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "520.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change cost of materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent User with pre populated CIS data - Check client's CIS In Year Deductions") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

    }

    Scenario("Agent User make changes in CYA page for EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks on the third contractor link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the first month change link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change labour link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 100.11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.11")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change cis deduction link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change cost of materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent User adds CIS in session data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks on the Add another contractor link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the Employer Reference Number field and enters a value of 123/4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/4567")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent User adds another CIS deductions data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks on the third contractor link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the Tax month ending dropdown and selects 5 December")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 December")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent User - Check back links for adding new contractor EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks the Add another contractor button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the Employer Reference Number field and enters a value of 123/4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/4567")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 2640.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "2640.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 210")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "210")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 220.05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "220.05")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent User - Check back links for adding new CIS deductions for existing contractor EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the third contractor link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the Tax month ending dropdown and selects 5 October")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 October")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.05")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent user adds new CIS deductions data to a contractor with no existing CIS history EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks on the third contractor link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the Tax month ending dropdown and selects 5 October")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 October")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 2000.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "2000.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change end of tax month link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change labour link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 100.11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.11")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change cis deduction link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change cost of materials link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User - A user with no cis data answers yes on gateway question page and changes to no to remove data") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the addSections link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the addCisSection tailoring option")
        whenTheUserClicksTheXTailoringOption("addCisSection")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Have you had CIS deductions taken from your payments by contractors? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      Given("no cis deductions data exists")
        givenNoCisDeductionsDataExists()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks the Add a contractor button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the Employer Reference Number field and enters a value of 123/4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/4567")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserShouldBeRedirectedToTheXPageForPensions() [0.79] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page for pensions
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the CIS save and continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

    }

    Scenario("Individual User - A user with cis data answers yes on gateway question page") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks on the CIS deductions change link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Have you had CIS deductions taken from your payments by contractors? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

    }

    Scenario("In Year - user cannot update cis if there is prior data") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

    }

    Scenario("In Year - user cannot update cis if there is no prior data") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the addSections link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the addCisSection tailoring option")
        whenTheUserClicksTheXTailoringOption("addCisSection")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the CIS You cannot update text is displayed")
        thenTheXIsDisplayed("CIS You cannot update text")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

    }

    Scenario("Individual User adds new Contractor Details - Back button Error") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks the Add another contractor button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the Employer Reference Number field and enters a value of 123/AB4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/AB4567")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user should see the Contractor name field with the value of Boots Ltd")
        thenTheUserShouldSeeTheXFieldWithTheValueOfX("Contractor name", "Boots Ltd")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user should see the Employer Reference Number field with the value of 123/AB4567")
        thenTheUserShouldSeeTheXFieldWithTheValueOfX("Employer Reference Number", "123/AB4567")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

    }
  }
}
