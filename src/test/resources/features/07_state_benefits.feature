@MVP @ZAP @state_benefits

Feature: State Benefits Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  #--------------------------------------Individual--------------------------------------#
  Scenario: Individual User with pre populated State Benefits data - In Year Deductions
    When the user logs into the service with the following details
      | Redirect url        | /2023/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AC160000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the State benefits link
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Individual User adds Jobseeker’s Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AC160000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the State benefits link
    Then the user should be redirected to the "State benefits" page
    When the user clicks on the Jobseeker’s Allowance link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks the Add missing claim button
    Then the user should be redirected to the "When did you start getting Jobseeker’s Allowance?" page
    When the user selects the claim Start Day field and enters a value of 01
    And the user selects the claim Start Month field and enters a value of 01
    And the user selects the claim Start Year field and enters a value of 2022
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end in the tax year ending 5 April 2022?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim End Day field and enters a value of 02
    And the user selects the claim End Month field and enters a value of 02
    And the user selects the claim End Year field and enters a value of 2022
    And the user clicks the continue button
    Then the user should be redirected to the "How much Jobseeker’s Allowance did you get between 1 January 2022 and 2 February 2022?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much Jobseeker’s Allowance did you get between 1 January 2022 and 2 February 2022?" page

  #--------------------------------------Agent--------------------------------------#
  Scenario: Agent User with pre populated State benefits data - Check client's State benefits In Year Deductions
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2023/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 200                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567                                                                       |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the State benefits link
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Agent User adds  Jobseeker’s Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 200                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567                                                                       |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the State benefits link
    Then the user should be redirected to the "State benefits" page
    When the user clicks on the Jobseeker’s Allowance link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks the Add missing claim button
    Then the user should be redirected to the "When did your client start getting Jobseeker’s Allowance?" page
    When the user selects the claim Start Day field and enters a value of 01
    And the user selects the claim Start Month field and enters a value of 01
    And the user selects the claim Start Year field and enters a value of 2022
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end in the tax year ending 5 April 2022?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim End Day field and enters a value of 02
    And the user selects the claim End Month field and enters a value of 02
    And the user selects the claim End Year field and enters a value of 2022
    And the user clicks the continue button
    Then the user should be redirected to the "How much Jobseeker’s Allowance did your client get between 1 January 2022 and 2 February 2022?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much Jobseeker’s Allowance did your client get between 1 January 2022 and 2 February 2022?" page
