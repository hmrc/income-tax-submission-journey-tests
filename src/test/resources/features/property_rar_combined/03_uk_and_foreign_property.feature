@property

Feature: UK and Foreign Property Journey - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user adds UK and Foreign Property details
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
#    When the user clicks on the UK & Foreign Property About link
#    Then the user should be redirected to the "UK and foreign property details" page

  Scenario: Agent user adds UK and Foreign Property details
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
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
#    When the user clicks on the UK & Foreign Property About link
#    Then the user should be redirected to the "UK and foreign property details" page




