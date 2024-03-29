@MVP @ZAP @crystallisation @ignore

Feature: Crystallisation Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: End of Year flow - Individual User - Crystallisation
    When the user logs into the service with the following details
      |Redirect url       |/EOY/start                                          |
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
    When the user clicks the continue button
    Then the user should be redirected to V&C "Your final tax overview - Manage your Income Tax updates - GOV.UK" page
    When the user clicks the View and Change Continue button
    Then the user should be redirected to the "Declaration" page
    When the user clicks the I agree - Submit Income Tax Return button
    Then the user should be redirected to the "Confirmation: We’ve received your Income Tax Return" page

  Scenario: End of Year flow - Agent User - Crystallisation
    When the user logs into the service with the following details
      |Redirect url               |/test-only/EOY/additional-parameters?ClientNino=AA123459A&ClientMTDID=1234567890    |
      |Credential Strength        |weak                                                                                 |
      |Confidence Level           |250                                                                                  |
      |Affinity Group             |Agent                                                                                |
      |Enrolment Key 1            |HMRC-AS-AGENT                                                                        |
      |Identifier Name 1          |AgentReferenceNumber                                                                 |
      |Identifier Value 1         |1                                                                                    |
      |Enrolment Key 2            |HMRC_NI                                                                              |
      |Identifier Name 2          |NINO                                                                                 |
      |Identifier Value 2         |AA123459A                                                                            |
      |Delegated Enrolment Key    |HMRC-MTD-IT                                                                          |
      |Delegated Identifier Name  |MTDITID                                                                              |
      |Delegated Identifier Value |1234567890                                                                           |
      |Delegated Auth Rule        |mtd-it-auth                                                                          |

    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks the continue button
    Then the user should be taken to V&C "What is your client’s UTR? - GOV.UK" test-only page on the View and Change service
    When the user selects the Client SA UTR field and enters a value of 1234567890
    And the user clicks the View and Change Continue button
    Then the user should be taken to V&C "Confirm your client’s details - GOV.UK" test-only page on the View and Change service
    When the user clicks the View and Change Continue button
    Then the user should be taken to V&C "Your client’s Income Tax - Manage your client’s Income Tax updates - GOV.UK" test-only page on the View and Change service
    When the user navigates to the final tax overview page
    And the user clicks the continue button
    Then the user should be redirected to V&C "Your client’s final tax overview - Manage your client’s Income Tax updates - GOV.UK" page
    When the user clicks the View and Change Continue button
    Then the user should be redirected to the "Declaration" page
    When the user clicks the I agree - Submit Income Tax Return button
    Then the user should be redirected to the "Confirmation: We’ve received your client’s Income Tax Return" page
