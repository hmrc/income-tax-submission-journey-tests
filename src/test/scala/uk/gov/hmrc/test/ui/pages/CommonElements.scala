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
    "yes"                  -> By.id("value"),
    "no"                   -> By.id("value-no"),
    "save and continue"    -> By.cssSelector("#main-content > div > div > form > button"),
    "continue"             -> By.id("continue"),
    "back"                 -> By.cssSelector("a.govuk-back-link"),
    "remove account"       -> By.cssSelector("#main-content > div > div > div.govuk-form-group > ul > li:nth-child(1) > span.hmrc-add-to-a-list__remove > a"),

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
    "UK untaxed interest updated amount earned" -> By.id("amount"),
    "UK taxed interest updated amount earned"   -> By.id("amount"),
    "UK untaxed interest account name"  -> By.id("untaxedAccountName"),
    "UK taxed interest account name"    -> By.id("taxedAccountName"),
    "first account change"              -> By.cssSelector("#main-content > div > div > div.govuk-form-group > ul > li:nth-child(1) > span.hmrc-add-to-a-list__change > a"),
    "second account change"             -> By.cssSelector("#main-content > div > div > div.govuk-form-group > ul > li:nth-child(2) > span.hmrc-add-to-a-list__change > a"),
    "change uk untaxed interest accounts summary" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd.govuk-summary-list__actions > a"),
    "change uk taxed interest accounts summary"  -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions > a"),
    "first" -> By.id("value"),
    "second" -> By.id("value-2"),
    "fourth" -> By.id("value-4"),
    "fifth" -> By.id("value-5"),

    //Employment Elements
    "employment"                      -> By.linkText("Employment"),
    "employment details"              -> By.linkText("Employment details"),
    "benefits"                        -> By.linkText("Benefits"),
    "expenses"                        -> By.linkText("Expenses"),
    "first employer"                  -> By.cssSelector("#main-content > div > div > div:nth-child(4) > ul > li:nth-child(1) > span > a"),
    "return to employment summary"    -> By.id("employmentSummaryBtn"),
    "return to overview"              -> By.id("returnToOverviewPageBtn"),
    "Unclickable employment"          -> By.cssSelector("#main-content > div > div > ol > li:nth-child(1) > ol > li:nth-child(5) > span.app-task-list__task-name"),
    "Unclickable benefits"            -> By.cssSelector("#main-content > div > div > div.govuk-form-group > ul > li:nth-child(2) > span.hmrc-add-to-a-list__identifier.hmrc-add-to-a-list__identifier--light"),
    "Unclickable expenses"            -> By.cssSelector("#main-content > div > div > div.govuk-form-group > ul > li:nth-child(3) > span.hmrc-add-to-a-list__identifier.hmrc-add-to-a-list__identifier--light"),

    //GiftAid Elements
    "GiftAid" -> By.id("giftAid_link"),
    "Amount donated using Gift Aid" -> By.id("amount"),
    "Amount donated as one-off payments" -> By.id("amount"),
    "Amount donated to overseas charities using Gift Aid" -> By.id("amount"),
    "Name of overseas charity" -> By.id("name"),
    "Amount to add to last tax year" -> By.id("amount"),
    "Amount to add to this tax year" -> By.id("amount"),
    "Total value of qualifying shares or securities" -> By.id("amount"),
    "Value of land or property" -> By.id("amount"),
    "Value of qualifying shares, securities, land or property donated to overseas charities" -> By.id("amount"),
    "Name of overseas charity you donated shares, securities, land or property to" -> By.id("name"),
    "Name of overseas charity your client donated shares, securities, land or property to" -> By.id("name"),
    "change amount donated to charity using Gift Aid" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change amount of one-off donations to charity using Gift Aid" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change amount donated to overseas charities using Gift Aid" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(3) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change overseas charities' names" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(4) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change amount of donation to add to last tax year" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(5) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change amount of donation added to this tax year" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(6) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change value of shares or securities" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(7) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change value of land or property" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(8) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change value of shares, securities, land or property" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(9) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change overseas charities you donated shares, securities, land or property to" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(10) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a")
  )
}
