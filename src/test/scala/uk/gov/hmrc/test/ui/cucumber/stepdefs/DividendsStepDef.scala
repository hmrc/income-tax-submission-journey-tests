package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.CommonPage
import org.openqa.selenium.By

class DividendsStepDef extends BaseStepDef {

  Then("""^the user should be on the received UK dividends page$""") { () =>
    driver.getCurrentUrl should be(CommonPage.url + "/personal-income/dividends/uk-dividends")
  }

  Then("""^the user should be on the UK dividends amount page$""") { () =>
    driver.getCurrentUrl should be(CommonPage.url + "/personal-income/dividends/uk-dividends-amount")
  }

  Then ("""^the user should be on the authorised unit trusts, investment companies/trusts page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/personal-income/dividends/other-dividends")
  }

  Then ("""^the user should be on the authorised unit trusts, investment companies/trusts amount page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/personal-income/dividends/other-dividends-amount")
  }

  Then ("""^the user should be on the dividends check your answers page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/personal-income/dividends/check-your-answers")
  }

}
