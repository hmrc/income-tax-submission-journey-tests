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

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.conf.TestConfiguration

import scala.jdk.CollectionConverters.CollectionHasAsScala

object CommonPage extends BasePage with CommonElements {
  override val url: String = TestConfiguration.url("income-tax-submission-frontend")

  def clickOnLink(linkName: String): Unit = {
    val selector: By = load(linkName)
    clickOn(selector)
  }

  def clickOnRadioButton(radioButtonBoolean: String): Unit = {
    val selector: By = load(radioButtonBoolean)
    if (!driver.findElement(selector).isSelected) {
      clickOn(selector)
    }
  }

  def deselectRadioButton(checkboxes: String): Unit = {
    val selector: By = load(checkboxes)
    if (driver.findElement(selector).isSelected) {
      clickOn(selector)
    }
  }

  def enterValue(valueTextBox: String, value: String): Unit = {
    val selector: By = load(valueTextBox)
    sendKeys(selector, value)
  }

  def checkValue(valueTextBox: String, expectedValue: String): Boolean =
    driver.findElement(load(valueTextBox)).getAttribute("value") == expectedValue

  def clickOnButton(buttonTitle: String): Unit = {
    val selector: By = load(buttonTitle)
    clickOn(selector)
  }

  def clickOnCheckbox(checkboxTitle: String): Unit = {
    val selector: By = load(checkboxTitle)
    clickOn(selector)
  }

  def clickAllCheckboxes(): Unit = {
    val checkboxes = driver.findElements(By.cssSelector("input[type=checkbox]"))
    checkboxes.forEach { checkbox =>
      if (!checkbox.isSelected) {
        checkbox.click()
      }
    }
  }

  def clickOnDropdown(dropdownTitle: String, dropdownValue: String): Unit = {
    val selector: By = load(dropdownTitle)
    select(selector, dropdownValue)
  }

  def attemptToClickOnCheckbox(checkboxTitle: String): Unit = {
    val selector: By = load(checkboxTitle)
    attemptToClickOn(selector)
  }

  def clickBySelector(selector: String): Unit = {
    clickOn(By.cssSelector(selector))
  }

  def containsText(selector: By, textToContain: String): Boolean = {
    val elements = driver.findElements(selector)
    elements.asScala.exists(_.getText.contains(textToContain))
  }

  def selectDropDownOptionByValue(id: String, value: String): Unit = {
    Driver.instance.findElement(By.id(id))
    val dropdown = new Select(findElementById(id))
    dropdown.selectByValue(value)
  }

  def clickOnAgentCheckbox(): Unit = {
    val selector: By = load("agentCheckboxV&C")
    if (!driver.findElement(selector).isSelected) {
      clickOn(selector)
    }
  }
}
