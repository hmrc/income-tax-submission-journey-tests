@TYR_Property_Gains @TYR_Common_Task_List @TYR_private_beta

@x

Feature: UK Property Gains Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - UK & Foreign Property Gains - User says yes to all questions
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567000    |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for InYear
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the UK Foreign Property link
    Then the user should be redirected to the "UK and foreign property details" page
    When the user clicks the Continue button
    Then the user should be redirected to the "How much total income did you get from all of your UK and foreign properties?" page
    When the user selects the Less than £1,000 radio button and clicks the Continue button
    Then the user should be redirected to the "Do you want to report your property income?" page
    When the user selects the My Client does not want to report their property income radio button and clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the Check your answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button and clicks the Continue button
    Then the user should be redirected to the "UK property" page

# TODO
#    Then the user should be redirected to the "Your Income Tax Return" page


  Scenario: Individual User - UK Property Gains - User says yes to all questions
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567000    |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for InYear
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks on the Income from property, pensions and investments link
    Then the user should be redirected to the "Rental income from property" page
    When the user selects the UK Property radio button
    When the user clicks the Continue button
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Rental income from property" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the UKProperty link
    Then the user should be redirected to the "UK property details" page
    When the user clicks the Continue button
    Then the user should be redirected to the "How much total income did you get from all of your UK properties?" page
    When the user selects the Less than £1,000 radio button and clicks the Continue button
    Then the user should be redirected to the "Do you want to report your property income?" page
    When the user selects the My Client does not want to report their property income radio button and clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the Check your answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button and clicks the Continue button
    Then the user should be redirected to the "UK property" page

# TODO
#    Then the user should be redirected to the "Your Income Tax Return" page



  Scenario: Individual User - Foreign Property Gains - User says yes to all questions
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567000    |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for InYear
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks on the Income from property, pensions and investments link
    Then the user should be redirected to the "Rental income from property" page
    When the user selects the Non-UK Property radio button
    When the user clicks the Continue button
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Rental income from property" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the ForeignProperty link
    Then the user should be redirected to the "Foreign property details" page
    When the user clicks the Continue button
    Then the user should be redirected to the "How much total income did you get from all of your Foreign properties?" page
    When the user selects the Less than £1,000 radio button and clicks the Continue button
    Then the user should be redirected to the "Do you want to report your property income?" page
    When the user selects the My Client does not want to report their property income radio button and clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the Check your answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button and clicks the Continue button
    Then the user should be redirected to the "Foreign property" page

# TODO
#    Then the user should be redirected to the "Your Income Tax Return" page








#    When the user clicks on the UK And Foreign Property About Link
#    Then the user should be redirected to the "Uk Foreign Property" page
#    Then the user clicks the Continue button
#    Then the user should be redirected to the "Total Property Income" page
#    When the user selects the Less than £1000 radio button
#    And the user clicks the Continue button
#    Then the user should be redirected to the "Report Income" page
#    When the user selects the My client wants to report their property income radio button
#    And the user clicks the Continue button
#    Then the user should be redirected to the "Rental Type UK" page
#    When the user selects the Property rentals checkbox
#    And the user clicks the Continue button
#    Then the user should be redirected to the "Countries/1" page
#    When the user selects the Country field and enters a value of Spain
#    And the user clicks the Continue button
#    Then the user should be redirected to the "Countries" page
#    When the user selects the No radio button
#    And the user clicks the Continue button
#    Then the user should be redirected to the "Claim Property Income Allowance or Expenses" page
#    When the user selects the Property Income Allowance radio button
#    And the user clicks the Continue button
#    Then the user should be redirected to the "Non Resident Landlord" page
#    When the user selects the Yes radio button
#    And the user clicks the Continue button
#    Then the user should be redirected to the "deducting tax from non uk resident landlord" page
#    When the user selects the Yes radio button
#    And the user selects the How Much Tax Was Deducted? field and enters a value of 100
#    And the user clicks the Continue button
#    Then the user should be redirected to the "uk rental property income" page
#    When the user selects the Deductions field and enters a value of 100
#    And the user clicks the Continue button
#    Then the user should be redirected to the "balancing charge" page
#    When the user selects the Yes radio button
#    And the user clicks the Continue button
#    And the user selects the Enter the amount field and enters a value of 100
#    Then the user should be redirected to the "lease premium payment" page
#    When the user selects the Yes radio button
#    And the user clicks the Continue button
#    Then the user should be redirected to the "Premium Grant Lease" page
#    When the user selects the Yes radio button
#    And the user selects the Enter the amount calculated field and enters a value of 100
#    And the user clicks the Continue button
#    Then the user should be redirected to the "Reverse Premiums received" page
#    When the user selects the Yes radio button
#    And the user selects the Enter the amount field and enters a value of 100
#    And the user clicks the Continue button
#    Then the user is redirected to the "Other income from property" page
#    When the user selects the How much other income from UK property did your client receive? field and enters a value of 1000
#    And the user clicks the Continue button
#    Then the user is redirected to the "foreign rental property income" page
#    When the user selects the How much total income did your client get from their foreign property rental? field and enters a value of 100
#    And the user clicks the Continue button
#    Then the user should be redirected to the "foreign balancing charge" page
#    When the user selects the Yes radio button
#    And the user selects the Enter the amount field and enters a value of 100
#    And the user clicks the Continue button
#    Then the user is redirected to the "foreign premiums for the grant of a lease" page
