@ZAP @pensions

Feature: Pensions Journeys - 05B Overseas Pensions - Income from Overseas Pensions - Income Tax Submission

  Background:
    Given the user navigates to the auth login page
    And the existing data in service pensions is cleared for nino AA000001C

  Scenario: Individual user as a new submission, goes through full income from overseas pension
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
    When the user clicks on the Income from overseas pensions link
    Then the user should be redirected to the "Did you get payments from an overseas pension scheme?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What country is the pension scheme registered in?" page
    When the user selects the Country field field and enters a value of Togo
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
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Overseas pensions" page

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

  Scenario: Agent user as a new submission, goes through full income from overseas pension
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
    When the user clicks on the Income from overseas pensions link

    Then the user should be redirected to the "Did your client get payments from an overseas pension scheme?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What country is the pension scheme registered in?" page
    When the user selects the Country field field and enters a value of Togo
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
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page for pensions
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Overseas pensions" page

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
