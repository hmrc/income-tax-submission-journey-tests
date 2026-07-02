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

class SelfEmploymentCashAccountJourneySpec extends BaseSpec {

  val individualUser: Seq[Map[String, String]] = Seq(
    Map("Redirect url" -> "/EOY/start"),
    Map("Credential Strength" -> "strong"),
    Map("Confidence Level" -> "250"),
    Map("Affinity Group" -> "Individual"),
    Map("Nino" -> "BB000002C"),
    Map("Enrolment Key 1" -> "HMRC-MTD-IT"),
    Map("Identifier Name 1" -> "MTDITID"),
    Map("Identifier Value 1" -> "1234567890")
  )
  Feature("Self Employment Cash accounting Journeys") {

    Scenario("Individual - Self employment Income journey - (Cash accounting - Use Less than the maximum of £1,000)") {
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

      When("the user clicks the addSelfEmployment tailoring option")
        whenTheUserClicksTheXTailoringOption("addSelfEmployment")

      And("the user clicks the continue button")
        whenTheUserClicksTheXButton("continue")

      Then("the user should be redirected to the Your Income Tax Return page")
        thenTheUserShouldBeRedirectedToTheXPage("Your Income Tax Return")

      When("the user clicks on the Self Employment link")
        whenTheUserClicksOnTheXLink("Self Employment")

      Then("the user should be redirected to the Self-employment page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Self-employment")

      When("the user clicks on the Review self-employments link")
        whenTheUserClicksOnTheXLink("Review self-employments")

      Then("the user should be redirected to the Check your self-employment details page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your self-employment details")

      When("the user clicks the Continue button")
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

      Then("the user should be redirected to the Were you a farmer or market gardener? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Were you a farmer or market gardener?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Did you get over half of your profit from literary or creative works? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Did you get over half of your profit from literary or creative works?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your details page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your details")

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

      When("the user clicks on the Self-employment Income link")
        whenTheUserClicksOnTheXLink("Self-employment Income")

      Then("the user should be redirected to the Income not counted as turnover page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Income not counted as turnover")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much non-turnover income did you get? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much non-turnover income did you get?")

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

      Then("the user should be redirected to the Is there any other self-employment income you need to tell us about? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Is there any other self-employment income you need to tell us about?")

      When("the user selects the yes radio button")
        whenTheUserSelectsTheXRadioButton("yes")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much other self-employment income did you get? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much other self-employment income did you get?")

      And("the user selects the Amount-field field and enters a value of 100000")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "100000")

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

      When("the user selects the second radio button radio button")
        whenTheUserSelectsTheXRadioButton("second radio button")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the How much trading allowance do you want to use? page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("How much trading allowance do you want to use?")

      And("the user selects the Amount-field field and enters a value of 999")
        whenTheUserSelectsTheXFieldAndEntersAValueOfX("Amount-field", "999")

      And("the user clicks the Continue button")
        whenTheUserClicksTheXButton("Continue")

      Then("the user should be redirected to the Check your income page under self employment")
        thenTheUserShouldBeRedirectedToTheXPageUnderSelfEmployment("Check your income")

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
