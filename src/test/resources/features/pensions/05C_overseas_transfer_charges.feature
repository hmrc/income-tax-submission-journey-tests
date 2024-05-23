@ZAP @pensions

Feature: Pensions Journeys - 05C Overseas Pensions - Overseas transfer charges - Income Tax Submission

  Background:
    Given the user navigates to the auth login page
    And the existing data in service pensions is cleared for nino AA000001C

  Scenario: Individual user as a new submission, Selects YES on - Did a UK pension scheme pay the transfer charge to HMRC
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001C   |
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
      | Nino                | AA000001C   |
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

  @ignore # SASS-7935
  Scenario: Agent user as a new submission, goes through transfer overseas from pension
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

    Given the user navigates to the auth login page
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA000001C     |
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
      | Nino                | AA000001C   |
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

  @ignore # SASS-7935
  Scenario: Check change links (EOY) - add, remove and change pension scheme
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001C   |
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