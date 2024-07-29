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

import io.cucumber.datatable.DataTable
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.Select
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.conf.TaxYearHelper
import uk.gov.hmrc.test.ui.driver.BrowserDriver

import java.util

trait BasePage extends Matchers with BrowserDriver with TaxYearHelper {
  val url: String = ""

  var redirectUrl: String = ""
  var credentialStrength: String = ""
  var confidenceLevel: String = ""
  var affinityGroup: String = ""
  var niNumber: String = ""
  var enrolmentKeyOne: String = ""
  var identifierNameOne: String = ""
  var identifierValueOne: String = ""
  var enrolmentKeyTwo: String = ""
  var identifierNameTwo: String = ""
  var identifierValueTwo: String = ""
  var delegatedEnrolmentKey: String = ""
  var delegatedIdentifierName: String = ""
  var delegatedIdentifierValue: String = ""
  var delegatedAuthRule: String = ""

  def findElementById(id: String): WebElement = Driver.instance.findElement(By.id(id))

  def replaceTaxYear(url : String): String ={
    url match {
      case x if url.contains("EOY") => url.replace("EOY",taxYearEOY.toString)
      case x if url.contains("InYear") => url.replace("InYear",taxYear.toString)
      case x if url.contains("TaxYearMinusTwo") => url.replace("TaxYearMinusTwo",taxYearMinusTwo.toString)
      case _ => "invalid url passed, should be EOY or InYear"
    }
  }

  def useDataTable(data: DataTable): Unit = {
    var firstColumn: String = ""
    val secondColumn: Int = 1
    val tableContent: util.List[util.Map[String, String]] = data.asMaps(classOf[String], classOf[String])

    def getColumnValue(row: Int) = data.row(row).get(secondColumn)

    for (row <- 0 to tableContent.toArray().length) {
      firstColumn = data.row(row).get(0)
      firstColumn match {
        case "Redirect url" => redirectUrl = replaceTaxYear(getColumnValue(row))
        case "Credential Strength" => credentialStrength = getColumnValue(row)
        case "Confidence Level" => confidenceLevel = getColumnValue(row)
        case "Affinity Group" => affinityGroup = getColumnValue(row)
        case "Nino" => niNumber = getColumnValue(row)
        case "Enrolment Key 1" => enrolmentKeyOne = getColumnValue(row)
        case "Identifier Name 1" => identifierNameOne = getColumnValue(row)
        case "Identifier Value 1" => identifierValueOne = getColumnValue(row)
        case "Enrolment Key 2" => enrolmentKeyTwo = getColumnValue(row)
        case "Identifier Name 2" => identifierNameTwo = getColumnValue(row)
        case "Identifier Value 2" => identifierValueTwo = getColumnValue(row)
        case "Delegated Enrolment Key" => delegatedEnrolmentKey = getColumnValue(row)
        case "Delegated Identifier Name" => delegatedIdentifierName = getColumnValue(row)
        case "Delegated Identifier Value" => delegatedIdentifierValue = getColumnValue(row)
        case "Delegated Auth Rule" => delegatedAuthRule = getColumnValue(row)
        case _ =>
      }
    }
  }

  def clickOn(selector: By): Unit = {
    driver.findElement(selector).click()
  }

  def select(selector: By, value: String): Unit = {
    val dropdown = new Select(driver.findElement(selector))
    dropdown.selectByVisibleText(value)
  }

  def attemptToClickOn(selector: By): Unit = {
    if (driver.findElements(selector).size() > 0) driver.findElement(selector).click()
  }

  def sendKeys(selector: By, value: String): Unit = {
    driver.findElement(selector).clear()
    driver.findElement(selector).sendKeys(value)
  }

  def elementExists(selector: By): Boolean =
    !driver.findElements(selector).isEmpty

  def navigateBack(): Unit =
    driver.navigate().back()
}
