@smoke

Feature: Smoke Estimation Journey in QA - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Returning flow - Individual User - View Estimation Smoke
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA000003A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
      |Enrolment Key 2    |IR-SA                                                |
      |Identifier Name 2  |UTR                                                  |
      |Identifier Value 2 |XAIT00000888888                                      |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks the Update tax calculation button
    When the user navigates to the tax overview for individuals page
    When the user clicks the Go to Income Tax Account button
    Then the user should be redirected to the "Income Tax" page on the View and Change service
