@MVP @ZAP @employment

Feature: Employment Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Agent user with one employment
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA133742A&ClientMTDID=1234567890  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |200                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |1234567890                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN1234567                                                                        |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "Employment" page
    When the user clicks on the employment details link
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks on the back link
    And the user clicks on the benefits link
    Then the user should be redirected to the "Check your client’s employment benefits" page
    When the user clicks on the back link
    And the user clicks on the expenses link
    Then the user should be redirected to the "Check your client’s employment expenses" page
    When the user clicks on the back link
    And the user clicks on the return to overview link
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Individual user with multiple employments
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |BB444444A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "Employment" page
    When the user clicks on the first employer link
    Then the user should be redirected to the "Employment details and benefits" page
    When the user clicks on the employment details link
    Then the user should be redirected to the "Check your employment details" page
    When the user clicks on the back link
    And the user clicks on the benefits link
    Then the user should be redirected to the "Check your employment benefits" page
    When the user clicks on the back link
    And the user clicks on the return to employment summary link
    And the user clicks on the expenses link
    Then the user should be redirected to the "Check your employment expenses" page

  Scenario: User with no employment data cant click the employment link
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA637489D                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user cannot click the employment link
    
  Scenario: User with a single employment that has no benefits or expenses cant click the benefits/expenses link
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA123459A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "Employment" page
    And the user cannot click the benefits link
    And the user cannot click the expenses link
