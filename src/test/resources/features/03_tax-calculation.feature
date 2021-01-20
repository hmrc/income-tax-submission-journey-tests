@MVP @ZAP

Feature: Tax Calculation Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Returning flow - Individual User with prior Interest and Dividends - Tax Calculation
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2020/additional-parameters?NINO=AA000003A |
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
    When the user clicks on the view estimation link
    Then the user should be on the Tax calculation to date page

