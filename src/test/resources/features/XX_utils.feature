@MVP

Feature: Util Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Checking the Accessibility Statement link for both frontends
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA123456A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user will redirect to the Income Tax Submission start page
#    Check for the Income Tax Frontend
    And the user should see the correct Accessibility Statement url
    When the user clicks the provide updates button
    Then the user should be on the overview page
    When the user clicks on the dividends link
    Then the user should be on the received UK dividends page
#  Check for the Personal Income Tax Frontend
    And the user should see the correct Accessibility Statement url
