@smoke

Feature: Smoke downstream Gift Aid Journeys to DES in QA - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Returning flow - Individual User with prior UK Gift Aid contributions, Review & change - Gift Aid Smoke
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |CC555555D                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |9876543210                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the GiftAid link
    Then the user should be redirected to the "Check your donations to charity" page

    When the user clicks on the change link in position 1
    Then the user should be redirected to the "How much did you donate to charity by using Gift Aid?" page
    When the user selects the Amount donated using Gift Aid field and enters a value of 1500
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page

    When the user clicks on the change link in position 2
    Then the user should be redirected to the "How much did you donate to charity as one-off payments?" page
    When the user selects the Amount donated as one-off payments field and enters a value of 700.50
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page

    When the user clicks on the change link in position 3
    Then the user should be redirected to the "How much did you donate to overseas charities by using Gift Aid?" page
    When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 12.99
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page

    When the user clicks on the change link in position 5
    Then the user should be redirected to the "How much of your donation did you add to the 2020 to 2021 tax year?" page
    When the user selects the Amount to add to last tax year field and enters a value of 117
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page

    When the user clicks on the change link in position 6
    Then the user should be redirected to the "How much of the donations you made after 5 April 2022 do you want to add to this tax year?" page
    When the user selects the Amount to add to this tax year field and enters a value of 0.48
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page

    When the user clicks on the change link in position 7
    Then the user should be redirected to the "What is the total value of qualifying shares or securities donated to charity?" page
    When the user selects the Total value of qualifying shares or securities field and enters a value of 1500
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page

    When the user clicks on the change link in position 8
    Then the user should be redirected to the "What is the value of land or property donated to charity?" page
    When the user selects the Value of land or property field and enters a value of 750
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning flow - Agent User with prior UK Gift Aid contributions, Review & change - Gift Aid Smoke
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=CC565656D&ClientMTDID=9876543211  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |200                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |9876543211                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN7654321                                                                        |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the GiftAid link

    When the user clicks on the change link in position 1
    Then the user should be redirected to the "How much did your client donate to charity by using Gift Aid?" page
    When the user selects the Amount donated using Gift Aid field and enters a value of 1500
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page

    When the user clicks on the change link in position 2
    Then the user should be redirected to the "How much did your client donate to charity as one-off payments?" page
    When the user selects the Amount donated as one-off payments field and enters a value of 700.50
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page

    When the user clicks on the change link in position 3
    Then the user should be redirected to the "How much did your client donate to overseas charities by using Gift Aid?" page
    When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 12.99
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page

    When the user clicks on the change link in position 5
    Then the user should be redirected to the "How much of your client’s donation did you add to the 2020 to 2021 tax year?" page
    When the user selects the Amount to add to last tax year field and enters a value of 117
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page

    When the user clicks on the change link in position 6
    Then the user should be redirected to the "How much of the donations your client made after 5 April 2022 do you want to add to this tax year?" page
    When the user selects the Amount to add to this tax year field and enters a value of 0.48
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page

    When the user clicks on the change link in position 7
    Then the user should be redirected to the "What is the total value of qualifying shares or securities donated to charity?" page
    When the user selects the Total value of qualifying shares or securities field and enters a value of 1500
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page

    When the user clicks on the change link in position 8
    Then the user should be redirected to the "What is the value of land or property donated to charity?" page
    When the user selects the Value of land or property field and enters a value of 750
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
