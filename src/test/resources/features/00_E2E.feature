@MVP @ZAP

Feature: End to End Income Tax Submission feature

  Background:
    Given the user navigates to the auth login page

  Scenario: Minimal flow - Individual User - Interest & Dividends
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
    When the user click the provide updates button
    Then the user should be on the overview page

  Scenario: Minimal flow - Agent User - Interest & Dividends
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

