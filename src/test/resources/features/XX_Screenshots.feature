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
