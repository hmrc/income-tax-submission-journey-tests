@MVP

Feature: Util Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Checking the Accessibility Statement link for both frontends
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
#    Check for the Income Tax Frontend
    And the user should see the correct Accessibility Statement url
    And the user should see the correct sign out url
    When the user clicks the provide updates button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Did you receive any dividends from companies in the UK?" page
#  Check for the Personal Income Tax Frontend
    And the user should see the correct Accessibility Statement url
    And the user should see the correct personal income sign out url

  Scenario: Checking the client authorisation link for agents - frontend
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?NINO=AA123456A&MTDITID=1234567890  |
      |Credential Strength|weak                                                                     |
      |Confidence Level   |200                                                                      |
      |Affinity Group     |Agent                                                                    |
      |Enrolment Key 1    |HMRC-MTD-IT                                                              |
      |Identifier Name 1  |MTDITID                                                                  |
      |Identifier Value 1 |1234567893                                                               |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                            |
      |Identifier Name 2  |AgentReferenceNumber                                                     |
      |Identifier Value 2 |XARN1234567                                                              |
    Then the user should be redirected to the "There’s a problem" page
    And the user should see the correct client-authorisation url

  Scenario: Checking the client authorisation link for agents - personal
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?NINO=AA123456A&MTDITID=1234567890            |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |200                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |1234567893                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN1234567                                                                        |
    Then the user should be redirected to the "There’s a problem" page
    Then user navigates to the untaxed interest page
    Then the user should be redirected to the "There’s a problem" page
    And the user should see the correct client-authorisation url



