@smoke

Feature: Smoke downstream Dividends Journeys to DES in QA - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Returning flow - Individual User with prior UK Dividends & Other Dividends, Review & change - Dividends Smoke
    When the user logs into the service with the following details
      # It should work for 2023, but it seems there is a problem with the API
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | CC555555D   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 9876543210  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Check your income from dividends" page
    When the user clicks on the change uk dividends amount link
    Then the user should be redirected to the "How much did you get in dividends from UK-based companies?" page
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your income from dividends" page
    When the user clicks on the change other dividends amount link
    Then the user should be redirected to the "How much did you get in dividends from trusts and open-ended investment companies based in the UK?" page
    When the user selects the UK other dividends amount field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Check your income from dividends" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page