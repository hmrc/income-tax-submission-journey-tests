@ZAP @pensions

Feature: Pensions Journeys - 04 Unauthorised Payments from Pensions - Income Tax Submission
  Background:
    Given the user navigates to the auth login page

  Scenario: Individual journey flow - Full Unauthorised pensions journey
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

    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: Agent journey flow - Full Unauthorised pensions journey
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AA000001A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                             |
      | Confidence Level    | 250                                                                              |
      | Affinity Group      | Agent                                                                            |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                      |
      | Identifier Name 1   | MTDITID                                                                          |
      | Identifier Value 1  | 1234567890                                                                       |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                    |
      | Identifier Name 2   | AgentReferenceNumber                                                             |
      | Identifier Value 2  | XARN1234567                                                                      |
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

    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: Individual journey flow - Yes, unauthorised payments that resulted in a surcharge
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

    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: Individual journey flow - Yes, unauthorised payments that did not result in a surcharge
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

    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: Individual journey flow - Change, Remove, add another pstr links
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
    Then the user should be redirected to the "Have you finished this section?" page for pensions

    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: View prior submission, Unauthorised pensions payments journey
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA370343B     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
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
    Then the user should be redirected to the "Have you finished this section?" page for pensions

    When the user selects the Yes, I’ve completed this section radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: User selects No on first question page - Unauthorised pensions journey
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
    When the user clicks on the Unauthorised payments from pensions link
    Then the user should be redirected to the "Unauthorised payments" page
    When the user clicks the No unauthorised payments checkbox
    And the user clicks the continue button
    Then the user should be redirected to the "Check your unauthorised payments" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions

    When the user selects the Yes, I’ve completed this section radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page
