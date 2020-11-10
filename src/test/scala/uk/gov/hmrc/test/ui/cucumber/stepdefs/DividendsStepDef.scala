/*
 * Copyright 2020 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{CommonElements, DividendsPage}

class DividendsStepDef extends BaseStepDef {

  Then("""^the user should be on the received UK dividends page$""") { () =>
    driver.getCurrentUrl should be(DividendsPage.url + "/dividends/uk-dividends")
  }

  Then("""^the user should be on the UK dividends amount page$""") { () =>
    driver.getCurrentUrl should be(DividendsPage.url + "/dividends/uk-dividends-amount")
  }

  Then ("""^the user should be on the authorised unit trusts, investment companies/trusts page$""") { () =>
    driver.getCurrentUrl should be (DividendsPage.url + "/dividends/other-dividends")
  }

  Then ("""^the user should be on the authorised unit trusts, investment companies/trusts amount page$""") { () =>
    driver.getCurrentUrl should be (DividendsPage.url + "/dividends/other-dividends-amount")
  }

  Then ("""^the user should be on the dividends check your answers page$""") { () =>
    driver.getCurrentUrl should be (DividendsPage.url + "/dividends/check-your-answers")
  }

}
