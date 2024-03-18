/*
 * Copyright 2023 HM Revenue & Customs
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
import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.AuthLoginPage._
import uk.gov.hmrc.test.ui.pages.{BasePage, CommonPage}

class AuthStepDef extends BasePage with Steps {

  Given("""^the user logs into the service with the following details$""") { arg: DataTable =>
    useDataTable(arg)
    getRedirectUrl.sendKeys(CommonPage.url + redirectUrl)
    selectCredentialStrength(credentialStrength)
    selectConfidenceLevel(confidenceLevel)
    selectAffinityGroup(affinityGroup)
    getNino.sendKeys(niNumber)
    getEnrolmentKeyOne.sendKeys(enrolmentKeyOne)
    getIdentifierNameOne.sendKeys(identifierNameOne)
    getIdentifierValueOne.sendKeys(identifierValueOne)
    getEnrolmentKeyTwo.sendKeys(enrolmentKeyTwo)
    getIdentifierNameTwo.sendKeys(identifierNameTwo)
    getIdentifierValueTwo.sendKeys(identifierValueTwo)
    if(affinityGroup.contains("Agent")) {
      driver.findElement(By.cssSelector("#js-add-delegated-enrolment")).click()
      getDelegatedEnrolmentKey.sendKeys(delegatedEnrolmentKey)
      getDelegatedIdentifierName.sendKeys(delegatedIdentifierName)
      getDelegatedIdentifierValue.sendKeys(delegatedIdentifierValue)
      getDelegatedAuthRule.sendKeys(delegatedAuthRule)
    }
    driver.findElement(By.cssSelector("#submit")).click()
  }
}
