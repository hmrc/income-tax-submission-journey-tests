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

package uk.gov.hmrc.test.ui.pages

import java.util

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.driver.BrowserDriver

trait BasePage extends Matchers with BrowserDriver{
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


  def useDataTable(data: DataTable): Unit = {
    var firstColumn: String = ""
    val secondColumn: Int = 1
    val tableContent: util.List[util.Map[String, String]] = data.asMaps(classOf[String], classOf[String])

    def getColumnValue(row: Int) = data.row(row).get(secondColumn)

    for (row <- 0 to tableContent.toArray().length) {
      firstColumn = data.row(row).get(0)
      firstColumn match {
        case "Redirect url" => redirectUrl = getColumnValue(row)
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
        case _ =>
      }
    }
  }

  def clickOn(selector: By): Unit = {
    driver.findElement(selector).click()
  }

  def sendKeys(selector: By, value: String): Unit = {
    driver.findElement(selector).clear()
    driver.findElement(selector).sendKeys(value)
  }
}
