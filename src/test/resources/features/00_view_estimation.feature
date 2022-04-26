@MVP @ZAP @view_estimation

Feature: View Estimation Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: In Year flow - Individual User - View Estimation
    When the user logs into the service with the following details
      |Redirect url       |/2023/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
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
    Then the user should be redirected to the "Income Tax" page on the View and Change service

  Scenario: In Year flow - Agent User - View Estimation
    When the user logs into the service with the following details
      |Redirect url               |/test-only/2023/additional-parameters?ClientNino=AA123459A&ClientMTDID=1234567890    |
      |Credential Strength        |weak                                                                                 |
      |Confidence Level           |200                                                                                  |
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
    Then the user should be taken to the "What is your client’s Unique Taxpayer Reference?" test-only page on the View and Change service
    When the user selects the Client SA UTR field and enters a value of 1234567890
    And the user clicks the View and Change Continue button
    Then the user should be taken to the "Confirm your client’s details" test-only page on the View and Change service
    When the user clicks the View and Change Continue button
    Then the user should be taken to the "Your client’s Income Tax" test-only page on the View and Change service
    When the user navigates to the tax overview for agents page
    And the user clicks the Go to Income Tax Account button
    Then the user should be redirected to the "Income Tax" page on the View and Change service