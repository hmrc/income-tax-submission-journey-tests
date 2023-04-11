@MVP @ZAP @state_benefits

Feature: State Benefits Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  #-------------------------------Job Seeker's Allowance---------------------------------#
  #--------------------------------------Individual--------------------------------------#
  Scenario: Individual User with pre populated State Benefits data - In Year Deductions
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
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
    When the user clicks on the first view in year link
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks the continue button
    Then the user should be redirected to the "Jobseeker’s Allowance" page

  Scenario: Individual User adds Jobseeker’s Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
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
    When the user selects the claim day field and enters a value of 01
    And the user selects the claim month field and enters a value of 01
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end between 1 January 2023 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did you have any tax taken off your Jobseeker’s Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much Jobseeker’s Allowance did you get between 1 January 2023 and 2 February 2023?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your Jobseeker’s Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the amount field and enters a value of 100.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the first view link
    When the user clicks on the remove claim link
    Then the user should be redirected to the "Are you sure you want to remove this Jobseeker’s Allowance claim?" page
    When the user clicks the Remove claim button
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the first ignored view link
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks the Restore claim button
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks the continue button
    Then the user should be redirected to the "State benefits" page

  Scenario: Individual User edits Jobseeker’s Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
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
    When the user clicks on the first view link
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change start date link
    Then the user should be redirected to the "When did you start getting Jobseeker’s Allowance?" page
    When the user selects the claim day field and enters a value of 04
    And the user selects the claim month field and enters a value of 08
    And the user selects the claim year field and enters a value of 2021
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change end date question link
    Then the user should be redirected to the "Did this claim end between 6 April 2022 and 5 April 2023?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change end date question link
    Then the user should be redirected to the "Did this claim end between 6 April 2022 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 03
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change end date link
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 04
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change tax taken question link
    Then the user should be redirected to the "Did you have any tax taken off your Jobseeker’s Allowance between 6 April 2022 and 4 February 2023?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change amount link
    Then the user should be redirected to the "How much Jobseeker’s Allowance did you get between 6 April 2022 and 4 February 2023?" page
    When the user selects the amount field and enters a value of 510.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change tax taken question link
    Then the user should be redirected to the "Did you have any tax taken off your Jobseeker’s Allowance between 6 April 2022 and 4 February 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your Jobseeker’s Allowance between 6 April 2022 and 4 February 2023?" page
    When the user selects the amount field and enters a value of 100.23
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    And the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Jobseeker’s Allowance" page

  Scenario: Individual User checks flow is correct for EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
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
    When the user selects the claim day field and enters a value of 01
    And the user selects the claim month field and enters a value of 01
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end between 1 January 2023 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did you have any tax taken off your Jobseeker’s Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much Jobseeker’s Allowance did you get between 1 January 2023 and 2 February 2023?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit back link
    And the user clicks on the state benefit back link
    Then the user should be redirected to the "Did you have any tax taken off your Jobseeker’s Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your Jobseeker’s Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the amount field and enters a value of 100.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page

  #--------------------------------------Agent--------------------------------------#
  Scenario: Agent User with pre populated State benefits data - Check client's State benefits In Year Deductions
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
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
    When the user clicks on the first view in year link
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks the continue button
    Then the user should be redirected to the "Jobseeker’s Allowance" page

  Scenario: Agent User adds Jobseeker’s Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
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
    When the user selects the claim day field and enters a value of 01
    And the user selects the claim month field and enters a value of 01
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end between 1 January 2023 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client have any tax taken off their Jobseeker’s Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much Jobseeker’s Allowance did your client get between 1 January 2023 and 2 February 2023?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your client’s Jobseeker’s Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the amount field and enters a value of 100.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the first view link
    When the user clicks on the remove claim link
    Then the user should be redirected to the "Are you sure you want to remove this Jobseeker’s Allowance claim?" page
    When the user clicks the Remove claim button
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the first ignored view link
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks the Restore claim button
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Jobseeker’s Allowance" page
    When the user clicks the continue button
    Then the user should be redirected to the "State benefits" page

  Scenario: Agent User edits Jobseeker’s Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
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
    When the user clicks on the first view link
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change start date link
    Then the user should be redirected to the "When did your client start getting Jobseeker’s Allowance?" page
    When the user selects the claim day field and enters a value of 04
    And the user selects the claim month field and enters a value of 08
    And the user selects the claim year field and enters a value of 2022
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change end date question link
    Then the user should be redirected to the "Did this claim end between 4 August 2022 and 5 April 2023?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change end date question link
    Then the user should be redirected to the "Did this claim end between 4 August 2022 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 03
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change end date link
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 04
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change tax taken question link
    Then the user should be redirected to the "Did your client have any tax taken off their Jobseeker’s Allowance between 4 August 2022 and 4 February 2023?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change amount link
    Then the user should be redirected to the "How much Jobseeker’s Allowance did your client get between 4 August 2022 and 4 February 2023?" page
    When the user selects the amount field and enters a value of 510.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    When the user clicks on the state benefit change tax taken question link
    Then the user should be redirected to the "Did your client have any tax taken off their Jobseeker’s Allowance between 4 August 2022 and 4 February 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your client’s Jobseeker’s Allowance between 4 August 2022 and 4 February 2023?" page
    When the user selects the amount field and enters a value of 100.23
    And the user clicks the continue button
    Then the user should be redirected to the "Review Jobseeker’s Allowance claim" page
    And the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Jobseeker’s Allowance" page

  #-----------------------------Employment Support Allowance-----------------------------#
  #--------------------------------------Individual--------------------------------------#
  Scenario: Individual User with pre populated State Benefits data - In Year Deductions
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
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
    When the user clicks on the Employment and Support Allowance link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first view in year link
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks the continue button
    Then the user should be redirected to the "Employment and Support Allowance" page

  Scenario: Individual User adds Employment and Support Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
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
    When the user clicks on the Employment and Support Allowance link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks the Add missing claim button
    Then the user should be redirected to the "When did you start getting Employment and Support Allowance?" page
    When the user selects the claim day field and enters a value of 01
    And the user selects the claim month field and enters a value of 01
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end between 1 January 2023 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did you have any tax taken off your Employment and Support Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much Employment and Support Allowance did you get between 1 January 2023 and 2 February 2023?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your Employment and Support Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the amount field and enters a value of 100.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first view link
    When the user clicks on the remove claim link
    Then the user should be redirected to the "Are you sure you want to remove this Employment and Support Allowance claim?" page
    When the user clicks the Remove claim button
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first ignored view link
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks the Restore claim button
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks the continue button
    Then the user should be redirected to the "State benefits" page

  Scenario: Individual User edits Employment and Support Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
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
    When the user clicks on the Employment and Support Allowance link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first view link
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change start date link
    Then the user should be redirected to the "When did you start getting Employment and Support Allowance?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 01
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change end date question link
    Then the user should be redirected to the "Did this claim end between 2 January 2023 and 5 April 2023?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change end date question link
    Then the user should be redirected to the "Did this claim end between 2 January 2023 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 03
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change end date link
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 04
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change tax taken question link
    Then the user should be redirected to the "Did you have any tax taken off your Employment and Support Allowance between 2 January 2023 and 4 February 2023?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change amount link
    Then the user should be redirected to the "How much Employment and Support Allowance did you get between 2 January 2023 and 4 February 2023?" page
    When the user selects the amount field and enters a value of 5100.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change tax taken question link
    Then the user should be redirected to the "Did you have any tax taken off your Employment and Support Allowance between 2 January 2023 and 4 February 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your Employment and Support Allowance between 2 January 2023 and 4 February 2023?" page
    When the user selects the amount field and enters a value of 100.23
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    And the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Employment and Support Allowance" page

  #--------------------------------------Agent--------------------------------------#
  Scenario: Agent User with pre populated State benefits data - Check client's State benefits In Year Deductions
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
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
    When the user clicks on the Employment and Support Allowance link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first view in year link
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks the continue button
    Then the user should be redirected to the "Employment and Support Allowance" page

  Scenario: Agent User adds Employment and Support Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
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
    When the user clicks on the Employment and Support Allowance link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks the Add missing claim button
    Then the user should be redirected to the "When did your client start getting Employment and Support Allowance?" page
    When the user selects the claim day field and enters a value of 01
    And the user selects the claim month field and enters a value of 01
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did this claim end between 1 January 2023 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client have any tax taken off their Employment and Support Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much Employment and Support Allowance did your client get between 1 January 2023 and 2 February 2023?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your client’s Employment and Support Allowance between 1 January 2023 and 2 February 2023?" page
    When the user selects the amount field and enters a value of 100.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first view link
    When the user clicks on the remove claim link
    Then the user should be redirected to the "Are you sure you want to remove this Employment and Support Allowance claim?" page
    When the user clicks the Remove claim button
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first ignored view link
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks the Restore claim button
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the state benefit back link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks the continue button
    Then the user should be redirected to the "State benefits" page

  Scenario: Agent User edits Employment and Support Allowance in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC160000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
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
    When the user clicks on the Employment and Support Allowance link
    Then the user should be redirected to the "Employment and Support Allowance" page
    When the user clicks on the first view link
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change start date link
    Then the user should be redirected to the "When did your client start getting Employment and Support Allowance?" page
    When the user selects the claim day field and enters a value of 02
    And the user selects the claim month field and enters a value of 01
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change end date question link
    Then the user should be redirected to the "Did this claim end between 2 January 2023 and 5 April 2023?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change end date question link
    Then the user should be redirected to the "Did this claim end between 2 January 2023 and 5 April 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 03
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change end date link
    Then the user should be redirected to the "When did this claim end?" page
    When the user selects the claim day field and enters a value of 04
    And the user selects the claim month field and enters a value of 02
    And the user selects the claim year field and enters a value of 2023
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change tax taken question link
    Then the user should be redirected to the "Did your client have any tax taken off their Employment and Support Allowance between 2 January 2023 and 4 February 2023?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change amount link
    Then the user should be redirected to the "How much Employment and Support Allowance did your client get between 2 January 2023 and 4 February 2023?" page
    When the user selects the amount field and enters a value of 5100.02
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    When the user clicks on the state benefit change tax taken question link
    Then the user should be redirected to the "Did your client have any tax taken off their Employment and Support Allowance between 2 January 2023 and 4 February 2023?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your client’s Employment and Support Allowance between 2 January 2023 and 4 February 2023?" page
    When the user selects the amount field and enters a value of 100.23
    And the user clicks the continue button
    Then the user should be redirected to the "Review Employment and Support Allowance claim" page
    And the user clicks the state benefit save and continue button
    Then the user should be redirected to the "Employment and Support Allowance" page
