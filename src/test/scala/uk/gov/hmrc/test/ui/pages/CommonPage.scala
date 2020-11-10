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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.conf.TestConfiguration

object CommonPage extends BasePage with CommonElements {
  override val url: String = TestConfiguration.url("income-tax-submission-frontend")
  val title = "Income Tax Submission"

  def clickOnLink(linkName: String): Unit = {
    val selector: By = load(linkName)
    clickOn(selector)
  }

  def clickOnRadioButton(radioButtonBoolean: String): Unit = {
    val selector: By = load(radioButtonBoolean)
    clickOn(selector)
  }

  def enterValue(valueTextBox: String,value:String): Unit = {
    val selector: By = load(valueTextBox)
    sendKeys(selector, value)
  }

  def clickOnButton(buttonTitle:String): Unit = {
    val selector: By = load(buttonTitle)
    clickOn(selector)
  }

}
