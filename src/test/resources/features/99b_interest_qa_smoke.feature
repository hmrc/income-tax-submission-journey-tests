@smoke

Feature: Smoke downstream Interest Journeys to DES in QA - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Returning flow - Individual User with prior UK Untaxed & Taxed Interest, Review & change - Interest Smoke
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
    When the user clicks on the interest link
    Then the user should be redirected to the "Check your UK interest" page
    When the user clicks on the change uk untaxed interest accounts summary link
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user clicks on the first account change link
    Then the user should be redirected to the "How much untaxed UK interest did you get?" page
    And the user selects the UK untaxed interest updated amount earned field and enters a value of 100.01
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user clicks on the second account change link
    Then the user should be redirected to the "How much untaxed UK interest did you get?" page
    And the user selects the UK untaxed interest updated amount earned field and enters a value of 100.01
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your UK interest" page
    When the user clicks on the change uk taxed interest accounts summary link
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user clicks on the first account change link
    Then the user should be redirected to the "How much taxed UK interest did you get?" page
    And the user selects the UK taxed interest updated amount earned field and enters a value of 100.01
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user clicks on the second account change link
    Then the user should be redirected to the "How much taxed UK interest did you get?" page
    And the user selects the UK taxed interest updated amount earned field and enters a value of 6000
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your UK interest" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning flow - Agent User with prior UK Untaxed & Taxed Interest, Review & change - Interest Smoke
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
    When the user clicks on the interest link
    Then the user should be redirected to the "Check your client’s UK interest" page
    When the user clicks on the change uk untaxed interest accounts summary link
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user clicks on the first account change link
    Then the user should be redirected to the "How much untaxed UK interest did your client get?" page
    And the user selects the UK untaxed interest updated amount earned field and enters a value of 100.01
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user clicks on the second account change link
    Then the user should be redirected to the "How much untaxed UK interest did your client get?" page
    And the user selects the UK untaxed interest updated amount earned field and enters a value of 100.01
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s UK interest" page
    When the user clicks on the change uk taxed interest accounts summary link
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user clicks on the first account change link
    Then the user should be redirected to the "How much taxed UK interest did your client get?" page
    And the user selects the UK taxed interest updated amount earned field and enters a value of 100.01
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user clicks on the second account change link
    Then the user should be redirected to the "How much taxed UK interest did your client get?" page
    And the user selects the UK taxed interest updated amount earned field and enters a value of 6000
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s UK interest" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
