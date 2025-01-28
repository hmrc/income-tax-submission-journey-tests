@smoke

Feature: State Benefits Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  #-------------------------------Job Seeker's Allowance---------------------------------#
  Scenario: Individual User adds Jobseeker’s Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | PW911433A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the State benefits link
    Then the user should be redirected to the "State benefits" page
    When the user clicks on the Jobseeker’s Allowance link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    Given no claims exist
    When the user clicks the Add missing claim button
    Then the user should be redirected to the "When did you start getting Jobseeker’s Allowance?" page

    #TODO : update the year of the start date here instead.So we only update the years in the rest of places?
    When the user selects the claim day field and enters a value of 01
    And the user selects the claim month field and enters a value of 01
    And the user selects the claim year field and enters a value of 2022
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end between 6 April 2022 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 09
    And the user selects the claim year field and enters a value of 2022
    And the user clicks the continue button
    Then the user should be redirected to the "Did you have any tax taken off your Jobseeker’s Allowance between 6 April 2022 and 2 September 2022?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much Jobseeker’s Allowance did you get between 6 April 2022 and 2 September 2022?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your Jobseeker’s Allowance between 6 April 2022 and 2 September 2022?" page
    When the user selects the amount field and enters a value of 100.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the first view link
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the remove claim link
    Then the user should be redirected to the "Are you sure you want to remove this Jobseeker’s Allowance claim?" page
    When the user clicks the Remove claim button
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks the continue button
    Then the user should be redirected to the "State benefits" page

  #-----------------------------Employment Support Allowance-----------------------------#
  Scenario: Individual User adds Employment and Support Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | PW911433A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the State benefits link
    Then the user should be redirected to the "State benefits" page
    When the user clicks on the Employment and Support Allowance link
    Then the user should be redirected to the "Employment and Support Allowance" page
    Given no claims exist
    When the user clicks the Add missing claim button
    Then the user should be redirected to the "When did you start getting Employment and Support Allowance?" page
    When the user selects the claim day field and enters a value of 01
    And the user selects the claim month field and enters a value of 07
    And the user selects the claim year field and enters a value of 2022
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end between 1 July 2022 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 10
    And the user selects the claim year field and enters a value of 2022
    And the user clicks the continue button
    Then the user should be redirected to the "Did you have any tax taken off your Employment and Support Allowance between 1 July 2022 and 2 October 2022?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much Employment and Support Allowance did you get between 1 July 2022 and 2 October 2022?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your Employment and Support Allowance between 1 July 2022 and 2 October 2022?" page
    When the user selects the amount field and enters a value of 100.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first view link
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the remove claim link
    Then the user should be redirected to the "Are you sure you want to remove this Employment and Support Allowance claim?" page
    When the user clicks the Remove claim button
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks the continue button
    Then the user should be redirected to the "State benefits" page
