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

class capitalgainsSpec extends BaseSpec {

  Feature("Capital Gains, Trusts And Estates Tailor Your Return - Income Tax Submission") {

    Scenario("Individual User maximal flow - Capital Gains, Trusts And Estates - Tailor your return") {
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

      Then("the user navigates to the Capital gains page")
        thenTheUserNavigatesToTheXPage("Capital gains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Capital Gains tailor your return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Trusts, settlements or estates tailor your return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Trusts radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      When("the user selects the Settlements radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      When("the user selects the Estates of people who have died radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

    }

    Scenario("Agent User maximal flow - Capital Gains, Trusts And Estates - Tailor your return") {
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

      Then("the user navigates to the Capital gains page")
        thenTheUserNavigatesToTheXPage("Capital gains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Capital Gains tailor your return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Trusts, settlements or estates tailor your return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the Trusts radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      When("the user selects the Settlements radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      When("the user selects the Estates of people who have died radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

    }

    Scenario("Individual user answers no for all questions - Capital Gains, Trusts And Estates - Tailor your return") {
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

      Then("the user navigates to the Capital gains page")
        thenTheUserNavigatesToTheXPage("Capital gains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Capital Gains tailor your return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Trusts, settlements or estates tailor your return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user deselects the Trusts radio button")
        whenTheUserDeselectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButton() [0.75] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button

      When("the user deselects the Settlements radio button")
        whenTheUserDeselectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButton() [0.75] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button

      When("the user deselects the Estates of people who have died radio button")
        whenTheUserDeselectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButton() [0.75] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button

      When("the user selects the No income from trusts radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

    }

    Scenario("Agent User answers no for all questions - Capital Gains, Trusts And Estates - Tailor your return") {
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

      Then("the user navigates to the Capital gains page")
        thenTheUserNavigatesToTheXPage("Capital gains")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Capital Gains tailor your return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Trusts, settlements or estates tailor your return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      When("the user deselects the Trusts radio button")
        whenTheUserDeselectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButton() [0.75] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button

      When("the user deselects the Settlements radio button")
        whenTheUserDeselectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButton() [0.75] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button

      When("the user deselects the Estates of people who have died radio button")
        whenTheUserDeselectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButton() [0.75] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button

      When("the user selects the No income from trusts radio button")
        whenTheUserSelectsTheXRadioButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // whenTheUserSelectsTheXRadioButtonX() [0.83] (CommonStepDefSteps.scala) pattern: the user selects the (.*) radio button: (.*)

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

    }
  }
}
