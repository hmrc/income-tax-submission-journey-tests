@MVP @ZAP

Feature: End to End Income Tax Submission feature

  Background:
    Given the user navigates to the auth login page

  Scenario: Minimal flow - Individual User - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/start           |
      |Credential Strength|strong           |
      |Confidence Level   |200              |
      |Affinity Group     |Individual       |
      |Nino               |AA123456A        |
      |Enrolment Key 1    |HMRC-MTD-IT      |
      |Identifier Name 1  |MTDITID          |
      |Identifier Value 1 |1234567890       |
    Then the user will redirect to the Income Tax Submission start page
    When the user clicks the provide updates button
    Then the user should be on the overview page
    Given the user clicks on the dividends link
    Then the user should be on the received UK dividends page
    When the user clicks the no radio button
    And clicks continue
    Then the user should be on the authorised unit trusts, investment companies/trusts page
    When the user clicks the no radio button
    And clicks continue
    Then the user should be on the dividends check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page

  Scenario: Maximal flow - Agent User - Dividends
    When the user logs into the service with the following details
      |Redirect url       |/test-only/agent-access/1234567890 |
      |Credential Strength|weak                               |
      |Confidence Level   |50                                 |
      |Affinity Group     |Agent                              |
      |Enrolment Key 1    |HMRC-MTD-IT                        |
      |Identifier Name 1  |MTDITID                            |
      |Identifier Value 1 |1234567890                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                      |
      |Identifier Name 2  |AgentReferenceNumber               |
      |Identifier Value 2 |XARN1234567                        |
    Then the user will redirect to the Income Tax Submission start page
    When the user click the provide updates button
    Then the user should be on the overview page
    Given the user clicks on the dividends link
    Then the user should be on the received UK dividends page
    When the user clicks the yes radio button
    And clicks continue
    Then the user should be on the UK dividends amount page
    When the user enters a value of £1000
    And clicks continue
    Then the user should be on the authorised unit trusts, investment companies/trusts page
    When the user clicks the yes radio button
    And clicks continue
    Then the user should be on the authorised unit trusts, investment companies/trusts amount page
    When the user enters a value of £500
    And clicks continue
    Then the user should be on the dividends check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page
