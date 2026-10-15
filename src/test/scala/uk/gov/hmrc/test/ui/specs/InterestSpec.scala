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

import uk.gov.hmrc.test.ui.specs.tags.classTags.MVP
import uk.gov.hmrc.test.ui.steps.AuthStepDefSteps._
import uk.gov.hmrc.test.ui.steps.CommonStepDefSteps._
import uk.gov.hmrc.test.ui.util.UserLogin

@MVP
class InterestSpec extends BaseSpec {

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

  Feature("Interest Journeys - Income Tax Submission") {

    Scenario("Minimal flow - Individual User - Interest") {
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

      When("the user clicks on the UK Interest link")
      whenTheUserClicksOnTheXLink("UK Interest")

      Then("the user should be redirected to the Did you get any interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get any interest from the UK?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you get untaxed interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get untaxed interest from the UK?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you get taxed interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get taxed interest from the UK?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your UK interest")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

    }

    Scenario("Maximal flow - Agent User - Interest") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser(clientNino = "AA123457A", clientMtdItId = "1234567890", inYear = true))

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

      When("the user clicks on the UK Interest link")
      whenTheUserClicksOnTheXLink("UK Interest")

      Then("the user should be redirected to the Did your client get any interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get any interest from the UK?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client get untaxed interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get untaxed interest from the UK?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Add an account with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Add an account with untaxed UK interest")

      When("the user selects the UK untaxed interest account name field and enters a value of Tesco Bank")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest account name", "Tesco Bank")

      And("the user selects the UK untaxed interest amount earned field and enters a value of 1000")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest amount earned", "1000")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Add an account with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Add an account with untaxed UK interest")

      When("the user selects the UK untaxed interest account name field and enters a value of First Direct")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest account name", "First Direct")

      And("the user selects the UK untaxed interest amount earned field and enters a value of 1500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest amount earned", "1500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Add an account with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Add an account with untaxed UK interest")

      When("the user selects the UK untaxed interest account name field and enters a value of Sainburys Bank")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest account name", "Sainburys Bank")

      And("the user selects the UK untaxed interest amount earned field and enters a value of 2500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest amount earned", "2500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client get taxed interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get taxed interest from the UK?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Which account did your client get taxed UK interest from? page")
      thenTheUserShouldBeRedirectedToTheXPage("Which account did your client get taxed UK interest from?")

      When("the user selects the fifth radio button: add a new account")
      whenTheUserSelectsTheXRadioButtonX("fifth", "add a new account")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      When("the user selects the UK taxed interest account name field and enters a value of RBS")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest account name", "RBS")

      And("the user selects the UK taxed interest amount earned field and enters a value of 500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest amount earned", "500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Which account did your client get taxed UK interest from? page")
      thenTheUserShouldBeRedirectedToTheXPage("Which account did your client get taxed UK interest from?")

      When("the user selects the fifth radio button: add a new account")
      whenTheUserSelectsTheXRadioButtonX("fifth", "add a new account")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      When("the user selects the UK taxed interest account name field and enters a value of Skipton")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest account name", "Skipton")

      And("the user selects the UK taxed interest amount earned field and enters a value of 600")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest amount earned", "600")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Which account did your client get taxed UK interest from? page")
      thenTheUserShouldBeRedirectedToTheXPage("Which account did your client get taxed UK interest from?")

      When("the user selects the fifth radio button: add a new account")
      whenTheUserSelectsTheXRadioButtonX("fifth", "add a new account")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      When("the user selects the UK taxed interest account name field and enters a value of Goldman Sachs")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest account name", "Goldman Sachs")

      And("the user selects the UK taxed interest amount earned field and enters a value of 700")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest amount earned", "700")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s UK interest")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

    }

    Scenario("Account Removal flow - Agent User  - Interest") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser(clientNino = "AA123456A", clientMtdItId = "1234567890", inYear = true))

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

      When("the user clicks on the UK Interest link")
      whenTheUserClicksOnTheXLink("UK Interest")

      Then("the user should be redirected to the Did your client get any interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get any interest from the UK?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client get untaxed interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get untaxed interest from the UK?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Add an account with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Add an account with untaxed UK interest")

      When("the user selects the UK untaxed interest account name field and enters a value of Tesco Bank")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest account name", "Tesco Bank")

      And("the user selects the UK untaxed interest amount earned field and enters a value of 1000")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest amount earned", "1000")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Add an account with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Add an account with untaxed UK interest")

      When("the user selects the UK untaxed interest account name field and enters a value of First Direct")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest account name", "First Direct")

      And("the user selects the UK untaxed interest amount earned field and enters a value of 1000")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest amount earned", "1000")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user clicks on the remove interest link")
      whenTheUserClicksOnTheXLink("remove interest")

      Then("the user should be redirected to the Are you sure you want to remove this account? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this account?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user clicks on the remove interest link")
      whenTheUserClicksOnTheXLink("remove interest")

      Then("the user should be redirected to the Are you sure you want to remove this account? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this account?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user clicks on the remove interest link")
      whenTheUserClicksOnTheXLink("remove interest")

      Then("the user should be redirected to the Are you sure you want to remove this account? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this account?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client get taxed interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get taxed interest from the UK?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Add an account with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Add an account with taxed UK interest")

      When("the user selects the UK taxed interest account name field and enters a value of Sainsburys Bank")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest account name", "Sainsburys Bank")

      And("the user selects the UK taxed interest amount earned field and enters a value of 500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest amount earned", "500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Add an account with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Add an account with taxed UK interest")

      When("the user selects the UK taxed interest account name field and enters a value of Tesco Bank")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest account name", "Tesco Bank")

      And("the user selects the UK taxed interest amount earned field and enters a value of 500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest amount earned", "500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user clicks on the remove interest link")
      whenTheUserClicksOnTheXLink("remove interest")

      Then("the user should be redirected to the Are you sure you want to remove this account? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this account?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user clicks on the remove interest link")
      whenTheUserClicksOnTheXLink("remove interest")

      Then("the user should be redirected to the Are you sure you want to remove this account? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this account?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user clicks on the remove interest link")
      whenTheUserClicksOnTheXLink("remove interest")

      Then("the user should be redirected to the Are you sure you want to remove this account? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove this account?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s UK interest")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

    }

    Scenario("Returning flow - Individual User with prior UK Untaxed & Taxed Interest, Review & change - Interest") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA123459A", inYear = true))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Interest from savings and securities link")
      whenTheUserClicksOnTheXLink("Interest from savings and securities")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      When("the user clicks on the UK Interest link")
      whenTheUserClicksOnTheXLink("UK Interest")

      Then("the user should be redirected to the Check your UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your UK interest")

      When("the user clicks on the change uk untaxed interest accounts summary link")
      whenTheUserClicksOnTheXLink("change uk untaxed interest accounts summary")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user clicks on the first account change link")
      whenTheUserClicksOnTheXLink("first account change")

      Then("the user should be redirected to the How much untaxed UK interest did you get? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much untaxed UK interest did you get?")

      And("the user selects the UK untaxed interest updated amount earned field and enters a value of 100.01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest updated amount earned", "100.01")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user clicks on the second account change link")
      whenTheUserClicksOnTheXLink("second account change")

      Then("the user should be redirected to the How much untaxed UK interest did you get? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much untaxed UK interest did you get?")

      And("the user selects the UK untaxed interest updated amount earned field and enters a value of 100.01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest updated amount earned", "100.01")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your UK interest")

      When("the user clicks on the change uk taxed interest accounts summary link")
      whenTheUserClicksOnTheXLink("change uk taxed interest accounts summary")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user clicks on the first account change link")
      whenTheUserClicksOnTheXLink("first account change")

      Then("the user should be redirected to the How much taxed UK interest did you get? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much taxed UK interest did you get?")

      And("the user selects the UK taxed interest updated amount earned field and enters a value of 100.01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest updated amount earned", "100.01")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user clicks on the second account change link")
      whenTheUserClicksOnTheXLink("second account change")

      Then("the user should be redirected to the How much taxed UK interest did you get? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much taxed UK interest did you get?")

      And("the user selects the UK taxed interest updated amount earned field and enters a value of 6000")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest updated amount earned", "6000")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your UK interest")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

    }

    Scenario("Individual user with taxed/untaxed interest for a previous tax year, chooses a previous account for both") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AA000002A", inYear = false))

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

      When("the user clicks on the UK Interest link")
      whenTheUserClicksOnTheXLink("UK Interest")

      Then("the user should be redirected to the Check your UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your UK interest")

      When("the user clicks on the change uk untaxed interest accounts summary link")
      whenTheUserClicksOnTheXLink("change uk untaxed interest accounts summary")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Which account did you get untaxed UK interest from? page")
      thenTheUserShouldBeRedirectedToTheXPage("Which account did you get untaxed UK interest from?")

      When("the user selects the first radio button: Halifax")
      whenTheUserSelectsTheXRadioButtonX("first", "Halifax")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much untaxed UK interest did you get? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much untaxed UK interest did you get?")

      And("the user selects the UK untaxed interest updated amount earned field and enters a value of 100.01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest updated amount earned", "100.01")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with untaxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with untaxed UK interest")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your UK interest")

      When("the user clicks on the change uk taxed interest accounts summary link")
      whenTheUserClicksOnTheXLink("change uk taxed interest accounts summary")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Which account did you get taxed UK interest from? page")
      thenTheUserShouldBeRedirectedToTheXPage("Which account did you get taxed UK interest from?")

      When("the user selects the second radio button: Nationwide")
      whenTheUserSelectsTheXRadioButtonX("second", "Nationwide")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much taxed UK interest did you get? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much taxed UK interest did you get?")

      And("the user selects the UK untaxed interest updated amount earned field and enters a value of 100.01")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK untaxed interest updated amount earned", "100.01")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your UK interest")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

    }

    Scenario("Agent user with taxed/untaxed interest for a previous tax year, chooses new accounts for both") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser(clientNino = "AA000002A", clientMtdItId = "1234567893", inYear = false))

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

      When("the user clicks on the UK Interest link")
      whenTheUserClicksOnTheXLink("UK Interest")

      Then("the user should be redirected to the Check your client’s UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s UK interest")

      When("the user clicks on the change uk taxed interest accounts summary link")
      whenTheUserClicksOnTheXLink("change uk taxed interest accounts summary")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      When("the user selects the fourth radio button: add a new account")
      whenTheUserSelectsTheXRadioButtonX("fourth", "add a new account")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Add an account with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Add an account with taxed UK interest")

      When("the user selects the UK taxed interest account name field and enters a value of First Direct")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest account name", "First Direct")

      And("the user selects the UK taxed interest amount earned field and enters a value of 1000")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest amount earned", "1000")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s UK interest")

      When("the user clicks on the change uk taxed interest accounts summary link")
      whenTheUserClicksOnTheXLink("change uk taxed interest accounts summary")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Which account did your client get taxed UK interest from? page")
      thenTheUserShouldBeRedirectedToTheXPage("Which account did your client get taxed UK interest from?")

      When("the user selects the fourth radio button: add a new account")
      whenTheUserSelectsTheXRadioButtonX("fourth", "add a new account")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Add an account with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Add an account with taxed UK interest")

      When("the user selects the UK taxed interest account name field and enters a value of Sainsburys Bank")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest account name", "Sainsburys Bank")

      And("the user selects the UK taxed interest amount earned field and enters a value of 500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("UK taxed interest amount earned", "500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Accounts with taxed UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Accounts with taxed UK interest")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s UK interest")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

    }

    Scenario("Individual User with No Prior Interest Data adds Interest in tailoring but then states they did not receive Interest income") {
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

      When("the user clicks on the UK Interest link")
      whenTheUserClicksOnTheXLink("UK Interest")

      Then("the user should be redirected to the Did you get any interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you get any interest from the UK?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your UK interest")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

    }

    Scenario("Agent User with Prior Interest Data states their client did not receive interest income") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser(clientNino = "AA000002A", clientMtdItId = "1234567893", inYear = false))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
      thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the Interest from savings and securities link")
      whenTheUserClicksOnTheXLink("Interest from savings and securities")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

      When("the user clicks on the UK Interest link")
      whenTheUserClicksOnTheXLink("UK Interest")

      Then("the user should be redirected to the Check your client’s UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s UK interest")

      When("the user clicks on the change interest from the uk summary link")
      whenTheUserClicksOnTheXLink("change interest from the uk summary")

      Then("the user should be redirected to the Did your client get any interest from the UK? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client get any interest from the UK?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the This will change information on your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("This will change information on your client’s Income Tax Return")

      When("the user clicks the confirm button")
      whenTheUserClicksTheXButton("confirm")

      Then("the user should be redirected to the Check your client’s UK interest page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s UK interest")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Interest from savings and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Interest from savings and securities")

    }
  }
}