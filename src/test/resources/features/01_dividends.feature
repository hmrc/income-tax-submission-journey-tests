@MVP @ZAP @dividends

Feature: Dividends Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Minimal flow - Individual User - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA123456A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the provide updates button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Did you receive any dividends from companies in the UK?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you receive any dividends from trusts or open ended investment companies?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Maximal flow - Agent User - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567890    |
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
    When the user clicks the provide updates button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Did your client receive any dividends from companies in the UK?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client get in dividends from UK-based companies?" page
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client receive any dividends from trusts or open ended investment companies?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What is the total amount of dividends from trusts or open ended investment companies?" page
    When the user selects the UK other dividends amount field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Returning flow - Individual User - Dividends
    When the user logs into the service with the following details
          |Redirect url       |/2022/start                                           |
          |Credential Strength|strong                                                |
          |Confidence Level   |200                                                   |
          |Affinity Group     |Individual                                            |
          |Nino               |AA000001A                                             |
          |Enrolment Key 1    |HMRC-MTD-IT                                           |
          |Identifier Name 1  |MTDITID                                               |
          |Identifier Value 1 |1234567891                                            |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the provide updates button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user should see the correct View estimation url

  Scenario: Returning flow - Individual User with prior UK Dividends & Other Dividends, Review but no change - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA000002A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567892                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the provide updates button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Check your answers" page
    When the user clicks on the change uk dividends amount link
    Then the user should be redirected to the "How much did you get in dividends from UK-based companies?" page
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks on the change other dividends amount link
    Then the user should be redirected to the "What is the total amount of dividends from trusts or open ended investment companies?" page
    When the user selects the prior amount radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user should see the correct View estimation url

  Scenario: Returning flow - Agent User with prior UK Dividends & Other Dividends, Review & Change - Dividends -
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA000003A&ClientMTDID=1234567893  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |200                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                        |
      |Identifier Value 1 |1234567893                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN1234567                                                                        |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the provide updates button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Check your answers" page
    When the user clicks on the change uk dividends amount link
    Then the user should be redirected to the "How much did you get in dividends from UK-based companies?" page
    And the user selects the other amount value field and enters a value of 2000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks on the change other dividends amount link
    Then the user should be redirected to the "What is the total amount of dividends from trusts or open ended investment companies?" page
    When the user selects the other amount radio button
    And the user selects the other amount value field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    And the user should see the correct View estimation url
