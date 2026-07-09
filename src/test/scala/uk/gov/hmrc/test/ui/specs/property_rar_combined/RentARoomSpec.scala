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
import uk.gov.hmrc.test.ui.specs.tags.classTags.MVP
import uk.gov.hmrc.test.ui.steps.AuthStepDefSteps._
import uk.gov.hmrc.test.ui.steps.CommonStepDefSteps._
import uk.gov.hmrc.test.ui.util.UserLogin

@MVP
class RentARoomSpec extends BaseSpec {

  private val individualUser: UserLogin = UserLogin(
    redirectUrl = "/EOY/start",
    nino = "AC210000B",
    enrolmentKey1 = "HMRC-MTD-IT",
    identifierName1 = "MTDITID",
    identifierValue1 = "1234567890"
  )

  private val agentUser: UserLogin = UserLogin(
    redirectUrl = "/test-only/EOY/additional-parameters?ClientNino=AC210000B&ClientMTDID=1234567890",
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
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

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

      When("the user clicks the Rent-a-room checkbox")
        whenTheUserClicksTheXCheckbox("Rent-a-room")

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

      When("the user clicks on the Rentaroom About link")
        whenTheUserClicksOnTheXLink("Rentaroom About")

      Then("the user should be redirected to the Rent a room page")
        thenTheUserShouldBeRedirectedToTheXPage("Rent a room")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Jointly let rent a room page")
        thenTheUserShouldBeRedirectedToTheXPage("Jointly let rent a room")

      When("the user selects the Jointly let rent a room, Yes radio button")
        whenTheUserSelectsTheXRadioButton("Jointly let rent a room, Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total rent a room income did you receive? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total rent a room income did you receive?")

      And("the user selects the TotalRentaRoomAmt field and enters a value of 1750.00")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("TotalRentaRoomAmt", "1750.00")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Claim expenses or rent a room relief page")
        thenTheUserShouldBeRedirectedToTheXPage("Claim expenses or rent a room relief")

      When("the user selects the Expenses radio button")
        whenTheUserSelectsTheXRadioButton("Expenses")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the RaRAboutHYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("RaRAboutHYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the RaREpensesLink link")
        whenTheUserClicksOnTheXLink("RaREpensesLink")

      Then("the user should be redirected to the Rent a room expenses page")
        thenTheUserShouldBeRedirectedToTheXPage("Rent a room expenses")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Consolidated or individual expenses page")
        thenTheUserShouldBeRedirectedToTheXPage("Consolidated or individual expenses")

      When("the user selects the Claim consolidated expenses radio button")
        whenTheUserSelectsTheXRadioButton("Claim consolidated expenses")

      And("the user selects the Claim consolidated expensesAmt field and enters a value of 160.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Claim consolidated expensesAmt", "160.89")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the RaRExpensesHYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("RaRExpensesHYFTS,Yes")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }

    Scenario("Agent user adds UK Property details - Rent-a-room Expenses") {
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

      When("the user clicks the Rent-a-room checkbox")
        whenTheUserClicksTheXCheckbox("Rent-a-room")

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

      When("the user clicks on the Rentaroom About link")
        whenTheUserClicksOnTheXLink("Rentaroom About")

      Then("the user should be redirected to the Rent a room page")
        thenTheUserShouldBeRedirectedToTheXPage("Rent a room")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Jointly let rent a room page")
        thenTheUserShouldBeRedirectedToTheXPage("Jointly let rent a room")

      When("the user selects the Jointly let rent a room, Yes radio button")
        whenTheUserSelectsTheXRadioButton("Jointly let rent a room, Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much total rent a room income did your client receive? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much total rent a room income did your client receive?")

      And("the user selects the TotalRentaRoomAmt field and enters a value of 1750.00")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("TotalRentaRoomAmt", "1750.00")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Claim expenses or rent a room relief page")
        thenTheUserShouldBeRedirectedToTheXPage("Claim expenses or rent a room relief")

      When("the user selects the Expenses radio button")
        whenTheUserSelectsTheXRadioButton("Expenses")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the RaRAboutHYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("RaRAboutHYFTS,Yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

      And("the user clicks on the RaREpensesLink link")
        whenTheUserClicksOnTheXLink("RaREpensesLink")

      Then("the user should be redirected to the Rent a room expenses page")
        thenTheUserShouldBeRedirectedToTheXPage("Rent a room expenses")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Consolidated or individual expenses page")
        thenTheUserShouldBeRedirectedToTheXPage("Consolidated or individual expenses")

      When("the user selects the Claim consolidated expenses radio button")
        whenTheUserSelectsTheXRadioButton("Claim consolidated expenses")

      And("the user selects the Claim consolidated expensesAmt field and enters a value of 160.89")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Claim consolidated expensesAmt", "160.89")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your answers page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your answers")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Have you finished this section? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you finished this section?")

      When("the user selects the RaRExpensesHYFTS,Yes radio button")
        whenTheUserSelectsTheXRadioButton("RaRExpensesHYFTS,Yes")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the UK property page")
        thenTheUserShouldBeRedirectedToTheXPage("UK property")

    }
  }
}
