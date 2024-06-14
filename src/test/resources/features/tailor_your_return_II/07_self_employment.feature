@TYR_Self_Employment @TYR_Common_Task_List

Feature: Self Employment Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Self Employment - Constructions Industry Scheme deductions
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
                                     #### remove block when dev work is complete ####
    Then the user navigates to the Tailor return start page
                  #### remove block when dev work is complete ####
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Construction Industry Schemes deductions link
    Then the user should be redirected to the "Have you had CIS deductions taken from your payments by contractors?" page

