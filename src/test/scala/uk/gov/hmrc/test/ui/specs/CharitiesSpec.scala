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

import uk.gov.hmrc.test.ui.specs.tags.MVP
import uk.gov.hmrc.test.ui.steps.AuthStepDefSteps._
import uk.gov.hmrc.test.ui.steps.CommonStepDefSteps._
import uk.gov.hmrc.test.ui.util.UserLogin

@MVP
class CharitiesSpec extends BaseSpec {

  private def individualUserInYear(nino: String, mtdItId: String): UserLogin = UserLogin(
    redirectUrl = "/InYear/start",
    nino = nino,
    enrolmentKey1 = "HMRC-MTD-IT",
    identifierName1 = "MTDITID",
    identifierValue1 = mtdItId
  )

  private def agentUserInYear(clientNino: String, clientMtdItId: String = "1234567890"): UserLogin = UserLogin(
    redirectUrl = s"/test-only/InYear/additional-parameters?ClientNino=$clientNino&ClientMTDID=$clientMtdItId",
    credentialStrength = "weak",
    affinityGroup = "Agent",
    enrolmentKey1 = "HMRC-MTD-IT",
    identifierName1 = "MTDITID",
    identifierValue1 = clientMtdItId,
    enrolmentKey2 = "HMRC-AS-AGENT",
    identifierName2 = "AgentReferenceNumber",
    identifierValue2 = "XARN1234567"
  )

  Feature("Charities Journeys - Income Tax Submission") {

    Scenario("Minimal flow - Individual User - Charities") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUserInYear(nino = "AA123456A", mtdItId = "1234567890"))

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

      When("the user clicks the addGiftAid tailoring option")
      whenTheUserClicksTheXTailoringOption("addGiftAid")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the GiftAid link")
      whenTheUserClicksOnTheXLink("GiftAid")

      Then("the user should be redirected to the Did you make donations to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you make donations to charity?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you use Gift Aid to donate to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you use Gift Aid to donate to charity?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user is redirected to the Do you want to add any donations made after 5 April InYear to this tax year? page")
      thenTheUserIsRedirectedToTheXXXPage("Do you want to add any donations made after 5 April", "InYear", "to this tax year?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Qualifying shares and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Qualifying shares and securities")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you donate land or property to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you donate land or property to charity?")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")
    }

    Scenario("Maximal flow - Agent User - Charities") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUserInYear(clientNino = "AA123457A"))

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

      When("the user clicks the addGiftAid tailoring option")
      whenTheUserClicksTheXTailoringOption("addGiftAid")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the GiftAid link")
      whenTheUserClicksOnTheXLink("GiftAid")

      Then("the user should be redirected to the Did your client make donations to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client make donations to charity?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client use Gift Aid to donate to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client use Gift Aid to donate to charity?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client donate to charity by using Gift Aid? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client donate to charity by using Gift Aid?")


      When("the user selects the Amount donated using Gift Aid field and enters a value of 1500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated using Gift Aid", "1500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client make one-off donations? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client make one-off donations?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client donate to charity as one-off payments? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client donate to charity as one-off payments?")


      When("the user selects the Amount donated as one-off payments field and enters a value of 700.50")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated as one-off payments", "700.50")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client use Gift Aid to donate to an overseas charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client use Gift Aid to donate to an overseas charity?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client donate to overseas charities by using Gift Aid? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client donate to overseas charities by using Gift Aid?")

      When("the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 12.99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated to overseas charities using Gift Aid", "12.99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Name of overseas charity your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity your client used Gift Aid to donate to")

      When("the user selects the Name of overseas charity field and enters a value of Bear’s Blue House")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity", "Bear’s Blue House")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charity your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity your client used Gift Aid to donate to")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Name of overseas charity your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity your client used Gift Aid to donate to")

      When("the user selects the Name of overseas charity field and enters a value of Foster’s Home")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity", "Foster’s Home")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charities your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charities your client used Gift Aid to donate to")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user is then redirected to the Did you add any of your client’s donations to the TaxYearMinusTwo EOY tax year? page")
      thenTheUserIsThenRedirectedToTheXXXXPage("Did you add any of your client’s donations to the", "TaxYearMinusTwo", "EOY", "tax year?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user is then redirected to the How much of your client’s donation did you add to the TaxYearMinusTwo EOY tax year? page")
      thenTheUserIsThenRedirectedToTheXXXXPage("How much of your client’s donation did you add to the", "TaxYearMinusTwo", "EOY", "tax year?")


      When("the user selects the Amount to add to last tax year field and enters a value of 117")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount to add to last tax year", "117")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user is redirected to the Do you want to add any donations made after 5 April InYear to this tax year? page")
      thenTheUserIsRedirectedToTheXXXPage("Do you want to add any donations made after 5 April", "InYear", "to this tax year?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user is redirected to the How much of the donations your client made after 5 April InYear do you want to add to this tax year? page")
      thenTheUserIsRedirectedToTheXXXPage("How much of the donations your client made after 5 April", "InYear", "do you want to add to this tax year?")


      When("the user selects the Amount to add to this tax year field and enters a value of 0.48")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount to add to this tax year", "0.48")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Qualifying shares and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Qualifying shares and securities")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the What is the total value of qualifying shares or securities donated to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the total value of qualifying shares or securities donated to charity?")


      When("the user selects the Total value of qualifying shares or securities field and enters a value of 1500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Total value of qualifying shares or securities", "1500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client donate land or property to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client donate land or property to charity?")

      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the What is the value of land or property donated to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the value of land or property donated to charity?")


      When("the user selects the Value of land or property field and enters a value of 750")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Value of land or property", "750")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client donate qualifying shares, securities, land or property to overseas charities? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client donate qualifying shares, securities, land or property to overseas charities?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the What is the value of qualifying shares, securities, land or property donated to overseas charities? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the value of qualifying shares, securities, land or property donated to overseas charities?")


      When("the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 219.05")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Value of qualifying shares, securities, land or property donated to overseas charities", "219.05")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Name of overseas charity your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity your client donated shares, securities, land or property to")


      When("the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Dexter’s Laboratory")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity your client donated shares, securities, land or property to", "Dexter’s Laboratory")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charity your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity your client donated shares, securities, land or property to")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Name of overseas charity your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity your client donated shares, securities, land or property to")


      When("the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Arnold’s Block")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity your client donated shares, securities, land or property to", "Arnold’s Block")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charities your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charities your client donated shares, securities, land or property to")


      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")

      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

    }

    Scenario("Account Removal flow - Agent User - Charities") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUserInYear(clientNino = "AA123457A"))

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


      When("the user clicks the addGiftAid tailoring option")
      whenTheUserClicksTheXTailoringOption("addGiftAid")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")


      When("the user clicks on the GiftAid link")
      whenTheUserClicksOnTheXLink("GiftAid")

      Then("the user should be redirected to the Did your client make donations to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client make donations to charity?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client use Gift Aid to donate to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client use Gift Aid to donate to charity?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client donate to charity by using Gift Aid? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client donate to charity by using Gift Aid?")


      When("the user selects the Amount donated using Gift Aid field and enters a value of 1500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated using Gift Aid", "1500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client make one-off donations? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client make one-off donations?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client donate to charity as one-off payments? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client donate to charity as one-off payments?")


      When("the user selects the Amount donated as one-off payments field and enters a value of 700.50")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated as one-off payments", "700.50")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client use Gift Aid to donate to an overseas charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client use Gift Aid to donate to an overseas charity?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client donate to overseas charities by using Gift Aid? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client donate to overseas charities by using Gift Aid?")


      When("the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 12.99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated to overseas charities using Gift Aid", "12.99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Name of overseas charity your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity your client used Gift Aid to donate to")


      When("the user selects the Name of overseas charity field and enters a value of Bear’s Blue House")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity", "Bear’s Blue House")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charity your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity your client used Gift Aid to donate to")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Name of overseas charity your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity your client used Gift Aid to donate to")


      When("the user selects the Name of overseas charity field and enters a value of Foster’s Home")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity", "Foster’s Home")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charities your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charities your client used Gift Aid to donate to")


      When("the user clicks on the remove account link")
      whenTheUserClicksOnTheXLink("remove account")

      Then("the user should be redirected to the Are you sure you want to remove Bear’s Blue House? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove Bear’s Blue House?")


      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charities your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charities your client used Gift Aid to donate to")


      When("the user clicks on the remove account link")
      whenTheUserClicksOnTheXLink("remove account")

      Then("the user should be redirected to the Are you sure you want to remove Bear’s Blue House? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove Bear’s Blue House?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charity your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity your client used Gift Aid to donate to")


      When("the user clicks on the remove account link")
      whenTheUserClicksOnTheXLink("remove account")

      Then("the user should be redirected to the Are you sure you want to remove Foster’s Home? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove Foster’s Home?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user is then redirected to the Did you add any of your client’s donations to the TaxYearMinusTwo EOY tax year? page")
      thenTheUserIsThenRedirectedToTheXXXXPage("Did you add any of your client’s donations to the", "TaxYearMinusTwo", "EOY", "tax year?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user is then redirected to the How much of your client’s donation did you add to the TaxYearMinusTwo EOY tax year? page")
      thenTheUserIsThenRedirectedToTheXXXXPage("How much of your client’s donation did you add to the", "TaxYearMinusTwo", "EOY", "tax year?")


      When("the user selects the Amount to add to last tax year field and enters a value of 15")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount to add to last tax year", "15")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user is redirected to the Do you want to add any donations made after 5 April InYear to this tax year? page")
      thenTheUserIsRedirectedToTheXXXPage("Do you want to add any donations made after 5 April", "InYear", "to this tax year?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user is redirected to the How much of the donations your client made after 5 April InYear do you want to add to this tax year? page")
      thenTheUserIsRedirectedToTheXXXPage("How much of the donations your client made after 5 April", "InYear", "do you want to add to this tax year?")


      When("the user selects the Amount to add to this tax year field and enters a value of 0.48")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount to add to this tax year", "0.48")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Qualifying shares and securities page")
      thenTheUserShouldBeRedirectedToTheXPage("Qualifying shares and securities")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the What is the total value of qualifying shares or securities donated to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the total value of qualifying shares or securities donated to charity?")


      When("the user selects the Total value of qualifying shares or securities field and enters a value of 1500")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Total value of qualifying shares or securities", "1500")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client donate land or property to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client donate land or property to charity?")


      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client donate qualifying shares, securities, land or property to overseas charities? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client donate qualifying shares, securities, land or property to overseas charities?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the What is the value of qualifying shares, securities, land or property donated to overseas charities? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the value of qualifying shares, securities, land or property donated to overseas charities?")


      When("the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 219.05")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Value of qualifying shares, securities, land or property donated to overseas charities", "219.05")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Name of overseas charity your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity your client donated shares, securities, land or property to")


      When("the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Dexter’s Laboratory")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity your client donated shares, securities, land or property to", "Dexter’s Laboratory")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charity your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity your client donated shares, securities, land or property to")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Name of overseas charity your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity your client donated shares, securities, land or property to")


      When("the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Arnold’s Block")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity your client donated shares, securities, land or property to", "Arnold’s Block")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charities your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charities your client donated shares, securities, land or property to")


      When("the user clicks on the remove account link")
      whenTheUserClicksOnTheXLink("remove account")

      Then("the user should be redirected to the Are you sure you want to remove Dexter’s Laboratory? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove Dexter’s Laboratory?")


      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charities your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charities your client donated shares, securities, land or property to")


      When("the user clicks on the remove account link")
      whenTheUserClicksOnTheXLink("remove account")

      Then("the user should be redirected to the Are you sure you want to remove Dexter’s Laboratory? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove Dexter’s Laboratory?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charity your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity your client donated shares, securities, land or property to")


      When("the user clicks on the remove account link")
      whenTheUserClicksOnTheXLink("remove account")

      Then("the user should be redirected to the Are you sure you want to remove Arnold’s Block? page")
      thenTheUserShouldBeRedirectedToTheXPage("Are you sure you want to remove Arnold’s Block?")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")


    }

    Scenario("Returning flow - Individual User, Review & change - Charities") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUserInYear(nino = "AA123459A", mtdItId =  "1234567891"))

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


      When("the user clicks the addGiftAid tailoring option")
      whenTheUserClicksTheXTailoringOption("addGiftAid")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")


      When("the user clicks on the GiftAid link")
      whenTheUserClicksOnTheXLink("GiftAid")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks on the change amount donated to charity using Gift Aid link")
      whenTheUserClicksOnTheXLink("change amount donated to charity using Gift Aid")

      Then("the user should be redirected to the How much did you donate to charity by using Gift Aid? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did you donate to charity by using Gift Aid?")


      When("the user selects the Amount donated using Gift Aid field and enters a value of 50000")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated using Gift Aid", "50000")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks on the change amount of one-off donations to charity using Gift Aid link")
      whenTheUserClicksOnTheXLink("change amount of one-off donations to charity using Gift Aid")

      Then("the user should be redirected to the How much did you donate to charity as one-off payments? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did you donate to charity as one-off payments?")


      When("the user selects the Amount donated as one-off payments field and enters a value of 7200.39")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated as one-off payments", "7200.39")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks on the change amount donated to overseas charities by using Gift Aid link")
      whenTheUserClicksOnTheXLink("change amount donated to overseas charities by using Gift Aid")

      Then("the user should be redirected to the How much did you donate to overseas charities by using Gift Aid? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did you donate to overseas charities by using Gift Aid?")


      When("the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 130")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated to overseas charities using Gift Aid", "130")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks on the change overseas charities names link")
      whenTheUserClicksOnTheXLink("change overseas charities names")

      Then("the user should be redirected to the Overseas charity you used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity you used Gift Aid to donate to")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Name of overseas charity you used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity you used Gift Aid to donate to")


      When("the user selects the Name of overseas charity field and enters a value of Courage’s Shelter")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity", "Courage’s Shelter")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charities you used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charities you used Gift Aid to donate to")


      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks on the change amount of donation to add to last tax year link")
      whenTheUserClicksOnTheXLink("change amount of donation to add to last tax year")

      Then("the user is then redirected to the How much of your donation did you add to the TaxYearMinusTwo EOY tax year? page")
      thenTheUserIsThenRedirectedToTheXXXXPage("How much of your donation did you add to the", "TaxYearMinusTwo", "EOY", "tax year?")


      When("the user selects the Amount to add to last tax year field and enters a value of 809.9")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount to add to last tax year", "809.9")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks on the change amount of donation added to this tax year link")
      whenTheUserClicksOnTheXLink("change amount of donation added to this tax year")

      Then("the user is redirected to the How much of the donations you made after 5 April InYear do you want to add to this tax year? page")
      thenTheUserIsRedirectedToTheXXXPage("How much of the donations you made after 5 April", "InYear", "do you want to add to this tax year?")


      When("the user selects the Amount to add to this tax year field and enters a value of 13")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount to add to this tax year", "13")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks on the change value of shares or securities link")
      whenTheUserClicksOnTheXLink("change value of shares or securities")

      Then("the user should be redirected to the What is the total value of qualifying shares or securities donated to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the total value of qualifying shares or securities donated to charity?")


      When("the user selects the Total value of qualifying shares or securities field and enters a value of 6407.31")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Total value of qualifying shares or securities", "6407.31")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks on the change value of land or property link")
      whenTheUserClicksOnTheXLink("change value of land or property")

      Then("the user should be redirected to the What is the value of land or property donated to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the value of land or property donated to charity?")


      When("the user selects the Value of land or property field and enters a value of 520")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Value of land or property", "520")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks on the change value of shares, securities, land or property link")
      whenTheUserClicksOnTheXLink("change value of shares, securities, land or property")

      Then("the user should be redirected to the What is the value of qualifying shares, securities, land or property donated to overseas charities? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the value of qualifying shares, securities, land or property donated to overseas charities?")

      When("the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 4.99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Value of qualifying shares, securities, land or property donated to overseas charities", "4.99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks on the change overseas charities shares, securities, land or property were donated to link")
      whenTheUserClicksOnTheXLink("change overseas charities shares, securities, land or property were donated to")

      Then("the user should be redirected to the Overseas charity you donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity you donated shares, securities, land or property to")


      When("the user selects the yes radio button")
      whenTheUserSelectsTheXRadioButton("yes")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Name of overseas charity you donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity you donated shares, securities, land or property to")


      When("the user selects the Name of overseas charity you donated shares, securities, land or property to field and enters a value of Jimmy’s Cafe")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity you donated shares, securities, land or property to", "Jimmy’s Cafe")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")


    }

    Scenario("Returning flow - Agent User - Charities") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUserInYear(clientNino = "AA123459A"))

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


      When("the user clicks the addGiftAid tailoring option")
      whenTheUserClicksTheXTailoringOption("addGiftAid")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")


      When("the user clicks on the GiftAid link")
      whenTheUserClicksOnTheXLink("GiftAid")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")

      When("the user clicks on the change amount of one-off donations to charity using Gift Aid link")
      whenTheUserClicksOnTheXLink("change amount of one-off donations to charity using Gift Aid")

      Then("the user should be redirected to the How much did your client donate to charity as one-off payments? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client donate to charity as one-off payments?")


      When("the user selects the Amount donated as one-off payments field and enters a value of 7200.39")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated as one-off payments", "7200.39")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks on the change amount donated to overseas charities by using Gift Aid link")
      whenTheUserClicksOnTheXLink("change amount donated to overseas charities by using Gift Aid")

      Then("the user should be redirected to the How much did your client donate to overseas charities by using Gift Aid? page")
      thenTheUserShouldBeRedirectedToTheXPage("How much did your client donate to overseas charities by using Gift Aid?")


      When("the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 130")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount donated to overseas charities using Gift Aid", "130")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks on the change overseas charities names link")
      whenTheUserClicksOnTheXLink("change overseas charities names")

      Then("the user should be redirected to the Overseas charity your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity your client used Gift Aid to donate to")


      When("the user clicks on the change charity name link")
      whenTheUserClicksOnTheXLink("change charity name")

      Then("the user should be redirected to the Name of overseas charity your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity your client used Gift Aid to donate to")


      When("the user selects the Name of overseas charity field and enters a value of Courage’s Shelter")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity", "Courage’s Shelter")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charity your client used Gift Aid to donate to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity your client used Gift Aid to donate to")


      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks on the change amount of donation to add to last tax year link")
      whenTheUserClicksOnTheXLink("change amount of donation to add to last tax year")

      Then("the user is then redirected to the How much of your client’s donation did you add to the TaxYearMinusTwo EOY tax year? page")
      thenTheUserIsThenRedirectedToTheXXXXPage("How much of your client’s donation did you add to the", "TaxYearMinusTwo", "EOY", "tax year?")


      When("the user selects the Amount to add to last tax year field and enters a value of 809.9")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount to add to last tax year", "809.9")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks on the change amount of donation added to this tax year link")
      whenTheUserClicksOnTheXLink("change amount of donation added to this tax year")

      Then("the user is redirected to the How much of the donations your client made after 5 April InYear do you want to add to this tax year? page")
      thenTheUserIsRedirectedToTheXXXPage("How much of the donations your client made after 5 April", "InYear", "do you want to add to this tax year?")


      When("the user selects the Amount to add to this tax year field and enters a value of 13")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount to add to this tax year", "13")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks on the change value of shares or securities link")
      whenTheUserClicksOnTheXLink("change value of shares or securities")

      Then("the user should be redirected to the What is the total value of qualifying shares or securities donated to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the total value of qualifying shares or securities donated to charity?")


      When("the user selects the Total value of qualifying shares or securities field and enters a value of 6407.31")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Total value of qualifying shares or securities", "6407.31")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks on the change value of land or property link")
      whenTheUserClicksOnTheXLink("change value of land or property")

      Then("the user should be redirected to the What is the value of land or property donated to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the value of land or property donated to charity?")


      When("the user selects the Value of land or property field and enters a value of 520")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Value of land or property", "520")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks on the change value of shares, securities, land or property link")
      whenTheUserClicksOnTheXLink("change value of shares, securities, land or property")

      Then("the user should be redirected to the What is the value of qualifying shares, securities, land or property donated to overseas charities? page")
      thenTheUserShouldBeRedirectedToTheXPage("What is the value of qualifying shares, securities, land or property donated to overseas charities?")


      When("the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 4.99")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Value of qualifying shares, securities, land or property donated to overseas charities", "4.99")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks on the change overseas charities shares, securities, land or property were donated to link")
      whenTheUserClicksOnTheXLink("change overseas charities shares, securities, land or property were donated to")

      Then("the user should be redirected to the Overseas charity your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity your client donated shares, securities, land or property to")


      When("the user clicks on the change charity name link")
      whenTheUserClicksOnTheXLink("change charity name")

      Then("the user should be redirected to the Name of overseas charity your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Name of overseas charity your client donated shares, securities, land or property to")


      When("the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Jimmy’s Cafe")
      whenTheUserSelectsTheXFieldAndEntersAValueOfX("Name of overseas charity your client donated shares, securities, land or property to", "Jimmy’s Cafe")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Overseas charity your client donated shares, securities, land or property to page")
      thenTheUserShouldBeRedirectedToTheXPage("Overseas charity your client donated shares, securities, land or property to")


      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")


    }

    Scenario("Individual User with No Prior Gift Aid Data adds Gift Aid in tailoring but then states they did not receive Gift Aid income") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUserInYear(nino = "AA123456A", mtdItId = "1234567890"))

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


      When("the user clicks the addGiftAid tailoring option")
      whenTheUserClicksTheXTailoringOption("addGiftAid")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")


      When("the user clicks on the GiftAid link")
      whenTheUserClicksOnTheXLink("GiftAid")

      Then("the user should be redirected to the Did you make donations to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did you make donations to charity?")


      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your donations to charity")


      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")


    }

    Scenario("Agent User with Prior Gift Aid Data states their client did not receive gift aid income") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUserInYear(clientNino = "AA123459A", clientMtdItId = "1234567893"))

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


      When("the user clicks the addGiftAid tailoring option")
      whenTheUserClicksTheXTailoringOption("addGiftAid")

      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")


      When("the user clicks on the GiftAid link")
      whenTheUserClicksOnTheXLink("GiftAid")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks on the change donations to charity summary link")
      whenTheUserClicksOnTheXLink("change donations to charity summary")

      Then("the user should be redirected to the Did your client make donations to charity? page")
      thenTheUserShouldBeRedirectedToTheXPage("Did your client make donations to charity?")


      When("the user selects the no radio button")
      whenTheUserSelectsTheXRadioButton("no")


      And("the user clicks the continue button")
      whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the This will change information on your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("This will change information on your client’s Income Tax Return")


      When("the user clicks the confirm button")
      whenTheUserClicksTheXButton("confirm")

      Then("the user should be redirected to the Check your client’s donations to charity page")
      thenTheUserShouldBeRedirectedToTheXPage("Check your client’s donations to charity")


      When("the user clicks the save and continue button")
      whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
      thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")


    }
  }
}