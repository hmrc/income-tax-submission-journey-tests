@TYR_Self_Employment @TYR_Common_Task_List @TYR_private_beta
Feature: Self Employment Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Self Employment - Constructions Industry Scheme deductions
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567891  |
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
    When the user clicks on the Construction Industry Schemes deductions link
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employer Reference Number field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user clicks the continue button
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by your contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 200
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay for materials for your contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay for building materials for your contractor?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the CIS save and continue link
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning User - Self Employment - Constructions Industry Scheme deductions
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
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
    When the user clicks on the Construction Industry Schemes deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the CIS save and continue link
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page

