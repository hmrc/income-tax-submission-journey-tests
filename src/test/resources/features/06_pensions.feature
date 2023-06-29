@MVP @ZAP @pensions

Feature: Pensions Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

    # Payments Into Pensions tests
  Scenario: Individual user as a new submission, goes through full payments into pensions flow
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
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

  Scenario: Agent user as a new submission, goes through full payments into pensions flow
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AA000001A&ClientMTDID=1234567890 |
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
      | Redirect url        | /EOY/start |
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

  Scenario: Agent user has prior submission, updates all payments into pensions amount fields
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA370343B&ClientMTDID=1234567890 |
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

  Scenario: Individual user has prior submission, says yes on relief at source (RAS) pensions page
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
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


  #--------------------------Unauthorised payments from pensions tests---------------------------------#


  Scenario: Individual journey flow - Full Unauthorised pensions journey
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
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
    When the user clicks on the Unauthorised payments from pensions link

    Then the user should be redirected to the "Unauthorised payments" page
    When the user clicks the Yes, unauthorised payments that resulted in a surcharge checkbox
    When the user clicks the Yes, unauthorised payments that did not result in a surcharge checkbox
    And the user clicks the continue button

    Then the user should be redirected to the "Amount that resulted in a surcharge" page
     When the user selects the amount field and enters a value of 200.20
     And the user clicks the continue button

     Then the user should be redirected to the "Did you pay non-UK tax on the amount that resulted in a surcharge?" page
     When the user selects the yes radio button
     When the user selects the amount in pounds field and enters a value of 100.20
     And the user clicks the continue button

     Then the user should be redirected to the "Amount that did not result in a surcharge" page
     When the user selects the amount field and enters a value of 200.20
     And the user clicks the continue button

     Then the user should be redirected to the "Did you pay non-UK tax on the amount that did not result in a surcharge?" page
     When the user selects the yes radio button
     When the user selects the amount in pounds field and enters a value of 110.20
     And the user clicks the continue button

     Then the user should be redirected to the "Were any of the unauthorised payments from a UK pension scheme?" page
     When the user selects the yes on radio button
     And the user clicks the continue button

     Then the user should be redirected to the "Pension Scheme Tax Reference (PSTR)" page
     And the user selects the PSTR field and enters a value of 12345678RA
     And the user clicks the continue button

     Then the user should be redirected to the "Unauthorised payments from UK pensions schemes" page
     And the user clicks the continue button
     Then the user should be redirected to the "Check your unauthorised payments" page
     When the user clicks the save and continue button
     Then the user should be redirected to the "Pensions" page


  Scenario: Agent journey flow - Full Unauthorised pensions journey
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AA000001A&ClientMTDID=1234567890 |
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
    When the user clicks on the Unauthorised payments from pensions link

    Then the user should be redirected to the "Unauthorised payments" page
    When the user clicks the Yes, unauthorised payments that resulted in a surcharge checkbox
    When the user clicks the Yes, unauthorised payments that did not result in a surcharge checkbox
    And the user clicks the continue button

    Then the user should be redirected to the "Amount that resulted in a surcharge" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your client pay non-UK tax on the amount that resulted in a surcharge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Amount that did not result in a surcharge" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your client pay non-UK tax on the amount that did not result in a surcharge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 110.20
    And the user clicks the continue button

    Then the user should be redirected to the "Were any of the unauthorised payments from a UK pension scheme?" page
    When the user selects the yes on radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension Scheme Tax Reference (PSTR)" page
    And the user selects the PSTR field and enters a value of 12345678RA
    And the user clicks the continue button

    Then the user should be redirected to the "Unauthorised payments from UK pensions schemes" page
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s unauthorised payments" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


  Scenario: Individual journey flow - Yes, unauthorised payments that resulted in a surcharge
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
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
    When the user clicks on the Unauthorised payments from pensions link

    Then the user should be redirected to the "Unauthorised payments" page
    When the user clicks the Yes, unauthorised payments that resulted in a surcharge checkbox
    And the user clicks the continue button

    Then the user should be redirected to the "Amount that resulted in a surcharge" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay non-UK tax on the amount that resulted in a surcharge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Were any of the unauthorised payments from a UK pension scheme?" page
    When the user selects the yes on radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension Scheme Tax Reference (PSTR)" page
    And the user selects the PSTR field and enters a value of 12345678RA
    And the user clicks the continue button

    Then the user should be redirected to the "Unauthorised payments from UK pensions schemes" page
    And the user clicks the continue button
    Then the user should be redirected to the "Check your unauthorised payments" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


  Scenario: Individual journey flow - Yes, unauthorised payments that did not result in a surcharge
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
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
    When the user clicks on the Unauthorised payments from pensions link

    Then the user should be redirected to the "Unauthorised payments" page
    When the user clicks the Yes, unauthorised payments that did not result in a surcharge checkbox
    And the user clicks the continue button

    Then the user should be redirected to the "Amount that did not result in a surcharge" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay non-UK tax on the amount that did not result in a surcharge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 110.20
    And the user clicks the continue button

    Then the user should be redirected to the "Were any of the unauthorised payments from a UK pension scheme?" page
    When the user selects the yes on radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension Scheme Tax Reference (PSTR)" page
    And the user selects the PSTR field and enters a value of 12345678RA
    And the user clicks the continue button

    Then the user should be redirected to the "Unauthorised payments from UK pensions schemes" page
    And the user clicks the continue button
    Then the user should be redirected to the "Check your unauthorised payments" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


  Scenario: Individual journey flow - Change, Remove, add another pstr links
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
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
    When the user clicks on the Unauthorised payments from pensions link

    Then the user should be redirected to the "Unauthorised payments" page
    When the user clicks the Yes, unauthorised payments that resulted in a surcharge checkbox
    And the user clicks the continue button

    Then the user should be redirected to the "Amount that resulted in a surcharge" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay non-UK tax on the amount that resulted in a surcharge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Were any of the unauthorised payments from a UK pension scheme?" page
    When the user selects the yes on radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension Scheme Tax Reference (PSTR)" page
    And the user selects the PSTR field and enters a value of 12345678RA
    And the user clicks the continue button
    Then the user should be redirected to the "Unauthorised payments from UK pensions schemes" page

    # step to validate add another pension scheme link
    When the user clicks on the Add another Pensions Scheme Tax Reference link
    Then the user should be redirected to the "Pension Scheme Tax Reference (PSTR)" page
    And the user selects the PSTR field and enters a value of 12345678RW
    And the user clicks the continue button
    Then the user should be redirected to the "Unauthorised payments from UK pensions schemes" page

    # step to validate change PSTR link
    When the user clicks on the Change PSTR link
    Then the user should be redirected to the "Pension Scheme Tax Reference (PSTR)" page
    And the user clicks the continue button
    Then the user should be redirected to the "Unauthorised payments from UK pensions schemes" page

    # step to validate Remove PSTR link
    When the user clicks on the Remove PSTR link
    Then the user should be redirected to the "Do you want to remove this Pension Scheme Tax Reference?" page
    And the user clicks the Remove Reference button
    Then the user should be redirected to the "Unauthorised payments from UK pensions schemes" page

    And the user clicks the continue button
    Then the user should be redirected to the "Check your unauthorised payments" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page

   # Todo -Add the rest of the CYA change links once redirect service is completed
  Scenario: View prior submission, Unauthorised pensions payments journey
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
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
    When the user clicks on the Unauthorised payments from pensions link
    Then the user should be redirected to the "Check your unauthorised payments" page
    When the user clicks on the change link in position 1
    Then the user should be redirected to the "Unauthorised payments" page


  # Todo - Remove ignore tag comment once bug SASS-4685 is fixed
  @ignore
  Scenario: Individual journey flow submission without a PSTR - Unauthorised pensions journey
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
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
    When the user clicks on the Unauthorised payments from pensions link
    Then the user should be redirected to the "Unauthorised payments" page
    When the user clicks the Yes, unauthorised payments that resulted in a surcharge checkbox
    When the user clicks the Yes, unauthorised payments that did not result in a surcharge checkbox
    And the user clicks the continue button
    Then the user should be redirected to the "Amount that resulted in a surcharge" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay non-UK tax on the amount that resulted in a surcharge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button
    Then the user should be redirected to the "Amount that did not result in a surcharge" page
    When the user selects the amount field and enters a value of 200.20
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay non-UK tax on the amount that did not result in a surcharge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 110.20
    And the user clicks the continue button
    Then the user should be redirected to the "Were any of the unauthorised payments from a UK pension scheme?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your unauthorised payments" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


  # Todo -Remove ignore tag once bug SASS-4685 is fixed
  @ignore
  Scenario: User selects No on first question page - Unauthorised pensions journey
  When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
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
    When the user clicks on the Unauthorised payments from pensions link
    Then the user should be redirected to the "Unauthorised payments" page
    When the user clicks the No checkbox
    And the user clicks the continue button
    Then the user should be redirected to the "Check your unauthorised payments" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


      #-------------- Overseas Pensions - Income from overseas Pensions tests ----------#

  Scenario: Individual user as a new submission, goes through full income from overseas pension
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
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
    When the user clicks on the Overseas pensions link
    Then the user should be redirected to the "Overseas pensions" page
    When the user clicks on the Income from overseas pensions link
    Then the user should be redirected to the "Did you get payments from an overseas pension scheme?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What country is the pension scheme registered in?" page
    When the user selects the Country field and enters a value of Togo
    And the user clicks the Country List button
    And the user clicks the continue button
    Then the user should be redirected to the "Pension payments" page
    When the user selects the amount before tax field and enters a value of 300.30
    And the user selects the tax paid field and enters a value of 200.30
    And the user clicks the continue button
    Then the user should be redirected to the "Did you have Special Withholding Tax (SWT) deducted from your pension?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button
    Then the user should be redirected to the "Are you claiming Foreign Tax Credit Relief (FTCR)?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your taxable amount" page
    And the user clicks the continue button
    Then the user should be redirected to the "Pension scheme summary" page
    And the user clicks the pensions scheme save and continue button
    Then the user should be redirected to the "Overseas pension income" page
    And the user clicks the continue button
    Then the user should be redirected to the "Check income from overseas pensions" page


  Scenario: Agent user as a new submission, goes through full income from overseas pension
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AA000001A&ClientMTDID=1234567890 |
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
    When the user clicks on the Overseas pensions link
    Then the user should be redirected to the "Overseas pensions" page
    When the user clicks on the Income from overseas pensions link

    Then the user should be redirected to the "Did your client get payments from an overseas pension scheme?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What country is the pension scheme registered in?" page
    When the user selects the Country field and enters a value of Togo
    And the user clicks the Country List button
    And the user clicks the continue button
    Then the user should be redirected to the "Pension payments" page
    When the user selects the amount before tax field and enters a value of 300.30
    And the user selects the tax paid field and enters a value of 200.30
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client have Special Withholding Tax (SWT) deducted from their pension?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button
    Then the user should be redirected to the "Is your client claiming Foreign Tax Credit Relief (FTCR)?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s taxable amount" page
    And the user clicks the continue button
    Then the user should be redirected to the "Pension scheme summary" page
    And the user clicks the pensions scheme save and continue button
    Then the user should be redirected to the "Overseas pension income" page
    And the user clicks the continue button
    Then the user should be redirected to the "Check income from overseas pensions" page


  Scenario: income from overseas pension - user has prior data
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
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
    When the user clicks on the Overseas pensions link
    Then the user should be redirected to the "Overseas pensions" page
    When the user clicks on the Income from overseas pensions link
    Then the user should be redirected to the "Check income from overseas pensions" page

