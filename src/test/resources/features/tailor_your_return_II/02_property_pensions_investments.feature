@TYR_private_beta @property_pensions_investments

Feature: Income from Property, Pensions And Investments Tailor Your Return - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User maximal flow - Income from Property, Pensions And Investments - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    ##- complete about you section --##
    Then the user navigates to the Tailor return start page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- Income from work and taxable state benefits steps ----##
    When the user clicks on the Income from work and taxable state benefits link
    Then the user should be redirected to the "What did you do for work?" page
    And the user selects the Employed radio button
    And the user selects the Self-employed radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" page
    When the user selects the Jobseeker's Allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- Rental income steps ----##
    When the user clicks on the Income from property, pensions and investments link
    Then the user should be redirected to the "Rental income from property" page
    When the user selects the UK Property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" page
    When the user selects the State Pension radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" page
    When the user selects the Life Annuity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" page
    When the user selects the Interest from UK trust funds or bonds radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" page
    When the user selects the Cash dividends from UK stocks and shares radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear

  Scenario: Agent User maximal flow - Income from Property, Pensions And Investments - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA123459A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | 1234567890                                                                          |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    Then the user navigates to the Tailor return start page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    ##---- About you steps have to be completed in order for Income from work and taxable state benefits link to be active ----##
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the Not a resident radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Your client’s residence status" page
    When the user selects the My client was not resident in the UK radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the No, my client did not donate to charity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Was your client a foster carer or shared lives carer?" page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    ##---- Income from work and taxable state benefits steps ----##
    When the user clicks on the Income from work and taxable state benefits link
    Then the user should be redirected to the "What did your client do for work?" page
    And the user selects the Employed radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" page
    When the user selects the Contribution-based radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    ##---- Income from property, pensions and investments ----##
    When the user clicks on the Income from property, pensions and investments link
    Then the user should be redirected to the "Rental income from property" page
    When the user selects the UK Property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" page
    When the user selects the State Pension radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" page
    When the user selects the Life Annuity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" page
    When the user selects the Interest from UK trust funds or bonds radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" page
    When the user selects the Cash dividends from UK stocks and shares radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear