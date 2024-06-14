@TYR_UK_Interest @TYR_Common_Task_List

Feature: UK Interest Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Interest - Banks and building societies
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
                                     #### remove block when dev work is complete ####
    Then the user navigates to the Tailor return start page
                  #### remove block when dev work is complete ####
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Banks and building societies1 link
    Then the user should be redirected to the "Did you get any interest from the UK?" page

  Scenario: Individual User - Interest - Trust fund bond or bonds
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
                                     #### remove block when dev work is complete ####
    Then the user navigates to the Tailor return start page
                  #### remove block when dev work is complete ####
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Trust fund bond or bonds link
    Then the user should be redirected to the "Did you get any interest from the UK?" page

  Scenario: Individual User - Interest - Gilt-edged or accrued income securities
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
                                     #### remove block when dev work is complete ####
    Then the user navigates to the Tailor return start page
                  #### remove block when dev work is complete ####
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Gilt-edged or accrued income securities1 link
    Then the user should be redirected to the "Interest from gilt-edged or accrued income securities" page