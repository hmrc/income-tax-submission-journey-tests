@ZAP @pensions

Feature: Pensions Journeys - 03 Pension Annual Allowance - Income Tax Submission
  Background:
    Given the user navigates to the auth login page

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
    Then the user should be redirected to the "Have you finished this section?" page for pensions

    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
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
    Then the user should be redirected to the "Have you finished this section?" page for pensions

    When the user selects the Yes, I’ve completed this section radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  Scenario: Agent journey flow - Pension Annual allowance
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
    Then the user should be redirected to the "Have you finished this section?" page for pensions

    When the user selects the Yes, I’ve completed this section radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Pensions" page

  # TODO Use stateful nino SASS-8170
  @ignore
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
