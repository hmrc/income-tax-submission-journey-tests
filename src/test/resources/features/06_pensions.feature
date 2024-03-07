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
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


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
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


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
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


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
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


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
    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


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
    When the user clicks the No unauthorised payments checkbox
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


      #-------------- Overseas Pensions - Overseas transfer charges ----------#

  Scenario: Individual user as a new submission, Selects YES on - Did a UK pension scheme pay the transfer charge to HMRC
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
    When the user clicks on the Overseas transfer charges link
    Then the user should be redirected to the "Did you transfer pension savings into an overseas pension scheme?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did the amount result in an overseas transfer charge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your pension schemes pay tax on the amount that resulted in a transfer charge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did a UK pension scheme pay the transfer charge to HMRC?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension scheme paying the transfer charge" page
    And the user selects the Name of pension scheme field and enters a value of TEST
    And the user selects the Pension Scheme Tax Reference field and enters a value of 12345678RQ
    And the user selects the Pension provider address field and enters a value of AB1 2DE
    And the user clicks the continue button

    Then the user should be redirected to the "Pension schemes paying transfer charges - summary" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check transfers into overseas pensions" page


  Scenario: Individual user as a new submission, Selects NO on - Did a UK pension scheme pay the transfer charge to HMRC
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
    When the user clicks on the Overseas transfer charges link
    Then the user should be redirected to the "Did you transfer pension savings into an overseas pension scheme?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did the amount result in an overseas transfer charge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your pension schemes pay tax on the amount that resulted in a transfer charge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did a UK pension scheme pay the transfer charge to HMRC?" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension scheme paying the transfer charge" page
    And the user selects the Name of pension scheme field and enters a value of TEST
    And the user selects the Pension Scheme Tax Reference field and enters a value of 123456
    And the user selects the Pension provider address field and enters a value of AB1 2DE
    When the user selects the Country field and enters a value of Togo
    And the user clicks the Country List button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension schemes paying transfer charges - summary" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check transfers into overseas pensions" page


  Scenario: Agent user as a new submission, goes through transfer overseas from pension
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
    When the user clicks on the Overseas transfer charges link

    Then the user should be redirected to the "Did your client transfer pension savings into an overseas pension scheme?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did the amount result in an overseas transfer charge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your client’s pension schemes pay tax on the amount that resulted in a transfer charge?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did a UK pension scheme pay the transfer charge to HMRC?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension scheme paying the transfer charge" page
    And the user selects the Name of pension scheme field and enters a value of TEST
    And the user selects the Pension Scheme Tax Reference field and enters a value of 12345678RQ
    And the user selects the Pension provider address field and enters a value of AB1 2DE
    And the user clicks the continue button

    Then the user should be redirected to the "Pension schemes paying transfer charges - summary" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check transfers into overseas pensions" page


  Scenario: Overseas transfer charges (InYear) - user has prior data
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
     When the user clicks on the Overseas transfer charges link
     Then the user should be redirected to the "Check transfers into overseas pensions" page


  Scenario: Individual user  Selects NO on first question page
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
    When the user clicks on the Overseas transfer charges link

    Then the user should be redirected to the "Did you transfer pension savings into an overseas pension scheme?" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Check transfers into overseas pensions" page

  Scenario: Check change links (EOY) - add, remove and change pension scheme
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
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
    When the user clicks on the Overseas transfer charges link

    Then the user should be redirected to the "Check transfers into overseas pensions" page

    When the user clicks on the change link in position 4

    # step to validate  Remove Pension scheme
    When the user clicks on the Remove pension scheme link
    Then the user should be redirected to the "Are you sure you want to remove overseas providerName 1 qualifying scheme?" page
    And the user clicks the Remove Scheme button

    Then the user should be redirected to the "Pension schemes paying transfer charges - summary" page

    And the user clicks the Add a scheme button

    Then the user should be redirected to the "Did a UK pension scheme pay the transfer charge to HMRC?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension scheme paying the transfer charge" page
    And the user selects the Name of pension scheme field and enters a value of TEST
    And the user selects the Pension Scheme Tax Reference field and enters a value of 12345678RQ
    And the user selects the Pension provider address field and enters a value of AB1 2DE
    And the user clicks the continue button

    Then the user should be redirected to the "Pension schemes paying transfer charges - summary" page

    # step to validate  change Pension scheme
    When the user clicks on the Change scheme link
    Then the user should be redirected to the "Did a UK pension scheme pay the transfer charge to HMRC?" page
    And the user clicks the continue button
    Then the user should be redirected to the "Pension scheme paying the transfer charge" page
    And the user clicks the continue button
    Then the user should be redirected to the "Pension schemes paying transfer charges - summary" page

    # step to validate add another pension scheme link
    When the user clicks on the Add another Pensions Scheme Tax Reference link
    Then the user should be redirected to the "Did a UK pension scheme pay the transfer charge to HMRC?" page


    #-------------- Pension Annual allowance ----------#

  Scenario: Individual flow - Pension Annual allowance
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
    When the user clicks on the Pension annual allowance link

    Then the user should be redirected to the "Do you have a reduced annual allowance?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "What type of reduced annual allowance do you have?" page
    When the user clicks the Money purchase annual allowance checkbox
    When the user clicks the Tapered annual allowance checkbox
    And the user clicks the continue button

    Then the user should be redirected to the "Have you gone above your annual allowance?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your pension schemes pay or agree to pay the tax?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Tell us the pension scheme that paid or agreed to pay the tax" page
    And the user selects the PSTR field and enters a value of 12345678RW
    And the user clicks the continue button

    Then the user should be redirected to the "Pension schemes that paid or agreed to pay the annual allowance tax" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check your annual allowance" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page

  # todo - see comment on SASS-7078
  @ignore
  Scenario: User answers no to first question - Pension Annual allowance
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
    When the user clicks on the Pension annual allowance link

    Then the user should be redirected to the "Do you have a reduced annual allowance?" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Check your annual allowance" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


  Scenario: Agent journey flow - Pension Annual allowance
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
    When the user clicks on the Pension annual allowance link

    Then the user should be redirected to the "Does your client have a reduced annual allowance?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "What type of reduced annual allowance does your client have?" page
    When the user clicks the Money purchase annual allowance checkbox
    When the user clicks the Tapered annual allowance checkbox
    And the user clicks the continue button

    Then the user should be redirected to the "Has your client gone above their annual allowance?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your client’s pension schemes pay or agree to pay the tax?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Tell us the pension scheme that paid or agreed to pay the tax" page
    And the user selects the PSTR field and enters a value of 12345678RW
    And the user clicks the continue button

    Then the user should be redirected to the "Pension schemes that paid or agreed to pay the annual allowance tax" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check your client’s annual allowance" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Pensions" page


  Scenario: Individual with prior data - Pension Annual allowance
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
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
    When the user clicks on the Pension annual allowance link
    Then the user should be redirected to the "Check your annual allowance" page

    When the user clicks on the change link in position 6

    # change links tests
    Then the user should be redirected to the "Pension schemes that paid or agreed to pay the annual allowance tax" page
    When the user clicks on the Adding another Pensions Scheme Tax Reference link

    Then the user should be redirected to the "Tell us the pension scheme that paid or agreed to pay the tax" page
    And the user selects the PSTR field and enters a value of 12345678RW
    And the user clicks the continue button
    Then the user should be redirected to the "Pension schemes that paid or agreed to pay the annual allowance tax" page

    When the user clicks on the Change allowance scheme link
    And the user clicks the continue button
    Then the user should be redirected to the "Pension schemes that paid or agreed to pay the annual allowance tax" page

    When the user clicks on the Remove allowance scheme link
    Then the user should be redirected to the "Do you want to remove this Pension Scheme Tax Reference?" page
    And the user clicks the Remove Reference button
    Then the user should be redirected to the "Pension schemes that paid or agreed to pay the annual allowance tax" page


  #-------------- Overseas Pensions - Short Service Refunds ----------#

  Scenario: Individual user submits a new submission - Short Service Refunds
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
    When the user clicks on the Short service refunds link

    Then the user should be redirected to the "Taxable short service refunds" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Non-UK tax on short service refunds" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 10.20
    And the user clicks the continue button

    Then the user should be redirected to the "Short service refund summary" page
    And the user clicks the Add a scheme button

    Then the user should be redirected to the "Pension scheme paying tax on the short service refund" page
    And the user selects the Name of pension scheme field and enters a value of TEST
    When the user selects the QOPS Reference field and enters a value of 123456
    And the user selects the Pension provider address field and enters a value of AB1 2DE
    When the user selects the Country field and enters a value of ESTONIA
    And the user clicks the Country List button
    And the user clicks the continue button

    Then the user should be redirected to the "Short service refund summary" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check short service refunds" page


  Scenario: Verify Change, remove and add another pension scheme links
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
    When the user clicks on the Short service refunds link

    Then the user should be redirected to the "Taxable short service refunds" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Non-UK tax on short service refunds" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 10.20
    And the user clicks the continue button

    Then the user should be redirected to the "Short service refund summary" page
    And the user clicks the Add a scheme button

    Then the user should be redirected to the "Pension scheme paying tax on the short service refund" page
    And the user selects the Name of pension scheme field and enters a value of TEST
    When the user selects the QOPS Reference field and enters a value of 123456
    And the user selects the Pension provider address field and enters a value of AB1 2DE
    When the user selects the Country field and enters a value of ESTONIA
    And the user clicks the Country List button
    And the user clicks the continue button

    Then the user should be redirected to the "Short service refund summary" page

    # step to validate change Pension scheme
    When the user clicks on the Change scheme link
    Then the user should be redirected to the "Pension scheme paying tax on the short service refund" page
    And the user clicks the continue button
    Then the user should be redirected to the "Short service refund summary" page

    # step to validate add another pension scheme link
    When the user clicks on the Add another Pensions Scheme Tax Reference link

    Then the user should be redirected to the "Pension scheme paying tax on the short service refund" page
    And the user selects the Name of pension scheme field and enters a value of TEST
    When the user selects the QOPS Reference field and enters a value of 123456
    And the user selects the Pension provider address field and enters a value of AB1 2DE
    When the user selects the Country field and enters a value of ESTONIA
    And the user clicks the Country List button
    And the user clicks the continue button

    # step to validate  Remove Pension scheme Link
    When the user clicks on the Remove pension scheme link
    Then the user should be redirected to the "Are you sure you want to remove TEST?" page
    And the user clicks the Remove Scheme button
    Then the user should be redirected to the "Short service refund summary" page

    And the user clicks the continue button
    Then the user should be redirected to the "Check short service refunds" page


     #-------------- Income from Pensions - State Pensions ----------#

  Scenario: Individual journey - Income from pension, state pensions
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

    When the user clicks on the Income from pensions link
    Then the user should be redirected to the "Income from pensions" page
    When the user clicks on the State pension link

    Then the user should be redirected to the "Do you get regular State Pension payments?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "When did you start getting State Pension payments?" page
    When the user selects the pension day field and enters a value of 01
    And the user selects the pension month field and enters a value of 01
    And the user selects the pension year field and enters a value of 2023
    And the user clicks the continue button

    Then the user should be redirected to the "Did you get a State Pension lump sum?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay tax on the State Pension lump sum?" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "When did you get your State Pension lump sum?" page
    When the user selects the pension day field and enters a value of 01
    And the user selects the pension month field and enters a value of 01
    And the user selects the pension year field and enters a value of 2023
    And the user clicks the continue button

    Then the user should be redirected to the "Do you want to add State Pension to your Income Tax calculation?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Check your State Pension" page



     #-------------- Income from Pensions - Other UK Pensions ----------#

  Scenario: Individual journey - Income from pension for other UK Pensions
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

    When the user clicks on the Income from pensions link
    Then the user should be redirected to the "Income from pensions" page
    When the user clicks on the Other UK Pensions link

    Then the user should be redirected to the "Do you get UK pension scheme payments?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension scheme details" page
    And the user selects the Name of pension scheme field and enters a value of TEST
    And the user selects the Pension Scheme Tax Reference field and enters a value of 123/AB456
    And the user selects the Pension Identification field and enters a value of 455
    And the user clicks the continue button

    Then the user should be redirected to the "How much pension did you get paid?" page
    When the user selects the amount before tax field and enters a value of 400.30
    And the user selects the tax paid field and enters a value of 100.30
    And the user clicks the continue button

    Then the user should be redirected to the "When did you start getting payments from this scheme?" page
    When the user selects the pension day field and enters a value of 01
    And the user selects the pension month field and enters a value of 01
    And the user selects the pension year field and enters a value of 2023
    And the user clicks the continue button

    Then the user should be redirected to the "Check pension scheme details" page
    And the user clicks the continue button

    Then the user should be redirected to the "UK pension income" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check UK Pension Income" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Income from pensions" page


  Scenario: Agent journey with prior data- Income from pension for other UK Pensions
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AA370343B&ClientMTDID=1234567890 |
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

    When the user clicks on the Income from pensions link
    Then the user should be redirected to the "Income from pensions" page
    When the user clicks on the Other UK Pensions link
    Then the user should be redirected to the "Check UK Pension Income" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Income from pensions" page


   #-------------- Overseas pension - Payment into overseas pension ----------#


  Scenario: Individual user as a new submission - Payment into overseas pension (No customer Reference)
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
    When the user clicks on the Payment into overseas pensions link

    Then the user should be redirected to the "Payments into overseas pension schemes" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Check payments into overseas pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Overseas pensions" page

  Scenario: Payment into overseas pensions (InYear) - user has prior data
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

    When the user clicks on the Payment into overseas pensions link

    Then the user should be redirected to the "Check payments into overseas pensions" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Overseas pensions" page

  Scenario: Individual user as a new submission - Payment into overseas pension (Migrant member relief - add QOPS)
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
    When the user clicks on the Payment into overseas pensions link

    Then the user should be redirected to the "Payments into overseas pension schemes" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "What’s your customer reference number?" page
    And the user selects the Customer reference number field and enters a value of PENSIONINCOME245
    And the user clicks the continue button

    Then the user should be redirected to the "Untaxed employer payments" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button

    Then the user should be redirected to the "What tax relief did you get on payments into overseas pensions?" page
    When the user selects the Migrant member relief radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Qualifying overseas pension scheme (QOPS) reference number (optional)" page
    When the user selects the QOPS Number field and enters a value of 123456
    And the user clicks the continue button

    Then the user should be redirected to the "Pension scheme details" page
    And the user clicks the continue button

    Then the user should be redirected to the "Schemes with untaxed employer payments" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check payments into overseas pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Overseas pensions" page

  Scenario: Individual user as a new submission - Payment into overseas pension (Migrant member relief - NO QOPS)
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
    When the user clicks on the Payment into overseas pensions link

    Then the user should be redirected to the "Payments into overseas pension schemes" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "What’s your customer reference number?" page
    And the user selects the Customer reference number field and enters a value of PENSIONINCOME245
    And the user clicks the continue button

    Then the user should be redirected to the "Untaxed employer payments" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button

    Then the user should be redirected to the "What tax relief did you get on payments into overseas pensions?" page
    When the user selects the Migrant member relief radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Qualifying overseas pension scheme (QOPS) reference number (optional)" page
    And the user clicks the continue button
    Then the user should be redirected to the "Pension scheme details" page
    And the user clicks the continue button

    Then the user should be redirected to the "Schemes with untaxed employer payments" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check payments into overseas pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Overseas pensions" page

  Scenario: Individual user as a new submission - Payment into overseas pension (Double taxation relief)
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
    When the user clicks on the Payment into overseas pensions link

    Then the user should be redirected to the "Payments into overseas pension schemes" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "What’s your customer reference number?" page
    And the user selects the Customer reference number field and enters a value of PENSIONINCOME245
    And the user clicks the continue button

    Then the user should be redirected to the "Untaxed employer payments" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button

    Then the user should be redirected to the "What tax relief did you get on payments into overseas pensions?" page
    When the user selects the Double taxation relief radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Double taxation agreement details" page
    When the user selects the Country field and enters a value of Ghana
    And the user clicks the Country List button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Pension scheme details" page
    And the user clicks the continue button

    Then the user should be redirected to the "Schemes with untaxed employer payments" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check payments into overseas pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Overseas pensions" page

  Scenario: Individual user as a new submission - Payment into overseas pension (Transitional corresponding relief)
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
    When the user clicks on the Payment into overseas pensions link

    Then the user should be redirected to the "Payments into overseas pension schemes" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "What’s your customer reference number?" page
    And the user selects the Customer reference number field and enters a value of PENSIONINCOME245
    And the user clicks the continue button

    Then the user should be redirected to the "Untaxed employer payments" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button

    Then the user should be redirected to the "What tax relief did you get on payments into overseas pensions?" page
    When the user selects the Transitional corresponding relief radio button
    And the user clicks the continue button

    Then the user should be redirected to the "SF74 reference" page
    When the user selects the SF74 reference field and enters a value of 123456
    And the user clicks the continue button

    Then the user should be redirected to the "Pension scheme details" page
    And the user clicks the continue button

    Then the user should be redirected to the "Schemes with untaxed employer payments" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check payments into overseas pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Overseas pensions" page


  Scenario: Individual user as a new submission - Payment into overseas pension (None of these)
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
    When the user clicks on the Payment into overseas pensions link

    Then the user should be redirected to the "Payments into overseas pension schemes" page
    When the user selects the yes radio button
    When the user selects the amount in pounds field and enters a value of 100.20
    And the user clicks the continue button

    Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
    When the user selects the yes radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "What’s your customer reference number?" page
    And the user selects the Customer reference number field and enters a value of PENSIONINCOME245
    And the user clicks the continue button

    Then the user should be redirected to the "Untaxed employer payments" page
    When the user selects the amount field and enters a value of 100.10
    And the user clicks the continue button

    Then the user should be redirected to the "What tax relief did you get on payments into overseas pensions?" page
    When the user selects the None of these radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Pension scheme details" page
    And the user clicks the continue button

    Then the user should be redirected to the "Schemes with untaxed employer payments" page
    And the user clicks the continue button

    Then the user should be redirected to the "Check payments into overseas pensions" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Overseas pensions" page


  Scenario: Payment into overseas pensions (InYear) - user selects NO on first question
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
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

    When the user clicks on the Payment into overseas pensions link

    Then the user should be redirected to the "Payments into overseas pension schemes" page
    When the user selects the no radio button
    And the user clicks the continue button

    Then the user should be redirected to the "Check payments into overseas pensions" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Overseas pensions" page


















