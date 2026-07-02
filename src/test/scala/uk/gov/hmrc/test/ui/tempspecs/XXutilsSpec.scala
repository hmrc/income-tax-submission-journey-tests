package uk.gov.hmrc.test.ui.tempspecs

import uk.gov.hmrc.test.ui.specs.BaseSpec

class XXutilsSpec extends BaseSpec{

  Feature("Util Journeys - Income Tax Submission") {

    Scenario("Checking the Accessibility Statement link for all 3 frontends") {
      When("the user logs into the service with the following details")
      Then("the user should be redirected to Update and submit an Income Tax Return page")
      And("the user should see the correct Accessibility Statement url")
      And("the user should see the correct sign out url")
      When("the user clicks the continue button")
      Then("the user should be redirected to the Your Income Tax Return page")
      When("the user clicks on the dividends link")
      Then("the user should be redirected to the Check your income from dividends page")
      And("the user should see the correct Accessibility Statement url")
      And("the user should see the correct personal income sign out url")
      When("the user goes back to the previous page in their browser's history")
      Then("the user should be redirected to the Your Income Tax Return page")
      When("the user clicks on the employment link")
      Then("the user should be redirected to the PAYE employment page")
      And("the user should see the correct Accessibility Statement url")
      And("the user should see the correct employment sign out url")
    }

    Scenario("Checking the client authorisation link for agents") {
      When("the user logs into the service with the following details")
      Then("the user should be redirected to the There’s a problem page")
      And("the user should see the correct Authorise you as an agent url")
      Then("the user navigates to the untaxed interest page")
      Then("the user should be redirected to the There’s a problem page")
      And("the user should see the correct Authorise you as an agent url")
    }

    Scenario("supporting Agent unauthorised to access submission service") {
      When("the user logs into the service with the following details")
      Then("the user should be redirected to the You are not authorised to use this service page")
    }
  }
}
