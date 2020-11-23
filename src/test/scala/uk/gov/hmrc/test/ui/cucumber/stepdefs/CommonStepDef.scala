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

import uk.gov.hmrc.test.ui.pages.CommonPage

class CommonStepDef extends BaseStepDef {

  Then("""^the user will redirect to the Income Tax Submission start page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/2020/start")
  }

  Then("""^the user should be on the overview page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/2020/view")
  }

  Given("""^the user clicks on the (.*) link$""") { linkName: String =>
    CommonPage.clickOnLink(linkName)
  }

  When("""^the user selects the (.*) radio button$""") { radioButtonBoolean: String =>
    CommonPage.clickOnRadioButton(radioButtonBoolean)
  }

  When("""^the user clicks the (.*) button$""") { buttonTitle: String =>
    CommonPage.clickOnButton(buttonTitle)
  }

  When("""^the user selects the (.*) field and enters a value of £(.*)$""") { (valueTextBox: String, value: String) =>
    CommonPage.enterValue(valueTextBox, value)
  }

  When("""^the client nino is passed into session$"""){ () =>
    driver.navigate().to(CommonPage.url + "/test-only/2020/additional-parameters?NINO=AA123456A")
  }

  When("""^the client nino with prior data is passed into session$"""){ () =>
    driver.navigate().to(CommonPage.url + "/test-only/2020/additional-parameters?NINO=AA000003A")
  }
}
