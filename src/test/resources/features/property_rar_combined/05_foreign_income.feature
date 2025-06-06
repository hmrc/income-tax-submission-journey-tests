@property

Feature: Foreign Income Journey - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user adds foreign income details using an accrual based nino
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page

    # Foreign income
    When the user clicks on the Dividends from foreign companies link
    Then the user should be redirected to the "Foreign dividends by country" page
    And the user clicks the continue button
    Then the user should be redirected to the "Which country did you receive your dividend income from?" page
    When the user selects the Country field and enters a value of Portugal
    And the user clicks the Country option button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tell us about dividend income you received from Portugal before foreign tax was deducted" page
    And the user selects the income received before foreign tax deducted amount field and enters a value of 1200
    And the user clicks the Continue button
    Then the user should be redirected to the "Have you had foreign tax deducted from your dividend income from Portugal?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "How much foreign tax was deducted from your dividend income from Portugal?" page
    And the user selects the tax deducted from dividend income amount field and enters a value of 582
    And the user clicks the Continue button
    Then the user should be redirected to the "Do you want to claim Foreign Tax Credit Relief?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    And the user should be redirected to the "Your foreign dividends by country" page
    When the user selects the No radio button
    And the user clicks the Continue button
    And the user should be redirected to the "Have you completed this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

  Scenario: Agent user adds foreign income details using a cash basis nino
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC210000A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page

    # Foreign income
    When the user clicks on the Dividends from foreign companies link
    Then the user should be redirected to the "Foreign dividends by country" page
    And the user clicks the continue button
    Then the user should be redirected to the "Which country did your client receive their dividend income from?" page
    When the user selects the Country field and enters a value of Italy
    And the user clicks the Country option button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tell us about dividend income your client received from Italy before foreign tax was deducted" page
    And the user selects the income received before foreign tax deducted amount field and enters a value of 4987.23
    And the user clicks the Continue button
    Then the user should be redirected to the "Has your client had foreign tax deducted from their dividend income from Italy?" page
    When the user selects the No radio button
    And the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    And the user should be redirected to the "Your client's foreign dividends by country" page
    When the user selects the No radio button
    And the user clicks the Continue button
    And the user should be redirected to the "Have you completed this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page