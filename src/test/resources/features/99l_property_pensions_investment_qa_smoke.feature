@smoke @ignore

Feature: Smoke Income from Property, Pensions And Investments Tailor Your Return in QA - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User maximal flow - Income from Property, Pensions And Investments - Tailor your return Smoke
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | PW911433A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 9876543210  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    Then the user navigates to the Rental income page
    Then the user should be redirected to the "Rental income from property" page
    When the user selects the UK Property radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" page
    When the user selects the State Pension radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK insurance gains" page
    When the user selects the Life Annuity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK interest" page
    When the user selects the Interest from UK trust funds or bonds radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK dividends, shares and loans from limited companies" page
    When the user selects the Cash dividends from UK stocks and shares radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
