Feature: About You Journeys Tailor Your Return - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User Full Journey Flow - About you - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | PW911433A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    Then the user navigates to the QA Tailor return start page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Marriage Allowance" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you, your partner or someone else get Child Benefit for a child living with you?" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Was your income over £50,000?" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "High Income Child Benefit Charge" page
    When the user selects the My income radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you make any patent royalty payments?" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax avoidance schemes" page
    When the user selects the Tax avoidance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page

  Scenario: Individual User Private Beta Journey Flow - About you - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    Then the user navigates to the QA Tailor return start page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
