@MVP @ZAP @pensions

Feature: Pensions Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

    # Payments Into Pensions tests
  Scenario: Individual user as a new submission, goes through full payments into pensions flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
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
    Then the user should be redirected to the "Pensions where tax relief is not claimed" page
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

  Scenario: Agent user as a new submission, goes through full payments into pensions flow
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AA000001A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                              |
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

  Scenario: Individual user as a new submission, minimal flow - selects no for all
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
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

  @ignore
  Scenario: Agent user has prior submission, updates all payments into pensions amount fields
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2023/additional-parameters?ClientNino=AA370343B&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                              |
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
    Then the user should be redirected to the "Total one-off payments into relief at source (RAS) pensions, plus basic rate tax relief" page
    When the user selects the amount field and enters a value of 40.00
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s total payments into relief at source (RAS) pensions" page
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

  @ignore
  Scenario: Individual user has prior submission, says yes on payments into pensions gateway page
    When the user logs into the service with the following details
      | Redirect url        | /2023/start |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA370343B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
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
    Then the user should be redirected to the "Check your payments into pensions" page