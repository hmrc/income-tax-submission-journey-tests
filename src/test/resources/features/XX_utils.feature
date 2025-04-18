@MVP @utils
Feature: Util Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  @ignore
  Scenario: Checking the Accessibility Statement link for all 3 frontends
    When the user logs into the service with the following details
      |Redirect url       |/InYear/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |250                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA123459A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
#    Check for the Income Tax Frontend
    And the user should see the correct Accessibility Statement url
    And the user should see the correct sign out url
#  Check for the Personal Income Tax Frontend
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Check your income from dividends" page
    And the user should see the correct Accessibility Statement url
    And the user should see the correct personal income sign out url
 #  Check for the Income Tax Employment Frontend
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    And the user should see the correct Accessibility Statement url
    And the user should see the correct employment sign out url

  @ignore
  Scenario: Checking the client authorisation link for agents
    When the user logs into the service with the following details
      |Redirect url       |/test-only/InYear/additional-parameters?ClientNino=AA123456A&ClientMTDID=1234567890   |
      |Credential Strength|weak                                                                                |
      |Confidence Level   |250                                                                                 |
      |Affinity Group     |Agent                                                                               |
      |Enrolment Key 1    |HMRC-AS-AGENT                                                                       |
      |Identifier Name 1  |AgentReferenceNumber                                                                |
      |Identifier Value 1 |XARN1234567                                                                         |
    Then the user should be redirected to the "There’s a problem" page
    And the user should see the correct Authorise you as an agent url
    Then the user navigates to the untaxed interest page
    Then the user should be redirected to the "There’s a problem" page
    And the user should see the correct Authorise you as an agent url

  Scenario: supporting Agent unauthorised to access submission service
    When the user logs into the service with the following details
      | Redirect url               | /test-only/EOY/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890 |
      | Credential Strength        | strong                                                                           |
      | Confidence Level           | 250                                                                              |
      | Affinity Group             | Agent                                                                            |
      | Enrolment Key 1            | HMRC-AS-AGENT                                                                    |
      | Identifier Name 1          | AgentReferenceNumber                                                             |
      | Identifier Value 1         | XARN1234567                                                                      |
      | Delegated Enrolment Key    | HMRC-MTD-IT-SUPP                                                                 |
      | Delegated Identifier Name  | MTDITID                                                                          |
      | Delegated Identifier Value | 1234567890                                                                       |
      | Delegated Auth Rule        | mtd-it-auth-supp                                                                 |
    Then the user should be redirected to the "You are not authorised to use this service" page
