@screenshots

Feature: Screenshot tests for welsh translations

  Background:
    Given the user navigates to the auth login page

  Scenario: Minimal flow - Individual User - Dividends
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
    And I take screenshots of the English, StartPage
    When the user clicks the provide updates button
    Then the user should be redirected to the "Your Income Tax Return" page
    And I take screenshots of the English, YourIncomeTaxReturnPage
    When the user clicks on the dividends link
    Then the user should be redirected to the "Did you receive any dividends from companies in the UK?" page
    And I take screenshots of the English, DidYouReceiveDivsPage
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you receive any dividends from trusts or open ended investment companies?" page
    And I take screenshots of the English, DidYouReceiveOtherDivsPage
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    And I take screenshots of the English, CheckYourAnswersPage
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page