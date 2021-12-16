@smoke

Feature: Smoke tests for end of year Employment Journeys to DES/IF in QA - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Returning flow - Individual User with prior UK employment views their details, benefits and expenses - Employment Smoke
    When the user logs into the service with the following details
      |Redirect url       |/2021/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |BB666555A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "Employment" page
    When the user clicks on the change link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the employment details link
    Then the user should be redirected to the "Check your employment details" page
    When the user clicks the back button
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the benefits link
    Then the user should be redirected to the "Check your employment benefits" page
    When the user clicks the back button
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the expenses link
    Then the user should be redirected to the "Check your employment expenses" page


  Scenario: Returning flow - Agent User with prior UK employment views their clients details, benefits and expenses - Employment Smoke
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2021/additional-parameters?ClientNino=BB666555A&ClientMTDID=1234567890  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |200                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |1234567890                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN7654321                                                                        |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "Employment" page
    When the user clicks on the change link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the employment details link
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks the back button
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the benefits link
    Then the user should be redirected to the "Check your client’s employment benefits" page
    When the user clicks the back button
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the expenses link
    Then the user should be redirected to the "Check your client’s employment expenses" page

