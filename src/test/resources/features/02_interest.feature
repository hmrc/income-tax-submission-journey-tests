@MVP @ZAP

Feature: End to End Income Tax Submission feature

  Background:
    Given the user navigates to the auth login page

  Scenario: Minimal flow - Individual User - Interest
    When the user logs into the service with the following details
      |Redirect url       |/start           |
      |Credential Strength|strong           |
      |Confidence Level   |200              |
      |Affinity Group     |Individual       |
      |Nino               |AA123456A        |
      |Enrolment Key 1    |HMRC-MTD-IT      |
      |Identifier Name 1  |MTDITID          |
      |Identifier Value 1 |1234567890       |
    Then the user will redirect to the Income Tax Submission start page
    When the user clicks the provide updates button
    Then the user should be on the overview page
    Given the user clicks on the interest link
    Then the user should be on the received UK untaxed interest page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be on the received UK taxed interest page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be on the interest check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page

  Scenario: Maximal flow - Agent User - Interest
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2020/agent-access/1234567890 |
      |Credential Strength|weak                                    |
      |Confidence Level   |50                                      |
      |Affinity Group     |Agent                                   |
      |Enrolment Key 1    |HMRC-MTD-IT                             |
      |Identifier Name 1  |MTDITID                                 |
      |Identifier Value 1 |1234567890                              |
      |Enrolment Key 2    |HMRC-AS-AGENT                           |
      |Identifier Name 2  |AgentReferenceNumber                    |
      |Identifier Value 2 |XARN1234567                             |
    Then the user will redirect to the Income Tax Submission start page
    When the client nino is passed into session
    And the user clicks the provide updates button
    Then the user should be on the overview page
    When the user clicks on the interest link
    Then the user should be on the received UK untaxed interest page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest details page
    When the user selects the UK untaxed interest account name field and enters a value of Tesco
    Then the user selects the UK untaxed interest amount earned field and enters a value of £1000
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest account summary page
    When the user clicks on the add another account link
    Then the user should be on the UK untaxed interest details page
    When the user selects the UK untaxed interest account name field and enters a value of Morrisons
    Then the user selects the UK untaxed interest amount earned field and enters a value of £1500
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest account summary page
    When the user clicks on the add another account link
    Then the user should be on the UK untaxed interest details page
    When the user selects the UK untaxed interest account name field and enters a value of Sainsbury's
    Then the user selects the UK untaxed interest amount earned field and enters a value of £2500
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest account summary page
    And the user clicks the continue button
    Then the user should be on the UK taxed interest page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the UK taxed interest details page
    When the user selects the UK taxed interest account name field and enters a value of Asda
    Then the user selects the UK taxed interest amount earned field and enters a value of £500
    And the user clicks the continue button
    Then the user should be on the UK taxed account summary page
    When the user clicks on the add another account link
    Then the user should be on the UK taxed interest details page
    When the user selects the UK taxed interest account name field and enters a value of Aldi
    Then the user selects the UK taxed interest amount earned field and enters a value of £600
    And the user clicks the continue button
    Then the user should be on the UK taxed account summary page
    When the user clicks on the add another account link
    Then the user should be on the UK taxed interest details page
    When the user selects the UK taxed interest account name field and enters a value of Lidl
    Then the user selects the UK taxed interest amount earned field and enters a value of £700
    And the user clicks the continue button
    Then the user should be on the UK taxed account summary page
    And the user clicks the continue button
    Then the user should be on the dividends check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page

#  Scenario: Returning flow - Individual User - Interest
#    When the user logs into the service with the following details
#      |Redirect url       |/test-only/2020/additional-parameters?NINO=AA000001A  |
#      |Credential Strength|strong                                                |
#      |Confidence Level   |200                                                   |
#      |Affinity Group     |Individual                                            |
#      |Nino               |AA000001A                                             |
#      |Enrolment Key 1    |HMRC-MTD-IT                                           |
#      |Identifier Name 1  |MTDITID                                               |
#      |Identifier Value 1 |1234567891                                            |
#    Then the user will redirect to the Income Tax Submission start page
#    When the user clicks the provide updates button
#    Then the user should be on the overview page
#    When the user clicks on the interest link
#    Then the user should be on the interest check your answers page
#    When the user clicks the save and continue button
#    Then the user should be on the overview page
#
#  Scenario: Returning flow - Individual User with prior UK Untaxed & Taxed Interest, Review but no change - Interest
#    When the user logs into the service with the following details
#      |Redirect url       |/test-only/2020/additional-parameters?NINO=AA000002A |
#      |Credential Strength|strong                                               |
#      |Confidence Level   |200                                                  |
#      |Affinity Group     |Individual                                           |
#      |Nino               |AA000002A                                            |
#      |Enrolment Key 1    |HMRC-MTD-IT                                          |
#      |Identifier Name 1  |MTDITID                                              |
#      |Identifier Value 1 |1234567892                                           |
#    Then the user will redirect to the Income Tax Submission start page
#    When the user clicks the provide updates button
#    Then the user should be on the overview page
#    When the user clicks on the interest link
#    Then the user should be on the interest check your answers page
#    And the user clicks on the change uk untaxed interest details link
#    Then the user should be on the UK untaxed interest account page
#    When the user selects the change button
#    Then the user selects the prior amount radio button
#    And the user clicks the continue button
#    Then the user should be on the UK untaxed interest account page
#    And the user clicks the continue button
#    Then the user should be on the interest check your answers page
#    And the user clicks on the uk taxed interest details link
#    Then the user should be on the UK taxed interest account page
#    When the user selects the change button
#    Then the user selects the prior amount radio button
#    And the user clicks the continue button
#    Then the user should be on the UK taxed interest account page
#    And the user clicks the continue button
#    Then the user should be on the interest check your answers page
#    When the user clicks the save and continue button
#    Then the user should be on the overview page
#
#  Scenario: Returning flow - Agent User with prior UK Untaxed & Taxed Interest, Review & change - Interest
#    When the user logs into the service with the following details
#      |Redirect url       |/test-only/2020/agent-access/1234567893 |
#      |Credential Strength|weak                                    |
#      |Confidence Level   |50                                      |
#      |Affinity Group     |Agent                                   |
#      |Enrolment Key 1    |HMRC-MTD-IT                             |
#      |Identifier Name 1  |MTDITID                                 |
#      |Identifier Value 1 |1234567893                              |
#      |Enrolment Key 2    |HMRC-AS-AGENT                           |
#      |Identifier Name 2  |AgentReferenceNumber                    |
#      |Identifier Value 2 |XARN1234567                             |
#    Then the user will redirect to the Income Tax Submission start page
#    When the client nino with prior data is passed into session
#    And the user clicks the provide updates button
#    Then the user should be on the overview page
#    When the user clicks on the interest link
#    Then the user should be on the interest check your answers page
#    And the user clicks on the change uk untaxed interest details link
#    Then the user should be on the UK untaxed interest account page
#    When the user selects the change button
#    Then the user should be on the UK untaxed interest earned page
#    Then the user selects the a different amount radio button
#    And the user selects the a different amount value field and enters a value of £2000
#    And the user clicks the continue button
#    Then the user should be on the UK untaxed interest account page
#    And the user clicks the continue button
#    Then the user should be on the interest check your answers page
#    And the user clicks on the change uk taxed interest details link
#    Then the user should be on the UK taxed interest account page
#    When the user selects the change button
#    Then the user should be on the UK taxed interest earned page
#    Then the user selects the a different amount radio button
#    And the user selects the a different amount value field and enters a value of £750
#    And the user clicks the continue button
#    Then the user should be on the UK taxed interest account page
#    And the user clicks the continue button
#    Then the user should be on the interest check your answers page
#    When the user clicks the save and continue button
#    Then the user should be on the overview page
