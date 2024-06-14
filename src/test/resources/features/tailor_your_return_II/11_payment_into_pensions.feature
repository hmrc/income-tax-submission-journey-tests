@TYR_Payment_Into_Pensions @TYR_Common_Task_List

Feature: Payment Into Pensions Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Pensions - Payment into UK pensions
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
    When the user clicks on the Payments into UK pensions1 link
    Then the user should be redirected to the "Relief at source (RAS) pensions" page


  Scenario: Individual User - Pensions - Annual allowances
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
    When the user clicks on the Annual allowances link
    Then the user should be redirected to the "Do you have a reduced annual allowance?" page


  Scenario: Individual User - Pensions - Payments into non-UK pensions
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
    When the user clicks on the Payments into overseas pensions link
    Then the user should be redirected to the "Pensions" page


  Scenario: Individual User - Pensions - Overseas transfer charges
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
    When the user clicks on the Overseas transfer charge1 link
    Then the user should be redirected to the "Did you transfer pension savings into an overseas pension scheme?" page