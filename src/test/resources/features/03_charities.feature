@MVP @ZAP @charities

Feature: Charities Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Minimal flow - Individual User - Charities
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the GiftAid link
    Then the user should be redirected to the "Did you use Gift Aid to donate to charity?" page

  Scenario: Minimal flow - Agent User - Charities
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567890    |
      |Credential Strength|weak                                                                                 |
      |Confidence Level   |200                                                                                  |
      |Affinity Group     |Agent                                                                                |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                          |
      |Identifier Name 1  |MTDITID                                                                              |
      |Identifier Value 1 |1234567890                                                                           |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                        |
      |Identifier Name 2  |AgentReferenceNumber                                                                 |
      |Identifier Value 2 |XARN1234567                                                                          |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the GiftAid link
    Then the user should be redirected to the "Did your client use Gift Aid to donate to charity?" page

  Scenario: Returning flow - Individual User - Charities
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                           |
      |Credential Strength|strong                                                |
      |Confidence Level   |200                                                   |
      |Affinity Group     |Individual                                            |
      |Nino               |AA123459A                                             |
      |Enrolment Key 1    |HMRC-MTD-IT                                           |
      |Identifier Name 1  |MTDITID                                               |
      |Identifier Value 1 |1234567891                                            |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the GiftAid link
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user should see the correct View estimation url

  Scenario: Returning flow - Agent User - Charities
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA123459A&ClientMTDID=1234567890    |
      |Credential Strength|weak                                                                                 |
      |Confidence Level   |200                                                                                  |
      |Affinity Group     |Agent                                                                                |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                          |
      |Identifier Name 1  |MTDITID                                                                              |
      |Identifier Value 1 |1234567890                                                                           |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                        |
      |Identifier Name 2  |AgentReferenceNumber                                                                 |
      |Identifier Value 2 |XARN1234567                                                                          |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the GiftAid link
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user should see the correct View estimation url