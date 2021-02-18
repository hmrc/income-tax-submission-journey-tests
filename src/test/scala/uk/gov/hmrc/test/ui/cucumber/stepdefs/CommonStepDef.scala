/*
 * Copyright 2021 HM Revenue & Customs
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

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.CommonPage

class CommonStepDef extends BaseStepDef {

  Then("""^the user will redirect to the Income Tax Submission start page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/2022/start")
  }

  Then("""^the user should be on the overview page$""") { () =>
    driver.getCurrentUrl should be (CommonPage.url + "/2022/view")
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

  When("""^the user selects the (.*) field and enters a value of (.*)$""") { (valueTextBox: String, value: String) =>
    CommonPage.enterValue(valueTextBox, value)
  }

  Then("""^the user should be redirected to the "(.*)" page$""") { (title: String) =>
    driver.getTitle should be(title)
  }

  And( """^the user should see the correct Accessibility Statement url$""") { () =>
    val expectedHref = "/accessibility-statement/income-tax-submission"
    driver.findElement(By.linkText("Accessibility statement")).getAttribute("href") should include (expectedHref)
  }

  And( """^the user should see the correct sign out url$""") { () =>
    val expectedHref = "sign out url Bolaji"
    driver.findElement(By.linkText("sign out")).getAttribute("href") should include (expectedHref)
  }

  And( """^the user should see the correct View estimation url$""") { () =>
    val href = driver.findElement(By.linkText("View estimation")).getAttribute("href").contains("/income-through-software/return/2022/calculate")
    href shouldBe true
  }

}
