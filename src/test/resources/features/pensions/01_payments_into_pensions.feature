@ZAP @pensions

Feature: Pensions Journeys - 01 Payments Into Pensions - Income Tax Submission

  Background:
    Given the user navigates to the auth login page
    And the existing data in service pensions is cleared for nino AA000001C

  Scenario: Individual user as a new submission, goes through full payments into pensions flow
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001C   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addPension tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the pensions link
    Then the user should be redirected to the "Pensions" page
    When the user clicks on the Payments into pensions link
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button
    Then the user should be redirected to the "Did you make any one-off payments into relief at source (RAS) pensions?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total one-off payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button
    Then the user should be redirected to the "Your total payments into relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Pensions where tax relief is not claimed" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay into a retirement annuity contract?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay into your retirement annuity contracts?" page
    When the user selects the amount field and enters a value of 300.30
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay into a workplace pension and not receive tax relief?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay into your workplace pensions?" page
    When the user selects the amount field and enters a value of 400.40
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks on the change link in position 1
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks on the change link in position 1
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button
    Then the user should be redirected to the "Did you make any one-off payments into relief at source (RAS) pensions?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total one-off payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button
    Then the user should be redirected to the "Your total payments into relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: Agent user as a new submission, goes through full payments into pensions flow
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AA000001C&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                             |
      | Confidence Level    | 250                                                                              |
      | Affinity Group      | Agent                                                                            |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                      |
      | Identifier Name 1   | MTDITID                                                                          |
      | Identifier Value 1  | 1234567890                                                                       |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                    |
      | Identifier Name 2   | AgentReferenceNumber                                                             |
      | Identifier Value 2  | XARN1234567                                                                      |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addPension tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the pensions link
    Then the user should be redirected to the "Pensions" page
    When the user clicks on the Payments into pensions link
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client make any one-off payments into relief at source (RAS) pensions?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total one-off payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s total payments into relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Pensions where tax relief is not claimed" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client pay into a retirement annuity contract?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client pay into their retirement annuity contracts?" page
    When the user selects the amount field and enters a value of 300.30
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client pay into a workplace pension and not receive tax relief?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client pay into their workplace pensions?" page
    When the user selects the amount field and enters a value of 400.40
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s payments into pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

    Given the user navigates to the auth login page
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AA000001C&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                             |
      | Confidence Level    | 250                                                                              |
      | Affinity Group      | Agent                                                                            |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                      |
      | Identifier Name 1   | MTDITID                                                                          |
      | Identifier Value 1  | 1234567890                                                                       |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                    |
      | Identifier Name 2   | AgentReferenceNumber                                                             |
      | Identifier Value 2  | XARN1234567                                                                      |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addPension tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the pensions link
    Then the user should be redirected to the "Pensions" page
    When the user clicks on the Payments into pensions link
    Then the user should be redirected to the "Check your client’s payments into pensions" page
    When the user clicks on the change link in position 3

    Then the user should be redirected to the "Did your client make any one-off payments into relief at source (RAS) pensions?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Check your client’s payments into pensions" page

    When the user clicks on the change link in position 5
    Then the user should be redirected to the "Pensions where tax relief is not claimed" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s payments into pensions" page

    When the user clicks on the change link in position 8
    Then the user should be redirected to the "Did your client pay into a workplace pension and not receive tax relief?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s payments into pensions" page

    When the user clicks on the change link in position 9
    Then the user should be redirected to the "How much did your client pay into their workplace pensions?" page
    When the user selects the amount field and enters a value of 10.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s payments into pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: Individual user as a new submission, minimal flow - selects no for all
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001C   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addPension tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the pensions link
    Then the user should be redirected to the "Pensions" page
    When the user clicks on the Payments into pensions link
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Pensions where tax relief is not claimed" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

    Given the user navigates to the auth login page
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001C   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addPension tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the pensions link
    Then the user should be redirected to the "Pensions" page
    When the user clicks on the Payments into pensions link
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks on the change link in position 1
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button
    Then the user should be redirected to the "Did you make any one-off payments into relief at source (RAS) pensions?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total one-off payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: Inyear - Individual user as a new submission, goes through full payments into pensions flow
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001C   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addPension tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the pensions link
    Then the user should be redirected to the "Pensions" page
    When the user clicks on the Payments into pensions link
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button
    Then the user should be redirected to the "Did you make any one-off payments into relief at source (RAS) pensions?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total one-off payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button
    Then the user should be redirected to the "Your total payments into relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Pensions where tax relief is not claimed" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay into a retirement annuity contract?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay into your retirement annuity contracts?" page
    When the user selects the amount field and enters a value of 300.30
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay into a workplace pension and not receive tax relief?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay into your workplace pensions?" page
    When the user selects the amount field and enters a value of 400.40
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks on the change link in position 1
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks on the change link in position 1
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button
    Then the user should be redirected to the "Did you make any one-off payments into relief at source (RAS) pensions?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total one-off payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button
    Then the user should be redirected to the "Your total payments into relief at source (RAS) pensions" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: Inyear - User answers yes only to Pensions where tax relief is not claimed
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001C   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addPension tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the pensions link
    Then the user should be redirected to the "Pensions" page
    When the user clicks on the Payments into pensions link
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pensions where tax relief is not claimed" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay into a retirement annuity contract?" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay into a workplace pension and not receive tax relief?" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: Individual answers NO to Relief at source (RAS) pensions
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001C   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addPension tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the pensions link
    Then the user should be redirected to the "Pensions" page
    When the user clicks on the Payments into pensions link
    Then the user should be redirected to the "Relief at source (RAS) pensions" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pensions where tax relief is not claimed" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay into a retirement annuity contract?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay into your retirement annuity contracts?" page
    When the user selects the amount field and enters a value of 300.30
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay into a workplace pension and not receive tax relief?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay into your workplace pensions?" page
    When the user selects the amount field and enters a value of 400.40
    And the user clicks the continue button
    Then the user should be redirected to the "Check your payments into pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page