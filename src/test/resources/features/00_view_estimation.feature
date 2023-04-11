@MVP @ZAP @view_estimation @ignore

Feature: View Estimation Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: In Year flow - Individual User - View Estimation
    When the user logs into the service with the following details
      |Redirect url       |/InYear/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |250                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA000000A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
      |Enrolment Key 2    |IR-SA                                                |
      |Identifier Name 2  |UTR                                                  |
      |Identifier Value 2 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks the Update tax calculation button
    When the user navigates to the tax overview for individuals page
    When the user clicks the Go to Income Tax Account button
    Then the user should be redirected to V&C "Income Tax - Manage your Income Tax updates - GOV.UK" page on the View and Change service

  Scenario: In Year flow - Agent User - View Estimation
    When the user logs into the service with the following details
      |Redirect url               |/test-only/InYear/additional-parameters?ClientNino=AA123459A&ClientMTDID=1234567890    |
      |Credential Strength        |weak                                                                                 |
      |Confidence Level           |250                                                                                  |
      |Affinity Group             |Agent                                                                                |
      |Enrolment Key 1            |HMRC-MTD-IT                                                                          |
      |Identifier Name 1          |MTDITID                                                                              |
      |Identifier Value 1         |1234567890                                                                           |
      |Enrolment Key 2            |HMRC-AS-AGENT                                                                        |
      |Identifier Name 2          |AgentReferenceNumber                                                                 |
      |Identifier Value 2         |1                                                                                    |
      |Enrolment Key 3            |HMRC_NI                                                                              |
      |Identifier Name 3          |NINO                                                                                 |
      |Identifier Value 3         |AA123459A                                                                            |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks the Update tax calculation button
    Then the user should be taken to V&C "What is your client’s UTR? - GOV.UK" test-only page on the View and Change service
    When the user selects the Client SA UTR field and enters a value of 1234567890
    And the user clicks the View and Change Continue button
    Then the user should be taken to V&C "Confirm your client’s details - GOV.UK" test-only page on the View and Change service
    When the user clicks the View and Change Continue button
    Then the user should be taken to V&C "Your client’s Income Tax - Manage your client’s Income Tax updates - GOV.UK" test-only page on the View and Change service
    When the user navigates to the tax overview for agents page
    And the user clicks the Go to Income Tax Account button
    Then the user should be redirected to V&C "Your client’s Income Tax - Manage your client’s Income Tax updates - GOV.UK" agent page on the View and Change service
