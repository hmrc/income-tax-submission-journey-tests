package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.PersonalIncomePage

class InterestStepDef extends BaseStepDef {

  Then("""^the user should be on the received UK untaxed interest page$""") { () =>
    driver.getCurrentUrl should be(PersonalIncomePage.url + "/2020/interest/untaxed-uk-interest")
  }

  Then("""^the user should be on the UK untaxed interest details page$""") { () =>
    driver.getCurrentUrl should be(PersonalIncomePage.url + "/2020/interest/untaxed-uk-interest-details")
  }

  Then("""^the user should be on the UK untaxed interest account summary page$""") { () =>
    driver.getCurrentUrl should be(PersonalIncomePage.url + "/2020/interest/untaxed-uk-interest-account-summary")
  }

  Then("""^the user should be on the received UK taxed interest page$""") { () =>
    driver.getCurrentUrl should be(PersonalIncomePage.url + "/2020/interest/taxed-uk-interest")
  }

  Then("""^the user should be on the UK taxed interest details page$""") { () =>
    driver.getCurrentUrl should be(PersonalIncomePage.url + "/2020/interest/taxed-uk-interest-details")
  }

  Then("""^the user should be on the UK taxed interest account summary page$""") { () =>
    driver.getCurrentUrl should be(PersonalIncomePage.url + "/2020/interest/taxed-uk-interest-account-summary")
  }

  Then("""^the user should be on the interest check your answers page$""") { () =>
    driver.getCurrentUrl should be(PersonalIncomePage.url + "/2020/interest/check-your-answers")
  }



}
