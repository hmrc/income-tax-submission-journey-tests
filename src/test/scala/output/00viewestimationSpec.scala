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

class viewestimationSpec extends BaseSpec {

  Feature("View Estimation Journeys - Income Tax Submission") {

    Scenario("In Year flow - Individual User - View Estimation") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails() // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return") // auto-chosen (score=1.00, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
      // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
      // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton() // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return") // auto-chosen (score=1.00, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
      // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
      // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the Update tax calculation button")
      whenTheUserClicksTheXButton() // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user navigates to the tax overview for individuals page")
      thenTheUserNavigatesToTheXPage("tax overview for individuals") // auto-chosen (score=1.00, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserNavigatesToTheXPageForX() [0.85] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page for (.*)

      When("the user clicks the Go to Income Tax Account button")
      whenTheUserClicksTheXButton() // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to V&C Income Tax - Manage your Income Tax updates - GOV.UK page on the View and Change service")
      thenTheUserShouldBeRedirectedToXPage("Income Tax - Manage your Income Tax updates - GOV.UK") // auto-chosen (score=1.00, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
      // thenTheUserShouldBeRedirectedToTheXPageOnTheViewAndChangeService() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page on the View and Change service
      // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
      // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
      // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

    }

    Scenario("In Year flow - Agent User - View Estimation") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails() // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return") // auto-chosen (score=1.00, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
      // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
      // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton() // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client's Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client's Income Tax Return") // auto-chosen (score=1.00, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
      // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
      // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      Then("the user navigates to the V&C login page page")
      thenTheUserNavigatesToTheXPage("V&C login page") // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user AA888888A is selected on V&C page")
      // ⚠️ No step-def match found for: the user AA888888A is selected on V&C page

      Then("the agent checkbox on V&C page is selected")
      thenTheXOnThePageDisplaysX("", "") // auto-chosen (score=0.75, CYAStepDefSteps.scala)

      And("the user clicks the Login button on the V&C page")
      whenTheUserClicksTheXButton() // auto-chosen (score=0.88, CommonStepDefSteps.scala)

      Then("the user should be redirected to V&C What is your client's UTR? - GOV.UK page")
      thenTheUserShouldBeRedirectedToXPage("What is your client's UTR? - GOV.UK") // auto-chosen (score=0.91, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page

      When("the user selects the Client SA UTR field and enters a value of 0008888888")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Client SA UTR", "0008888888") // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the View and Change Continue button")
      whenTheUserClicksTheXButton() // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to V&C Confirm your client's details - GOV.UK page")
      thenTheUserShouldBeRedirectedToXPage("Confirm your client's details - GOV.UK") // auto-chosen (score=0.91, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserShouldBeRedirectedToTheXPage() [0.77] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page

      When("the user clicks the View and Change Continue button")
      whenTheUserClicksTheXButton() // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to V&C Your client's Income Tax - Manage your client's Income Tax updates - GOV.UK page")
      thenTheUserShouldBeRedirectedToXPage("Your client's Income Tax - Manage your client's Income Tax updates - GOV.UK") // auto-chosen (score=1.00, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
      // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
      // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user navigates to the tax view page")
      thenTheUserNavigatesToTheXPage("tax view") // auto-chosen (score=1.00, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserNavigatesToTheXPageForX() [0.77] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page for (.*)

      And("the user clicks the Continue button")
      whenTheUserClicksTheXButton() // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your client's Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client's Income Tax Return") // auto-chosen (score=1.00, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
      // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
      // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks the Update tax calculation button")
      whenTheUserClicksTheXButton() // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user clicks the Go to Income Tax Account button")
      whenTheUserClicksTheXButton() // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to V&C Your client's Income Tax - Manage your client's Income Tax updates - GOV.UK agent page on the View and Change service")
      thenTheUserShouldBeRedirectedToXPage("Your client's Income Tax - Manage your client's Income Tax updates - GOV.UK") // auto-chosen (score=1.00, CommonStepDefSteps.scala)
      // --- Other possible matches ---
      // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
      // thenTheUserShouldBeRedirectedToTheXPageOnTheViewAndChangeService() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page on the View and Change service
      // thenTheUserShouldBeRedirectedToTheXAgentPageOnTheViewAndChangeService() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" agent page on the View and Change service
      // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
      // thenTheXOnThePageDisplaysX() [0.75] (CYAStepDefSteps.scala) pattern: the "(.*)" on the page displays "(.*)"
      // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

    }
  }
}
