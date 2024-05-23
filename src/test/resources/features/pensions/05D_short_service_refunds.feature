@ZAP @pensions

Feature: Pensions Journeys - 05D Short Service refunds - Income Tax Submission

  Background:
    Given the user navigates to the auth login page
    And the existing data in service pensions is cleared for nino AA000001C

  Scenario: Individual user submits a new submission - Short Service Refunds
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
