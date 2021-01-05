
@MVP

Feature: Util Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Minimal flow - Individual User - Check Accessibility link
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2020/additional-parameters?NINO=AA123456A |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA123456A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user will redirect to the Income Tax Submission start page
    And the user should see the correct Accessibility Statement url