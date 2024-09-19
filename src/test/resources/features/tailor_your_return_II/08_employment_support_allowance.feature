@TYR_Employment_Support_Allowance @TYR_Common_Task_List @TYR_private_beta

Feature: Employment and Support Allowance Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Employment and Support Allowance - Review Employment and Support Allowance Claims
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567000  |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Review Employment and support allowance claims link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user selects the Yes, claim Employment and Support Allowance radio button
    And the user clicks the continue, missing claim button
    Then the user should be redirected to the "When did you start getting Employment and Support Allowance?" page
    When the user selects the claim day field and enters a value of 01
    And the user selects the claim month field and enters a value of 01
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end between 6 April 2023 and 5 April 2024?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2024
    And the user clicks the continue button
    Then the user should be redirected to the "Did you have any tax taken off your Employment and Support Allowance between 6 April 2023 and 2 February 2024?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much Employment and Support Allowance did you get between 6 April 2023 and 2 February 2024?" page
    When the user selects the amount field and enters a value of 1130.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your Employment and Support Allowance between 6 April 2023 and 2 February 2024?" page
    When the user selects the amount field and enters a value of 130.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first view link
    And the user clicks on the remove claim link
    Then the user should be redirected to the "Are you sure you want to remove this Employment and Support Allowance claim?" page
    When the user clicks the Remove claim button
    Then the user should be redirected to the "Employment and Support Allowance" page

  Scenario: Returning User - Employment and Support Allowance - Review Employment and Support Allowance Claims
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC160000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Review Employment and support allowance claims link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first view link
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Employment and Support Allowance" page
