@TYR_UK_Dividends_Shares_Loans @TYR_Common_Task_List @TYR_private_beta
Feature: UK dividends, shares and loans from limited companies Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - UK dividends, shares and loans - Cash dividends from UK stocks and shares
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
    When the user clicks on the Cash dividends from UK stocks and shares task list link
    Then the user should be redirected to the "How much did you get in dividends from UK-based companies?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your dividends" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning Agent User - UK dividends, shares and loans - Cash dividends from UK stocks and shares
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
    When the user clicks on the Cash dividends from UK stocks and shares task list link
    Then the user should be redirected to the "Check your client's dividends" page
    When the user clicks on the change value of dividends from UK companies link
    Then the user should be redirected to the "How much did your client get in dividends from UK-based companies?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client's dividends" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Returning Secondary Agent User - UK dividends, shares and loans - Cash dividends from UK stocks and shares
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
    ##TODO: uncomment when all ema tickets are merged
#    Then the user should be redirected to the "Your client’s Income Tax Return" page
#    When the user clicks on the Cash dividends from UK stocks and shares task list link
#    Then the user should be redirected to the "Check your client's dividends" page
#    When the user clicks on the change value of dividends from UK companies link
#    Then the user should be redirected to the "How much did your client get in dividends from UK-based companies?" page
#    When the user selects the amount field and enters a value of 100
#    And the user clicks the continue button
#    Then the user should be redirected to the "Check your client's dividends" page
#    And the user clicks the continue button
#    Then the user should be redirected to the "Have you finished this section?" page
#    When the user selects the yes radio button
#    And the user clicks the continue button
#    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Individual User - UK dividends, shares and loans - Stock dividends from UK companies
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
    When the user clicks on the Stock dividends from UK companies task list link
    Then the user should be redirected to the "How much did you get?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your dividends" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning Agent User - UK dividends, shares and loans - Stock dividends from UK companies
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
    When the user clicks on the Stock dividends from UK companies task list link
    Then the user should be redirected to the "Check your client's dividends" page
    When the user clicks on the change value of stock dividends link
    Then the user should be redirected to the "How much did your client get?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client's dividends" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Individual User - UK dividends, shares and loans - Dividends from unit trusts or investment companies
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
    When the user clicks on the Dividends from unit trusts or investment companies task list link
    Then the user should be redirected to the "How much did you get in dividends from trusts and open-ended investment companies based in the UK?" page
    When the user selects the amount field and enters a value of 193.45
    And the user clicks the continue button
    Then the user should be redirected to the "Check your dividends" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning Agent User - UK dividends, shares and loans - Dividends from unit trusts or investment companies
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
    When the user clicks on the Dividends from unit trusts or investment companies task list link
    Then the user should be redirected to the "Check your client's dividends" page
    When the user clicks on the change value of unit trusts or investment companies link
    Then the user should be redirected to the "How much did your client get in dividends from trusts and open-ended investment companies based in the UK?" page
    When the user selects the amount field and enters a value of 195.5
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client's dividends" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Individual User - UK dividends, shares and loans - Free or redeemable shares
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
    When the user clicks on the Free or redeemable shares task list link
    Then the user should be redirected to the "How much did you get in free or redeemable shares?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your dividends" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning Agent User - UK dividends, shares and loans - Free or redeemable shares
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
    When the user clicks on the Free or redeemable shares task list link
    Then the user should be redirected to the "Check your client's dividends" page
    When the user clicks on the change value of free or redeemable shares link
    Then the user should be redirected to the "How much did your client get in free or redeemable shares?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client's dividends" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Individual User - UK dividends, shares and loans - Close company loans written off or released
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
    When the user clicks on the Close company loans written off or released task list link
    Then the user should be redirected to the "How much did the close company write off or release from your loan?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your dividends" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning Agent User - UK dividends, shares and loans - Close company loans written off or released
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
    When the user clicks on the Close company loans written off or released task list link
    Then the user should be redirected to the "Check your client's dividends" page
    When the user clicks on the change value of close company loan written off or released link
    Then the user should be redirected to the "How much did the close company write off or release from your client's loan?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client's dividends" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page