@TYR_Payment_Into_Pensions @TYR_Common_Task_List @TYR_private_beta

Feature: Payment Into Pensions Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Pensions - Payment into UK pensions
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567000  |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- About you steps have to be completed in order for Income from work and taxable state benefits link to be active ----##
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    When the user selects the Gifts of shares or securities radio button
    When the user selects the Gifts of land or property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- Income from work and taxable state benefits steps ----##
    When the user clicks on the Income from work and taxable state benefits link
    Then the user should be redirected to the "About your work" page
    And the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" page
    When the user selects the Jobseeker's Allowance radio button
    When the user selects the Contribution-based Employment and Support Allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
   ##---- Income from property, pensions and investments steps ----##
    When the user clicks on the Income from property, pensions and investments link
    Then the user should be redirected to the "Rental income from property" page
    When the user selects the UK Property radio button
    When the user selects the Non UK Property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" page
    When the user selects the State Pension radio button
    When the user selects the Non UK pensions radio button
    When the user selects the Other UK pensions (occupational and private) radio button
    When the user selects the Unauthorised payments from pension schemes radio button
    When the user selects the Short service refunds from pensions radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" page
    When the user selects the Life Insurance radio button
    When the user selects the Life Annuity radio button
    When the user selects the Voided ISA (a policy cancelled by your ISA manager) radio button
    When the user selects the Capital Redemption radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" page
    When the user selects the Interest from UK trust funds or bonds radio button
    When the user selects the Interest from UK banks and building societies radio button
    When the user selects the Interest from gilt-edged or accrued income securities1 radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" page
    When the user selects the Cash dividends from UK stocks and shares radio button
    When the user selects the Stock dividends from UK companies radio button
    When the user selects the Dividends from unit trusts or investment companies radio button
    When the user selects the Free or redeemable shares radio button
    When the user selects the Close company loans written off or released radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
  ##---- Payments into UK pensions steps ----##
    When the user clicks on the Payments into UK pensions task list link
    Then the user should be redirected to the "Payments into pensions" page
    When the user selects the Payments into UK pensions radio button
    When the user selects the Payments into non-UK pensions radio button
    When the user selects the Annual allowances radio button
    When the user selects the Overseas transfer charges radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Payments into UK pensions1 link
    Then the user should be redirected to the "Relief at source (RAS) pensions" page


  Scenario: Individual User - Pensions - Annual allowances
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567000  |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- About you steps have to be completed in order for Income from work and taxable state benefits link to be active ----##
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    When the user selects the Gifts of shares or securities radio button
    When the user selects the Gifts of land or property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- Income from work and taxable state benefits steps ----##
    When the user clicks on the Income from work and taxable state benefits link
    Then the user should be redirected to the "About your work" page
    And the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" page
    When the user selects the Jobseeker's Allowance radio button
    When the user selects the Contribution-based Employment and Support Allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
   ##---- Income from property, pensions and investments steps ----##
    When the user clicks on the Income from property, pensions and investments link
    Then the user should be redirected to the "Rental income from property" page
    When the user selects the UK Property radio button
    When the user selects the Non UK Property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" page
    When the user selects the State Pension radio button
    When the user selects the Non UK pensions radio button
    When the user selects the Other UK pensions (occupational and private) radio button
    When the user selects the Unauthorised payments from pension schemes radio button
    When the user selects the Short service refunds from pensions radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" page
    When the user selects the Life Insurance radio button
    When the user selects the Life Annuity radio button
    When the user selects the Voided ISA (a policy cancelled by your ISA manager) radio button
    When the user selects the Capital Redemption radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" page
    When the user selects the Interest from UK trust funds or bonds radio button
    When the user selects the Interest from UK banks and building societies radio button
    When the user selects the Interest from gilt-edged or accrued income securities1 radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" page
    When the user selects the Cash dividends from UK stocks and shares radio button
    When the user selects the Stock dividends from UK companies radio button
    When the user selects the Dividends from unit trusts or investment companies radio button
    When the user selects the Free or redeemable shares radio button
    When the user selects the Close company loans written off or released radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
  ##---- Payments into UK pensions steps ----##
    When the user clicks on the Payments into UK pensions task list link
    Then the user should be redirected to the "Payments into pensions" page
    When the user selects the Payments into UK pensions radio button
    When the user selects the Payments into non-UK pensions radio button
    When the user selects the Annual allowances radio button
    When the user selects the Overseas transfer charges radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Annual allowances1 link
    Then the user should be redirected to the "Do you have a reduced annual allowance?" page


  Scenario: Individual User - Pensions - Payments into non-UK pensions
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567000  |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- About you steps have to be completed in order for Income from work and taxable state benefits link to be active ----##
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    When the user selects the Gifts of shares or securities radio button
    When the user selects the Gifts of land or property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- Income from work and taxable state benefits steps ----##
    When the user clicks on the Income from work and taxable state benefits link
    Then the user should be redirected to the "About your work" page
    And the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" page
    When the user selects the Jobseeker's Allowance radio button
    When the user selects the Contribution-based Employment and Support Allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
   ##---- Income from property, pensions and investments steps ----##
    When the user clicks on the Income from property, pensions and investments link
    Then the user should be redirected to the "Rental income from property" page
    When the user selects the UK Property radio button
    When the user selects the Non UK Property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" page
    When the user selects the State Pension radio button
    When the user selects the Non UK pensions radio button
    When the user selects the Other UK pensions (occupational and private) radio button
    When the user selects the Unauthorised payments from pension schemes radio button
    When the user selects the Short service refunds from pensions radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" page
    When the user selects the Life Insurance radio button
    When the user selects the Life Annuity radio button
    When the user selects the Voided ISA (a policy cancelled by your ISA manager) radio button
    When the user selects the Capital Redemption radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" page
    When the user selects the Interest from UK trust funds or bonds radio button
    When the user selects the Interest from UK banks and building societies radio button
    When the user selects the Interest from gilt-edged or accrued income securities1 radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" page
    When the user selects the Cash dividends from UK stocks and shares radio button
    When the user selects the Stock dividends from UK companies radio button
    When the user selects the Dividends from unit trusts or investment companies radio button
    When the user selects the Free or redeemable shares radio button
    When the user selects the Close company loans written off or released radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
  ##---- Payments into UK pensions steps ----##
    When the user clicks on the Payments into UK pensions task list link
    Then the user should be redirected to the "Payments into pensions" page
    When the user selects the Payments into UK pensions radio button
    When the user selects the Payments into non-UK pensions radio button
    When the user selects the Annual allowances radio button
    When the user selects the Overseas transfer charges radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Payments into overseas pensions link
    Then the user should be redirected to the "Pensions" page


  Scenario: Individual User - Pensions - Overseas transfer charges
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567000  |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- About you steps have to be completed in order for Income from work and taxable state benefits link to be active ----##
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    When the user selects the Gifts of shares or securities radio button
    When the user selects the Gifts of land or property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- Income from work and taxable state benefits steps ----##
    When the user clicks on the Income from work and taxable state benefits link
    Then the user should be redirected to the "About your work" page
    And the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" page
    When the user selects the Jobseeker's Allowance radio button
    When the user selects the Contribution-based Employment and Support Allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
   ##---- Income from property, pensions and investments steps ----##
    When the user clicks on the Income from property, pensions and investments link
    Then the user should be redirected to the "Rental income from property" page
    When the user selects the UK Property radio button
    When the user selects the Non UK Property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" page
    When the user selects the State Pension radio button
    When the user selects the Non UK pensions radio button
    When the user selects the Other UK pensions (occupational and private) radio button
    When the user selects the Unauthorised payments from pension schemes radio button
    When the user selects the Short service refunds from pensions radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" page
    When the user selects the Life Insurance radio button
    When the user selects the Life Annuity radio button
    When the user selects the Voided ISA (a policy cancelled by your ISA manager) radio button
    When the user selects the Capital Redemption radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" page
    When the user selects the Interest from UK trust funds or bonds radio button
    When the user selects the Interest from UK banks and building societies radio button
    When the user selects the Interest from gilt-edged or accrued income securities1 radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" page
    When the user selects the Cash dividends from UK stocks and shares radio button
    When the user selects the Stock dividends from UK companies radio button
    When the user selects the Dividends from unit trusts or investment companies radio button
    When the user selects the Free or redeemable shares radio button
    When the user selects the Close company loans written off or released radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
  ##---- Payments into UK pensions steps ----##
    When the user clicks on the Payments into UK pensions task list link
    Then the user should be redirected to the "Payments into pensions" page
    When the user selects the Payments into UK pensions radio button
    When the user selects the Payments into non-UK pensions radio button
    When the user selects the Annual allowances radio button
    When the user selects the Overseas transfer charges radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Overseas transfer charge1 link
    Then the user should be redirected to the "Did you transfer pension savings into an overseas pension scheme?" page