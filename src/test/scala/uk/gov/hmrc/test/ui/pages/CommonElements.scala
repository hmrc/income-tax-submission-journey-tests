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
import org.scalatest.matchers.should.Matchers

trait CommonElements extends BasePage with Matchers{

  def load(key: String): By =
    elements(key)

  val elements: Map[String, By] = Map(
    //Common Elements
    "yes"                  -> By.id("yes_no_yes"),
    "no"                   -> By.id("yes_no_no"),
    "save and continue"    -> By.cssSelector("#main-content > div > div > form > button"),
    "provide updates"      -> By.cssSelector("#main-content > div > div > a"),
    "continue"             -> By.id("continue"),

    //Dividends Elements
    "dividends"                 -> By.id("dividends_link"),
    "UK dividends amount"       -> By.id("amount"),
    "UK other dividends amount" -> By.id("amount"),
    "other amount"              -> By.id("other-amount"),
    "prior amount"              -> By.id("prior-amount"),
    "other amount value"        -> By.id("other-amount-input"),
    "change uk dividends amount" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd.govuk-summary-list__actions > a"),
    "change other dividends amount" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions > a")

    //Interest Elements

  )
}
