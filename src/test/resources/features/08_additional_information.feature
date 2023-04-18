@additional_info

Feature: Additional Information Journeys (Interest Securities) - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User maximal flow - Interest from gilt-edged or accrued income securities
    When the user logs into the service with the following details
      |Redirect url       |/InYear/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |250                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA123456A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addInterest tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Interest from savings and securities link
    Then the user should be redirected to the "Interest from savings and securities" page
    When the user clicks on the Interest from gilt-edged or accrued income securities link
    Then the user should be redirected to the "Interest from gilt-edged or accrued income securities" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total interest" page
    When the user selects the amount field and enters a value of 400.40
    And the user clicks the continue button
    Then the user should be redirected to the "Was tax taken off your interest?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your interest?" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Check your interest from gilt-edged or accrued income securities" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Interest from savings and securities" page

  Scenario: Agent User maximal flow - Interest from gilt-edged or accrued income securities
    When the user logs into the service with the following details
      |Redirect url       |/test-only/InYear/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567893  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |250                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |1234567893                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN1234567                                                                        |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addInterest tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Interest from savings and securities link
    Then the user should be redirected to the "Interest from savings and securities" page
    When the user clicks on the Interest from gilt-edged or accrued income securities link
    Then the user should be redirected to the "Interest from gilt-edged or accrued income securities" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total interest" page
    When the user selects the amount field and enters a value of 400.40
    And the user clicks the continue button
    Then the user should be redirected to the "Was tax taken off your client’s interest?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your client’s interest?" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client's interest from gilt-edged or accrued income securities" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Interest from savings and securities" page

  Scenario: Individual User says no on "gateway question page" - Interest from gilt-edged or accrued income securities
    When the user logs into the service with the following details
      |Redirect url       |/EOY/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |250                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA123456A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addInterest tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Interest from savings and securities link
    Then the user should be redirected to the "Interest from savings and securities" page
    When the user clicks on the Interest from gilt-edged or accrued income securities link
    Then the user should be redirected to the "Interest from gilt-edged or accrued income securities" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your interest from gilt-edged or accrued income securities" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Interest from savings and securities" page

  Scenario: Individual User says answers on "Was tax taken off your interest?" page - Interest from gilt-edged or accrued income securities
    When the user logs into the service with the following details
      |Redirect url       |/test-only/InYear/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567893  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |250                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |1234567893                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN1234567                                                                        |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addInterest tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Interest from savings and securities link
    Then the user should be redirected to the "Interest from savings and securities" page
    When the user clicks on the Interest from gilt-edged or accrued income securities link
    Then the user should be redirected to the "Interest from gilt-edged or accrued income securities" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Total interest" page
    When the user selects the amount field and enters a value of 400.40
    And the user clicks the continue button
    Then the user should be redirected to the "Was tax taken off your client’s interest?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client's interest from gilt-edged or accrued income securities" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Interest from savings and securities" page