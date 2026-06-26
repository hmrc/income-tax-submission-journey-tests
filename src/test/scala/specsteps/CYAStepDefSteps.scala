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

package specsteps

import uk.gov.hmrc.test.ui.pages.CommonPageOld

object CYAStepDefSteps {

  // ^the user clicks on the change link in position (.*)$
  def whenTheUserClicksOnTheChangeLinkInPositionX(): Unit = {
    position: String =>
        CommonPageOld.clickBySelector(s"#main-content > div > div > dl > div:nth-child($position) > dd.govuk-summary-list__actions > a")
  }

  // ^the user clicks on the change (.*) benefit link in position (.*)$
  def whenTheUserClicksOnTheChangeXBenefitLinkInPositionX(section: String, position: String): Unit = {
    val sectionMaps = Map(
          "car" -> 2,
          "accommodation" -> 3,
          "travel" -> 4,
          "utilities" -> 5,
          "medical" -> 6,
          "income" -> 7,
          "reimbursed" -> 8,
          "assets" -> 9
        )

        CommonPageOld.clickBySelector(s"#main-content > div > div > dl:nth-of-type(${sectionMaps(section)}) > div:nth-child($position) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a")
  }

  // ^the status on the page is "(.*)"$
  def thenTheStatusOnThePageIsX(status: String): Unit = {
    val selector = CommonPageOld.load(status)
        CommonPageOld.elementExists(selector)
  }

  // ^the "(.*)" on the page displays "(.*)"$
  def thenTheXOnThePageDisplaysX(tag: String, status: String): Unit = {
    val selector = CommonPageOld.load(tag)
        val result = CommonPageOld.containsText(selector, status)
        assert(result, s"The value for '$tag' does not display '$status'")
  }

}
