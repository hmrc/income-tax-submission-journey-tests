@capital_gains @Tailoring @ignore

  #TODO remove ignore tag when TYR II capital gains Journey navigation is complete
Feature: Capital Gains, Trusts And Estates Tailor Your Return - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User maximal flow - Capital Gains, Trusts And Estates - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    Then the user navigates to the Capital gains page
    Then the user should be redirected to the "Capital Gains" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Trusts, settlements or estates" tailor your return page
    When the user selects the Trusts radio button
    When the user selects the Settlements radio button
    When the user selects the Estates of people who have died radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  @ignore
  Scenario: Agent User maximal flow - Capital Gains, Trusts And Estates - Tailor your return
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
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    Then the user navigates to the Capital gains page
    Then the user should be redirected to the "Capital Gains" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Trusts, settlements or estates" tailor your return page
    When the user selects the Trusts radio button
    When the user selects the Settlements radio button
    When the user selects the Estates of people who have died radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  Scenario: Individual user answers no for all questions - Capital Gains, Trusts And Estates - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    Then the user navigates to the Capital gains page
    Then the user should be redirected to the "Capital Gains" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Trusts, settlements or estates" tailor your return page
    When the user deselects the Trusts radio button
    When the user deselects the Settlements radio button
    When the user deselects the Estates of people who have died radio button
    When the user selects the No income from trusts radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  @ignore
  Scenario: Agent User answers no for all questions - Capital Gains, Trusts And Estates - Tailor your return
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
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    Then the user navigates to the Capital gains page
    Then the user should be redirected to the "Capital Gains" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Trusts, settlements or estates" tailor your return page
    When the user deselects the Trusts radio button
    When the user deselects the Settlements radio button
    When the user deselects the Estates of people who have died radio button
    When the user selects the No income from trusts radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page