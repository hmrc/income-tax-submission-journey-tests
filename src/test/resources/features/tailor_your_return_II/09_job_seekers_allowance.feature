@TYR_Jobseekers_Allowance @TYR_Common_Task_List @TYR_private_beta

Feature: Jobseeker's Allowance Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Jobseeker's Allowance - Review Jobseeker's Allowance Claims
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
    When the user clicks on the Review Jobseeker’s Allowance claims link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user selects the Yes, claim Jobseeker's Allowance radio button
    And the user clicks the continue, missing claim button
    Then the user should be redirected to the "When did you start getting Jobseeker’s Allowance?" page
    When the user selects the claim day field and enters a value of 01
    And the user selects the claim month field and enters a value of 10
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end between 1 October 2023 and 5 April 2024?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 03
    And the user selects the claim year field and enters a value of 2024
    And the user clicks the continue button
    Then the user should be redirected to the "Did you have any tax taken off your Jobseeker’s Allowance between 1 October 2023 and 2 March 2024?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much Jobseeker’s Allowance did you get between 1 October 2023 and 2 March 2024?" page
    When the user selects the amount field and enters a value of 1100.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your Jobseeker’s Allowance between 1 October 2023 and 2 March 2024?" page
    When the user selects the amount field and enters a value of 100.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    #TODO Remove comments below when CIS bug is fixed from clicking continue button on page above
#    When the user clicks the state benefit save and continue button
#    Then the user should be redirected to the "Jobseeker’s Allowance" page
#    When the user clicks on the first view link
#    When the user clicks on the remove claim link
#    Then the user should be redirected to the "Are you sure you want to remove this Jobseeker’s Allowance claim?" page
#    When the user clicks the Remove claim button
#    Then the user should be redirected to the "Jobseeker’s Allowance" page

  Scenario: Returning User - Jobseeker's Allowance - Review Jobseeker's Allowance Claims
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
    When the user clicks on the Review Jobseeker’s Allowance claims link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the first view link
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user selects the no radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
