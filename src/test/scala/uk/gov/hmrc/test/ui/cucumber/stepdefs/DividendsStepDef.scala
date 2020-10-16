package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.CommonPage
import org.openqa.selenium.By

class DividendsStepDef extends BaseStepDef {

  Then("""^the user should be on the received UK dividends page$""") { () =>
    driver.getCurrentUrl should be(CommonPage.url + "/dividends/dividend-uk-status")
  }

  Then("""^the user should be on the UK dividends amount page$""") { () =>
    driver.getCurrentUrl should be(CommonPage.url + "/dividends/dividend-uk-amount")
  }

  Then ("""^the user should be on the authorised unit trusts, investment companies/trusts page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/dividends/other-dividend-status")
  }

  Then ("""^the user should be on the authorised unit trusts, investment companies/trusts amount page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/dividends/other-dividend-amount")
  }

  Then ("""^the user should be on the dividends check your answers page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/dividends/summary")
  }

}
