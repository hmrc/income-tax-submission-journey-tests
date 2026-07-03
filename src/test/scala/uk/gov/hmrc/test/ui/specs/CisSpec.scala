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

import uk.gov.hmrc.test.ui.specs.tags.{MVP, Wip}
import uk.gov.hmrc.test.ui.steps.AuthStepDefSteps._
import uk.gov.hmrc.test.ui.steps.CommonStepDefSteps._
import uk.gov.hmrc.test.ui.steps.CYAStepDefSteps._


@MVP
class CisSpec extends BaseSpec {

  val individualUserInYearNoPriorData: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/InYear/start"),
    Map("Credential Strength" -> "strong"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Individual"),
    Map("Nino" -> "AC152222B"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567890")
  )
  val individualUserNoCisData: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/EOY/start"),
    Map("Credential Strength" -> "strong"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Individual"),
    Map("Nino" -> "AC151111B"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567890")
  )
  val individualUser: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/EOY/start"),
    Map("Credential Strength" -> "strong"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Individual"),
    Map("Nino" -> "AC150000B"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567890")
  )

  val agentUser: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/test-only/EOY/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890"),
    Map("Credential Strength" -> "strong"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Agent"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567890"),
    Map("Enrolment Key 2" -> "HMRC-AS-AGENT"),
    Map("Identifier Name 2" -> "AgentReferenceNumber"),
    Map("Identifier Value 2" -> "XARN1234567")
  )

  val agentUserTwo: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/test-only/EOY/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567891"),
    Map("Credential Strength" -> "strong"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Agent"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567891"),
    Map("Enrolment Key 2" -> "HMRC-AS-AGENT"),
    Map("Identifier Name 2" -> "AgentReferenceNumber"),
    Map("Identifier Value 2" -> "XARN1234567")
  )

  Feature("Construction Industry Scheme (CIS) Journeys - Income Tax Submission") {

    //--------------------------------------Individual--------------------------------------//

    Scenario("Individual User with pre populated CIS data - Check contractor's CIS In Year Deductions") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks on the first contractor link")
        whenTheUserClicksOnTheXLink("first contractor")

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      //    When the user clicks on the first month view link
      //    Then the user should be redirected to the "Check your CIS deductions" page
      //    When the user clicks on the return to contractor link
      //    Then the user should be redirected to the "Contractor CIS deductions" page
      //    When the user clicks on the second month view link
      //    Then the user should be redirected to the "Check your CIS deductions" page
      //    When the user clicks on the return to contractor link
      //    Then the user should be redirected to the "Contractor CIS deductions" page

      When("the user clicks on the return to cis summary link")
        whenTheUserClicksOnTheXLink("return to cis summary")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      When("the user clicks on the second contractor link")
        whenTheUserClicksOnTheXLink("second contractor")

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      //    When the user clicks on the first month view link
      //    Then the user should be redirected to the "Check your CIS deductions" page
      //    When the user clicks on the return to contractor link
      //    Then the user should be redirected to the "Contractor CIS deductions" page
      //    When the user clicks on the second month view link
      //    Then the user should be redirected to the "Check your CIS deductions" page
      //    When the user clicks on the return to contractor link
      //    Then the user should be redirected to the "Contractor CIS deductions" page

      When("the user clicks on the return to cis summary link")
        whenTheUserClicksOnTheXLink("return to cis summary")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      When("the user clicks on the cis return to overview link")
        whenTheUserClicksOnTheXLink("cis return to overview")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

    }

    Scenario("Individual User make changes in CYA page for EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks on the third contractor link")
        whenTheUserClicksOnTheXLink("third contractor")

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      When("the user clicks on the first month change link")
        whenTheUserClicksOnTheXLink("first month change")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change End of tax month
      //    When the user clicks on the change end of tax month link
      //    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
      //    When the user clicks the continue button
      //    Then the user should be redirected to the "Check your CIS deductions" page

      //Change Labour
      When("the user clicks on the change labour link")
        whenTheUserClicksOnTheXLink("change labour")

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("Amount paid before tax by this contractor")

      When("the user selects the amount field and enters a value of 100.11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.11")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change CIS deductions
      When("the user clicks on the change cis deduction link")
        whenTheUserClicksOnTheXLink("change cis deduction")

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by your contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 250.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "250.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change Paid for materials from yes to no
      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink("change paid for materials")

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change Paid for materials from no to yes
      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink("change paid for materials")

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change Cost of materials
      When("the user clicks on the change cost of materials link")
        whenTheUserClicksOnTheXLink("change cost of materials")

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

    }

    Scenario("Individual User adds CIS in session data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks the Add another contractor button")
        whenTheUserClicksTheXButton("Add another contractor")

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor details")

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")

      And("the user selects the Employer Reference Number field and enters a value of 123/4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/4567")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your contractor make CIS deductions?")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("Amount paid before tax by this contractor")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by your contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

    }

    Scenario("Individual User adds another CIS deductions data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks the third contractor button")
        whenTheUserClicksTheXButton("third contractor")

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink("Add another CIS deduction")

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your contractor make CIS deductions?")

      When("the user clicks the Tax month ending dropdown and selects 5 October")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 October")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("Amount paid before tax by this contractor")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by your contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

    }

    Scenario("Individual User - Check back links for adding new contractor EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks the Add another contractor button")
        whenTheUserClicksTheXButton("Add another contractor")

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor details")

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")

      And("the user selects the Employer Reference Number field and enters a value of 123/4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/4567")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your contractor make CIS deductions?")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("Amount paid before tax by this contractor")

      When("the user selects the amount field and enters a value of 2000.05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "2000.05")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by your contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user selects the amount field and enters a value of 20.05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.05")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by your contractor in CIS deductions?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("Amount paid before tax by this contractor")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your contractor make CIS deductions?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor details")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

    }

    Scenario("Individual User - Check back links for adding new CIS deductions for existing contractor EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks the third contractor button")
        whenTheUserClicksTheXButton("third contractor")

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink("Add another CIS deduction")

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your contractor make CIS deductions?")

      When("the user clicks the Tax month ending dropdown and selects 5 October")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 October")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("Amount paid before tax by this contractor")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by your contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user selects the amount field and enters a value of 20.05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.05")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by your contractor in CIS deductions?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("Amount paid before tax by this contractor")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your contractor make CIS deductions?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

    }

    Scenario("Individual user adds new CIS deductions data to a contractor with no existing CIS history EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks the third contractor button")
        whenTheUserClicksTheXButton("third contractor")

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink("Add another CIS deduction")

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your contractor make CIS deductions?")

      When("the user clicks the Tax month ending dropdown and selects 5 January")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 January")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("Amount paid before tax by this contractor")

      When("the user selects the amount field and enters a value of 2000.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "2000.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by your contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change End of tax month
      When("the user clicks on the change end of tax month link")
        whenTheUserClicksOnTheXLink("change end of tax month")

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your contractor make CIS deductions?")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change Labour
      When("the user clicks on the change labour link")
        whenTheUserClicksOnTheXLink("change labour")

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("Amount paid before tax by this contractor")

      When("the user selects the amount field and enters a value of 100.11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.11")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change CIS deductions
      When("the user clicks on the change cis deduction link")
        whenTheUserClicksOnTheXLink("change cis deduction")

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by your contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 520.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "520.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change Paid for materials from yes to no
      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink("change paid for materials")

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change Paid for materials from no to yes
      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink("change paid for materials")

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      //Change Cost of materials
      When("the user clicks on the change cost of materials link")
        whenTheUserClicksOnTheXLink("change cost of materials")

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

    }

  //--------------------------------------Agent--------------------------------------//

    Scenario("Agent User with pre populated CIS data - Check client's CIS In Year Deductions") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      //    When the user clicks on the first contractor link
      //    Then the user should be redirected to the "Contractor CIS deductions" page
      //    When the user clicks on the first month view link
      //    Then the user should be redirected to the "Check your client’s CIS deductions" page
      //    When the user clicks on the return to contractor link
      //    Then the user should be redirected to the "Contractor CIS deductions" page
      //    When the user clicks on the second month view link
      //    Then the user should be redirected to the "Check your client’s CIS deductions" page
      //    When the user clicks on the return to contractor link
      //    Then the user should be redirected to the "Contractor CIS deductions" page
      //    When the user clicks on the return to cis summary link
      //    Then the user should be redirected to the "CIS deductions" page

      //    When the user clicks on the second contractor link
      //    Then the user should be redirected to the "Contractor CIS deductions" page
      //    When the user clicks on the first month view link
      //    Then the user should be redirected to the "Check your client’s CIS deductions" page
      //    When the user clicks on the return to contractor link
      //    Then the user should be redirected to the "Contractor CIS deductions" page
      //    When the user clicks on the second month view link
      //    Then the user should be redirected to the "Check your client’s CIS deductions" page
      //    When the user clicks on the return to contractor link
      //    Then the user should be redirected to the "Contractor CIS deductions" page
      //    When the user clicks on the return to cis summary link
      //    Then the user should be redirected to the "CIS deductions" page
      //    When the user clicks on the cis return to overview link
      //    Then the user should be redirected to the "Your client’s Income Tax Return" page

    }

    Scenario("Agent User make changes in CYA page for EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks on the third contractor link")
        whenTheUserClicksOnTheXLink("third contractor")

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      When("the user clicks on the first month change link")
        whenTheUserClicksOnTheXLink("first month change")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change End of tax month
      //    When the user clicks on the change end of tax month link
      //    Then the user should be redirected to the "When did your client’s contractor make CIS deductions?" page
      //    When the user clicks the continue button
      //    Then the user should be redirected to the "Check your client’s CIS deductions" page

      //Change Labour
      When("the user clicks on the change labour link")
        whenTheUserClicksOnTheXLink("change labour")

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did the contractor pay your client for labour?")

      When("the user selects the amount field and enters a value of 100.11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.11")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change CIS deductions
      When("the user clicks on the change cis deduction link")
        whenTheUserClicksOnTheXLink("change cis deduction")

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by the contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change Paid for materials from yes to no
      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink("change paid for materials")

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change Paid for materials from no to yes
      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink("change paid for materials")

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change Cost of materials
      When("the user clicks on the change cost of materials link")
        whenTheUserClicksOnTheXLink("change cost of materials")

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

    }

    Scenario("Agent User adds CIS in session data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks on the Add another contractor link")
        whenTheUserClicksOnTheXLink("Add another contractor")

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor details")

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")

      And("the user selects the Employer Reference Number field and enters a value of 123/4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/4567")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client’s contractor make CIS deductions?")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did the contractor pay your client for labour?")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by the contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

    }

    Scenario("Agent User adds another CIS deductions data EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks on the third contractor link")
        whenTheUserClicksOnTheXLink("third contractor")

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink("Add another CIS deduction")

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client’s contractor make CIS deductions?")

      When("the user clicks the Tax month ending dropdown and selects 5 December")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 December")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did the contractor pay your client for labour?")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by the contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

    }

    Scenario("Agent User - Check back links for adding new contractor EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUserTwo)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks the Add another contractor button")
        whenTheUserClicksTheXButton("Add another contractor")

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor details")

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")

      And("the user selects the Employer Reference Number field and enters a value of 123/4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/4567")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client’s contractor make CIS deductions?")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did the contractor pay your client for labour?")

      When("the user selects the amount field and enters a value of 2640.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "2640.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by the contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 210")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "210")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user selects the amount field and enters a value of 220.05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "220.05")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by the contractor in CIS deductions?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did the contractor pay your client for labour?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client’s contractor make CIS deductions?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor details")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

    }

    Scenario("Agent User - Check back links for adding new CIS deductions for existing contractor EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      When("the user clicks on the third contractor link")
        whenTheUserClicksOnTheXLink("third contractor")

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink("Add another CIS deduction")

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client’s contractor make CIS deductions?")

      When("the user clicks the Tax month ending dropdown and selects 5 October")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 October")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did the contractor pay your client for labour?")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by the contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user selects the amount field and enters a value of 20.05")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.05")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by the contractor in CIS deductions?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did the contractor pay your client for labour?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client’s contractor make CIS deductions?")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      When("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

    }

    Scenario("Agent user adds new CIS deductions data to a contractor with no existing CIS history EOY") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(agentUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your client’s Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your client’s Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks on the third contractor link")
        whenTheUserClicksOnTheXLink("third contractor")

      Then("the user should be redirected to the Contractor CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor CIS deductions")

      When("the user clicks on the Add another CIS deduction link")
        whenTheUserClicksOnTheXLink("Add another CIS deduction")

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client’s contractor make CIS deductions?")

      When("the user clicks the Tax month ending dropdown and selects 5 October")
        whenTheUserClicksTheXDropdownAndSelectsX("Tax month ending", "5 October")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did the contractor pay your client for labour?")

      When("the user selects the amount field and enters a value of 2000.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "2000.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by the contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change End of tax month
      When("the user clicks on the change end of tax month link")
        whenTheUserClicksOnTheXLink("change end of tax month")

      Then("the user should be redirected to the When did your client’s contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your client’s contractor make CIS deductions?")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change Labour
      When("the user clicks on the change labour link")
        whenTheUserClicksOnTheXLink("change labour")

      Then("the user should be redirected to the How much did the contractor pay your client for labour? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did the contractor pay your client for labour?")

      When("the user selects the amount field and enters a value of 100.11")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "100.11")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change CIS deductions
      When("the user clicks on the change cis deduction link")
        whenTheUserClicksOnTheXLink("change cis deduction")

      Then("the user should be redirected to the How much was taken by the contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by the contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change Paid for materials from yes to no
      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink("change paid for materials")

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user selects the no radio button")
        whenTheUserSelectsTheXRadioButton("no")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change Paid for materials from no to yes
      When("the user clicks on the change paid for materials link")
        whenTheUserClicksOnTheXLink("change paid for materials")

      Then("the user should be redirected to the Did your client pay for materials for their contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did your client pay for materials for their contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

      //Change Cost of materials
      When("the user clicks on the change cost of materials link")
        whenTheUserClicksOnTheXLink("change cost of materials")

      Then("the user should be redirected to the How much did your client pay for building materials for the contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did your client pay for building materials for the contractor?")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your client’s CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your client’s CIS deductions")

    }
//------------- agent user ends ---------------------//
    Scenario("Individual User - A user with no cis data answers yes on gateway question page and changes to no to remove data") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUserNoCisData)

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

      When("the user clicks the addCisSection tailoring option")
        whenTheUserClicksTheXTailoringOption("addCisSection")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the Have you had CIS deductions taken from your payments by contractors? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you had CIS deductions taken from your payments by contractors?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      Given("no cis deductions data exists")
        givenNoCisDeductionsDataExists()

      When("the user clicks the Add a contractor button")
        whenTheUserClicksTheXButton("Add a contractor")

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor details")

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")

      And("the user selects the Employer Reference Number field and enters a value of 123/4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/4567")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your contractor make CIS deductions?")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Amount paid before tax by this contractor page")
        thenTheUserShouldBeRedirectedToTheXPage("Amount paid before tax by this contractor")

      When("the user selects the amount field and enters a value of 20.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "20.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much was taken by your contractor in CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much was taken by your contractor in CIS deductions?")

      When("the user selects the amount field and enters a value of 200")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "200")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Did you pay for materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("Did you pay for materials for your contractor?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the How much did you pay for building materials for your contractor? page")
        thenTheUserShouldBeRedirectedToTheXPage("How much did you pay for building materials for your contractor?")

      When("the user selects the amount field and enters a value of 110.02")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("amount", "110.02")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Check your CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("Check your CIS deductions")

      When("the user clicks the CIS save and continue button")
        whenTheUserClicksTheXButton("CIS save and continue")

    }

    Scenario("Individual User - A user with cis data answers yes on gateway question page") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks on the CIS deductions change link")
        whenTheUserClicksOnTheXLink("CIS deductions change")

      Then("the user should be redirected to the Have you had CIS deductions taken from your payments by contractors? page")
        thenTheUserShouldBeRedirectedToTheXPage("Have you had CIS deductions taken from your payments by contractors?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

    }

    Scenario("In Year - user cannot update cis if there is prior data") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

    }

    Scenario("In Year - user cannot update cis if there is no prior data") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUserInYearNoPriorData)

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

      When("the user clicks the addCisSection tailoring option")
        whenTheUserClicksTheXTailoringOption("addCisSection")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the CIS You cannot update text is displayed")
        thenTheXIsDisplayed("CIS You cannot update text")

    }

    Scenario("Individual User adds new Contractor Details - Back button Error") {
      When("the user logs into the service with the following details")
        givenTheUserLogsIntoTheServiceWithTheFollowingDetails(individualUser)

      Then("the user should be redirected to Update and submit an Income Tax Return page")
        thenTheUserShouldBeRedirectedToXPage("Update and submit an Income Tax Return")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the cis deductions link")
        whenTheUserClicksOnTheXLink("cis deductions")

      Then("the user should be redirected to the CIS deductions page")
        thenTheUserShouldBeRedirectedToTheXPage("CIS deductions")

      And("the status on the page is Yes for gateway question")
        thenTheStatusOnThePageIsX("Yes")

      When("the user clicks the Add another contractor button")
        whenTheUserClicksTheXButton("Add another contractor")

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor details")

      When("the user selects the Contractor name field and enters a value of Boots Ltd")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Contractor name", "Boots Ltd")

      And("the user selects the Employer Reference Number field and enters a value of 123/AB4567")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Employer Reference Number", "123/AB4567")

      When("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the When did your contractor make CIS deductions? page")
        thenTheUserShouldBeRedirectedToTheXPage("When did your contractor make CIS deductions?")

      And("the user goes back to the previous page in their browser's history")
        whenTheUserGoesBackToThePreviousPageInTheirBrowsersHistory()

      Then("the user should be redirected to the Contractor details page")
        thenTheUserShouldBeRedirectedToTheXPage("Contractor details")

      And("the user should see the Contractor name field with the value of Boots Ltd")
        thenTheUserShouldSeeTheXFieldWithTheValueOfX("Contractor name", "Boots Ltd")

      And("the user should see the Employer Reference Number field with the value of 123/AB4567")
        thenTheUserShouldSeeTheXFieldWithTheValueOfX("Employer Reference Number", "123/AB4567")

    }
  }
}
