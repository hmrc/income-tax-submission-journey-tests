@TYR_Property_Gains @TYR_Common_Task_List @TYR_private_beta
Feature: UK Property Gains Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - UK & Foreign Property Gains - User says no to all questions
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
#   Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Individual User - UK Property Gains - User says no to all questions
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
    When the user deselects the Non UK Property radio button
    When the user clicks the Continue button
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Rental income from property" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the UKProperty link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the Continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the Less than £1,000 radio button and clicks the Continue button
    Then the user should be redirected to the "Report Property Income" page
    When the user selects the I do not want to report my property income radio button and clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the Check your answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button and clicks the Continue button
#   Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Agent User - Foreign Property Gains - User says no to all questions
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567893 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567893                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for InYear
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    When the user clicks on the Income from property, pensions and investments link
    Then the user should be redirected to the "Rental income from property" page
    When the user deselects the UK Property radio button
    When the user clicks the Continue button
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Rental income from property" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the ForeignProperty link
    Then the user should be redirected to the "Foreign property details" page
    When the user clicks the Continue button
    Then the user should be redirected to the "How much total income did your client get from all of their foreign properties?" page
    When the user selects the Less than £1,000 radio button and clicks the Continue button
    Then the user should be redirected to the "Do you want to report your property income?" page
    When the user selects the I do not want to report my client's property income radio button and clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the Check your answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button and clicks the Continue button
#   Then the user should be redirected to the "Your Income Tax Return" page
