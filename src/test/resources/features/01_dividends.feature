@MVP @ZAP @dividends

Feature: Dividends Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page


  Scenario: Maximal flow - Agent User - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2023/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567890    |
      |Credential Strength|weak                                                                                 |
      |Confidence Level   |200                                                                                  |
      |Affinity Group     |Agent                                                                                |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                          |
      |Identifier Name 1  |MTDITID                                                                              |
      |Identifier Value 1 |1234567890                                                                           |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                        |
      |Identifier Name 2  |AgentReferenceNumber                                                                 |
      |Identifier Value 2 |XARN1234567                                                                          |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addDividend tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Did your client get dividends from shares?" page
    When the user selects the yes radio button
    And the user clicks the continue button
  Then the user should be redirected to the "Did your client get dividends from UK-based companies?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client get in dividends from UK-based companies?" page
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get dividends from UK-based trusts or open-ended investment companies?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client get in dividends from trusts and open-ended investment companies based in the UK?" page
    When the user selects the UK other dividends amount field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s income from dividends" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Returning flow - Individual User with prior UK Dividends & Other Dividends, Review & change - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/2023/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA000001A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567892                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Check your income from dividends" page
    When the user clicks on the change uk dividends amount link
    Then the user should be redirected to the "How much did you get in dividends from UK-based companies?" page
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your income from dividends" page
    When the user clicks on the change other dividends amount link
    Then the user should be redirected to the "Did you get dividends from shares" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in dividends from trusts and open-ended investment companies based in the UK?" page
    When the user selects the UK other dividends amount field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Check your income from dividends" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page
#    And the user should see the correct Income Tax Account for individuals url

  Scenario: Returning flow - Agent User with prior UK Dividends & Other Dividends, Review & Change - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2023/additional-parameters?ClientNino=AA000003A&ClientMTDID=1234567893  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |200                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |1234567893                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN1234567                                                                        |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Check your client’s income from dividends" page
    When the user clicks on the change dividends from the uk summary link
    Then the user should be redirected to the "Did your client get dividends from shares?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s income from dividends" page
    When the user clicks on the change uk dividends amount link
    Then the user should be redirected to the "How much did your client get in dividends from UK-based companies?" page
    And the user selects the UK dividends amount field and enters a value of 2000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s income from dividends" page
    When the user clicks on the change other dividends amount link
    Then the user should be redirected to the "How much did your client get in dividends from trusts and open-ended investment companies based in the UK?" page
    And the user selects the UK other dividends amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s income from dividends" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
#   And the user should see the correct Income Tax Account for agents url

    Scenario: Individual User with No Prior Dividend Data adds Dividend in tailoring but then states they did not receive Dividend income
        When the user logs into the service with the following details
          |Redirect url       |/2023/start                                          |
          |Credential Strength|strong                                               |
          |Confidence Level   |200                                                  |
          |Affinity Group     |Individual                                           |
          |Nino               |AA123456A                                            |
          |Enrolment Key 1    |HMRC-MTD-IT                                          |
          |Identifier Name 1  |MTDITID                                              |
          |Identifier Value 1 |1234567890                                           |
        Then the user should be redirected to the "Update and submit an Income Tax Return" page
        When the user clicks the continue button
        Then the user should be redirected to the "Your Income Tax Return" page
        When the user clicks on the addSections link
        Then the user should be redirected to the "Add sections to your Income Tax Return" page
        When the user clicks the addDividend tailoring option
        And the user clicks the continue button
        Then the user should be redirected to the "Your Income Tax Return" page
        When the user clicks on the dividends link
        Then the user should be redirected to the "Did you get dividends from shares?" page
        When the user selects the no radio button
        And the user clicks the continue button
        Then the user should be redirected to the "Check your income from dividends" page
        When the user clicks the save and continue button
        Then the user should be redirected to the "Your Income Tax Return" page

    Scenario: Agent User with Prior Dividend Data states their client did not receive dividend income
        When the user logs into the service with the following details
          |Redirect url       |/test-only/2023/additional-parameters?ClientNino=AA000003A&ClientMTDID=1234567893  |
          |Credential Strength|weak                                                                               |
          |Confidence Level   |200                                                                                |
          |Affinity Group     |Agent                                                                              |
          |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
          |Identifier Name 1  |MTDITID                                                                            |
          |Identifier Value 1 |1234567893                                                                         |
          |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
          |Identifier Name 2  |AgentReferenceNumber                                                               |
          |Identifier Value 2 |XARN1234567                                                                        |
        Then the user should be redirected to the "Update and submit an Income Tax Return" page
        When the user clicks the continue button
        Then the user should be redirected to the "Your client’s Income Tax Return" page
        When the user clicks on the dividends link
        Then the user should be redirected to the "Check your client’s income from dividends" page
        When the user clicks on the change dividends from the uk summary link
        Then the user should be redirected to the "Did your client get dividends from shares?" page
        When the user selects the no radio button
        And the user clicks the continue button
        Then the user should be redirected to the "This will change information on your client’s Income Tax Return" page
        When the user clicks the confirm button
        Then the user should be redirected to the "Check your client’s income from dividends" page
        When the user clicks the save and continue button
        Then the user should be redirected to the "Your client’s Income Tax Return" page