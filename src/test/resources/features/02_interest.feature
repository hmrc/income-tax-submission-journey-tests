@MVP @ZAP @interest

Feature: Interest Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Minimal flow - Individual User - Interest
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
    When the user clicks on the interest link
    Then the user should be redirected to the "Did you get untaxed interest from the UK?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get taxed interest from the UK?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your UK interest" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page


  Scenario: Maximal flow - Agent User - Interest
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567890  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |200                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |1234567890                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN1234567                                                                        |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the interest link
    Then the user should be redirected to the "Did your client get untaxed interest from the UK?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Add an account with untaxed UK interest" page
    When the user selects the UK untaxed interest account name field and enters a value of Tesco Bank
    And the user selects the UK untaxed interest amount earned field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Add an account with untaxed UK interest" page
    When the user selects the UK untaxed interest account name field and enters a value of First Direct
    And the user selects the UK untaxed interest amount earned field and enters a value of 1500
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Add an account with untaxed UK interest" page
    When the user selects the UK untaxed interest account name field and enters a value of Sainburys Bank
    And the user selects the UK untaxed interest amount earned field and enters a value of 2500
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get taxed interest from the UK?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Add an account with taxed UK interest" page
    When the user selects the UK taxed interest account name field and enters a value of RBS
    And the user selects the UK taxed interest amount earned field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Add an account with taxed UK interest" page
    When the user selects the UK taxed interest account name field and enters a value of Skipton
    And the user selects the UK taxed interest amount earned field and enters a value of 600
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Add an account with taxed UK interest" page
    When the user selects the UK taxed interest account name field and enters a value of Goldman Sachs
    And the user selects the UK taxed interest amount earned field and enters a value of 700
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s UK interest" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Account Removal flow - Agent User  - Interest
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA123456A&ClientMTDID=1234567890  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |200                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |1234567890                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN1234567                                                                        |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the interest link
    Then the user should be redirected to the "Did your client get untaxed interest from the UK?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Add an account with untaxed UK interest" page
    When the user selects the UK untaxed interest account name field and enters a value of Tesco Bank
    And the user selects the UK untaxed interest amount earned field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Add an account with untaxed UK interest" page
    When the user selects the UK untaxed interest account name field and enters a value of First Direct
    And the user selects the UK untaxed interest amount earned field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get taxed interest from the UK?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Add an account with taxed UK interest" page
    When the user selects the UK taxed interest account name field and enters a value of Sainsbury’s Bank
    And the user selects the UK taxed interest amount earned field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Add an account with taxed UK interest" page
    When the user selects the UK taxed interest account name field and enters a value of Tesco Bank
    And the user selects the UK taxed interest amount earned field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s UK interest" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Returning flow - Individual User with prior UK Untaxed & Taxed Interest, Review & change - Interest
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA000003A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
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
    And the user should see the correct View estimation url

  Scenario: Returning flow - Agent User with prior UK Untaxed & Taxed Interest, Review & change - Interest
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA000003A&ClientMTDID=1234567893  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |200                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |1234567893                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN1234567                                                                        |
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
    And the user should see the correct View estimation url
