@MVP @ZAP

Feature: Dividends Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Minimal flow - Individual User - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2020/additional-parameters?NINO=AA123456A |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA123456A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user will redirect to the Income Tax Submission start page
    When the user clicks the provide updates button
    Then the user should be on the overview page
    When the user clicks on the dividends link
    Then the user should be on the received UK dividends page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be on the authorised unit trusts, investment companies/trusts page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be on the dividends check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page

  Scenario: Maximal flow - Agent User - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2020/agent-access/1234567890 |
      |Credential Strength|weak                                    |
      |Confidence Level   |200                                      |
      |Affinity Group     |Agent                                   |
      |Enrolment Key 1    |HMRC-MTD-IT                             |
      |Identifier Name 1  |MTDITID                                 |
      |Identifier Value 1 |1234567890                              |
      |Enrolment Key 2    |HMRC-AS-AGENT                           |
      |Identifier Name 2  |AgentReferenceNumber                    |
      |Identifier Value 2 |XARN1234567                             |
    Then the user will redirect to the Income Tax Submission start page
    When the client nino is passed into session
    And the user clicks the provide updates button
    Then the user should be on the overview page
    When the user clicks on the dividends link
    Then the user should be on the received UK dividends page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the UK dividends amount page
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be on the authorised unit trusts, investment companies/trusts page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the authorised unit trusts, investment companies/trusts amount page
    When the user selects the UK other dividends amount field and enters a value of 500
    And the user clicks the continue button
    Then the user should be on the dividends check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page

  Scenario: Returning flow - Individual User - Dividends
    When the user logs into the service with the following details
          |Redirect url       |/test-only/2020/additional-parameters?NINO=AA000001A  |
          |Credential Strength|strong                                                |
          |Confidence Level   |200                                                   |
          |Affinity Group     |Individual                                            |
          |Nino               |AA000001A                                             |
          |Enrolment Key 1    |HMRC-MTD-IT                                           |
          |Identifier Name 1  |MTDITID                                               |
          |Identifier Value 1 |1234567891                                            |
    Then the user will redirect to the Income Tax Submission start page
    When the user clicks the provide updates button
    Then the user should be on the overview page
    When the user clicks on the dividends link
    Then the user should be on the dividends check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page
    And the user should see the correct View estimation url

  Scenario: Returning flow - Individual User with prior UK Dividends & Other Dividends, Review but no change - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2020/additional-parameters?NINO=AA000002A |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA000002A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567892                                           |
    Then the user will redirect to the Income Tax Submission start page
    When the user clicks the provide updates button
    Then the user should be on the overview page
    When the user clicks on the dividends link
    And the user clicks on the change uk dividends amount link
    Then the user should be on the UK dividends amount page
    When the user selects the prior amount radio button
    And the user clicks the continue button
    Then the user should be on the dividends check your answers page
    When the user clicks on the change other dividends amount link
    Then the user should be on the authorised unit trusts, investment companies/trusts amount page
    When the user selects the prior amount radio button
    And the user clicks the continue button
    Then the user should be on the dividends check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page
    And the user should see the correct View estimation url

  Scenario: Returning flow - Agent User with prior UK Dividends & Other Dividends, Review & Change - Dividends -
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2020/agent-access/1234567893 |
      |Credential Strength|weak                                    |
      |Confidence Level   |200                                     |
      |Affinity Group     |Agent                                   |
      |Enrolment Key 1    |HMRC-MTD-IT                             |
      |Identifier Name 1  |MTDITID                                 |
      |Identifier Value 1 |1234567893                              |
      |Enrolment Key 2    |HMRC-AS-AGENT                           |
      |Identifier Name 2  |AgentReferenceNumber                    |
      |Identifier Value 2 |XARN1234567                             |
    Then the user will redirect to the Income Tax Submission start page
    When the client nino with prior data is passed into session
    And the user clicks the provide updates button
    Then the user should be on the overview page
    When the user clicks on the dividends link
    And the user clicks on the change uk dividends amount link
    Then the user should be on the UK dividends amount page
    When the user selects the other amount radio button
    And the user selects the other amount value field and enters a value of 2000
    And the user clicks the continue button
    Then the user should be on the dividends check your answers page
    When the user clicks on the change other dividends amount link
    Then the user should be on the authorised unit trusts, investment companies/trusts amount page
    When the user selects the other amount radio button
    And the user selects the other amount value field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be on the dividends check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page
    And the user should see the correct View estimation url
