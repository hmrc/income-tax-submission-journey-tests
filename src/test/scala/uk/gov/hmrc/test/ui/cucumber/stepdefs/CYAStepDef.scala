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

import uk.gov.hmrc.test.ui.pages.CommonPage

class CYAStepDef extends BaseStepDef {

  When("""^the user clicks on the change link in position (.*)$""") { position: String =>
    CommonPage.clickBySelector(s"#main-content > div > div > dl > div:nth-child($position) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a")
  }

  When("""^the user clicks on the change (.*) benefit link in position (.*)$""") { (section: String, position: String) =>
    val sectionMaps = Map(
      "car" -> 5,
      "accommodation" -> 7,
      "travel" -> 9,
      "utilities" -> 11,
      "medical" -> 13,
      "income" -> 15,
      "reimbursed" -> 17,
      "assets" -> 19
    )

    CommonPage.clickBySelector(s"#main-content > div > div > dl:nth-child(${sectionMaps(section)}) > div:nth-child($position) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a")
  }

}