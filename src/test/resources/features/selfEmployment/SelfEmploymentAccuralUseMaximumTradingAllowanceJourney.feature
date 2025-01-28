@SelfEmployment
Feature: Self Employment accrual accounting -Use Maximum trading allowance Journeys

  Background:
    Given the user navigates to the auth login page

  Scenario: Agent Check self employment details
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=BB000001A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Review self-employments link
    Then the user should be redirected to the "Self-employment" page under self employment
    When the user clicks on the View Self Employment link
    Then the user should be redirected to the "Check your client’s self-employment details" page under self employment
    And the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks the Continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

  Scenario: Agent - Self Employment Abroad
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=BB000001A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Self-employment abroad link
    Then the user should be redirected to the "Did your client carry out all of their self-employment abroad?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your client’s details" page under self employment
    And the user clicks the Self Employment Save and continue button

    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

  Scenario: Agent - Self employment InYear Income journey - (Accural accounting - maximum trading allowance)
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=BB000001A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Self-employment Income link
    Then the user should be redirected to the "Income not counted as turnover" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much non-turnover income did your client get?" page under self employment
    And the user selects the Amount-field field and enters a value of 20000
    And the user clicks the Continue button

    Then the user should be redirected to the "Your turnover" page under self employment
    And the user selects the Amount-field field and enters a value of 50000
    And the user clicks the Continue button

    Then the user should be redirected to the "Is there any other self-employment income your client needs to tell us about?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much other self-employment income did your client get?" page under self employment
    And the user selects the Amount-field field and enters a value of 100000
    And the user clicks the Continue button

    Then the user should be redirected to the "Turnover exempt from tax" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of your client’s turnover is exempt from being taxed as profit?" page under self employment
    And the user selects the Amount-field field and enters a value of 120,000
    And the user clicks the Continue button

    Then the user should be redirected to the "Trading allowance" page under self employment
    #Use trading allowance
    When the user selects the Use the trading allowance radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Trading allowance for income under £1,000" page under self employment
    #Use The maximum £1,000
    When the user selects the first radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your client’s income" page under self employment
    And the user clicks the Self Employment Save and continue button

    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

  Scenario: Secondary Agent - Check self employment details
    When the user logs into the service with the following details
      | Redirect url               | /test-only/InYear/additional-parameters?ClientNino=BB000001A&ClientMTDID=1234567890 |
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
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment
    When the user clicks on the Review self-employments link
    Then the user should be redirected to the "Self-employment" page under self employment
    When the user clicks on the View Self Employment link
    Then the user should be redirected to the "Check your client’s self-employment details" page under self employment
    And the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment
    When the user clicks the Continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment
