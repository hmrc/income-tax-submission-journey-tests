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

class additionalinformationSpec extends BaseSpec {

  Feature("Additional Information Journeys (Interest Securities & Gains) - Income Tax Submission") {

    Scenario("Agent User maximal flow - Interest from gilt-edged or accrued income securities") {
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

      When("the user clicks on the addSections link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Add sections to your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the addInterest tailoring option")
        whenTheUserClicksTheXTailoringOption("addInterest")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the Interest from savings and securities link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Interest from savings and securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Interest from gilt-edged or accrued income securities link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Interest from gilt-edged or accrued income securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Total interest page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 400.40")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "400.40")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Was tax taken off your client’s interest? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much tax was taken off your client’s interest? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 123.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client's interest from gilt-edged or accrued income securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the save and continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Interest from savings and securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User says no on 'gateway question page' - Interest from gilt-edged or accrued income securities") {
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

      When("the user clicks the addInterest tailoring option")
        whenTheUserClicksTheXTailoringOption("addInterest")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the Interest from savings and securities link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Interest from savings and securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Interest from gilt-edged or accrued income securities link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Interest from gilt-edged or accrued income securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your interest from gilt-edged or accrued income securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the save and continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Interest from savings and securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Agent User says answers on 'Was tax taken off your interest?' page - Interest from gilt-edged or accrued income securities") {
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

      When("the user clicks on the addSections link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Add sections to your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the addInterest tailoring option")
        whenTheUserClicksTheXTailoringOption("addInterest")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the Interest from savings and securities link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Interest from savings and securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Interest from gilt-edged or accrued income securities link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Interest from gilt-edged or accrued income securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Total interest page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 400.40")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "400.40")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Was tax taken off your client’s interest? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client's interest from gilt-edged or accrued income securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the save and continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Interest from savings and securities page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User maximal flow - Gains - User says yes to all questions") {
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

      When("the user clicks the addGains tailoring option")
        whenTheUserClicksTheXTailoringOption("addGains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the Gains from policies and contracts link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the What type of policy gave you a gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Life Insurance radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy number page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Policy number field and enters a value of P-89879-123")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Policy number", "P-89879-123")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Chargeable event gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 123.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy event page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Other radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user selects the What caused this gain? field and enters a value of Inheritance")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("What caused this gain?", "Inheritance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Years since your last gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Gains Year field and enters a value of 99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy held page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Gains Year field and enters a value of 99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Was your gain treated as tax paid? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Are you entitled to deficiency relief? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user selects the amount field and enters a value of 193")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "193")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 1")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the What type of policy gave you a gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 2")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Policy number page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 3")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Chargeable event gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 4")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Policy event page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 5")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Years since your last gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Gains Year field and enters a value of 99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 6")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Years since your last gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 7")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Policy held page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 8")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Was your gain treated as tax paid? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 9")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Are you entitled to deficiency relief? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user selects the amount field and enters a value of 193")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "193")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the save and continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your policies page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User maximal flow - Gains - User answers no on gains status page") {
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

      When("the user clicks the addGains tailoring option")
        whenTheUserClicksTheXTailoringOption("addGains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the Gains from policies and contracts link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the What type of policy gave you a gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Life Insurance radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy number page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Policy number field and enters a value of P-89879-123")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Policy number", "P-89879-123")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Chargeable event gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 123.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy event page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Full or part surrender radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy held page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Gains Year field and enters a value of 99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Was your gain treated as tax paid? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Are you entitled to deficiency relief? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User minimum flow - Gains - User answers no on gain gateway question page") {
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

      When("the user clicks the addGains tailoring option")
        whenTheUserClicksTheXTailoringOption("addGains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the Gains from policies and contracts link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your gains from life insurance policies and contracts page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the return to overview button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      Then("the Gains status on the page displays Excluded")
        thenTheXOnThePageDisplaysX("", "")  // auto-chosen (score=1.00, CYAStepDefSteps.scala)

    }

    Scenario("Individual User maximum flow - Gains - User answers no on Deficiency relief page") {
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

      When("the user clicks the addGains tailoring option")
        whenTheUserClicksTheXTailoringOption("addGains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the Gains from policies and contracts link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the What type of policy gave you a gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Life Insurance radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy number page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Policy number field and enters a value of P-89879-123")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Policy number", "P-89879-123")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Chargeable event gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 123.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy event page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Sale or assignment of a policy radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Years since your last gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Gains Year field and enters a value of 99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy held page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Gains Year field and enters a value of 99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Was your gain treated as tax paid? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Are you entitled to deficiency relief? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Returning flow - Individual User with prior Gains Data, Reviews data") {
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

      When("the user clicks the addGains tailoring option")
        whenTheUserClicksTheXTailoringOption("addGains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      And("the status on the page is Updated Tag")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks on the Gains from policies and contracts link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your policies page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Add another gain from a different policy link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the What type of policy gave you a gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the back link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your policies page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the return to overview button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

    }

    Scenario("Returning flow - Individual User with prior Gains Data, removes policy") {
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

      When("the user clicks on the Gains from policies and contracts link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your policies page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the Policy remove link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Are you sure you want to remove this policy? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the remove button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your policies page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User maximal flow - Gains - User says yes to all questions") {
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

      When("the user clicks the addGains tailoring option")
        whenTheUserClicksTheXTailoringOption("addGains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the Gains from policies and contracts link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the What type of policy gave you a gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Voided ISA radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy number page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Policy number field and enters a value of P-89879-123")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Policy number", "P-89879-123")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Chargeable event gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 123.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy event page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Other radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user selects the What caused this gain? field and enters a value of Inheritance")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("What caused this gain?", "Inheritance")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Years since your last gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Gains Year field and enters a value of 99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy held page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Gains Year field and enters a value of 99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much tax did you pay on your gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 123.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 1")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the What type of policy gave you a gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 2")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Policy number page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 3")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Chargeable event gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 4")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Policy event page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 5")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Years since your last gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Gains Year field and enters a value of 99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 6")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Years since your last gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 7")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Policy held page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 8")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the How much tax did you pay on your gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the save and continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your policies page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Individual User maximal flow - Gains - User answers no on gains status page") {
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

      When("the user clicks the addGains tailoring option")
        whenTheUserClicksTheXTailoringOption("addGains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the Gains from policies and contracts link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the What type of policy gave you a gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Voided ISA radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy number page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Policy number field and enters a value of P-89879-123")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Policy number", "P-89879-123")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Chargeable event gain page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 123.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy event page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Full or part surrender radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserIsThenRedirectedToTheXXXXPage() [0.79] (CommonStepDefSteps.scala) pattern: the user is then redirected to the "(.*)" "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy held page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Gains Year field and enters a value of 99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much tax did you pay on your gain? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user selects the amount field and enters a value of 123.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Policy summary page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }

    Scenario("Returning flow - Individual User with prior Gains Data, Reviews data") {
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

      When("the user clicks the addGains tailoring option")
        whenTheUserClicksTheXTailoringOption("addGains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      And("the status on the page is Updated Tag")
        thenTheStatusOnThePageIsX("")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

      When("the user clicks on the Gains from policies and contracts link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your policies page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the return to overview button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

    }

    Scenario("Maximal flow - Agent User - Stock Dividends") {
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

      When("the user clicks on the addSections link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Add sections to your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the addDividend tailoring option")
        whenTheUserClicksTheXTailoringOption("addDividend")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the dividends link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client get dividends from shares? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client get dividends from UK-based companies? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client get in dividends from UK-based companies? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the UK dividends amount field and enters a value of 1000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK dividends amount", "1000")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Dividends from UK-based trusts or open-ended investment companies page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client get in dividends from trusts and open-ended investment companies based in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the UK other dividends amount field and enters a value of 500")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK other dividends amount", "500")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client get stock dividends? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client get? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 100")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did your client get free or redeemable shares? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did your client get in free or redeemable shares? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 100")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Close company loans written off page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did the close company write off or release from your client's loan? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 100")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your client's dividends page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the save and continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

    }

    Scenario("Maximal flow - User with no prior data - answers No on Stock Dividends page") {
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

      When("the user clicks the addDividend tailoring option")
        whenTheUserClicksTheXTailoringOption("addDividend")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the dividends link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you get dividends from shares? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you get dividends from UK-based companies? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you get in dividends from UK-based companies? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the UK dividends amount field and enters a value of 1000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK dividends amount", "1000")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Dividends from UK-based trusts or open-ended investment companies page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you get in dividends from trusts and open-ended investment companies based in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the UK other dividends amount field and enters a value of 500")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK other dividends amount", "500")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you get stock dividends? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you get free or redeemable shares? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Close company loans written off page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your dividends page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the save and continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

    }

    Scenario("Maximal flow - User with no prior data - answers Yes on Stock Dividends page but no for all following questions") {
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

      When("the user clicks the addDividend tailoring option")
        whenTheUserClicksTheXTailoringOption("addDividend")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the dividends link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you get dividends from shares? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you get dividends from UK-based companies? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you get in dividends from UK-based companies? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the UK dividends amount field and enters a value of 1000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK dividends amount", "1000")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Dividends from UK-based trusts or open-ended investment companies page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you get in dividends from trusts and open-ended investment companies based in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the UK other dividends amount field and enters a value of 500")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK other dividends amount", "500")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you get stock dividends? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the How much did you get? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 100")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Did you get free or redeemable shares? page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Close company loans written off page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your dividends page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the save and continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

    }

    Scenario("Maximal flow - User with no prior data - adds all available Business Tax Reliefs") {
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

      When("the user navigates to the Post-cessation trade relief page")
        thenTheUserNavigatesToTheXPage("Post-cessation trade relief")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the amount field and enters a value of 50.99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "50.99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 1")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Post-cessation trade relief and certain other losses page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 125.44")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "125.44")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user navigates to the Non-deductible Loan Interest relief page")
        thenTheUserNavigatesToTheXPage("Non-deductible Loan Interest relief")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the amount field and enters a value of 50.99")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "50.99")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 1")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Non-deductible loan interest from investments into property letting partnerships page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 110.44")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.44")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user navigates to the Qualifying loan interest relief page")
        thenTheUserNavigatesToTheXPage("Qualifying loan interest relief")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user selects the amount field and enters a value of 120.44")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "120.44")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks on the change link in position 1")
        whenTheUserClicksOnTheChangeLinkInPositionX()  // auto-chosen (score=1.00, CYAStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserClicksOnTheXLink() [0.90] (CommonStepDefSteps.scala) pattern: the user clicks on the (.*) link

      Then("the user should be redirected to the Qualifying loan interest payable in the year page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the amount field and enters a value of 125.44")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "125.44")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

    }
  }
}
