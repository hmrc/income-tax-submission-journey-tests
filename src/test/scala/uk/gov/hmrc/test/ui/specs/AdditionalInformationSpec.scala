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

import uk.gov.hmrc.test.ui.specs.tags._
import uk.gov.hmrc.test.ui.steps.AuthStepDefSteps._
import uk.gov.hmrc.test.ui.steps.CYAStepDefSteps._
import uk.gov.hmrc.test.ui.steps.CommonStepDefSteps._
import uk.gov.hmrc.test.ui.util.UserLogin

@MVP
class AdditionalInformationSpec extends BaseSpec {

  private def individualUser(nino: String, mtdItId: String = "1234567890", inYear: Boolean): UserLogin = UserLogin(
    redirectUrl = if (inYear) "/InYear/start" else "/EOY/start",
    nino = nino,
    enrolmentKey1 = "HMRC-MTD-IT",
    identifierName1 = "MTDITID",
    identifierValue1 = mtdItId
  )

  private def agentUser(clientNino: String, clientMtdItId: String, inYear: Boolean): UserLogin = UserLogin(
    redirectUrl = s"/test-only/${if (inYear) "InYear" else "EOY"}/additional-parameters?ClientNino=$clientNino&ClientMTDID=$clientMtdItId",
    credentialStrength = "weak",
    affinityGroup = "Agent",
    enrolmentKey1 = "HMRC-MTD-IT",
    identifierName1 = "MTDITID",
    identifierValue1 = clientMtdItId,
    enrolmentKey2 = "HMRC-AS-AGENT",
    identifierName2 = "AgentReferenceNumber",
    identifierValue2 = "XARN1234567"
  )

  Feature("Additional Information Journeys (Interest Securities & Gains) - Income Tax Submission") {

    Scenario("Agent User maximal flow - Interest from gilt-edged or accrued income securities") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser(clientNino = "AA123457A", clientMtdItId = "1234567893", inYear = true))

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

      When("the user clicks the addInterest tailoring option")
      whenTheUserClicksTheXTailoringOption("addInterest")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the Interest from savings and securities link")
      whenTheUserClicksOnTheXLink("Interest from savings and securities")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      When("the user clicks on the Interest from gilt-edged or accrued income securities link")
      whenTheUserClicksOnTheXLink("Interest from gilt-edged or accrued income securities")

      Then("the user should be redirected to the Interest from gilt-edged or accrued income securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from gilt-edged or accrued income securities")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Total interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Total interest")

      When("the user selects the amount field and enters a value of 400.40")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "400.40")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Was tax taken off your client’s interest? page")
      thenTheUserShouldBeRedirectedToTheXPage("Was tax taken off your client’s interest?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much tax was taken off your client’s interest? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much tax was taken off your client’s interest?")

      When("the user selects the amount field and enters a value of 123.45")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client's interest from gilt-edged or accrued income securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client's interest from gilt-edged or accrued income securities")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

    }

    Scenario("Individual User says no on 'gateway question page' - Interest from gilt-edged or accrued income securities") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123456A", inYear = false))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addInterest tailoring option")
      whenTheUserClicksTheXTailoringOption("addInterest")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Interest from savings and securities link")
      whenTheUserClicksOnTheXLink("Interest from savings and securities")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      When("the user clicks on the Interest from gilt-edged or accrued income securities link")
      whenTheUserClicksOnTheXLink("Interest from gilt-edged or accrued income securities")

      Then("the user should be redirected to the Interest from gilt-edged or accrued income securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from gilt-edged or accrued income securities")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your interest from gilt-edged or accrued income securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your interest from gilt-edged or accrued income securities")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

    }

    Scenario("Agent User says answers on 'Was tax taken off your interest?' page - Interest from gilt-edged or accrued income securities") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser(clientNino = "AA123457A", clientMtdItId = "1234567893", inYear = true))

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

      When("the user clicks the addInterest tailoring option")
      whenTheUserClicksTheXTailoringOption("addInterest")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the Interest from savings and securities link")
      whenTheUserClicksOnTheXLink("Interest from savings and securities")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      When("the user clicks on the Interest from gilt-edged or accrued income securities link")
      whenTheUserClicksOnTheXLink("Interest from gilt-edged or accrued income securities")

      Then("the user should be redirected to the Interest from gilt-edged or accrued income securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from gilt-edged or accrued income securities")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Total interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Total interest")

      When("the user selects the amount field and enters a value of 400.40")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "400.40")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Was tax taken off your client’s interest? page")
      thenTheUserShouldBeRedirectedToTheXPage("Was tax taken off your client’s interest?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client's interest from gilt-edged or accrued income securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client's interest from gilt-edged or accrued income securities")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

    }

    Scenario("Individual User maximal flow - Gains - User says yes to all questions") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123458A", inYear = true))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addGains tailoring option")
      whenTheUserClicksTheXTailoringOption("addGains")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Gains from policies and contracts link")
      whenTheUserClicksOnTheXLink("Gains from policies and contracts")

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
      thenTheUserShouldBeRedirectedToTheXPage("Gains from life insurance policies and contracts")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the What type of policy gave you a gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("What type of policy gave you a gain?")

      When("the user selects the Life Insurance radio button")
      whenTheUserSelectsTheXRadioButton("Life Insurance")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy number page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy number")

      When("the user selects the Policy number field and enters a value of P-89879-123")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Policy number", "P-89879-123")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Chargeable event gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Chargeable event gain")

      When("the user selects the amount field and enters a value of 123.45")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy event page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy event")

      When("the user selects the Other radio button")
      whenTheUserSelectsTheXRadioButton("Other")

      And("the user selects the What caused this gain? field and enters a value of Inheritance")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("What caused this gain?", "Inheritance")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
      thenTheUserShouldBeRedirectedToTheXPage("Have you had a gain from this policy in an earlier tax year?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Years since your last gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Years since your last gain")

      When("the user selects the Gains Year field and enters a value of 99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy held page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy held")

      When("the user selects the Gains Year field and enters a value of 99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Was your gain treated as tax paid? page")
      thenTheUserShouldBeRedirectedToTheXPage("Was your gain treated as tax paid?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Are you entitled to deficiency relief? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you entitled to deficiency relief?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user selects the amount field and enters a value of 193")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "193")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 1")
      whenTheUserClicksOnTheChangeLinkInPositionX("1")

      Then("the user should be redirected to the What type of policy gave you a gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("What type of policy gave you a gain?")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 2")
      whenTheUserClicksOnTheChangeLinkInPositionX("2")

      Then("the user should be redirected to the Policy number page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy number")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 3")
      whenTheUserClicksOnTheChangeLinkInPositionX("3")

      Then("the user should be redirected to the Chargeable event gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Chargeable event gain")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 4")
      whenTheUserClicksOnTheChangeLinkInPositionX("4")

      Then("the user should be redirected to the Policy event page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy event")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 5")
      whenTheUserClicksOnTheChangeLinkInPositionX("5")

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
      thenTheUserShouldBeRedirectedToTheXPage("Have you had a gain from this policy in an earlier tax year?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Years since your last gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Years since your last gain")

      When("the user selects the Gains Year field and enters a value of 99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 6")
      whenTheUserClicksOnTheChangeLinkInPositionX("6")

      Then("the user should be redirected to the Years since your last gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Years since your last gain")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 7")
      whenTheUserClicksOnTheChangeLinkInPositionX("7")

      Then("the user should be redirected to the Policy held page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy held")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 8")
      whenTheUserClicksOnTheChangeLinkInPositionX("8")

      Then("the user should be redirected to the Was your gain treated as tax paid? page")
      thenTheUserShouldBeRedirectedToTheXPage("Was your gain treated as tax paid?")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 9")
      whenTheUserClicksOnTheChangeLinkInPositionX("9")

      Then("the user should be redirected to the Are you entitled to deficiency relief? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you entitled to deficiency relief?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user selects the amount field and enters a value of 193")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "193")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your policies page")
      thenTheUserShouldBeRedirectedToTheXPage("Your policies")

    }

    Scenario("Individual User maximal flow - Gains - User answers no on gains status page - Life Insurance") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123456A", inYear = true))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addGains tailoring option")
      whenTheUserClicksTheXTailoringOption("addGains")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Gains from policies and contracts link")
      whenTheUserClicksOnTheXLink("Gains from policies and contracts")

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
      thenTheUserShouldBeRedirectedToTheXPage("Gains from life insurance policies and contracts")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the What type of policy gave you a gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("What type of policy gave you a gain?")

      When("the user selects the Life Insurance radio button")
      whenTheUserSelectsTheXRadioButton("Life Insurance")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy number page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy number")

      When("the user selects the Policy number field and enters a value of P-89879-123")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Policy number", "P-89879-123")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Chargeable event gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Chargeable event gain")

      When("the user selects the amount field and enters a value of 123.45")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy event page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy event")

      When("the user selects the Full or part surrender radio button")
      whenTheUserSelectsTheXRadioButton("Full or part surrender")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
      thenTheUserShouldBeRedirectedToTheXPage("Have you had a gain from this policy in an earlier tax year?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy held page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy held")

      When("the user selects the Gains Year field and enters a value of 99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Was your gain treated as tax paid? page")
      thenTheUserShouldBeRedirectedToTheXPage("Was your gain treated as tax paid?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Are you entitled to deficiency relief? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you entitled to deficiency relief?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

    }

    Scenario("Individual User minimum flow - Gains - User answers no on gain gateway question page") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA012345A", inYear = true))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addGains tailoring option")
      whenTheUserClicksTheXTailoringOption("addGains")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Gains from policies and contracts link")
      whenTheUserClicksOnTheXLink("Gains from policies and contracts")

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
      thenTheUserShouldBeRedirectedToTheXPage("Gains from life insurance policies and contracts")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your gains from life insurance policies and contracts page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your gains from life insurance policies and contracts")

      When("the user clicks the return to overview button")
      whenTheUserClicksTheXButton("return to overview")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      Then("the Gains status on the page displays Excluded")
      thenTheXOnThePageDisplaysX("Gains status", "Excluded")

    }

    Scenario("Individual User maximum flow - Gains - User answers no on Deficiency relief page") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123456A", inYear = true))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addGains tailoring option")
      whenTheUserClicksTheXTailoringOption("addGains")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Gains from policies and contracts link")
      whenTheUserClicksOnTheXLink("Gains from policies and contracts")

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
      thenTheUserShouldBeRedirectedToTheXPage("Gains from life insurance policies and contracts")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the What type of policy gave you a gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("What type of policy gave you a gain?")

      When("the user selects the Life Insurance radio button")
      whenTheUserSelectsTheXRadioButton("Life Insurance")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy number page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy number")

      When("the user selects the Policy number field and enters a value of P-89879-123")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Policy number", "P-89879-123")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Chargeable event gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Chargeable event gain")

      When("the user selects the amount field and enters a value of 123.45")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy event page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy event")

      When("the user selects the Sale or assignment of a policy radio button")
      whenTheUserSelectsTheXRadioButton("Sale or assignment of a policy")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
      thenTheUserShouldBeRedirectedToTheXPage("Have you had a gain from this policy in an earlier tax year?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Years since your last gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Years since your last gain")

      When("the user selects the Gains Year field and enters a value of 99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy held page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy held")

      When("the user selects the Gains Year field and enters a value of 99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Was your gain treated as tax paid? page")
      thenTheUserShouldBeRedirectedToTheXPage("Was your gain treated as tax paid?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Are you entitled to deficiency relief? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you entitled to deficiency relief?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

    }

    Scenario("Returning flow - Individual User with prior Gains Data, Reviews data") { // TODO: is this needed? it adds Gains section, checks status tag is 'Updated',  goes to add another policy but clicks back
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123459A", inYear = true))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addGains tailoring option")
      whenTheUserClicksTheXTailoringOption("addGains")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      And("the status on the page is Updated Tag")
      thenTheStatusOnThePageIsX("Updated Tag")

      When("the user clicks on the Gains from policies and contracts link")
      whenTheUserClicksOnTheXLink("Gains from policies and contracts")

      Then("the user should be redirected to the Your policies page")
      thenTheUserShouldBeRedirectedToTheXPage("Your policies")

      When("the user clicks on the Add another gain from a different policy link")
      whenTheUserClicksOnTheXLink("Add another gain from a different policy")

      Then("the user should be redirected to the What type of policy gave you a gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("What type of policy gave you a gain?")

      When("the user clicks on the back link")
      whenTheUserClicksOnTheXLink("back")

      Then("the user should be redirected to the Your policies page")
      thenTheUserShouldBeRedirectedToTheXPage("Your policies")

      When("the user clicks the return to overview button")
      whenTheUserClicksTheXButton("return to overview")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

    }

    Scenario("Returning flow - Individual User with prior Gains Data, removes policy") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123459A", inYear = true))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Gains from policies and contracts link")
      whenTheUserClicksOnTheXLink("Gains from policies and contracts")

      Then("the user should be redirected to the Your policies page")
      thenTheUserShouldBeRedirectedToTheXPage("Your policies")

      When("the user clicks on the Policy remove link")
      whenTheUserClicksOnTheXLink("Policy remove")

      Then("the user should be redirected to the Are you sure you want to remove this policy? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this policy?")

      When("the user clicks the remove button")
      whenTheUserClicksTheXButton("remove")

      Then("the user should be redirected to the Your policies page")
      thenTheUserShouldBeRedirectedToTheXPage("Your policies")

    }

    Scenario("Individual User maximal flow - Gains - User says yes to all questions - Deficiency relief") { //deficiency relief
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123458A", inYear = true))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addGains tailoring option")
      whenTheUserClicksTheXTailoringOption("addGains")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Gains from policies and contracts link")
      whenTheUserClicksOnTheXLink("Gains from policies and contracts")

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
      thenTheUserShouldBeRedirectedToTheXPage("Gains from life insurance policies and contracts")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the What type of policy gave you a gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("What type of policy gave you a gain?")

      When("the user selects the Voided ISA radio button")
      whenTheUserSelectsTheXRadioButton("Voided ISA")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy number page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy number")

      When("the user selects the Policy number field and enters a value of P-89879-123")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Policy number", "P-89879-123")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Chargeable event gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Chargeable event gain")

      When("the user selects the amount field and enters a value of 123.45")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy event page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy event")

      When("the user selects the Other radio button")
      whenTheUserSelectsTheXRadioButton("Other")

      And("the user selects the What caused this gain? field and enters a value of Inheritance")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("What caused this gain?", "Inheritance")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
      thenTheUserShouldBeRedirectedToTheXPage("Have you had a gain from this policy in an earlier tax year?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Years since your last gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Years since your last gain")

      When("the user selects the Gains Year field and enters a value of 99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy held page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy held")

      When("the user selects the Gains Year field and enters a value of 99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much tax did you pay on your gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much tax did you pay on your gain?")

      When("the user selects the amount field and enters a value of 123.45")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 1")
      whenTheUserClicksOnTheChangeLinkInPositionX("1")

      Then("the user should be redirected to the What type of policy gave you a gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("What type of policy gave you a gain?")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 2")
      whenTheUserClicksOnTheChangeLinkInPositionX("2")

      Then("the user should be redirected to the Policy number page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy number")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 3")
      whenTheUserClicksOnTheChangeLinkInPositionX("3")

      Then("the user should be redirected to the Chargeable event gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Chargeable event gain")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 4")
      whenTheUserClicksOnTheChangeLinkInPositionX("4")

      Then("the user should be redirected to the Policy event page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy event")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 5")
      whenTheUserClicksOnTheChangeLinkInPositionX("5")

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
      thenTheUserShouldBeRedirectedToTheXPage("Have you had a gain from this policy in an earlier tax year?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Years since your last gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Years since your last gain")

      When("the user selects the Gains Year field and enters a value of 99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 6")
      whenTheUserClicksOnTheChangeLinkInPositionX("6")

      Then("the user should be redirected to the Years since your last gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Years since your last gain")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 7")
      whenTheUserClicksOnTheChangeLinkInPositionX("7")

      Then("the user should be redirected to the Policy held page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy held")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks on the change link in position 8")
      whenTheUserClicksOnTheChangeLinkInPositionX("8")

      Then("the user should be redirected to the How much tax did you pay on your gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much tax did you pay on your gain?")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your policies page")
      thenTheUserShouldBeRedirectedToTheXPage("Your policies")

    }

    Scenario("Individual User maximal flow - Gains - User answers no on gains status page - Voided ISA") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123456A", inYear = true))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addGains tailoring option")
      whenTheUserClicksTheXTailoringOption("addGains")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Gains from policies and contracts link")
      whenTheUserClicksOnTheXLink("Gains from policies and contracts")

      Then("the user should be redirected to the Gains from life insurance policies and contracts page")
      thenTheUserShouldBeRedirectedToTheXPage("Gains from life insurance policies and contracts")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the What type of policy gave you a gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("What type of policy gave you a gain?")

      When("the user selects the Voided ISA radio button")
      whenTheUserSelectsTheXRadioButton("Voided ISA")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy number page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy number")

      When("the user selects the Policy number field and enters a value of P-89879-123")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Policy number", "P-89879-123")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Chargeable event gain page")
      thenTheUserShouldBeRedirectedToTheXPage("Chargeable event gain")

      When("the user selects the amount field and enters a value of 123.45")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy event page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy event")

      When("the user selects the Full or part surrender radio button")
      whenTheUserSelectsTheXRadioButton("Full or part surrender")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you had a gain from this policy in an earlier tax year? page")
      thenTheUserShouldBeRedirectedToTheXPage("Have you had a gain from this policy in an earlier tax year?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy held page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy held")

      When("the user selects the Gains Year field and enters a value of 99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Gains Year", "99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much tax did you pay on your gain? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much tax did you pay on your gain?")

      When("the user selects the amount field and enters a value of 123.45")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "123.45")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Policy summary page")
      thenTheUserShouldBeRedirectedToTheXPage("Policy summary")

    }

    /*
        Scenario("Returning flow - Individual User with prior Gains Data, Reviews data") { // TODO: commented outas same as Scenario on line 1277 (same name) without adding the policy
          When("the user logs into the service with the following details")
            givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123459A", inYear = true))

          Then("the user should be redirected to Update and submit an Income Tax Return page")
            thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

          When("the user clicks the continue button")
            whenTheUserClicksTheXButton("continue")

          Then("the user should be redirected to the Your Income Tax Return page")
            thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

          When("the user clicks on the addSections link")
            whenTheUserClicksOnTheXLink("addSections")

          Then("the user should be redirected to the Add sections to your Income Tax Return page")
            thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

          When("the user clicks the addGains tailoring option")
            whenTheUserClicksTheXTailoringOption("addGains")

          And("the user clicks the continue button")
            whenTheUserClicksTheXButton("continue")

          Then("the user should be redirected to the Your Income Tax Return page")
            thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

          And("the status on the page is Updated Tag")
            thenTheStatusOnThePageIsX("Updated Tag")  // auto-chosen (score=0.90, CYAStepDefSteps.scala)

          When("the user clicks on the Gains from policies and contracts link")
            whenTheUserClicksOnTheXLink("Gains from policies and contracts")

          Then("the user should be redirected to the Your policies page")
            thenTheUserShouldBeRedirectedToTheXPage("Your policies")

          When("the user clicks the return to overview button")
            whenTheUserClicksTheXButton("return to overview")

          Then("the user should be redirected to the Your Income Tax Return page")
            thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

        }
    */
    Scenario("Maximal flow - Agent User - Stock Dividends") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser(clientNino = "AA123457A", clientMtdItId = "1234567890", inYear = false))

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

      When("the user clicks the addDividend tailoring option")
      whenTheUserClicksTheXTailoringOption("addDividend")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the dividends link")
      whenTheUserClicksOnTheXLink("dividends")

      Then("the user should be redirected to the Did your client get dividends from shares? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get dividends from shares?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client get dividends from UK-based companies? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get dividends from UK-based companies?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client get in dividends from UK-based companies? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client get in dividends from UK-based companies?")

      When("the user selects the UK dividends amount field and enters a value of 1000")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK dividends amount", "1000")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Dividends from UK-based trusts or open-ended investment companies page")
      thenTheUserShouldBeRedirectedToTheXPage("Dividends from UK-based trusts or open-ended investment companies")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client get in dividends from trusts and open-ended investment companies based in the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client get in dividends from trusts and open-ended investment companies based in the UK?")

      When("the user selects the UK other dividends amount field and enters a value of 500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK other dividends amount", "500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client get stock dividends? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get stock dividends?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client get? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client get?")

      When("the user selects the amount field and enters a value of 100")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client get free or redeemable shares? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get free or redeemable shares?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client get in free or redeemable shares? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client get in free or redeemable shares?")

      When("the user selects the amount field and enters a value of 100")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Close company loans written off page")
      thenTheUserShouldBeRedirectedToTheXPage("Close company loans written off")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did the close company write off or release from your client's loan? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did the close company write off or release from your client's loan?")

      When("the user selects the amount field and enters a value of 100")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client's dividends page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client's dividends")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

    }

    Scenario("Maximal flow - User with no prior data - answers No on Stock Dividends page") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123458A", inYear = false))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addDividend tailoring option")
      whenTheUserClicksTheXTailoringOption("addDividend")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the dividends link")
      whenTheUserClicksOnTheXLink("dividends")

      Then("the user should be redirected to the Did you get dividends from shares? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get dividends from shares?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you get dividends from UK-based companies? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get dividends from UK-based companies?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you get in dividends from UK-based companies? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did you get in dividends from UK-based companies?")

      When("the user selects the UK dividends amount field and enters a value of 1000")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK dividends amount", "1000")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Dividends from UK-based trusts or open-ended investment companies page")
      thenTheUserShouldBeRedirectedToTheXPage("Dividends from UK-based trusts or open-ended investment companies")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you get in dividends from trusts and open-ended investment companies based in the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did you get in dividends from trusts and open-ended investment companies based in the UK?")

      When("the user selects the UK other dividends amount field and enters a value of 500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK other dividends amount", "500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you get stock dividends? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get stock dividends?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you get free or redeemable shares? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get free or redeemable shares?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Close company loans written off page")
      thenTheUserShouldBeRedirectedToTheXPage("Close company loans written off")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your dividends page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your dividends")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

    }

    Scenario("Maximal flow - User with no prior data - answers Yes on Stock Dividends page but no for all following questions") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123458A", inYear = false))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user clicks the addDividend tailoring option")
      whenTheUserClicksTheXTailoringOption("addDividend")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the dividends link")
      whenTheUserClicksOnTheXLink("dividends")

      Then("the user should be redirected to the Did you get dividends from shares? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get dividends from shares?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you get dividends from UK-based companies? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get dividends from UK-based companies?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you get in dividends from UK-based companies? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did you get in dividends from UK-based companies?")

      When("the user selects the UK dividends amount field and enters a value of 1000")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK dividends amount", "1000")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Dividends from UK-based trusts or open-ended investment companies page")
      thenTheUserShouldBeRedirectedToTheXPage("Dividends from UK-based trusts or open-ended investment companies")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you get in dividends from trusts and open-ended investment companies based in the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did you get in dividends from trusts and open-ended investment companies based in the UK?")

      When("the user selects the UK other dividends amount field and enters a value of 500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK other dividends amount", "500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you get stock dividends? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get stock dividends?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you get? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did you get?")

      When("the user selects the amount field and enters a value of 100")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you get free or redeemable shares? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get free or redeemable shares?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Close company loans written off page")
      thenTheUserShouldBeRedirectedToTheXPage("Close company loans written off")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your dividends page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your dividends")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

    }

    Scenario("Maximal flow - User with no prior data - adds all available Business Tax Reliefs") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123458A", inYear = false))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the addSections link")
      whenTheUserClicksOnTheXLink("addSections")

      Then("the user should be redirected to the Add sections to your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")

      When("the user navigates to the Post-cessation trade relief page")
      thenTheUserNavigatesToTheXPage("Post-cessation trade relief")

      And("the user selects the amount field and enters a value of 50.99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "50.99")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks on the change link in position 1")
      whenTheUserClicksOnTheChangeLinkInPositionX("1")

      Then("the user should be redirected to the Post-cessation trade relief and certain other losses page")
      thenTheUserShouldBeRedirectedToTheXPage("Post-cessation trade relief and certain other losses")

      When("the user selects the amount field and enters a value of 125.44")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "125.44")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      When("the user navigates to the Non-deductible Loan Interest relief page")
      thenTheUserNavigatesToTheXPage("Non-deductible Loan Interest relief")

      And("the user selects the amount field and enters a value of 50.99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "50.99")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks on the change link in position 1")
      whenTheUserClicksOnTheChangeLinkInPositionX("1")

      Then("the user should be redirected to the Non-deductible loan interest from investments into property letting partnerships page")
      thenTheUserShouldBeRedirectedToTheXPage("Non-deductible loan interest from investments into property letting partnerships")

      When("the user selects the amount field and enters a value of 110.44")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.44")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      When("the user navigates to the Qualifying loan interest relief page")
      thenTheUserNavigatesToTheXPage("Qualifying loan interest relief")

      And("the user selects the amount field and enters a value of 120.44")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "120.44")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks on the change link in position 1")
      whenTheUserClicksOnTheChangeLinkInPositionX("1")

      Then("the user should be redirected to the Qualifying loan interest payable in the year page")
      thenTheUserShouldBeRedirectedToTheXPage("Qualifying loan interest payable in the year")

      When("the user selects the amount field and enters a value of 125.44")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "125.44")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

    }
  }
}

