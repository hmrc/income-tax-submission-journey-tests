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
    "other amount"         -> By.id("other-amount"),
    "prior amount"         -> By.id("prior-amount"),
    "other amount value"   -> By.id("other-amount-input"),

    //Dividends Elements
    "dividends"                     -> By.id("dividends_link"),
    "UK dividends amount"           -> By.id("amount"),
    "UK other dividends amount"     -> By.id("amount"),
    "change uk dividends amount"    -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd.govuk-summary-list__actions > a"),
    "change other dividends amount" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions > a"),

    //Interest Elements
    "interest"                          -> By.id("interest_link"),
    "UK untaxed interest amount earned" -> By.id("untaxedAmount"),
    "UK taxed interest amount earned"   -> By.id("taxedAmount"),
    "UK untaxed interest account name"  -> By.id("untaxedAccountName"),
    "UK taxed interest account name"    -> By.id("taxedAccountName"),
    "add another account"               -> By.cssSelector("#main-content > div > div > div:nth-child(4) > a"),
    "remove account"                    -> By.cssSelector("#main-content > div > div > div.govuk-summary-list > div:nth-child(1) > dd:nth-child(3) > a"),
    "first account change"              -> By.cssSelector("#main-content > div > div > div.govuk-summary-list > div:nth-child(1) > dd:nth-child(3) > a"),
    "second account change"             -> By.cssSelector("#main-content > div > div > div.govuk-summary-list > div:nth-child(2) > dd:nth-child(3) > a"),
    "change uk untaxed interest accounts summary" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd.govuk-summary-list__actions > a"),
    "change uk taxed interest accounts summary"  -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions > a"),

  )
}
