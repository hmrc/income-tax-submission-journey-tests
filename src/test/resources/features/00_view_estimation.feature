@ZAP @view_estimation @V&C

Feature: View Estimation Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: In Year flow - Individual User - View Estimation
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start   |
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
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks the Update tax calculation button
    When the user navigates to the tax overview for individuals page
    When the user clicks the Go to Income Tax Account button
    Then the user should be redirected to V&C "Income Tax - Manage your Income Tax updates - GOV.UK" page on the View and Change service

  Scenario: In Year flow - Agent User - View Estimation
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA888888A&ClientMTDID=XAIT00000888888 |
      | Credential Strength | weak                                                                                     |
      | Confidence Level    | 250                                                                                      |
      | Affinity Group      | Agent                                                                                    |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                              |
      | Identifier Name 1   | MTDITID                                                                                  |
      | Identifier Value 1  | XAIT00000888888                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                            |
      | Identifier Name 2   | AgentReferenceNumber                                                                     |
      | Identifier Value 2  | 0008888888                                                                               |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    Then the user navigates to the V&C login page page
    When the user AA888888A is selected on V&C page
    Then the agent checkbox on V&C page is selected
    And the user clicks the Login button on the V&C page
    Then the user should be redirected to V&C "What is your client’s UTR? - GOV.UK" page
    When the user selects the Client SA UTR field and enters a value of 0008888888
    And the user clicks the View and Change Continue button
    Then the user should be redirected to V&C "Confirm your client’s details - GOV.UK" page
    When the user clicks the View and Change Continue button
    Then the user should be redirected to V&C "Your client’s Income Tax - Manage your client’s Income Tax updates - GOV.UK" page
    When the user navigates to the tax view page
    And the user clicks the Continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks the Update tax calculation button
    And the user clicks the Go to Income Tax Account button
    Then the user should be redirected to V&C "Your client’s Income Tax - Manage your client’s Income Tax updates - GOV.UK" agent page on the View and Change service
