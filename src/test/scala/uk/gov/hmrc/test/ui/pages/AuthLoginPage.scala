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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.driver.BrowserDriver

object AuthLoginPage extends BrowserDriver {
  val url: String = TestConfiguration.url("auth-login-stub") + "/gg-sign-in"

  def getRedirectUrl: WebElement = driver.findElement(By.name("redirectionUrl"))

  def selectCredentialStrength(credentialStrength: String): Unit = {
    val select = new Select(driver.findElement(By.name("credentialStrength")))
    select.selectByVisibleText(credentialStrength)
  }

  def selectConfidenceLevel(confidenceLevel: String): Unit = {
    val select = new Select(driver.findElement(By.name("confidenceLevel")))
    select.selectByVisibleText(confidenceLevel)
  }

  def selectAffinityGroup(affinityGroup: String): Unit = {
    val select = new Select(driver.findElement(By.name("affinityGroup")))
    select.selectByVisibleText(affinityGroup)
  }

  def getNino: WebElement = driver.findElement(By.name("nino"))

  def getEnrolmentKeyOne: WebElement = driver.findElement(By.name("enrolment[0].name"))

  def getIdentifierNameOne: WebElement = driver.findElement(By.name("enrolment[0].taxIdentifier[0].name"))

  def getIdentifierValueOne: WebElement = driver.findElement(By.name("enrolment[0].taxIdentifier[0].value"))

  def getEnrolmentKeyTwo: WebElement = driver.findElement(By.name("enrolment[1].name"))

  def getIdentifierNameTwo: WebElement = driver.findElement(By.name("enrolment[1].taxIdentifier[0].name"))

  def getIdentifierValueTwo: WebElement = driver.findElement(By.name("enrolment[1].taxIdentifier[0].value"))

  def getDelegatedEnrolmentKey: WebElement = driver.findElement(By.name("delegatedEnrolment[0].key"))

  def getDelegatedIdentifierName: WebElement = driver.findElement(By.name("delegatedEnrolment[0].taxIdentifier[0].name"))

  def getDelegatedIdentifierValue: WebElement = driver.findElement(By.name("delegatedEnrolment[0].taxIdentifier[0].value"))

  def getDelegatedAuthRule: WebElement = driver.findElement(By.name("delegatedEnrolment[0].delegatedAuthRule"))

}
