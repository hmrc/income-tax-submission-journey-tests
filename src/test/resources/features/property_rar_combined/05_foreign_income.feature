@property

Feature: Foreign Income Journey - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user adds foreign income details using an accrual based nino
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page

    # Foreign income
    When the user clicks on the Dividends from foreign companies link
    Then the user should be redirected to the "Foreign dividends by country" page
    And the user clicks the continue button

  Scenario: Agent user adds foreign income details using a cash basis nino
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC210000A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page

    # Foreign income
    When the user clicks on the Dividends from foreign companies link
    Then the user should be redirected to the "Foreign dividends by country" page
    And the user clicks the continue button

