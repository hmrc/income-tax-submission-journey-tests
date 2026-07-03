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

import uk.gov.hmrc.test.ui.specs.tags.{Ignore, MVP}
import uk.gov.hmrc.test.ui.steps.AuthStepDefSteps._
import uk.gov.hmrc.test.ui.steps.CommonStepDefSteps._

@MVP
class XXutilsSpec extends BaseSpec {

  val supportingAgentUser: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/test-only/InYear/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890"),
    Map("Credential Strength" -> "weak"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Agent"),
    Map("Enrolment Key 1" -> "HMRC-AS-AGENT"),
    Map("Identifier Name 1" -> "AgentReferenceNumber"),
    Map("Identifier Value 1" -> "XARN1234567"),
    Map("Delegated Enrolment Key" -> "HMRC-MTD-IT-SUPP"),
    Map("Delegated Identifier Name" -> "MTDITID"),
    Map("Delegated Identifier Value" -> "1234567890"),
    Map("Delegated Auth Rule" -> "mtd-it-auth-supp")
  )
  val agentUser: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/test-only/InYear/additional-parameters?ClientNino=AA123456A&ClientMTDID=1234567890"),
    Map("Credential Strength" -> "weak"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Agent"),
    Map("Enrolment Key 1" -> "HMRC-AS-AGENT"),
    Map("Identifier Name 1" -> "AgentReferenceNumber"),
    Map("Identifier Value 1" -> "XARN1234567")
  )
  val individualUser: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/InYear/start"),
    Map("Credential Strength" -> "strong"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Individual"),
    Map("Nino" -> "AA123459A"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567890")
  )


  Feature("Util Journeys - Income Tax Submission") {

    ignore("Checking the Accessibility Statement link for all 3 frontends") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      And("the user should see the correct Accessibility Statement url")
        thenTheUserShouldSeeTheCorrectXUrl("Accessibility Statement")

      And("the user should see the correct sign out url")
        thenTheUserShouldSeeTheCorrectXUrl("sign out")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the dividends link")
        whenTheUserClicksOnTheXLink("dividends")

      Then("the user should be redirected to the Check your income from dividends page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your income from dividends")

      And("the user should see the correct Accessibility Statement url")
        thenTheUserShouldSeeTheCorrectXUrl("Accessibility Statement")

      And("the user should see the correct personal income sign out url")
        thenTheUserShouldSeeTheCorrectXUrl("personal income sign out")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the employment link")
        whenTheUserClicksOnTheXLink("employment")

      Then("the user should be redirected to the PAYE employment page")
        thenTheUserShouldBeRedirectedToTheXPage("PAYE employment")

      And("the user should see the correct Accessibility Statement url")
        thenTheUserShouldSeeTheCorrectXUrl("Accessibility Statement")

      And("the user should see the correct employment sign out url")
        thenTheUserShouldSeeTheCorrectXUrl("employment sign out")

    }

    Scenario("Checking the client authorisation link for agents") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to the There’s a problem page")
        thenTheUserShouldBeRedirectedToTheXPage("There’s a problem")

      And("the user should see the correct Authorise you as an agent url")
        thenTheUserShouldSeeTheCorrectXUrl("Authorise you as an agent")

      Then("the user navigates to the untaxed interest page")
        thenTheUserNavigatesToTheXPage("untaxed interest")

      Then("the user should be redirected to the There’s a problem page")
        thenTheUserShouldBeRedirectedToTheXPage("There’s a problem")

      And("the user should see the correct Authorise you as an agent url")
        thenTheUserShouldSeeTheCorrectXUrl("Authorise you as an agent")

    }

    Scenario("supporting Agent unauthorised to access submission service") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(supportingAgentUser)

      Then("the user should be redirected to the You are not authorised to use this service page")
        thenTheUserShouldBeRedirectedToTheXPage("You are not authorised to use this service")

    }
  }
}
