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
import specsteps.CommonStepDefSteps._
import specsteps.AuthStepDefSteps.givenTheUserLogsIntoTheServiceWithTheFollowingDetails


class SelfEmploymentAccuralUseMaximumTradingAllowanceJourneySpec extends BaseSpec with Matchers {

  val agentUser: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/test-only/InYear/additional-parameters?ClientNino=BB000001A&ClientMTDID=1234567890"),
    Map("Credential Strength" -> "weak"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Agent"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567890"),
    Map("Enrolment Key 2" -> "HMRC-AS-AGENT"),
    Map("Identifier Name 2" -> "AgentReferenceNumber"),
    Map("Identifier Value 2" -> "XARN1234567")
  )

  Feature("Self Employment accrual accounting -Use Maximum trading allowance Journeys") {

    Scenario("Agent Check self employment details") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the addSections link")
        whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Add sections to your client’s Income Tax Return")

      When("the user clicks the addSelfEmployment tailoring option")
        whenTheUserClicksTheXTailoringOption("addSelfEmployment")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the Self Employment link")
        whenTheUserClicksOnTheXLink("Self Employment")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

    }

    Scenario("Agent - Self Employment Abroad") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the addSections link")
        whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Add sections to your client’s Income Tax Return")

      When("the user clicks the addSelfEmployment tailoring option")
        whenTheUserClicksTheXTailoringOption("addSelfEmployment")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the Self Employment link")
        whenTheUserClicksOnTheXLink("Self Employment")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Review self-employments link")
        whenTheUserClicksOnTheXLink("Review self-employments")

      Then("the user should be redirected to the Check your client’s self-employment details page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your client’s self-employment details")

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

      Then("the user should be redirected to the Was your client a farmer or market gardener? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Was your client a farmer or market gardener?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Did your client get over half their profit from literary or creative works? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Did your client get over half their profit from literary or creative works?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your client’s details page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your client’s self-employment details")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button")
        whenTheUserSelectsTheXRadioButton("Yes, I’ve completed this section")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your client’s self-employment details")

    }

    Scenario("Agent - Self employment InYear Income journey - (Accural accounting - maximum trading allowance)") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the addSections link")
        whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Add sections to your client’s Income Tax Return")

      When("the user clicks the addSelfEmployment tailoring option")
        whenTheUserClicksTheXTailoringOption("addSelfEmployment")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the Self Employment link")
        whenTheUserClicksOnTheXLink("Self Employment")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Self-employment Income link")
        whenTheUserClicksOnTheXLink("Self-employment Income")

      Then("the user should be redirected to the Income not counted as turnover page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Income not counted as turnover")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much non-turnover income did your client get? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much non-turnover income did your client get?")

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

      Then("the user should be redirected to the Is there any other self-employment income your client needs to tell us about? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Is there any other self-employment income your client needs to tell us about?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much other self-employment income did your client get? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much other self-employment income did your client get?")

      And("the user selects the Amount-field field and enters a value of 100000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "100000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Turnover exempt from tax page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Turnover exempt from tax")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much of your client’s turnover is exempt from being taxed as profit? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much of your client’s turnover is exempt from being taxed as profit?")

      And("the user selects the Amount-field field and enters a value of 120,000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "120,000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Trading allowance page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Trading allowance")

      When("the user selects the Use the trading allowance radio button")
        whenTheUserSelectsTheXRadioButton("Use the trading allowance")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Trading allowance for income under £1,000 page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Trading allowance for income under £1,000")

      When("the user selects the first radio button radio button")
        whenTheUserSelectsTheXRadioButton("first radio button")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your client’s income page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your client’s income")

      And("the user clicks the Self Employment Save and continue button")
        whenTheUserClicksTheXButton("Self Employment Save and continue")

      Then("the user should be redirected to the Have you finished this section? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Have you finished this section?")

      When("the user selects the Yes, I’ve completed this section radio button")
        whenTheUserSelectsTheXRadioButton("Yes, I’ve completed this section")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

    }
  }
}
