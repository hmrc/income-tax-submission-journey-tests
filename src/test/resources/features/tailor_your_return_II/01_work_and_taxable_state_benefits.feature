@TYR_private_beta @about_your_work

Feature: About Your Work Journeys Tailor Your Return - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user selects both employed and self employed maximum flow - Income from work and taxable state benefits - Tailor your return
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
    ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
      ##---- About you steps have to be Completed in order for Income from work and taxable state benefits link to be active ----##
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    Then the "About you tag" on the page displays "Completed"
    ##---- Income from work and taxable state benefits steps ----##
    Then the "Income from work and taxable state benefits tag" on the page displays "Not started"
    When the user clicks on the Income from work and taxable state benefits link
    Then the user should be redirected to the "What did you do for work?" page
    And the user selects the Employed radio button
    And the user selects the Self-employed radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" page
    When the user selects the Jobseeker's Allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    Then the "Income from work and taxable state benefits tag" on the page displays "Completed"
    ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit an Income Tax Return" page

  Scenario: Agent User selects employed only on "what did you do for work" page  - Income from work and taxable state benefits - Tailor your return
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
      ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    ##---- About you steps have to be Completed in order for Income from work and taxable state benefits link to be active ----##
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
    Then the "About you tag" on the page displays "Completed"
    ##---- Income from work and taxable state benefits steps ----##
    Then the "Income from work and taxable state benefits tag" on the page displays "Not started"
    When the user clicks on the Income from work and taxable state benefits link
    Then the user should be redirected to the "What did your client do for work?" page
    And the user selects the Employed radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" page
    When the user selects the Contribution-based radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your client’s Tax Return" page
    Then the "Income from work and taxable state benefits tag" on the page displays "Completed"
    ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit an Income Tax Return" page

  Scenario: Individual user without employed or self-employed - Income from work and taxable state benefits - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123488A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    Then the user navigates to the Tailor return start page
   ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    ##---- About you steps have to be Completed in order for Income from work and taxable state benefits link to be active ----##
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    Then the "About you tag" on the page displays "Completed"
    ##---- Income from work and taxable state benefits steps ----##
    Then the "Income from work and taxable state benefits tag" on the page displays "Not started"
    When the user clicks on the Income from work and taxable state benefits link
    Then the user should be redirected to the "What did you do for work?" page
    When the user selects the None of the above radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" page
    When the user selects the No, I did not get either of these state benefits radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    Then the "Income from work and taxable state benefits tag" on the page displays "Completed"
    ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit an Income Tax Return" page

  Scenario: Individual User maximal flow user selects self employed only - Income from work and taxable state benefits - Tailor your return
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
   ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
     ##---- About you steps have to be Completed in order for Income from work and taxable state benefits link to be active ----##
    When the user clicks on the About you link
    Then the user should be redirected to the "UK residence status" page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" page
    When the user selects the Donations using Gift Aid radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    Then the "About you tag" on the page displays "Completed"
    ##---- Income from work and taxable state benefits steps ----##
    Then the "Income from work and taxable state benefits tag" on the page displays "Not started"
    When the user clicks on the Income from work and taxable state benefits link
    Then the user should be redirected to the "What did you do for work?" page
    And the user selects the Self-employed radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" page
    When the user selects the Jobseeker's Allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    Then the "Income from work and taxable state benefits tag" on the page displays "Completed"
    ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for InYear
    Then the user should be redirected to the "Update and submit an Income Tax Return" page