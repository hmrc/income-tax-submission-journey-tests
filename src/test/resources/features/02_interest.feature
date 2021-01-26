@MVP @ZAP

Feature: Interest Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Minimal flow - Individual User - Interest
    When the user logs into the service with the following details
      |Redirect url       |/2020/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA123456A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
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
      |Redirect url       |/test-only/2020/additional-parameters?NINO=AA123456A&MTDITID=1234567890  |
      |Credential Strength|weak                                                                     |
      |Confidence Level   |200                                                                      |
      |Affinity Group     |Agent                                                                    |
      |Enrolment Key 1    |HMRC-MTD-IT                                                              |
      |Identifier Name 1  |MTDITID                                                                  |
      |Identifier Value 1 |1234567890                                                               |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                            |
      |Identifier Name 2  |AgentReferenceNumber                                                     |
      |Identifier Value 2 |XARN1234567                                                              |
    Then the user will redirect to the Income Tax Submission start page
    When the user clicks the provide updates button
    Then the user should be on the overview page
    When the user clicks on the interest link
    Then the user should be on the received UK untaxed interest page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest details page
    When the user selects the UK untaxed interest account name field and enters a value of Tesco
    Then the user selects the UK untaxed interest amount earned field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest accounts summary page
    When the user clicks on the add another account link
    Then the user should be on the UK untaxed interest details page
    When the user selects the UK untaxed interest account name field and enters a value of Morrisons
    Then the user selects the UK untaxed interest amount earned field and enters a value of 1500
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest accounts summary page
    When the user clicks on the add another account link
    Then the user should be on the UK untaxed interest details page
    When the user selects the UK untaxed interest account name field and enters a value of Sainsbury's
    Then the user selects the UK untaxed interest amount earned field and enters a value of 2500
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest accounts summary page
    And the user clicks the continue button
    Then the user should be on the received UK taxed interest page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the UK taxed interest details page
    When the user selects the UK taxed interest account name field and enters a value of Asda
    Then the user selects the UK taxed interest amount earned field and enters a value of 500
    And the user clicks the continue button
    Then the user should be on the UK taxed interest accounts summary page
    When the user clicks on the add another account link
    Then the user should be on the UK taxed interest details page
    When the user selects the UK taxed interest account name field and enters a value of Aldi
    Then the user selects the UK taxed interest amount earned field and enters a value of 600
    And the user clicks the continue button
    Then the user should be on the UK taxed interest accounts summary page
    When the user clicks on the add another account link
    Then the user should be on the UK taxed interest details page
    When the user selects the UK taxed interest account name field and enters a value of Lidl
    Then the user selects the UK taxed interest amount earned field and enters a value of 700
    And the user clicks the continue button
    Then the user should be on the UK taxed interest accounts summary page
    And the user clicks the continue button
    Then the user should be on the interest check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page

  Scenario: Account Removal flow - Agent User  - Interest
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2020/additional-parameters?NINO=AA123456A&MTDITID=1234567890  |
      |Credential Strength|weak                                                                     |
      |Confidence Level   |200                                                                      |
      |Affinity Group     |Agent                                                                    |
      |Enrolment Key 1    |HMRC-MTD-IT                                                              |
      |Identifier Name 1  |MTDITID                                                                  |
      |Identifier Value 1 |1234567890                                                               |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                            |
      |Identifier Name 2  |AgentReferenceNumber                                                     |
      |Identifier Value 2 |XARN1234567                                                              |
    Then the user will redirect to the Income Tax Submission start page
    When the user clicks the provide updates button
    Then the user should be on the overview page
    When the user clicks on the interest link
    Then the user should be on the received UK untaxed interest page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest details page
    When the user selects the UK untaxed interest account name field and enters a value of Tesco
    Then the user selects the UK untaxed interest amount earned field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest accounts summary page
    When the user clicks on the add another account link
    Then the user should be on the UK untaxed interest details page
    When the user selects the UK untaxed interest account name field and enters a value of Asda
    Then the user selects the UK untaxed interest amount earned field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest accounts summary page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account? - Register your income tax return with HMRC - Gov.UK" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest accounts summary page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account? - Register your income tax return with HMRC - Gov.UK" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest accounts summary page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account? - Register your income tax return with HMRC - Gov.UK" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the received UK taxed interest page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the UK taxed interest details page
    When the user selects the UK taxed interest account name field and enters a value of Asda
    Then the user selects the UK taxed interest amount earned field and enters a value of 500
    And the user clicks the continue button
    Then the user should be on the UK taxed interest accounts summary page
    When the user clicks on the add another account link
    Then the user should be on the UK taxed interest details page
    When the user selects the UK taxed interest account name field and enters a value of Tesco
    Then the user selects the UK taxed interest amount earned field and enters a value of 500
    And the user clicks the continue button
    Then the user should be on the UK taxed interest accounts summary page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account? - Register your income tax return with HMRC - Gov.UK" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be on the UK taxed interest accounts summary page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account? - Register your income tax return with HMRC - Gov.UK" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the UK taxed interest accounts summary page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove this account? - Register your income tax return with HMRC - Gov.UK" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be on the interest check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page

  Scenario: Returning flow - Individual User with prior UK Untaxed & Taxed Interest, Review & change - Interest
    When the user logs into the service with the following details
      |Redirect url       |/2020/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA000003A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user will redirect to the Income Tax Submission start page
    When the user clicks the provide updates button
    Then the user should be on the overview page
    When the user clicks on the interest link
    Then the user should be on the interest check your answers page
    When the user clicks on the change uk untaxed interest accounts summary link
    Then the user should be on the UK untaxed interest accounts summary page
    When the user clicks on the first account change link
    Then the user should be on the Halifax untaxed interest account page
    When the user selects the prior amount radio button
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest accounts summary page
    When the user clicks on the second account change link
    Then the user should be on the Nationwide untaxed interest account page
    When the user selects the other amount radio button
    And the user selects the other amount value field and enters a value of 100.01
    And the user clicks the continue button
    Then the user should be on the UK untaxed interest accounts summary page
    When the user clicks the continue button
    Then the user should be on the interest check your answers page
    When the user clicks on the change uk taxed interest accounts summary link
    Then the user should be on the UK taxed interest accounts summary page
    When the user clicks on the first account change link
    Then the user should be on the Monzo taxed interest account page
    When the user selects the prior amount radio button
    And the user clicks the continue button
    Then the user should be on the UK taxed interest accounts summary page
    When the user clicks on the second account change link
    Then the user should be on the TSB Account taxed interest account page
    When the user selects the other amount radio button
    And the user selects the other amount value field and enters a value of 6000
    And the user clicks the continue button
    Then the user should be on the UK taxed interest accounts summary page
    When the user clicks the continue button
    Then the user should be on the interest check your answers page
    When the user clicks the save and continue button
    Then the user should be on the overview page
    And the user should see the correct View estimation url
