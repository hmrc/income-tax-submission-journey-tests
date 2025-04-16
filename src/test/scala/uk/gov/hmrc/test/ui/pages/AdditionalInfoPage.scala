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

import uk.gov.hmrc.test.ui.conf.TestConfiguration

object AdditionalInfoPage {

  lazy val baseUrl: String = TestConfiguration.url("income-tax-additional-info-frontend")

  def businessReliefsUrl(taxYear: Int): String =
    baseUrl + s"/$taxYear/business-reliefs"

  def postCessationTradeReliefUrl(taxYear: Int): String =
    businessReliefsUrl(taxYear) + "/post-cessation-trade-relief/relief-claimed"

  def nonDeductibleLoanInterestReliefUrl(taxYear: Int): String =
    businessReliefsUrl(taxYear) + "/non-deductible-loan-interest/relief-claimed"

  def qualifyingLoanInterestReliefUrl(taxYear: Int): String =
    businessReliefsUrl(taxYear) + "/qualifying-loan-interest/relief-claimed"

}
