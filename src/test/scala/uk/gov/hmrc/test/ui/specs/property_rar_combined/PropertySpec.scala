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

package uk.gov.hmrc.test.ui.specs.property_rar_combined

import uk.gov.hmrc.test.ui.specs.BaseSpec
import uk.gov.hmrc.test.ui.specs.tags.{MVP, Wip}
import uk.gov.hmrc.test.ui.steps.AuthStepDefSteps._
import uk.gov.hmrc.test.ui.steps.CommonStepDefSteps._
import uk.gov.hmrc.test.ui.util.UserLogin

@MVP @Wip
class PropertySpec extends BaseSpec {

  private def individualUser(nino: String, mtdItId: String = "1234567890", inYear: Boolean): UserLogin = UserLogin(
    redirectUrl = if (inYear) "/InYear/start" else "/EOY/start",
    nino = nino,
    enrolmentKey1 = "HMRC-MTD-IT",
    identifierName1 = "MTDITID",
    identifierValue1 = mtdItId
  )

  private def agentUser(clientNino: String, inYear: Boolean): UserLogin = UserLogin(
    redirectUrl = s"/test-only/${if (inYear) "InYear" else "EOY"}/additional-parameters?ClientNino=$clientNino&ClientMTDID=1234567890",
    credentialStrength = "weak",
    affinityGroup = "Agent",
    enrolmentKey1 = "HMRC-MTD-IT",
    identifierName1 = "MTDITID",
    identifierValue1 = "1234567890",
    enrolmentKey2 = "HMRC-AS-AGENT",
    identifierName2 = "AgentReferenceNumber",
    identifierValue2 = "XARN1234567"
  )
  Feature("Property Journeys - Income Tax Submission") {

    Scenario("Individual user adds UK Property details") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000A", inYear = false))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      And("the user selects the Yes, claim property income allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim property income allowance")

      And("the user clicks the save and continue button")
        whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user selects the save and continue radio button")
        whenTheUserSelectsTheXRadioButton("save and continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS AboutPropertyYes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS AboutPropertyYes")

      And("the user clicks the save and continue button")
        whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Agent user adds UK Property details") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser(clientNino = "AC210000A", inYear = false))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did your client get from all of their properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did your client get from all of their properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property does your client have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property does your client have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Does your client want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Does your client want to claim property income allowance?")

      And("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the save and continue button")
        whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user selects the save and continue radio button")
        whenTheUserSelectsTheXRadioButton("save and continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS AboutPropertyYes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS AboutPropertyYes")

      And("the user clicks the save and continue button")
        whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Individual user adds UK Property - Property rentals and claims Property Income Allowance") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = false))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      When("the user selects the Yes, claim property income allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim property income allowance")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Individual user adds UK Property - Property rentals and claims Expenses") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = false))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      When("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Individual user change answers ON Property rentals CYA - claims Property Income Allowance") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = false))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      When("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks on the Change link")
        whenTheUserClicksOnTheXLink("Change")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      When("the user selects the Yes, claim property income allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim property income allowance")

      And("the user clicks the save and continue button")
        whenTheUserClicksTheXButton("save and continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

    }

    Scenario("Agent user adds UK Property details - In Year - change claim expenses") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser(clientNino = "AC210000B", inYear = true))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did your client get from all of their properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did your client get from all of their properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property does your client have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property does your client have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Does your client want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Does your client want to claim property income allowance?")

      When("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks on the Change link")
        whenTheUserClicksOnTheXLink("Change")

      Then("the user should be redirected to the Does your client want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Does your client want to claim property income allowance?")

      When("the user selects the Yes, claim property income allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim property income allowance")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

    }

    Scenario("Individual user adds UK Property Property rentals - Individual user - answers questions in the Income Journey") {
      When("the user logs into the service with the following details")
      givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = false))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      When("the user selects the Yes, claim property income allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim property income allowance")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Income link")
        whenTheUserClicksOnTheXLink("Rentals Income")

      Then("the user should be redirected to the Property income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property income")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Non-UK resident landlord page")
        thenTheUserShouldBeRedirectedToTheXPage("Non-UK resident landlord")

      When("the user selects the Yes radio button")
        whenTheUserSelectsTheXRadioButton("Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Deducting Tax from non-UK landlords page")
        thenTheUserShouldBeRedirectedToTheXPage("Deducting Tax from non-UK landlords")

      And("the user selects the Tax deducted Yes radio button")
        whenTheUserSelectsTheXRadioButton("Tax deducted Yes")

      And("the user selects the Tax Deducted Amount field and enters a value of 340.55")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Tax Deducted Amount", "340.55")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Property rental income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rental income")

      When("the user selects the Property rental amount field and enters a value of 340.55")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Property rental amount", "340.55")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Premiums for the grant of a lease page")
        thenTheUserShouldBeRedirectedToTheXPage("Premiums for the grant of a lease")

      When("the user selects the Yes, premiums for a grant of lease radio button")
        whenTheUserSelectsTheXRadioButton("Yes, premiums for a grant of lease")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you calculated the figure yourself? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you calculated the figure yourself?")

      When("the user selects the No,calculated radio button")
        whenTheUserSelectsTheXRadioButton("No,calculated")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you receive for the grant of a lease? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you receive for the grant of a lease?")

      And("the user selects the grant lease amount field and enters a value of 1000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("grant lease amount", "1000")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How many complete 12 month periods were in the term of the lease? page")
        thenTheUserShouldBeRedirectedToTheXPage("How many complete 12 month periods were in the term of the lease?")

      And("the user selects the month period field and enters a value of 2")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("month period", "2")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Premiums for a grant of a lease page")
        thenTheUserShouldBeRedirectedToTheXPage("Premiums for a grant of a lease")

      When("the user clicks the No, premiums for the grant of lease button")
        whenTheUserClicksTheXButton("No, premiums for the grant of lease")

      And("the user selects the Amount, premiums for a grant of lease field and enters a value of 9000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount, premiums for a grant of lease", "9000")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Reverse premiums received page")
        thenTheUserShouldBeRedirectedToTheXPage("Reverse premiums received")

      And("the user selects the Yes,premiums recieved radio button")
        whenTheUserSelectsTheXRadioButton("Yes,premiums recieved")

      Then("the user selects the premium recieved amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("premium recieved amount", "1200")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Other income from property page")
        thenTheUserShouldBeRedirectedToTheXPage("Other income from property")

      When("the user selects the Other income amount field and enters a value of 1350.78")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Other income amount", "1350.78")

      Then("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      And("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the IncomeYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("IncomeYes,HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Agent user adds UK Property Property rentals - Agent user - answers questions in the Income Journey") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser(clientNino = "AC210000B", inYear = true))

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did your client get from all of their properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did your client get from all of their properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property does your client have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property does your client have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Does your client want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Does your client want to claim property income allowance?")

      When("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Income link")
        whenTheUserClicksOnTheXLink("Rentals Income")

      Then("the user should be redirected to the Property income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property income")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Non-UK resident landlord page")
        thenTheUserShouldBeRedirectedToTheXPage("Non-UK resident landlord")

      When("the user selects the Yes radio button")
        whenTheUserSelectsTheXRadioButton("Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Deducting Tax from non-UK landlords page")
        thenTheUserShouldBeRedirectedToTheXPage("Deducting Tax from non-UK landlords")

      And("the user selects the Tax deducted Yes radio button")
        whenTheUserSelectsTheXRadioButton("Tax deducted Yes")

      And("the user selects the Tax Deducted Amount field and enters a value of 340.55")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Tax Deducted Amount", "340.55")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Property rental income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rental income")

      When("the user selects the Property rental amount field and enters a value of 340.55")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Property rental amount", "340.55")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Premiums for the grant of a lease page")
        thenTheUserShouldBeRedirectedToTheXPage("Premiums for the grant of a lease")

      When("the user selects the Yes, premiums for a grant of lease radio button")
        whenTheUserSelectsTheXRadioButton("Yes, premiums for a grant of lease")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Has your client calculated the premium for the grant of a lease taxable amount themselves? page")
        thenTheUserShouldBeRedirectedToTheXPage("Has your client calculated the premium for the grant of a lease taxable amount themselves?")

      When("the user selects the No,calculated radio button")
        whenTheUserSelectsTheXRadioButton("No,calculated")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client receive for the grant of a lease? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client receive for the grant of a lease?")

      And("the user selects the grant lease amount field and enters a value of 1000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("grant lease amount", "1000")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How many complete 12 month periods were in the term of the lease? page")
        thenTheUserShouldBeRedirectedToTheXPage("How many complete 12 month periods were in the term of the lease?")

      And("the user selects the month period field and enters a value of 21")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("month period", "21")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Premiums for a grant of a lease page")
        thenTheUserShouldBeRedirectedToTheXPage("Premiums for a grant of a lease")

      When("the user clicks the No, premiums for the grant of lease button")
        whenTheUserClicksTheXButton("No, premiums for the grant of lease")

      And("the user selects the Amount, premiums for a grant of lease field and enters a value of 12500")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount, premiums for a grant of lease", "12500")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Reverse premiums received page")
        thenTheUserShouldBeRedirectedToTheXPage("Reverse premiums received")

      And("the user selects the Yes,premiums recieved radio button")
        whenTheUserSelectsTheXRadioButton("Yes,premiums recieved")

      Then("the user selects the premium recieved amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("premium recieved amount", "1200")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Other income from property page")
        thenTheUserShouldBeRedirectedToTheXPage("Other income from property")

      When("the user selects the Other income amount field and enters a value of 1350.78")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Other income amount", "1350.78")

      Then("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      And("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the IncomeYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("IncomeYes,HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Individual user adds UK Property - Property rentals - Premiums received, Have you calculated the figure yourself? and Adjustments") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = false))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      When("the user selects the Yes, claim property income allowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim property income allowance")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Income link")
        whenTheUserClicksOnTheXLink("Rentals Income")

      Then("the user should be redirected to the Property income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property income")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Non-UK resident landlord page")
        thenTheUserShouldBeRedirectedToTheXPage("Non-UK resident landlord")

      When("the user selects the Yes radio button")
        whenTheUserSelectsTheXRadioButton("Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Deducting Tax from non-UK landlords page")
        thenTheUserShouldBeRedirectedToTheXPage("Deducting Tax from non-UK landlords")

      And("the user selects the Tax deducted Yes radio button")
        whenTheUserSelectsTheXRadioButton("Tax deducted Yes")

      And("the user selects the Tax Deducted Amount field and enters a value of 340.55")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Tax Deducted Amount", "340.55")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Property rental income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rental income")

      When("the user selects the Property rental amount field and enters a value of 340.55")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Property rental amount", "340.55")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Premiums for the grant of a lease page")
        thenTheUserShouldBeRedirectedToTheXPage("Premiums for the grant of a lease")

      When("the user selects the Yes, premiums for a grant of lease radio button")
        whenTheUserSelectsTheXRadioButton("Yes, premiums for a grant of lease")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you calculated the figure yourself? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you calculated the figure yourself?")

      When("the user selects the Yes,calculated radio button")
        whenTheUserSelectsTheXRadioButton("Yes,calculated")

      And("the user selects the Yes,calculated amount field and enters a value of 7000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Yes,calculated amount", "7000")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Reverse premiums received page")
        thenTheUserShouldBeRedirectedToTheXPage("Reverse premiums received")

      And("the user selects the Yes,premiums recieved radio button")
        whenTheUserSelectsTheXRadioButton("Yes,premiums recieved")

      Then("the user selects the premium recieved amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("premium recieved amount", "1200")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Other income from property page")
        thenTheUserShouldBeRedirectedToTheXPage("Other income from property")

      When("the user selects the Other income amount field and enters a value of 3590.78")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Other income amount", "3590.78")

      Then("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      And("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the IncomeYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("IncomeYes,HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Adjustments link")
        whenTheUserClicksOnTheXLink("Rentals Adjustments")

      Then("the user should be redirected to the Adjustments page")
        thenTheUserShouldBeRedirectedToTheXPage("Adjustments")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was your private use adjustment? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was your private use adjustment?")

      And("the user selects the Private use adjustment Amount field and enters a value of 698.56")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Private use adjustment Amount", "698.56")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Balancing charge page")
        thenTheUserShouldBeRedirectedToTheXPage("Balancing charge")

      And("the user selects the BalancingChargeYes radio button")
        whenTheUserSelectsTheXRadioButton("BalancingChargeYes")

      Then("the user selects the How much is the balancing charge? Amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("How much is the balancing charge? Amount", "1200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Property Income Allowance claim page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Property Income Allowance claim")

      And("the user selects the Enter your share of PIA for this property Amount field and enters a value of 1000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Enter your share of PIA for this property Amount", "1000")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Business premises renovation allowance balancing charge page")
        thenTheUserShouldBeRedirectedToTheXPage("Business premises renovation allowance balancing charge")

      When("the user clicks the Yes,How much is the renovation allowance balancing charge? button")
        whenTheUserClicksTheXButton("Yes,How much is the renovation allowance balancing charge?")

      And("the user selects the How much is the renovation allowance balancing charge? amount field and enters a value of 254.90")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("How much is the renovation allowance balancing charge? amount", "254.90")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Residential finance costs page")
        thenTheUserShouldBeRedirectedToTheXPage("Residential finance costs")

      When("the user selects the How much were your residential finance costs? Amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("How much were your residential finance costs? Amount", "1200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Unused residential costs brought forward page")
        thenTheUserShouldBeRedirectedToTheXPage("Unused residential costs brought forward")

      And("the user selects the How much unused residential costs do you want to bring forward? Amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("How much unused residential costs do you want to bring forward? Amount", "1200")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you have any unused losses for your property rental in previous years? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you have any unused losses for your property rental in previous years?")

      When("the user clicks the Yes, did you have any unused losses for your property rental in previous years? button")
        whenTheUserClicksTheXButton("Yes, did you have any unused losses for your property rental in previous years?")

      And("the user selects the Yes, how much unused residential costs do you want to bring forward? Amount field and enters a value of 300")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Yes, how much unused residential costs do you want to bring forward? Amount", "300")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      And("the user selects the 2020 to 2021 radio button")
        whenTheUserSelectsTheXRadioButton("2020 to 2021")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the AdjustmentsYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("AdjustmentsYes,HYFTS")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Individual user adds UK Property - Property rentals - Claim Expenses - Claim Consolidated Expenses") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = false))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      Then("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Income link")
        whenTheUserClicksOnTheXLink("Rentals Income")

      Then("the user should be redirected to the Property income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property income")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Non-UK resident landlord page")
        thenTheUserShouldBeRedirectedToTheXPage("Non-UK resident landlord")

      When("the user selects the Yes radio button")
        whenTheUserSelectsTheXRadioButton("Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Deducting Tax from non-UK landlords page")
        thenTheUserShouldBeRedirectedToTheXPage("Deducting Tax from non-UK landlords")

      And("the user selects the Tax deducted Yes radio button")
        whenTheUserSelectsTheXRadioButton("Tax deducted Yes")

      And("the user selects the Tax Deducted Amount field and enters a value of 13400.50")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Tax Deducted Amount", "13400.50")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Property rental income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rental income")

      When("the user selects the Property rental amount field and enters a value of 24000.00")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Property rental amount", "24000.00")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Premiums for the grant of a lease page")
        thenTheUserShouldBeRedirectedToTheXPage("Premiums for the grant of a lease")

      When("the user selects the Yes, premiums for a grant of lease radio button")
        whenTheUserSelectsTheXRadioButton("Yes, premiums for a grant of lease")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you calculated the figure yourself? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you calculated the figure yourself?")

      When("the user selects the Yes,calculated radio button")
        whenTheUserSelectsTheXRadioButton("Yes,calculated")

      And("the user selects the Yes,calculated amount field and enters a value of 7000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Yes,calculated amount", "7000")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Reverse premiums received page")
        thenTheUserShouldBeRedirectedToTheXPage("Reverse premiums received")

      And("the user selects the Yes,premiums recieved radio button")
        whenTheUserSelectsTheXRadioButton("Yes,premiums recieved")

      Then("the user selects the premium recieved amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("premium recieved amount", "1200")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Other income from property page")
        thenTheUserShouldBeRedirectedToTheXPage("Other income from property")

      When("the user selects the Other income amount field and enters a value of 3590.78")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Other income amount", "3590.78")

      Then("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      And("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the IncomeYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("IncomeYes,HYFTS")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the Rentals Expenses link")
        whenTheUserClicksOnTheXLink("Rentals Expenses")

      Then("the user should be redirected to the Expenses page")
        thenTheUserShouldBeRedirectedToTheXPage("Expenses")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Consolidated or individual expenses page")
        thenTheUserShouldBeRedirectedToTheXPage("Consolidated or individual expenses")

      When("the user selects the Yes,consolidated expenses radio button")
        whenTheUserSelectsTheXRadioButton("Yes,consolidated expenses")

      And("the user selects the consolidated expenses amount field and enters a value of 1250.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("consolidated expenses amount", "1250.89")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the ExpensesYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("ExpensesYes,HYFTS")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Individual user adds UK Property - Property rentals - Claim Expenses - Claim Individual Expenses") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = false))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      Then("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Income link")
        whenTheUserClicksOnTheXLink("Rentals Income")

      Then("the user should be redirected to the Property income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property income")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Non-UK resident landlord page")
        thenTheUserShouldBeRedirectedToTheXPage("Non-UK resident landlord")

      When("the user selects the Yes radio button")
        whenTheUserSelectsTheXRadioButton("Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Deducting Tax from non-UK landlords page")
        thenTheUserShouldBeRedirectedToTheXPage("Deducting Tax from non-UK landlords")

      And("the user selects the Tax deducted Yes radio button")
        whenTheUserSelectsTheXRadioButton("Tax deducted Yes")

      And("the user selects the Tax Deducted Amount field and enters a value of 13400.50")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Tax Deducted Amount", "13400.50")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Property rental income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rental income")

      When("the user selects the Property rental amount field and enters a value of 24000.00")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Property rental amount", "24000.00")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Premiums for the grant of a lease page")
        thenTheUserShouldBeRedirectedToTheXPage("Premiums for the grant of a lease")

      When("the user selects the Yes, premiums for a grant of lease radio button")
        whenTheUserSelectsTheXRadioButton("Yes, premiums for a grant of lease")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you calculated the figure yourself? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you calculated the figure yourself?")

      When("the user selects the Yes,calculated radio button")
        whenTheUserSelectsTheXRadioButton("Yes,calculated")

      And("the user selects the Yes,calculated amount field and enters a value of 7000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Yes,calculated amount", "7000")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Reverse premiums received page")
        thenTheUserShouldBeRedirectedToTheXPage("Reverse premiums received")

      And("the user selects the Yes,premiums recieved radio button")
        whenTheUserSelectsTheXRadioButton("Yes,premiums recieved")

      Then("the user selects the premium recieved amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("premium recieved amount", "1200")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Other income from property page")
        thenTheUserShouldBeRedirectedToTheXPage("Other income from property")

      When("the user selects the Other income amount field and enters a value of 3590.78")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Other income amount", "3590.78")

      Then("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      And("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the IncomeYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("IncomeYes,HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the Rentals Expenses link")
        whenTheUserClicksOnTheXLink("Rentals Expenses")

      Then("the user should be redirected to the Expenses page")
        thenTheUserShouldBeRedirectedToTheXPage("Expenses")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Consolidated or individual expenses page")
        thenTheUserShouldBeRedirectedToTheXPage("Consolidated or individual expenses")

      When("the user selects the No,consolidated expenses radio button")
        whenTheUserSelectsTheXRadioButton("No,consolidated expenses")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Rents, rates and insurance costs for your property page")
        thenTheUserShouldBeRedirectedToTheXPage("Rents, rates and insurance costs for your property")

      And("the user selects the Rents, rates and insurance amount field and enters a value of 300")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Rents, rates and insurance amount", "300")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Property repairs and maintenance page")
        thenTheUserShouldBeRedirectedToTheXPage("Property repairs and maintenance")

      And("the user selects the Property repairs and maintenance amount field and enters a value of 589.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Property repairs and maintenance amount", "589.45")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Loan interest or other financial costs page")
        thenTheUserShouldBeRedirectedToTheXPage("Loan interest or other financial costs")

      And("the user selects the Loan interest or other financial costs amount field and enters a value of 1189.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Loan interest or other financial costs amount", "1189.45")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Legal, management or other professional fees page")
        thenTheUserShouldBeRedirectedToTheXPage("Legal, management or other professional fees")

      And("the user selects the Legal, management or other professional fees amount field and enters a value of 1000.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Legal, management or other professional fees amount", "1000.89")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Costs of services provided, including wages page")
        thenTheUserShouldBeRedirectedToTheXPage("Costs of services provided, including wages")

      And("the user selects the Costs of services provided, including wages amount field and enters a value of 349")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Costs of services provided, including wages amount", "349")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Property business travel costs page")
        thenTheUserShouldBeRedirectedToTheXPage("Property business travel costs")

      And("the user selects the Property business travel costs amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Property business travel costs amount", "200")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Other allowable property expenses page")
        thenTheUserShouldBeRedirectedToTheXPage("Other allowable property expenses")

      And("the user selects the Other allowable property expenses amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Other allowable property expenses amount", "200")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the ExpensesYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("ExpensesYes,HYFTS")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Individual user adds UK Property - Property rentals - Claim Allowances - Cash basis accounting method and claim capital allowances for a car") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000A", inYear = true))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      Then("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Income link")
        whenTheUserClicksOnTheXLink("Rentals Income")

      Then("the user should be redirected to the Property income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property income")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Non-UK resident landlord page")
        thenTheUserShouldBeRedirectedToTheXPage("Non-UK resident landlord")

      When("the user selects the Yes radio button")
        whenTheUserSelectsTheXRadioButton("Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Deducting Tax from non-UK landlords page")
        thenTheUserShouldBeRedirectedToTheXPage("Deducting Tax from non-UK landlords")

      And("the user selects the Tax deducted Yes radio button")
        whenTheUserSelectsTheXRadioButton("Tax deducted Yes")

      And("the user selects the Tax Deducted Amount field and enters a value of 13400.50")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Tax Deducted Amount", "13400.50")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Property rental income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rental income")

      When("the user selects the Property rental amount field and enters a value of 24000.00")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Property rental amount", "24000.00")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Premiums for the grant of a lease page")
        thenTheUserShouldBeRedirectedToTheXPage("Premiums for the grant of a lease")

      When("the user selects the Yes, premiums for a grant of lease radio button")
        whenTheUserSelectsTheXRadioButton("Yes, premiums for a grant of lease")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you calculated the figure yourself? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you calculated the figure yourself?")

      When("the user selects the Yes,calculated radio button")
        whenTheUserSelectsTheXRadioButton("Yes,calculated")

      And("the user selects the Yes,calculated amount field and enters a value of 7000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Yes,calculated amount", "7000")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Reverse premiums received page")
        thenTheUserShouldBeRedirectedToTheXPage("Reverse premiums received")

      And("the user selects the Yes,premiums recieved radio button")
        whenTheUserSelectsTheXRadioButton("Yes,premiums recieved")

      Then("the user selects the premium recieved amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("premium recieved amount", "1200")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Other income from property page")
        thenTheUserShouldBeRedirectedToTheXPage("Other income from property")

      When("the user selects the Other income amount field and enters a value of 3590.78")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Other income amount", "3590.78")

      Then("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      And("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the IncomeYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("IncomeYes,HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Allowances link")
        whenTheUserClicksOnTheXLink("Rentals Allowances")

      Then("the user should be redirected to the Allowances page")
        thenTheUserShouldBeRedirectedToTheXPage("Allowances")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Capital allowances for a car page")
        thenTheUserShouldBeRedirectedToTheXPage("Capital allowances for a car")

      And("the user selects the Yes,capital allowances for a car radio button")
        whenTheUserSelectsTheXRadioButton("Yes,capital allowances for a car")

      Then("the user selects the Capital allowances for a car amount field and enters a value of 1290")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Capital allowances for a car amount", "1290")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the AllowancesYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("AllowancesYes,HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

    }

    Scenario("Individual user adds UK Property - Property rentals - Claim Allowances - Traditional accounting method and claim allowances") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = true))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      Then("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Income link")
        whenTheUserClicksOnTheXLink("Rentals Income")

      Then("the user should be redirected to the Property income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property income")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Non-UK resident landlord page")
        thenTheUserShouldBeRedirectedToTheXPage("Non-UK resident landlord")

      When("the user selects the Yes radio button")
        whenTheUserSelectsTheXRadioButton("Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Deducting Tax from non-UK landlords page")
        thenTheUserShouldBeRedirectedToTheXPage("Deducting Tax from non-UK landlords")

      And("the user selects the Tax deducted Yes radio button")
        whenTheUserSelectsTheXRadioButton("Tax deducted Yes")

      And("the user selects the Tax Deducted Amount field and enters a value of 13400.50")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Tax Deducted Amount", "13400.50")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Property rental income page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rental income")

      When("the user selects the Property rental amount field and enters a value of 24000.00")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Property rental amount", "24000.00")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Premiums for the grant of a lease page")
        thenTheUserShouldBeRedirectedToTheXPage("Premiums for the grant of a lease")

      When("the user selects the Yes, premiums for a grant of lease radio button")
        whenTheUserSelectsTheXRadioButton("Yes, premiums for a grant of lease")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you calculated the figure yourself? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you calculated the figure yourself?")

      When("the user selects the Yes,calculated radio button")
        whenTheUserSelectsTheXRadioButton("Yes,calculated")

      And("the user selects the Yes,calculated amount field and enters a value of 7000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Yes,calculated amount", "7000")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Reverse premiums received page")
        thenTheUserShouldBeRedirectedToTheXPage("Reverse premiums received")

      And("the user selects the Yes,premiums recieved radio button")
        whenTheUserSelectsTheXRadioButton("Yes,premiums recieved")

      Then("the user selects the premium recieved amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("premium recieved amount", "1200")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Other income from property page")
        thenTheUserShouldBeRedirectedToTheXPage("Other income from property")

      When("the user selects the Other income amount field and enters a value of 3590.78")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Other income amount", "3590.78")

      Then("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      And("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the IncomeYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("IncomeYes,HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Allowances link")
        whenTheUserClicksOnTheXLink("Rentals Allowances")

      Then("the user should be redirected to the Allowances page")
        thenTheUserShouldBeRedirectedToTheXPage("Allowances")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Annual investment allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Annual investment allowance")

      When("the user selects the Annual investment allowance amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Annual investment allowance amount", "1200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Zero-emission car allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Zero-emission car allowance")

      When("the user selects the Zero-emission car allowance amount field and enters a value of 1200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Zero-emission car allowance amount", "1200")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Zero-emission goods vehicle allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Zero-emission goods vehicle allowance")

      When("the user selects the Zero-emission goods vehicle allowance amount field and enters a value of 12.90")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Zero-emission goods vehicle allowance amount", "12.90")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Business premises renovation allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Business premises renovation allowance")

      When("the user selects the Business premises renovation allowance amount field and enters a value of 12.90")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Business premises renovation allowance amount", "12.90")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Replacement of domestic goods page")
        thenTheUserShouldBeRedirectedToTheXPage("Replacement of domestic goods")

      When("the user selects the Replacement of domestic goods amount field and enters a value of 1011.90")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Replacement of domestic goods amount", "1011.90")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Other capital allowances page")
        thenTheUserShouldBeRedirectedToTheXPage("Other capital allowances")

      When("the user selects the Other capital allowances amount field and enters a value of 1011.90")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Other capital allowances amount", "1011.90")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the AllowancesYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("AllowancesYes,HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

    }

    Scenario("Individual user adds UK Property - Property rentals - Claim Expenses - Structures and Buildings Allowance") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = false))


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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      Then("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Structures and Buildings Allowance link")
        whenTheUserClicksOnTheXLink("Rentals Structures and Buildings Allowance")

      Then("the user should be redirected to the Do you want to claim structures and buildings allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim structures and buildings allowance?")

      Then("the user selects the Yes, claimStructureBuildingAllowance radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claimStructureBuildingAllowance")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Structures Buildings Allowance page")
        thenTheUserShouldBeRedirectedToTheXPage("Structures Buildings Allowance")

      And("the user clicks the Add Claim button")
        whenTheUserClicksTheXButton("Add Claim")

      Then("the user should be redirected to the Qualifying date page")
        thenTheUserShouldBeRedirectedToTheXPage("Qualifying date")

      And("the user selects the sba Day field and enters a value of 21")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("sba Day", "21")

      And("the user selects the sba Month field and enters a value of 09")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("sba Month", "09")

      And("the user selects the sba Year field and enters a value of 2021")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("sba Year", "2021")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Structures and buildings allowance qualifying amount page")
        thenTheUserShouldBeRedirectedToTheXPage("Structures and buildings allowance qualifying amount")

      When("the user selects the Qualifying Amount field and enters a value of 1000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Qualifying Amount", "1000")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much is your structures and buildings allowance claim? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much is your structures and buildings allowance claim?")

      And("the user selects the How much is your structures and buildings allowance claim? amount field and enters a value of 1,659.00")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("How much is your structures and buildings allowance claim? amount", "1,659.00")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Structures and buildings allowance address page")
        thenTheUserShouldBeRedirectedToTheXPage("Structures and buildings allowance address")

      And("the user selects the Building name field and enters a value of Crest House, London")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building name", "Crest House, London")

      And("the user selects the Building number field and enters a value of 123B")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building number", "123B")

      And("the user selects the Postcode field and enters a value of SW1A 1AA")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Postcode", "SW1A 1AA")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your structures and buildings allowance claims page")
        thenTheUserShouldBeRedirectedToTheXPage("Your structures and buildings allowance claims")

      And("the user selects the Yes,anotherClaim radio button")
        whenTheUserSelectsTheXRadioButton("Yes,anotherClaim")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      And("the user clicks the Add Claim button")
        whenTheUserClicksTheXButton("Add Claim")

      Then("the user should be redirected to the Qualifying date page")
        thenTheUserShouldBeRedirectedToTheXPage("Qualifying date")

      And("the user selects the sba Day field and enters a value of 22")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("sba Day", "22")

      And("the user selects the sba Month field and enters a value of 10")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("sba Month", "10")

      And("the user selects the sba Year field and enters a value of 2019")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("sba Year", "2019")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Structures and buildings allowance qualifying amount page")
        thenTheUserShouldBeRedirectedToTheXPage("Structures and buildings allowance qualifying amount")

      When("the user selects the Qualifying Amount field and enters a value of 3000.90")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Qualifying Amount", "3000.90")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much is your structures and buildings allowance claim? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much is your structures and buildings allowance claim?")

      And("the user selects the How much is your structures and buildings allowance claim? amount field and enters a value of 1659.45")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("How much is your structures and buildings allowance claim? amount", "1659.45")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Structures and buildings allowance address page")
        thenTheUserShouldBeRedirectedToTheXPage("Structures and buildings allowance address")

      And("the user selects the Building name field and enters a value of Crest Palace Limited")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building name", "Crest Palace Limited")

      And("the user selects the Building number field and enters a value of 123A")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building number", "123A")

      And("the user selects the Postcode field and enters a value of SW1A 1AA")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Postcode", "SW1A 1AA")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your structures and buildings allowance claims page")
        thenTheUserShouldBeRedirectedToTheXPage("Your structures and buildings allowance claims")

      When("the user clicks on the RemoveClaim link")
        whenTheUserClicksOnTheXLink("RemoveClaim")

      Then("the user should be redirected to the Do you want to remove this structures and buildings allowance £1,659 claim? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to remove this structures and buildings allowance £1,659 claim?")

      And("the user selects the RemoveYes radio button")
        whenTheUserSelectsTheXRadioButton("RemoveYes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your structures and buildings allowance claims page")
        thenTheUserShouldBeRedirectedToTheXPage("Your structures and buildings allowance claims")

      And("the user selects the No,anotherClaim radio button")
        whenTheUserSelectsTheXRadioButton("No,anotherClaim")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the sbaYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("sbaYes,HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Individual user adds UK Property - Property rentals - Claim Expenses - Enhanced Structures and Buildings Allowance") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = false))

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

      When("the user clicks the addProperty tailoring option")
        whenTheUserClicksTheXTailoringOption("addProperty")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Property link")
        whenTheUserClicksOnTheXLink("Property")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the UK property About link")
        whenTheUserClicksOnTheXLink("UK property About")

      Then("the user should be redirected to the UK Property details page")
        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")

      When("the user selects the second property radio button: Between 1000 and 85000")
        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the Which rental property do you have in the UK? page")
        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")

      When("the user clicks the Property Rentals checkbox")
        whenTheUserClicksTheXCheckbox("Property Rentals")

      And("the user clicks the UK Property continue button")
        whenTheUserClicksTheXButton("UK Property continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the Check your answers continue button")
        whenTheUserClicksTheXButton("Check your answers continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the HYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Property rentals about link")
        whenTheUserClicksOnTheXLink("Property rentals about")

      Then("the user should be redirected to the Property rentals page")
        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Do you want to claim property income allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")

      Then("the user selects the No, claim expenses radio button")
        whenTheUserSelectsTheXRadioButton("No, claim expenses")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the Yes HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("Yes HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      When("the user clicks on the Rentals Enhanced Structures and Buildings Allowance link")
        whenTheUserClicksOnTheXLink("Rentals Enhanced Structures and Buildings Allowance")

      Then("the user should be redirected to the Do you want to claim enhanced structures and buildings allowance? page")
        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim enhanced structures and buildings allowance?")

      Then("the user selects the Yes, claim radio button")
        whenTheUserSelectsTheXRadioButton("Yes, claim")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Enhanced structures and buildings allowance claims page")
        thenTheUserShouldBeRedirectedToTheXPage("Enhanced structures and buildings allowance claims")

      And("the user clicks the Add Claim button")
        whenTheUserClicksTheXButton("Add Claim")

      Then("the user should be redirected to the Qualifying date page")
        thenTheUserShouldBeRedirectedToTheXPage("Qualifying date")

      And("the user selects the esba Day field and enters a value of 11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("esba Day", "11")

      And("the user selects the esba Month field and enters a value of 12")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("esba Month", "12")

      And("the user selects the esba Year field and enters a value of 2019")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("esba Year", "2019")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Qualifying amount page")
        thenTheUserShouldBeRedirectedToTheXPage("Qualifying amount")

      When("the user selects the Qualifying amt field and enters a value of 12350.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Qualifying amt", "12350.89")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much is your enhanced structures and buildings allowance claim? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much is your enhanced structures and buildings allowance claim?")

      And("the user selects the How much is your enhanced structures and buildings allowance claim? amount field and enters a value of 1650")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("How much is your enhanced structures and buildings allowance claim? amount", "1650")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Enhanced structures and buildings allowance address page")
        thenTheUserShouldBeRedirectedToTheXPage("Enhanced structures and buildings allowance address")

      And("the user selects the Building name field and enters a value of MBNX Fan Mall")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building name", "MBNX Fan Mall")

      And("the user selects the Building number field and enters a value of 11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building number", "11")

      And("the user selects the Postcode field and enters a value of SA1 1AA")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Postcode", "SA1 1AA")

      When("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your enhanced structures and buildings allowance claims page")
        thenTheUserShouldBeRedirectedToTheXPage("Your enhanced structures and buildings allowance claims")

      And("the user selects the No,anotherClaim radio button")
        whenTheUserSelectsTheXRadioButton("No,anotherClaim")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the esbaYes,HYFTS radio button")
        whenTheUserSelectsTheXRadioButton("esbaYes,HYFTS")

      And("the user clicks the property continue button")
        whenTheUserClicksTheXButton("property continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

//    Scenario("Individual user adds UK Property - Property rentals - Claim Expenses - Enhanced Structures and Buildings Allowance") {
//      When("the user logs into the service with the following details")
//        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser(nino = "AC210000B", inYear = false))
//
//      Then("the user should be redirected to Update and submit an Income Tax Return page")
//        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")
//
//      When("the user clicks the continue button")
//        whenTheUserClicksTheXButton("continue")
//
//      Then("the user should be redirected to the Your Income Tax Return page")
//        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")
//
//      When("the user clicks on the addSections link")
//        whenTheUserClicksOnTheXLink("addSections")
//
//      Then("the user should be redirected to the Add sections to your Income Tax Return page")
//        thenTheUserShouldBeRedirectedToTheXPage("Add sections to your Income Tax Return")
//
//      When("the user clicks the addProperty tailoring option")
//        whenTheUserClicksTheXTailoringOption("addProperty")
//
//      And("the user clicks the continue button")
//        whenTheUserClicksTheXButton("continue")
//
//      Then("the user should be redirected to the Your Income Tax Return page")
//        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")
//
//      When("the user clicks on the Property link")
//        whenTheUserClicksOnTheXLink("Property")
//
//      Then("the user should be redirected to the UK property page")
//        thenTheUserShouldBeRedirectedToTheXPage("UK property")
//
//      And("the user clicks on the UK property About link")
//        whenTheUserClicksOnTheXLink("UK property About")
//
//      Then("the user should be redirected to the UK Property details page")
//        thenTheUserShouldBeRedirectedToTheXPage("UK Property details")
//
//      When("the user clicks the continue button")
//        whenTheUserClicksTheXButton("continue")
//
//      Then("the user should be redirected to the How much total income did you get from your UK properties? page")
//        thenTheUserShouldBeRedirectedToTheXPage("How much total income did you get from your UK properties?")
//
//      When("the user selects the second property radio button: Between 1000 and 85000")
//        whenTheUserSelectsTheXRadioButtonX("second property", "Between 1000 and 85000")
//
//      And("the user clicks the property continue button")
//        whenTheUserClicksTheXButton("property continue")
//
//      Then("the user should be redirected to the Which rental property do you have in the UK? page")
//        thenTheUserShouldBeRedirectedToTheXPage("Which rental property do you have in the UK?")
//
//      When("the user clicks the Property rentals checkbox")
//        whenTheUserClicksTheXCheckbox("Property rentals")
//
//      And("the user clicks the Property rentals continue button")
//        whenTheUserClicksTheXButton("Property rentals continue")
//
//      Then("the user should be redirected to the Check your answers page")
//        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")
//
//      When("the user clicks the Check your answers continue button")
//        whenTheUserClicksTheXButton("Check your answers continue")
//
//      Then("the user should be redirected to the Have you finished this section? page")
//        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")
//
//      When("the user selects the HYFTS,Yes radio button")
//        whenTheUserSelectsTheXRadioButton("HYFTS,Yes")
//
//      And("the user clicks the continue button")
//        whenTheUserClicksTheXButton("continue")
//
//      Then("the user should be redirected to the UK property page")
//        thenTheUserShouldBeRedirectedToTheXPage("UK property")
//
//      When("the user clicks on the Property rentals about link")
//        whenTheUserClicksOnTheXLink("Property rentals about")
//
//      Then("the user should be redirected to the Property rentals page")
//        thenTheUserShouldBeRedirectedToTheXPage("Property rentals")
//
//      And("the user clicks the continue button")
//        whenTheUserClicksTheXButton("continue")
//
//      Then("the user should be redirected to the Do you want to claim property income allowance? page")
//        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim property income allowance?")
//
//      Then("the user selects the No, claim expenses radio button")
//        whenTheUserSelectsTheXRadioButton("No, claim expenses")
//
//      And("the user clicks the Continue button")
//        whenTheUserClicksTheXButton("Continue")
//
//      Then("the user should be redirected to the Check your answers page")
//        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")
//
//      When("the user clicks the continue button")
//        whenTheUserClicksTheXButton("continue")
//
//      Then("the user should be redirected to the Have you finished this section? page")
//        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")
//
//      When("the user selects the Yes HYFTS radio button")
//        whenTheUserSelectsTheXRadioButton("Yes HYFTS")
//
//      And("the user clicks the property continue button")
//        whenTheUserClicksTheXButton("property continue")
//
//      Then("the user should be redirected to the UK property page")
//        thenTheUserShouldBeRedirectedToTheXPage("UK property")
//
//      When("the user clicks on the Rentals Enhanced Structures and Buildings Allowance link")
//        whenTheUserClicksOnTheXLink("Rentals Enhanced Structures and Buildings Allowance")
//
//      Then("the user should be redirected to the Do you want to claim enhanced structures and buildings allowance? page")
//        thenTheUserShouldBeRedirectedToTheXPage("Do you want to claim enhanced structures and buildings allowance?")
//
//      Then("the user selects the Yes, claim radio button")
//        whenTheUserSelectsTheXRadioButton("Yes, claim")
//
//      And("the user clicks the Continue button")
//        whenTheUserClicksTheXButton("Continue")
//
//      Then("the user should be redirected to the Enhanced structures and buildings allowance claims page")
//        thenTheUserShouldBeRedirectedToTheXPage("Enhanced structures and buildings allowance claims")
//
//      And("the user clicks the Add Claim button")
//        whenTheUserClicksTheXButton("Add Claim")
//
//      Then("the user should be redirected to the Qualifying date page")
//        thenTheUserShouldBeRedirectedToTheXPage("Qualifying date")
//
//      And("the user selects the esba Day field and enters a value of 11")
//        whenTheUserSelectsTheXFieldAndEntersAValueOfX("esba Day", "11")
//
//      And("the user selects the esba Month field and enters a value of 12")
//        whenTheUserSelectsTheXFieldAndEntersAValueOfX("esba Month", "12")
//
//      And("the user selects the esba Year field and enters a value of 2019")
//        whenTheUserSelectsTheXFieldAndEntersAValueOfX("esba Year", "2019")
//
//      When("the user clicks the Continue button")
//        whenTheUserClicksTheXButton("Continue")
//
//      Then("the user should be redirected to the Qualifying amount page")
//        thenTheUserShouldBeRedirectedToTheXPage("Qualifying amount")
//
//      When("the user selects the Qualifying amt field and enters a value of 12350.89")
//        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Qualifying amt", "12350.89")
//
//      And("the user clicks the Continue button")
//        whenTheUserClicksTheXButton("Continue")
//
//      Then("the user should be redirected to the How much is your enhanced structures and buildings allowance claim? page")
//        thenTheUserShouldBeRedirectedToTheXPage("How much is your enhanced structures and buildings allowance claim?")
//
//      And("the user selects the How much is your enhanced structures and buildings allowance claim? amount field and enters a value of 1650")
//        whenTheUserSelectsTheXFieldAndEntersAValueOfX("How much is your enhanced structures and buildings allowance claim? amount", "1650")
//
//      When("the user clicks the Continue button")
//        whenTheUserClicksTheXButton("Continue")
//
//      Then("the user should be redirected to the Enhanced structures and buildings allowance address page")
//        thenTheUserShouldBeRedirectedToTheXPage("Enhanced structures and buildings allowance address")
//
//      And("the user selects the Building name field and enters a value of MBNX Fan Mall")
//        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building name", "MBNX Fan Mall")
//
//      And("the user selects the Building number field and enters a value of 11")
//        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Building number", "11")
//
//      And("the user selects the Postcode field and enters a value of SA1 1AA")
//        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Postcode", "SA1 1AA")
//
//      When("the user clicks the Continue button")
//        whenTheUserClicksTheXButton("Continue")
//
//      Then("the user should be redirected to the Check your answers page")
//        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")
//
//      And("the user clicks the continue button")
//        whenTheUserClicksTheXButton("continue")
//
//      Then("the user should be redirected to the Your enhanced structures and buildings allowance claims page")
//        thenTheUserShouldBeRedirectedToTheXPage("Your enhanced structures and buildings allowance claims")
//
//      And("the user selects the No,anotherClaim radio button")
//        whenTheUserSelectsTheXRadioButton("No,anotherClaim")
//
//      And("the user clicks the continue button")
//        whenTheUserClicksTheXButton("continue")
//
//      Then("the user should be redirected to the Have you finished this section? page")
//        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")
//
//      When("the user selects the esbaYes,HYFTS radio button")
//        whenTheUserSelectsTheXRadioButton("esbaYes,HYFTS")
//
//      And("the user clicks the property continue button")
//        whenTheUserClicksTheXButton("property continue")
//
//      Then("the user should be redirected to the UK property page")
//        thenTheUserShouldBeRedirectedToTheXPage("UK property")
//
//    }
  }
}
