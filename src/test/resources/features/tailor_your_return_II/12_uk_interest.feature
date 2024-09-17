@TYR_UK_Interest @TYR_Common_Task_List @TYR_private_beta

Feature: UK Interest Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Interest - Banks and building societies
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
    When the user clicks on the Banks and building societies task list link
    ##TODO Remove comment when the journey is correctly split
#    Then the user should be redirected to the "Add an account with untaxed UK interest" page

  Scenario: Individual User - Interest - Trust fund bond or bonds
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
    When the user clicks on the Trust fund bond or bonds task list link
    ##TODO Remove comment when the journey is correctly split
#    Then the user should be redirected to the "Add an account with taxed UK interest" page

  Scenario: Individual User - Interest - Gilt-edged or accrued income securities
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
    When the user clicks on the Gilt-edged or accrued income securities task list link
    Then the user should be redirected to the "Total interest" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Was tax taken off your interest?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your interest?" page
    When the user selects the amount field and enters a value of 10
    And the user clicks the continue button
    Then the user should be redirected to the "Check your interest from gilt-edged or accrued income securities" page
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning Agent User - Interest - Gilt-edged or accrued income securities
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA123459A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | 1234567890                                                                          |
    Then the user navigates to the Tailor return start page
    ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for InYear
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Gilt-edged or accrued income securities task list link
    Then the user should be redirected to the "Check your client's interest from gilt-edged or accrued income securities" page
    When the user clicks on the change amount of interest link
    Then the user should be redirected to the "Total interest" page
    When the user selects the amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client's interest from gilt-edged or accrued income securities" page
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page