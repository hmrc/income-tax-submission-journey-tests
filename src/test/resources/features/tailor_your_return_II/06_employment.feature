@TYR_Employment @TYR_Common_Task_List @TYR_private_beta
Feature: Employment Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Employment - PAYE employment (Including student loans)
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
    When the user clicks on the PAYE employment (including student loans) task list link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the Add an employer link
    Then the user should be redirected to the "What’s the name of your employer?" page
    When the user selects the Employer name field and enters a value of Bear’s Blue House LTD
    And the user clicks the continue button
    Then the user should be redirected to the "When did you start working at Bear’s Blue House LTD?" page
    When the user selects the Day field and enters a value of 24
    And the user selects the Month field and enters a value of 09
    And the user selects the Year field and enters a value of 2021
    And the user clicks the continue button
    Then the user should be redirected to the "Did you leave between 6 April 2023 and 5 April 2024?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then  the user should be redirected to the "When did you leave Bear’s Blue House LTD?" page
    When the user selects the Day field and enters a value of 24
    And the user selects the Month field and enters a value of 12
    And the user selects the Year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "What is Bear’s Blue House LTD’s employer PAYE reference? (optional)" page
    When the user selects the PAYE reference field and enters a value of 123/AB456
    And the user clicks the continue button
    Then the user should be redirected to the "What’s your payroll ID for Bear’s Blue House LTD? (optional)" page
    When the user selects the Payroll id field and enters a value of 123456
    And the user clicks the continue button
    Then the user should be redirected to the "How much did Bear’s Blue House LTD pay you?" page
    When the user selects the Pay field and enters a value of 2000.54
    And the user clicks the continue button
    Then the user should be redirected to the "How much UK tax was taken from your Bear’s Blue House LTD earnings?" page
    When the user selects the Tax field and enters a value of 20.54
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment details" page

  Scenario: Returning Agent User In Year- Employment - PAYE employment (Including student loans)
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
    When the user clicks on the PAYE employment (including student loans) task list link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Returning Secondary Agent User In Year- Employment - PAYE employment (Including student loans)
    When the user logs into the service with the following details
      | Redirect url               | /test-only/InYear/additional-parameters?ClientNino=AA123459A&ClientMTDID=1234567890 |
      | Credential Strength        | weak                                                                                |
      | Confidence Level           | 250                                                                                 |
      | Affinity Group             | Agent                                                                               |
      | Enrolment Key 1            | HMRC-AS-AGENT                                                                       |
      | Identifier Name 1          | AgentReferenceNumber                                                                |
      | Identifier Value 1         | XARN1234567                                                                         |
      | Delegated Enrolment Key    | HMRC-MTD-IT-SUPP                                                                    |
      | Delegated Identifier Name  | MTDITID                                                                             |
      | Delegated Identifier Value | 1234567890                                                                          |
      | Delegated Auth Rule        | mtd-it-auth-supp                                                                    |
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
    ##TODO: uncomment when all ema tickets are done
#    Then the user should be redirected to the "Your client’s Income Tax Return" page
#    When the user clicks on the PAYE employment (including student loans) task list link
#    Then the user should be redirected to the "PAYE employment" page
#    When the user clicks the Continue button
#    Then the user should be redirected to the "Have you finished this section?" page
#    When the user selects the yes radio button
#    And the user clicks the continue button
#    Then the user should be redirected to the "Your client’s Income Tax Return" page