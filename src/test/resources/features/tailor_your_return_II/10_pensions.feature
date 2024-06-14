@TYR_Pensions @TYR_Common_Task_List

Feature: Pensions Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Pensions - State Pensions
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
    When the user clicks on the State Pension1 link
    Then the user should be redirected to the "Pensions" page


  Scenario: Individual User - Pensions - Other UK Pensions
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
    When the user clicks on the Other UK Pensions1 link
    Then the user should be redirected to the "Pensions" page

  Scenario: Individual User - Pensions - Unauthorised payment from Pensions
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
    When the user clicks on the Unauthorised payments1 link
    Then the user should be redirected to the "Pensions" page


  Scenario: Individual User - Pensions - Short service refunds
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
    When the user clicks on the Short service refunds1 link
    Then the user should be redirected to the "Pensions" page


  Scenario: Individual User - Pensions - Income from overseas Pensions
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
    When the user clicks on the Income from overseas pensions1 link
    Then the user should be redirected to the "Pensions" page