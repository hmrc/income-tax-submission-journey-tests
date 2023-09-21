@MVP @Tailoring @property_pensions_investments @ignore

  #TODO remove ignore tag when TYR II Property,Pensions and investments Journey navigation is complete
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
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    Then the user navigates to the Rental income page
    Then the user should be redirected to the "Rental income from property" tailor your return page
    When the user selects the UK Property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" tailor your return page
    When the user selects the State Pension radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" tailor your return page
    When the user selects the Life Annuity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" tailor your return page
    When the user selects the Interest from UK trust funds or bonds radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" tailor your return page
    When the user selects the Cash dividends from UK stocks and shares radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Non-UK interest, dividends and insurance policies" tailor your return page
    When the user selects the Non-UK interest radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  @ignore
  Scenario: Agent User maximal flow - Income from Property, Pensions And Investments - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567893 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567893                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    Then the user navigates to the Rental income page
    Then the user should be redirected to the "Rental income from property" tailor your return page
    When the user selects the UK Property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" tailor your return page
    When the user selects the State Pension radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" tailor your return page
    When the user selects the Life Annuity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" tailor your return page
    When the user selects the Interest from UK trust funds or bonds radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" tailor your return page
    When the user selects the Cash dividends from UK stocks and shares radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Non-UK interest, dividends and insurance policies" tailor your return page
    When the user selects the Non-UK interest radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page


  Scenario: Individual user answers no for all questions - Income from Property, Pensions And Investments - Tailor your return
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
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    Then the user navigates to the Rental income page
    Then the user should be redirected to the "Rental income from property" tailor your return page
    When the user selects the No income from property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" tailor your return page
    When the user selects the No income from pensions radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" tailor your return page
    When the user selects the No UK insurance gains radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" tailor your return page
    When the user selects the No income from UK interest radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" tailor your return page
    When the user selects the No UK dividends, shares or loans radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Non-UK interest, dividends and insurance policies" tailor your return page
    When the user selects the No non-UK interest, dividends or income from insurance policies radio button
    And the user clicks the Continue button
    # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  @ignore
  Scenario: Agent User answers no for all questions - Income from Property, Pensions And Investments - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567893 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567893                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    Then the user navigates to the Rental income page
    Then the user should be redirected to the "Rental income from property" tailor your return page
    When the user selects the No income from property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" tailor your return page
    When the user selects the No income from pensions radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" tailor your return page
    When the user selects the No UK insurance gains radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" tailor your return page
    When the user selects the No income from UK interest radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" tailor your return page
    When the user selects the No UK dividends, shares or loans radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Non-UK interest, dividends and insurance policies" tailor your return page
    When the user selects the No non-UK interest, dividends or income from insurance policies radio button
    And the user clicks the Continue button
    # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  @ignore #add test when user story 5345 is complete
  Scenario: Individual user answers non UK resident  - Income from Property, Pensions And Investments - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123478A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    Then the user navigates to the UK residence status page
    Then the user should be redirected to the "UK residence status" tailor your return page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Your residence status" tailor your return page
    When the user selects the I was a dual resident in the UK and another country radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" tailor your return page
    When the user selects the No, I did not donate to charity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Marriage Allowance" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you, your partner or someone else get Child Benefit for a child living with you?" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you make any patent royalty payments?" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax avoidance schemes" tailor your return page
    When the user selects the No, I was not in any tax avoidance schemes radio button
    And the user clicks the Continue button
    #Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

    Then the user navigates to the Rental income page
    Then the user should be redirected to the "Rental income from property" tailor your return page
    When the user selects the No income from property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" tailor your return page
    When the user selects the No income from pensions radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" tailor your return page
    When the user selects the No UK insurance gains radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" tailor your return page
    When the user selects the No income from UK interest radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" tailor your return page
    When the user selects the No UK dividends, shares or loans radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Non-UK interest, dividends and insurance policies" tailor your return page
    When the user selects the No non-UK interest, dividends or income from insurance policies radio button
    #Then the Non UK residence message is displayed
    And the user clicks the Continue button
    #Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page