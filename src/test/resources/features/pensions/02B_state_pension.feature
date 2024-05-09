@ZAP @pensions

Feature: Pensions Journeys - 02B Income from Pensions - State Pension - Income Tax Submission

  Scenario: Individual journey - Income from pension, state pensions
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001A   |
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

    When the user clicks on the Income from pensions link
    Then the user should be redirected to the "Income from pensions" page
    When the user clicks on the State pension link

    Then the user should be redirected to the "Do you get regular State Pension payments?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "When did you start getting State Pension payments?" page
    When the user selects the pension day field and enters a value of 01
    And the user selects the pension month field and enters a value of 01
    And the user selects the pension year field and enters a value of 2023
    And the user clicks the continue button

    Then the user should be redirected to the "Did you get a State Pension lump sum?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay tax on the State Pension lump sum?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "When did you get your State Pension lump sum?" page
    When the user selects the pension day field and enters a value of 01
    And the user selects the pension month field and enters a value of 01
    And the user selects the pension year field and enters a value of 2023
    And the user clicks the continue button

    Then the user should be redirected to the "Check your State Pension" page
