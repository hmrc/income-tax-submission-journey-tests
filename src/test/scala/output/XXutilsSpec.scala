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

class XXutilsSpec extends BaseSpec {

  Feature("Util Journeys - Income Tax Submission") {

    Scenario("Checking the Accessibility Statement link for all 3 frontends") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToTheXPage() [0.85] (CommonStepDefSteps.scala) pattern: the user should be redirected to the "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      And("the user should see the correct Accessibility Statement url")
        thenTheUserShouldSeeTheCorrectXUrl("Accessibility Statement")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user should see the correct sign out url")
        thenTheUserShouldSeeTheCorrectXUrl("sign out")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the dividends link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the Check your income from dividends page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user should see the correct Accessibility Statement url")
        thenTheUserShouldSeeTheCorrectXUrl("Accessibility Statement")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user should see the correct personal income sign out url")
        thenTheUserShouldSeeTheCorrectXUrl("personal income sign out")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      When("the user goes back to the previous page in their browser's history")
        // ⚠️ No step-def match found for: the user goes back to the previous page in their browser's history

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [1.00] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page
        // thenTheUserIsRedirectedToTheXXXPage() [0.78] (CommonStepDefSteps.scala) pattern: the user is redirected to the "(.*)" "(.*)" "(.*)" page
        // thenTheUserNavigatesToTheXPage() [0.75] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page

      When("the user clicks on the employment link")
        whenTheUserClicksOnTheXLink()  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user should be redirected to the PAYE employment page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user should see the correct Accessibility Statement url")
        thenTheUserShouldSeeTheCorrectXUrl("Accessibility Statement")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      And("the user should see the correct employment sign out url")
        thenTheUserShouldSeeTheCorrectXUrl("employment sign out")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

    }

    Scenario("Checking the client authorisation link for agents") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to the There’s a problem page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user should see the correct Authorise you as an agent url")
        thenTheUserShouldSeeTheCorrectXUrl("Authorise you as an agent")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

      Then("the user navigates to the untaxed interest page")
        thenTheUserNavigatesToTheXPage("untaxed interest")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserNavigatesToTheXPageForX() [0.77] (CommonStepDefSteps.scala) pattern: the user navigates to the (.*) page for (.*)

      Then("the user should be redirected to the There’s a problem page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

      And("the user should see the correct Authorise you as an agent url")
        thenTheUserShouldSeeTheCorrectXUrl("Authorise you as an agent")  // auto-chosen (score=1.00, CommonStepDefSteps.scala)

    }

    Scenario("supporting Agent unauthorised to access submission service") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails()  // auto-chosen (score=1.00, AuthStepDefSteps.scala)

      Then("the user should be redirected to the You are not authorised to use this service page")
        thenTheUserShouldBeRedirectedToTheXPage("")  // auto-chosen (score=0.92, CommonStepDefSteps.scala)
        // --- Other possible matches ---
        // thenTheUserShouldBeRedirectedToXPage() [0.91] (CommonStepDefSteps.scala) pattern: the user should be redirected to "(.*)" page

    }
  }
}
