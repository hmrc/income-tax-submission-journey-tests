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
import org.openqa.selenium.By

class CommonStepDef extends BaseStepDef {

  When("""^the user click the provide updates button$""") { () =>
    driver.findElement(By.cssSelector("#main-content > div > div > main > div > a")).click()
  }

  Then("""^the user will redirect to the Income Tax Submission start page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/start")
  }

  Then("""^the user should be on the overview page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/view")
  }

}
