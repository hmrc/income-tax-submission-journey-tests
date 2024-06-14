@TYR_UK_Dividends_Shares_Loans @TYR_Common_Task_List

Feature: UK dividends, shares and loans from limited companies Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - UK dividends, shares and loans - Cash dividends from UK stocks and shares
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
    When the user clicks on the Cash dividends from UK stocks and shares1 link
    Then the user should be redirected to the "Did you get dividends from shares?" page

  Scenario: Individual User - UK dividends, shares and loans - Stock dividends from UK companies
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
    When the user clicks on the Stock dividends from UK companies link
    Then the user should be redirected to the "Did you get dividends from shares?" page


  Scenario: Individual User - UK dividends, shares and loans - Dividends from unit trusts or investment companies
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
    When the user clicks on the Dividends from unit trusts or investment companies link
    Then the user should be redirected to the "Did you get dividends from shares?" page


  Scenario: Individual User - UK dividends, shares and loans - Free or redeemable shares
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
    When the user clicks on the Free or redeemable shares1 link
    Then the user should be redirected to the "Did you get dividends from shares?" page


  Scenario: Individual User - UK dividends, shares and loans - Close company loans written off or released
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
    When the user clicks on the Close company loans written off or released link
    Then the user should be redirected to the "Did you get dividends from shares?" page