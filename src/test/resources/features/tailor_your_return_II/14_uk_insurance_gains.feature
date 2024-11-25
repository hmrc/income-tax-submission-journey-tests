@TYR_UK_Insurance_Gains @TYR_Common_Task_List @TYR_private_beta

Feature: UK Insurance Gains Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - UK Insurance Gains - Life Insurance - User says yes to all questions
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
    When the user clicks on the Life Insurance common task list link
    Then the user should be redirected to the "Policy number" page
    When the user selects the Policy number field and enters a value of P-89879-123
    And the user clicks the continue button
    Then the user should be redirected to the "Chargeable event gain" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Policy event" page
    When the user selects the Other radio button
    And the user selects the What caused this gain? field and enters a value of Inheritance
    And the user clicks the continue button
    Then the user should be redirected to the "Have you had a gain from this policy in an earlier tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Years since your last gain" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Policy held" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Was your gain treated as tax paid?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Are you entitled to deficiency relief?" page
    When the user selects the yes radio button
    And the user selects the amount field and enters a value of 193
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

  Scenario: Individual User - UK Insurance Gains - Life Annuity - User answers no on gains status page
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
    When the user clicks on the Life Annuity common task list link
    Then the user should be redirected to the "Policy number" page
    When the user selects the Policy number field and enters a value of P-89879-123
    And the user clicks the continue button
    Then the user should be redirected to the "Chargeable event gain" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Policy event" page
    When the user selects the Full or part surrender radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Have you had a gain from this policy in an earlier tax year?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Policy held" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Was your gain treated as tax paid?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Are you entitled to deficiency relief?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

  Scenario: Individual User - UK Insurance Gains - Capital Redemption - User answers no on Deficiency relief page
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
    When the user clicks on the Capital Redemption common task list link
    Then the user should be redirected to the "Policy number" page
    When the user selects the Policy number field and enters a value of P-89879-123
    And the user clicks the continue button
    Then the user should be redirected to the "Chargeable event gain" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Policy event" page
    When the user selects the Sale or assignment of a policy radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Have you had a gain from this policy in an earlier tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Years since your last gain" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Policy held" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Was your gain treated as tax paid?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Are you entitled to deficiency relief?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

  Scenario: Individual User - UK Insurance Gains - Voided ISA(a policy cancelled by your ISA manager)
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
    When the user clicks on the Voided ISA(a policy cancelled by your ISA manager) common task list link
    Then the user should be redirected to the "Policy number" page
    When the user selects the Policy number field and enters a value of P-89879-123
    And the user clicks the continue button
    Then the user should be redirected to the "Chargeable event gain" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Policy event" page
    When the user selects the Other radio button
    And the user selects the What caused this gain? field and enters a value of Inheritance
    And the user clicks the continue button
    Then the user should be redirected to the "Have you had a gain from this policy in an earlier tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Years since your last gain" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Policy held" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax did you pay on your gain?" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

  Scenario: Returning Agent User - UK Insurance Gains - Life Insurance - Individual User with prior Gains Data, Reviews data
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
    When the user clicks on the Life Insurance common task list link
    Then the user should be redirected to the "Your client's policies" page
    When the user clicks on the Chane Policy link
    Then the user should be redirected to the "Policy summary" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client's policies" page
    And the user clicks the return to overview button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Secondary Agent User authorised
    When the user logs into the service with the following details
      | Redirect url               | /test-only/InYear/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567893 |
      | Credential Strength        | weak                                                                                |
      | Confidence Level           | 250                                                                                 |
      | Affinity Group             | Agent                                                                               |
      | Enrolment Key 1            | HMRC-AS-AGENT                                                                       |
      | Identifier Name 1          | AgentReferenceNumber                                                                |
      | Identifier Value 1         | XARN1234567                                                                         |
      | Delegated Enrolment Key    | HMRC-MTD-IT-SUPP                                                                    |
      | Delegated Identifier Name  | MTDITID                                                                             |
      | Delegated Identifier Value | 1234567893                                                                          |
      | Delegated Auth Rule        | mtd-it-auth-supp                                                                    |
    ## TODO: delete the following steps once SASS-10357 gets implemented
    Then the user should be redirected to the "There’s a problem" page
    When the user visits Gains gateway
    Then the user should be redirected to the "Gains from life insurance policies and contracts" page