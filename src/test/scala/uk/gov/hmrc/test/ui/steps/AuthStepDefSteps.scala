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

package uk.gov.hmrc.test.ui.steps

import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.pages.AuthLoginPageNew._
import uk.gov.hmrc.test.ui.pages.CommonPage
import uk.gov.hmrc.test.ui.pages.CommonPage.replaceTaxYear
import uk.gov.hmrc.test.ui.util.UserLogin

import java.time.Year

object AuthStepDefSteps {

  def givenTheUserLogsIntoTheServiceWithTheFollowingDetails(user: UserLogin): Unit = {
    getRedirectUrl.sendKeys(CommonPage.url + replaceTaxYear(user.redirectUrl))
    selectCredentialStrength(user.credentialStrength)
    selectConfidenceLevel(user.confidenceLevel)
    selectAffinityGroup(user.affinityGroup)
    getNino.sendKeys(user.nino)
    getEnrolmentKeyOne.sendKeys(user.enrolmentKey1)
    getIdentifierNameOne.sendKeys(user.identifierName1)
    getIdentifierValueOne.sendKeys(user.identifierValue1)
    getEnrolmentKeyTwo.sendKeys(user.enrolmentKey2)
    getIdentifierNameTwo.sendKeys(user.identifierName2)
    getIdentifierValueTwo.sendKeys(user.identifierValue2)
    if (user.affinityGroup.contains("Agent")) {
      Driver.instance.findElement(By.cssSelector("#js-add-delegated-enrolment")).click()
      getDelegatedEnrolmentKey.sendKeys(user.delegatedEnrolmentKey)
      getDelegatedIdentifierName.sendKeys(user.delegatedIdentifierName)
      getDelegatedIdentifierValue.sendKeys(user.delegatedIdentifierValue)
      getDelegatedAuthRule.sendKeys(user.delegatedAuthRule)
    }
    Driver.instance.findElement(By.cssSelector("#submit")).click()
  }

}