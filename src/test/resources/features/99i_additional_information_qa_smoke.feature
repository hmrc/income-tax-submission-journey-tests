
Feature: Additional Information Journeys (Interest Securities) - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User maximal flow - Interest from gilt-edged or accrued income securities
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |250                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |PW911133A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addInterest tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Interest from savings and securities link
    Then the user should be redirected to the "Interest from savings and securities" page
    When the user clicks on the Interest from gilt-edged or accrued income securities link
    Then the user should be redirected to the "Interest from gilt-edged or accrued income securities" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much interest did you get?" page
    When the user selects the amount field and enters a value of 400.40
    And the user clicks the continue button
    Then the user should be redirected to the "Was tax taken off your interest?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your interest?" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Check your interest from gilt-edged or accrued income securities" page

  Scenario: Individual User says no on "gateway question page" - Interest from gilt-edged or accrued income securities
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |250                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |PW911133A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addInterest tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Interest from savings and securities link
    Then the user should be redirected to the "Interest from savings and securities" page
    When the user clicks on the Interest from gilt-edged or accrued income securities link
    Then the user should be redirected to the "Interest from gilt-edged or accrued income securities" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your interest from gilt-edged or accrued income securities" page