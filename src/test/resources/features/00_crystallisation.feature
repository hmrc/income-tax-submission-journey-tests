@MVP @ZAP @crystallisation @V&C

Feature: Crystallisation Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: End of Year flow - Individual User - Crystallisation
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start      |
      | Credential Strength | strong          |
      | Confidence Level    | 250             |
      | Affinity Group      | Individual      |
      | Nino                | AA888888A       |
      | Enrolment Key 1     | HMRC-MTD-IT     |
      | Identifier Name 1   | MTDITID         |
      | Identifier Value 1  | XAIT00000888888 |
      | Enrolment Key 2     | IR-SA           |
      | Identifier Name 2   | UTR             |
      | Identifier Value 2  | 0008888888      |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to V&C "Your final tax overview - Manage your Income Tax updates - GOV.UK" page
    When the user clicks the View and Change Continue button
    Then the user should be redirected to the "Declaration" page
    When the user clicks the I agree - Submit Income Tax Return button
    Then the user should be redirected to the "Confirmation: We’ve received your Income Tax Return" page

  Scenario: End of Year flow - Agent User - Crystallisation
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AA888888A&ClientMTDID=XAIT00000888888 |
      | Credential Strength | weak                                                                                  |
      | Confidence Level    | 250                                                                                   |
      | Affinity Group      | Agent                                                                                 |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                           |
      | Identifier Name 1   | MTDITID                                                                               |
      | Identifier Value 1  | XAIT00000888888                                                                       |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                         |
      | Identifier Name 2   | AgentReferenceNumber                                                                  |
      | Identifier Value 2  | 0008888888                                                                            |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to V&C "What is your client’s UTR? - GOV.UK" page
    When the user selects the Client SA UTR field and enters a value of 0008888888
    And the user clicks the Continue button
    Then the user should be redirected to V&C "Confirm your client’s details - GOV.UK" page
    When the user clicks the View and Change Continue button
    Then the user should be redirected to V&C "Your client’s Income Tax - Manage your client’s Income Tax updates - GOV.UK" page
    When the user navigates to the final tax overview page
    And the user clicks the Continue button
    Then the user should be redirected to V&C "Your client’s final tax overview - Manage your client’s Income Tax updates - GOV.UK" page
    When the user clicks the View and Change Continue button
    Then the user should be redirected to the "Declaration" page
    When the user clicks the I agree - Submit Income Tax Return button
    Then the user should be redirected to the "Confirmation: We’ve received your client’s Income Tax Return" page
