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
import org.scalatest.matchers.should.Matchers

trait CommonElements extends BasePage with Matchers {

  def load(key: String): By =
    elements(key)

  val elements: Map[String, By] = Map(
    //Common Elements
    "yes"                       -> By.id("value"),
    "no"                        -> By.id("value-no"),
    "Yes"                       -> By.xpath("//*[contains(text(),'Yes')]"),
    "No"                        -> By.xpath("//*[contains(text(),'No')]"),
    "Continue"                  -> By.xpath("//*[contains(text(),'Continue')]"),
    "save and continue"         -> By.cssSelector("#main-content > div > div > form > button"),
    "continue"                  -> By.id("continue"),
    "confirm"                   -> By.xpath("//*[contains(text(),'Confirm')]"),
    "back"                      -> By.cssSelector("a.govuk-back-link"),
    "remove account"            -> By.cssSelector("#main-content > div > div > div.govuk-form-group > ul > li:nth-child(1) > span.hmrc-add-to-a-list__remove > a"),
    "change"                    -> By.cssSelector("#main-content > div > div > div.govuk-form-group > ul > li > span.hmrc-add-to-a-list__change > a"),
    "return to overview"        -> By.id("returnToOverviewPageBtn"),
    "remove"                    -> By.id("remove"),
    "Yes for gateway question"  -> By.xpath("//dd[contains(text(),'Yes')]"),
    "No for gateway question"   -> By.xpath("//dd[contains(text(),'No')]"),
    "amount"                    -> By.id("amount"),

    //Tailoring Elements
    "addSections"   -> By.id("addSectionsLink"),
    "addDividend"   -> By.id("dividends"),
    "addInterest"   -> By.id("interest"),
    "addGiftAid"    -> By.id("gift-aid"),
    "addEmployment" -> By.id("employment"),
    "addCisSection" -> By.id("cis"),
    "addPension"    -> By.id("pensions"),
    "addGains"      -> By.id("gains"),
    "addProperty"   -> By.id("property"),
    "addSelfEmployment" -> By.id("self-employment"),

    //Dividends Elements
    "dividends"                                                  -> By.id("dividends_link"),
    "UK dividends amount"                                        -> By.id("amount"),
    "UK other dividends amount"                                  -> By.id("amount"),
    "change dividends from the uk summary"                       -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd.govuk-summary-list__actions > a"),
    "change uk dividends amount"                                 -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions > a"),
    "change other dividends amount"                              -> By.cssSelector("#main-content > div > div > dl > div:nth-child(3) > dd.govuk-summary-list__actions > a"),
    "change stock dividends"                                     -> By.cssSelector("#main-content > div > div > dl > div:nth-child(4) > dd.govuk-summary-list__actions > a"),
    "change value of stock dividends"                            -> By.xpath("//*[contains(text(),'Value of stock dividends')]/parent::div/dd[2]"),
    "change value of free or redeemable shares"                  -> By.xpath("//*[contains(text(),'Free or redeemable shares')]/parent::div/dd[2]"),
    "change value of close company loan written off or released" -> By.xpath("//*[contains(text(),'Close company loan written off or released')]/parent::div/dd[2]"),

    //Interest Elements
    "Interest from savings and securities"                  -> By.id("interest_link"),
    "UK Interest"                                           -> By.xpath("//*[contains(text(),'UK Interest')]"),
    "Interest from gilt-edged or accrued income securities" -> By.cssSelector("#main-content > div > div > ol > li:nth-child(2) > span.app-task-list__task-name > a"),
    "UK untaxed interest amount earned"           -> By.id("untaxedAmount"),
    "UK taxed interest amount earned"             -> By.id("taxedAmount"),
    "UK untaxed interest updated amount earned"   -> By.id("amount"),
    "UK taxed interest updated amount earned"     -> By.id("amount"),
    "UK untaxed interest account name"            -> By.id("untaxedAccountName"),
    "UK taxed interest account name"              -> By.id("taxedAccountName"),
    "first account change"                        -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd > ul > li:nth-child(1) > a"),
    "second account change"                       -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd > ul > li:nth-child(1) > a"),
    "change interest from the uk summary"         -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd.govuk-summary-list__actions > a"),
    "change uk untaxed interest accounts summary" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions > a"),
    "change uk taxed interest accounts summary"   -> By.cssSelector("#main-content > div > div > dl > div:nth-child(3) > dd.govuk-summary-list__actions > a"),
    "remove interest"                             -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd > ul > li:nth-child(2) > a"),
    "first"                                       -> By.id("value"),
    "second"                                      -> By.id("value-2"),
    "third"                                       -> By.id("value-3"),
    "fourth"                                      -> By.id("value-4"),
    "fifth"                                       -> By.id("value-5"),

    //Employment Elements
    "employment"                   -> By.id("employment_link"),
    "employment details"           -> By.linkText("Employment details"),
    "view employer"                -> By.cssSelector("#main-content > div > div > dl:nth-of-type(1) > div > dd > a"),
    "benefits"                     -> By.linkText("Benefits"),
    "employment benefits"          -> By.id("employment-benefits_link"),
    "expenses"                     -> By.linkText("Expenses"),
    "view expenses"                -> By.cssSelector("#main-content > div > div > dl:nth-of-type(2) > div > dd > a"),
    "add expenses"                 -> By.id("add-expenses"),
    "change expenses"              -> By.cssSelector("#main-content > div > div > dl:nth-child(10) > div > dd > ul > li:nth-child(1) > a"),
    "view first employer"          -> By.cssSelector("#main-content > div > div > dl:nth-of-type(1) > div:nth-child(1) > dd > a"),
    "change employer"              -> By.cssSelector("#main-content > div > div > dl:nth-child(6) > div > dd > ul > li:nth-child(1) > a"),
    "return to employment summary" -> By.id("returnToEmploymentSummaryBtn"),
    "return to employer"           -> By.id("returnToEmployerBtn"),
    "Clickable employment"         -> By.id("employment_link"),
    "Employer name"                -> By.id("name"),
    "PAYE reference"               -> By.id("payeRef"),
    "Payroll id"                   -> By.id("payrollId"),
    "Day"                          -> By.id("amount-day"),
    "Month"                        -> By.id("amount-month"),
    "Year"                         -> By.id("amount-year"),
    "Start Day"                    -> By.id("startAmount-day"),
    "Start Month"                  -> By.id("startAmount-month"),
    "Start Year"                   -> By.id("startAmount-year"),
    "End Day"                      -> By.id("endAmount-day"),
    "End Month"                    -> By.id("endAmount-month"),
    "End Year"                     -> By.id("endAmount-year"),
    "Pay"                          -> By.id("amount"),
    "Tax"                          -> By.id("amount"),
    "amount"                       -> By.id("amount"),
    "change employment" -> By.cssSelector("#main-content > div > div > dl > div > dd.govuk-summary-list__actions > ul > li:nth-child(1) > a"),
    "first change employment" -> By.cssSelector("#main-content > div > div > dl:nth-child(6) > div:nth-child(1) > dd > ul > li:nth-child(1) > a"),
    "second change employment" -> By.cssSelector("#main-content > div > div > dl:nth-child(6) > div:nth-child(2) > dd > ul > li:nth-child(1) > a"),
    "third change employment" -> By.cssSelector("#main-content > div > div > dl:nth-child(6) > div:nth-child(3) > dd > ul > li:nth-child(1) > a"),
    "change Employer" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "change start date" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "change still working reference" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(3) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "change end date" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(4) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "change PAYE reference" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(5) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "change payroll id" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(6) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "change pay received" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(7) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "change tax taken from pay" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(8) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "Employments list item" -> By.cssSelector("#employer-h2"),
    "Expenses list item" -> By.cssSelector("#expense-h2"),
    "remove employment" -> By.cssSelector("#main-content > div > div > dl:nth-child(6) > div > dd > ul > li:nth-child(2) > a"),
    "third remove employment" -> By.cssSelector("#main-content > div > div > dl:nth-child(6) > div:nth-child(3) > dd > ul > li:nth-child(2) > a"),
    "remove expenses" -> By.cssSelector("#main-content > div > div > dl:nth-child(8) > div > dd > ul > li:nth-child(2) > a"),
    "Remove expenses" -> By.cssSelector("#remove-expenses-button-id"),
    "change expenses section" -> By.cssSelector("#main-content > div > div > div:nth-child(6) > ul > li > span.hmrc-add-to-a-list__change > a"),
    "Add an employer" -> By.xpath("//a[contains(text(),'Add an employer')]"),
    "Add another employer" -> By.linkText("Add another employer"),
    "Remove employer" -> By.id("remove-employer-button-id"),
    "student loans" -> By.id("student-loans_link"),
    "student loan repayments" -> By.cssSelector("#studentLoans"),
    "postgraduate loan repayments" -> By.cssSelector("#studentLoans-2"),
    "no repayments" -> By.cssSelector("#studentLoans-4"),
    "change student loan repayments" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "student loans amount change" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "postgraduate loans amount change" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(3) > dd.govuk-summary-list__actions > a > span:nth-child(1)"),
    "cannot update" -> By.cssSelector("#main-content > div > div > div.govuk-inset-text"),
    "PAYE employment change" -> By.cssSelector("#main-content > div > div > dl:nth-child(3) > div > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a > span:nth-child(1)"),
    "Employment remove confirm" -> By.id("remove-employer-button-id"),
    "Taxable lump sums and certain income" -> By.id("taxable-lump-sums-and-certain-income_link"),
     "Taxable lump sum page" -> By.id("page-heading"),
     "Taxable lump sum button" -> By.id("AddALumpSum"),
     "Taxable lump sum amount page" -> By.id("page-heading"),
     "Taxable lumps su amount" -> By.id("amount"),
     "Taxable lump sum continue button" -> By.id("continue"),
     "Save and continue" -> By.id("saveAndContinueBtn"),

    //GiftAid Elements
    "GiftAid"                                             -> By.id("giftAid_link"),
    "Amount donated using Gift Aid"                       -> By.id("amount"),
    "Amount donated as one-off payments"                  -> By.id("amount"),
    "Amount donated to overseas charities using Gift Aid" -> By.id("amount"),
    "Name of overseas charity"                            -> By.id("name"),
    "Amount to add to last tax year"                      -> By.id("amount"),
    "Amount to add to this tax year"                      -> By.id("amount"),
    "Total value of qualifying shares or securities"      -> By.id("amount"),
    "Value of land or property"                           -> By.id("amount"),
    "Value of qualifying shares, securities, land or property donated to overseas charities"  -> By.id("amount"),
    "Name of overseas charity you donated shares, securities, land or property to"            -> By.id("name"),
    "Name of overseas charity your client donated shares, securities, land or property to"    -> By.id("name"),
    "change donations to charity summary" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change amount donated to charity using Gift Aid" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change amount of one-off donations to charity using Gift Aid" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(3) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change amount donated to overseas charities by using Gift Aid" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(4) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change overseas charities names" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(5) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change amount of donation to add to last tax year" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(6) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change amount of donation added to this tax year" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(7) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change value of shares or securities" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(8) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change value of land or property" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(9) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change value of shares, securities, land or property" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(10) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change overseas charities shares, securities, land or property were donated to" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(11) > dd.govuk-summary-list__actions.govuk-\\!-width-one-third > a"),
    "change charity name" -> By.cssSelector("#main-content > div > div > div.govuk-form-group > ul > li:nth-child(1) > span.hmrc-add-to-a-list__change > a"),

    //Crystallisation Elements
    "I agree - Submit Income Tax Return" -> By.cssSelector("#agree"),
    "Client SA UTR"                      -> By.id("utr"),
    "View and Change Continue"           -> By.id("continue-button"),

    //Construction Industry Scheme Elements
    "cis deductions"             -> By.id("cis_link"),
    "first contractor"           -> By.cssSelector("tbody > tr.govuk-table__row:nth-child(1) > th > a"),
    "second contractor"          -> By.cssSelector("tbody > tr.govuk-table__row:nth-child(2) > th > a"),
    "third contractor"           -> By.cssSelector("tbody > tr.govuk-table__row:nth-child(3) > th > a"),
    "cis return to overview"     -> By.id("return-to-overview-button-id"),
    "first month view"           -> By.cssSelector("#main-content > div > div > dl > div > dd > a"),
    "second month view"          -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd > a"),
    "return to cis summary"      -> By.id("return-to-summary-button-id"),
    "return to contractor"       -> By.id("return-to-contractor-button-id"),
    "first month change"         -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd:nth-child(2) > a"),
    "first month remove"         -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dd:nth-child(3) > a"),
    "change end of tax month"    -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd:nth-child(3) > a"),
    "change labour"              -> By.cssSelector("#main-content > div > div > dl > div:nth-child(3) > dd:nth-child(3) > a"),
    "change cis deduction"       -> By.cssSelector("#main-content > div > div > dl > div:nth-child(4) > dd:nth-child(3) > a"),
    "change paid for materials"  -> By.cssSelector("#main-content > div > div > dl > div:nth-child(5) > dd:nth-child(3) > a"),
    "change cost of materials"   -> By.cssSelector("#main-content > div > div > dl > div:nth-child(6) > dd:nth-child(3) > a"),
    "Add another contractor"     -> By.id("add-contractor"),
    "Contractor name"            -> By.id("contractorName"),
    "Employer Reference Number"  -> By.id("employerReferenceNumber"),
    "Add another CIS deduction"  -> By.id("add-another-link"),
    "Add a CIS deduction"        -> By.id("add-link"),
    "Tax month ending"           -> By.id("month"),
    "Add a contractor"           -> By.id("add-contractor"),
    "CIS save and continue"      -> By.id("save-and-continue-button-id"),
    "Remove period"              -> By.id("remove-period-button-id"),
    "CIS deductions change"      -> By.xpath("//*[@id=\"main-content\"]/div/div/dl/div/dd[2]/a/span[1]"), //("//dt[contains(text,'')]/../dd[2]/a/span[1]"),
    "CIS You cannot update text" -> By.cssSelector("#main-content > div > div > div.govuk-inset-text"),
    "Updated for Cis"            -> By.xpath("//*[contains(text(),'Updated')]/../../span/a[@id='cis_link']"),
    "Cannot Update for Cis"      -> By.xpath("//*[contains(text(),'Cannot update')]/../../span/a[@id='cis_link']"),

    //State Benefits Elements
   // "State benefits"                          -> By.id("stateBenefits_link"),
    "State benefits"                          -> By.cssSelector("#stateBenefits_link"),
    "Jobseeker’s Allowance"                   -> By.id("jobSeekersAllowance_link"),
    "Add missing claim"                       -> By.id("add-missing-claim-button-id"),
    "claim day"                               -> By.id("value-for-day"),
    "claim month"                             -> By.id("value-for-month"),
    "claim year"                              -> By.id("value-for-year"),
    "remove claim"                            -> By.id("remove-link-id"),
    "Remove claim"                            -> By.id("remove-claim-button-id"),
    "Restore claim"                           -> By.id("restore-claim-button-id"),
    "first view"                              -> By.cssSelector("#benefits-summary-list-id > div:nth-child(1) > dd:nth-child(3) > a:nth-child(1)"),
    "first ignored view"                      -> By.cssSelector("#ignored-benefits-summary-list-id > div:nth-child(1) > dd:nth-child(3) > a:nth-child(1)"),
    "first view in year"                      -> By.cssSelector("div.govuk-summary-list__row:nth-child(1) > dd:nth-child(2) > a:nth-child(1)"),
    "state benefit change start date"         -> By.cssSelector("div.govuk-summary-list__row:nth-child(1) > dd:nth-child(3) > a:nth-child(1) > span:nth-child(1)"),
    "state benefit change end date question"  -> By.cssSelector("div.govuk-summary-list__row:nth-child(2) > dd:nth-child(3) > a:nth-child(1) > span:nth-child(1)"),
    "state benefit change end date"           -> By.cssSelector("div.govuk-summary-list__row:nth-child(3) > dd:nth-child(3) > a:nth-child(1) > span:nth-child(1)"),
    "state benefit change tax taken question" -> By.cssSelector("div.govuk-summary-list__row:nth-child(4) > dd:nth-child(3) > a:nth-child(1) > span:nth-child(1)"),
    "state benefit change amount"             -> By.cssSelector("div.govuk-summary-list__row:nth-child(5) > dd:nth-child(3) > a:nth-child(1) > span:nth-child(1)"),
    "state benefit save and continue"         -> By.id("save-and-continue-button-id"),
    "state benefit back"                      -> By.id("back-link"),
    "Employment and Support Allowance"        -> By.id("employmentSupportAllowance_link"),
    "The date you started getting Jobseeker’s Allowance must include a day" -> By.id("value-for-error"),
    "The date you started getting Jobseeker’s Allowance must include a month"   -> By.id("emptyMonth-error"),
    "The date you started getting Jobseeker’s Allowance must include a year" -> By.id("emptyYear-error"),

    //View Estimation Elements
    "Update tax calculation"   -> By.id("updateTaxCalculation"),
    "Go to Income Tax Account" -> By.id("continue-button"),

    //Pensions Elements
    "pensions" -> By.id("pensions_link"),
    "Payments into pensions" -> By.id("payments-into-pensions-link"),
    "Unauthorised payments from pensions" -> By.id("unauthorised-payments-from-pensions-link"),
    "Yes, unauthorised payments that resulted in a surcharge" -> By.id("unauthorisedPayments"),
    "Yes, unauthorised payments that did not result in a surcharge" -> By.id("unauthorisedPayments-2"),
    "No unauthorised payments" -> By.id("unauthorisedPayments-4"),
    "amount in pounds" -> By.id("amount-2"),
    "PSTR" -> By.id("taxReferenceId"),
    "yes on" -> By.id("value-yes"),
    "Add another Pensions Scheme Tax Reference" -> By.id("add-another-pension-link"),
    "Change PSTR" -> By.cssSelector("#pensionIncomeSummaryList > dl > div:nth-child(1) > dd.hmrc-add-to-a-list__change > a"),
    "Remove PSTR" -> By.cssSelector("#pensionIncomeSummaryList > dl > div:nth-child(1) > dd.hmrc-add-to-a-list__remove > a"),
    "Remove Reference" -> By.id("remove-pension-button-id"),
    "Overseas pensions" -> By.id("overseas-pensions-summary-link"),
    "Income from overseas pensions" -> By.id("income-from-overseas-pensions-link"),
    "Country" -> By.id("countryId"),
    "Country List" -> By.id("countryId__listbox"),
    "amount before tax" -> By.id("amount-1"),
    "tax paid" -> By.id("amount-2"),
    "amount in pounds" -> By.id("amount-2"),
    "pensions scheme save and continue" -> By.id("continue"),
    "add another pension scheme" -> By.id("add-another-pension-link"),
    "Name of pension scheme" -> By.id("providerName"),
    "Pension Scheme Tax Reference" -> By.id("schemeReference"),
    "Pension provider address" -> By.id("providerAddress"),
    "Remove pension scheme" -> By.cssSelector("#pensionTransferSummaryList > dl > div > dd.hmrc-add-to-a-list__remove > a > span:nth-child(1)"),
    "Remove Scheme" -> By.id("remove-pension-button-id"),
    "Add a scheme" -> By.id("AddAScheme"),
    "Change scheme" -> By.cssSelector("#pensionTransferSummaryList > dl > div > dd.hmrc-add-to-a-list__change > a > span:nth-child(1)"),
    "Overseas transfer charges" -> By.id("overseas-transfer-charges-link"),
    "Pension lifetime allowance" -> By.id("pension-lifetime-allowance-link"),
    "Adding another Pensions Scheme Tax Reference" -> By.id("add-another-link"),
    "Pension annual allowance" -> By.id("pension-annual-allowance-link"),
    "Money purchase annual allowance" -> By.id("reducedAnnualAllowanceType"),
    "Tapered annual allowance" -> By.id("reducedAnnualAllowanceType-2"),
    "Remove allowance scheme"  -> By.cssSelector("div > dl > div:nth-child(1) > dd.hmrc-add-to-a-list__remove > a"),
    "Change allowance scheme" -> By.cssSelector("div > dl > div:nth-child(1) > dd.hmrc-add-to-a-list__change > a"),
    "Short service refunds" -> By.id("short-service-refunds-link"),
    "Income from pensions" -> By.id("income-from-pensions-link"),
    "State pension" -> By.id("state-pensions-link"),
    "pension day" -> By.id("day"),
    "pension month" -> By.id("month"),
    "pension year" -> By.id("year"),
    "Other UK Pensions" -> By.id("other-uk-pensions-link"),
    "Pension Identification" -> By.id("pensionId"),

    //Gains Elements
    "Gains from policies and contracts" -> By.id("gains_link"),
    "Life Insurance"                    -> By.cssSelector("[value='lifeInsurance']"),
    "Full or part surrender"            -> By.cssSelector("[value='Full or part surrender']"),
    "Other"                             -> By.id("other-text"),
    "Sale or assignment of a policy"    -> By.id("policy-event-3"),
    "What caused this gain?"            -> By.id("other-text-input"),
    "Policy number"                     -> By.id("value"),
    "Gains Year"                        -> By.id("year"),
    "Policy remove"                     -> By.id("policy-remove"),
    "Updated Tag"                       -> By.xpath("//*[contains(text(),'Updated')]/../../span/a[@id='gains_link']"),
    "Add a policy"                      -> By.id("continue"),
    "Excluded for Gains"                -> By.xpath("//*[contains(text(),'Excluded')]/../../span/a[@id='gains_link']"),
    "Voided ISA"                        -> By.cssSelector("[value='voidedIsa']"),

    //About You
    "About you"                                                   -> By.id("task-list__task-link--aboutYou"),
    "I was not resident in the UK"                                -> By.cssSelector("[value='WasNot']"),
    "I was a dual resident in the UK and another country"         -> By.cssSelector("[value='Was']"),
    "No, my client did not donate to charity"                     -> By.id("CharitableDonations-5"),
    "My income"                                                   -> By.cssSelector("[value='selfIncome']"),
    "Tax avoidance"                                               -> By.cssSelector("[value='taxAvoidance']"),
    "No, my client was not in any tax avoidance schemes"          -> By.id("TaxAvoidance-4"),
    "My partner’s income"                                 -> By.cssSelector("[value='MyPartnersIncome']"),
    "I do not have a partner"                             -> By.cssSelector("[value='NoPartner']"),
    "Donations using Gift Aid"                            -> By.id("CharitableDonations"),
    "yes, but permanent home is abroad"                   -> By.cssSelector("[value='domiciled']"),
    "Not a resident"                                      -> By.cssSelector("[value='nonUK']"),
    "My client was not resident in the UK"                -> By.cssSelector("[value='nonResident']"),
    "No residency"                                        -> By.cssSelector("[value='nonUK']"),

    //About Your Work
    "Employed"                                         -> By.cssSelector("[value='Employed']"),
    "Self-employed"                                    -> By.cssSelector("[value='SelfEmployed']"),
    "Jobseeker's Allowance"                            -> By.cssSelector("[value='JobseekersAllowance']"),
    "Member of Parliament"                             -> By.cssSelector("[value='MemberOfParliament']"),
    "None of the above"                                -> By.cssSelector("[value='NoneOfTheAbove']"),
    "No, I did not get either of these state benefits" -> By.cssSelector("[value='DidNotGetStateBenefits']"),
    "Contribution-based"                               -> By.cssSelector("[value='ContributionBasedEmploymentAndSupportAllowance']"),
    "Partnership"                                      -> By.cssSelector("[value='Partnership']"),
    "Hidden message"                                   -> By.cssSelector("[class='govuk-body govuk-!-padding-2']"),
    "yes, but permanent home is abroad"                -> By.id("value_1"),
    "checkboxes"                                       ->By.cssSelector("[class='govuk-checkboxes__input']"),

    // Property UK
    "Property"                 -> By.id("property_link"),
    "About your UK Properties" -> By.cssSelector("#main-content > div > div > h1"),
    "About your UK Properties About" -> By.id("about_uk_properties_link"),
    "UK Property details" -> By.cssSelector("#main-content > div > div > h1"),
    "property continue" -> By.cssSelector("#main-content > div > div > form > button"),
    "How much total income did you get from your UK properties?" -> By.cssSelector("#main-content > div > div > form > div > fieldset > legend > h1"),
    "first property" -> By.id("value_0"),
    "second property" -> By.id("value_1"),
    "How much total income did your client get from all of their properties?" -> By.cssSelector("#main-content > div > div > form > div > fieldset > legend > h1"),
    "UK property" -> By.cssSelector("#main-content > div > div > form > h1"),
    "Property Rentals" -> By.id("value_0"),
    "UK Property continue" -> By.cssSelector("#main-content > div > div > form > button"),
    "Check Your Answers" -> By.cssSelector("#main-content > div > div > h1"),
    "Check Your Answers continue" -> By.cssSelector("#main-content > div > div > a"),
    "Property rentals about" -> By.id ("about_link"),//("about_rentals_link"),
    "Property rentals" -> By.cssSelector("#main-content > div > div > h1"),
    "Expenses less than £1,000" -> By.cssSelector("#main-content > div > div > h1"),
    "Property rentals Yes" -> By.id("value"),
    "Property rentals No"-> By.id("value-no"),
    "Do you want to claim property income allowance?" -> By.cssSelector("#main-content > div > div > form > div > fieldset > legend > h1"),
    "Does your client want to claim property income allowance?" -> By.cssSelector("#main-content > div > div > form > div > fieldset > legend"),
    "Yes, claim property income allowance" -> By.id("value"),
    "No, claim expenses" -> By.id("value-no"),
    "Check Your Answers"-> By.cssSelector("#main-content > div > div > h1"),
    "Are your total expenses less than £1,000?" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(1) > dt"),
    "Would you like to claim property income allowance?" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dt"),
    "Change" -> By.cssSelector("#main-content > div > div > dl > div:nth-child(2) > dd.govuk-summary-list__actions > a"),
    "Income" -> By.id  ("income_link"),
    "Property Income" -> By.cssSelector("#main-content > div > div > h1"),
    "Non-UK resident landlord" -> By.cssSelector("#main-content > div > div > h1"),
    "Yes" -> By.id("value"),
    "No" -> By.id("value-no"),
    "Deducting Tax from non-UK landlords" -> By.cssSelector ("#main-content > div > div > form > h1"),//("#main-content > div > div > form > div > fieldset > legend > h1"),
    "Tax deducted Yes" -> By.id("deductingTax"),
    "Tax deducted No" -> By.id("deductingTax-no"),
    "Tax Deducted Amount" -> By.id("taxDeductedAmount"),
    "Income from Property Rentals" -> By.cssSelector("#main-content > div > div > form > h2"),
    "How much total income did you recieve from from all of your property rentals?" -> By.cssSelector("#main-content > div > div > form > h3"),
    "Property rental amount" -> By.id("incomeFromPropertyRentals"),
    "Premiums for the grant of a lease" -> By.cssSelector("#main-content > div > div > h1"),
    "Have you calculated the figure yourself?" -> By.cssSelector("#main-content > div > div > form > div > fieldset > legend > h1"),
    "Yes,calculated amount" -> By.id("calculatedFigureYourselfAmount"),
    "Yes,calculated" -> By.id("calculatedFigureYourself"),
    "No,calculated" -> By.id("calculatedFigureYourself-no"),
    "How much did you receive for the grant of a lease?" -> By.cssSelector("#main-content > div > div > form > div > h1 > label"),
    "grant lease amount" -> By.id("value"),
    "How many complete 12 month periods were in the term of the lease?" -> By.cssSelector("#main-content > div > div > form > div > h1 > label"),
    "month period" -> By.id("value"),
    "Premiums for a grant of a lease" -> By.cssSelector("#main-content > div > div > h1"),
    "premium amount"-> By.id("PremiumPayment"),
    "Reverse premiums received" -> By.cssSelector("#main-content > div > div > h1"),
    "premium recieved amount"-> By.id("reversePremiumsReceivedAmount"),
    "Yes,premiums recieved" -> By.id("reversePremiumsReceived"),
    "No,premiums recieved" -> By.id("reversePremiumsReceived-no"),
    "Other income from property" -> By.cssSelector("#main-content > div > div > form > h1"),
    "Other income amount" -> By.id("amount"),
    "Check Your Answers" -> By.cssSelector("#main-content > div > div > h1"),
    "Adjusments" -> By.id("adjustments_link"),

    // Property, Pensions And Investments
    "UK Property"                                                          -> By.cssSelector("[value='UkProperty']"),
    "Non UK Property"                                                      -> By.cssSelector("[value='NonukProperty']"),
    "No income from property"                                              -> By.cssSelector("[value='NoRentalIncome']"),
    "State Pension"                                                        -> By.cssSelector("[value='StatePension']"),
    "Non UK pensions"                                                      -> By.cssSelector("[value='NonUkPensions']"),
    "No income from pensions"                                              -> By.cssSelector("[value='NoIncomePensions']"),
    "No UK insurance gains"                                                -> By.cssSelector("[value='NoGains']"),
    "Interest from UK banks and building societies"                        -> By.cssSelector("[value='InterestFromUkBanksAndBuildingSocieties']"),
    "Interest from UK trust funds or bonds"                                -> By.cssSelector("[value='InterestFromUkTrustFundsOrBonds']"),
    "No income from UK interest"                                           -> By.cssSelector("[value='NoInterestIncome']"),
    "Cash dividends from UK stocks and shares"                             -> By.cssSelector("[value='CashDividendsFromUkStocksAndShares']"),
    "Free or redeemable shares"                                            -> By.cssSelector("[value='FreeOrRedeemableShares']"),
    "No UK dividends, shares or loans"                                     -> By.cssSelector("[value='NoUkDividendsSharesLoans']"),
    "Non-UK interest"                                                      -> By.cssSelector("[value='NonukInterest']"),
    "Non-UK dividends while living in the UK"                              -> By.cssSelector("[value='NonukDividendsWhileLivingInTheUk]"),
    "No non-UK interest, dividends or income from insurance policies"      -> By.cssSelector("[value='NoNonUkInterestDividendsInsurance']"),
    "Life Annuity"                                                         -> By.cssSelector("[value='LifeAnnuity']"),
    "No UK insurance gains"                                                -> By.cssSelector("[value='NoGains']"),
  
    // Capital gains
    "Trusts"                            -> By.cssSelector("[value='Trusts']"),
    "Settlements"                       -> By.cssSelector("[value='Settlements']"),
    "Estates of people who have died"   -> By.cssSelector("[value='Estates']"),
    "No income from trusts"             -> By.cssSelector("value='NoIncome'"),

    //Self Employment
    "Self Employment" ->By.id("selfEmployment_link"),
    "Review self-employments" -> By.cssSelector("#main-content > div > div > div.task-list > ul > li > span > a"),
    "View Self Employment" -> By.cssSelector("#main-content > div > div > dl > div > dd.govuk-summary-list__actions > a"),
    "Self Employment Save and continue" -> By.id("continue")
  )
}
