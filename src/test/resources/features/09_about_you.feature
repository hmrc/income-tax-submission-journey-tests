@TYR @about_you

Feature: About You Journeys Tailor Your Return - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User Full Journey Flow - About you - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    Then the user navigates to the Tailor return start page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Marriage Allowance" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you, your partner or someone else get Child Benefit for a child living with you?" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Was your income over £50,000?" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "High Income Child Benefit Charge" page
    When the user selects the My income radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you make any patent royalty payments?" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax avoidance schemes" page
    When the user selects the Tax avoidance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page

  Scenario: Agent User Maximum Flow Answers No For All Questions - About you - Tailor your return
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
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    Then the user navigates to the Tailor return start page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the Not a resident radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Your client’s residence status" page
    When the user selects the My client was not resident in the UK radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the No, my client did not donate to charity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Marriage Allowance" page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did your client, their partner or someone else get Child Benefit for a child living with them?" page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Was your client a foster carer or shared lives carer?" page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did your client make any patent royalty payments?" page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax avoidance schemes" page
    When the user selects the No, my client was not in any tax avoidance schemes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page

  @about_you_private_beta @TYR_private_beta
  Scenario: Individual User Private Beta Journey Flow - About you - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    Then the user navigates to the Tailor return start page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page

  @about_you_private_beta @TYR_private_beta
  Scenario: Agent User Private Beta Answers No For All Questions - About you - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AA123459A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                             |
      | Confidence Level    | 250                                                                              |
      | Affinity Group      | Agent                                                                            |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                      |
      | Identifier Name 1   | MTDITID                                                                          |
      | Identifier Value 1  | 1234567890                                                                       |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                    |
      | Identifier Name 2   | AgentReferenceNumber                                                             |
      | Identifier Value 2  | 1234567890                                                                       |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    Then the user navigates to the Tailor return start page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the Not a resident radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Your client’s residence status" page
    When the user selects the My client was not resident in the UK radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the No, my client did not donate to charity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Was your client a foster carer or shared lives carer?" page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page

  @payment_into_pensions
  Scenario: Individual User Private Beta Journey Flow - About you - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    Then the user navigates to the Tailor return start page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user navigates to the Payments into pensions page
    Then the user should be redirected to the "Payments into pensions" page
    When the user selects the Payments into UK pensions radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page