@ZAP @pensions

Feature: Pensions Journeys - 02A Income from Pensions - UK Pension Income - Income Tax Submission

  Background:
    Given the user navigates to the auth login page
    And the existing data in service pensions is cleared for nino AA000001C

  Scenario: Individual journey - Income from pension for other UK Pensions
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
    Then the user should be redirected to the "Have you finished this section?" page for pensions

    When the user selects the Yes, I’ve completed this section radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" page

  @ignore
  Scenario: Agent journey with prior data- Income from pension for other UK Pensions
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

    When the user clicks on the Income from pensions link
    Then the user should be redirected to the "Income from pensions" page
    When the user clicks on the Other UK Pensions link
    Then the user should be redirected to the "Check UK Pension Income" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions

    When the user selects the Yes, I’ve completed this section radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Income from pensions" page
