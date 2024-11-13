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

  import java.time.LocalDate

  val currentYear: Int = LocalDate.now.getYear

  Given("""^the user logs into the service as an individual""") { ()
    getRedirectUrl.sendKeys(CommonPage.url + "/" + currentYear + "/start")
    selectCredentialStrength("strong")
    selectConfidenceLevel("250")
    selectAffinityGroup("Individual")
    getNino.sendKeys("BB000002A")
    getEnrolmentKeyOne.sendKeys("HMRC-MTD-IT")
    getIdentifierNameOne.sendKeys("MTDITID")
    getIdentifierValueOne.sendKeys("1234567890")
  driver.findElement(By.cssSelector("#submit")).click()
}

  And("""^navigates to the self-employment section""") { () =>
    CommonPage.clickOnButton(buttonTitle = "continue")
    driver.getTitle.replace("\u00A0", " ") should be("Your Income Tax Return - Update and submit an Income Tax Return - GOV.UK")
  }

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
