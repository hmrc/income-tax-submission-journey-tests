@smoke
Feature: Pensions Journeys in QA - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user as a new submission, goes through full payments into pensions flow
    When the user logs into the service with the following details
      | Redirect url        | /2023/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | PW911433A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addPension tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the pensions link
    Then the user should be redirected to the "Pensions" page
    When the user clicks on the Payments into pensions link
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button
    Then the user should be redirected to the "Did you make any one-off payments into relief at source (RAS) pensions?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total one-off payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button
    Then the user should be redirected to the "Your total payments into relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Pensions where tax relief is not claimed" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay into a retirement annuity contract?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay into your retirement annuity contracts?" page
    When the user selects the amount field and enters a value of 300.30
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay into a workplace pension and not receive tax relief?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay into your workplace pensions?" page
    When the user selects the amount field and enters a value of 400.40
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks on the change link in position 1
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks on the change link in position 2
    Then the user should be redirected to the "Pensions where tax relief is not claimed" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
