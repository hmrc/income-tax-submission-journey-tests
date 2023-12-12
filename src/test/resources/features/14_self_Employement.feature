@MVP @ZAP @SelfEmployment

Feature: Self Employment Journeys

  Background:
    Given the user navigates to the auth login page

    #-------------- Review Self Employment Page ----------#
  Scenario: Individual Check self employment details
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001D   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Review self-employments link
    Then the user should be redirected to the "Self-employment" page under self employment
    When the user clicks on the View Self Employment link
    Then the user should be redirected to the "Check your self-employment details" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks the Continue button
    Then the user should be redirected to the "Have you completed this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment


  Scenario: Agent Check self employment details
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA000001D&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Review self-employments link
    Then the user should be redirected to the "Self-employment" page under self employment
    When the user clicks on the View Self Employment link
    Then the user should be redirected to the "Check your client’s self-employment details" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks the Continue button
    Then the user should be redirected to the "Have you completed this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

#-------------- Self Employment Abroad  ----------#
  @ignore
  Scenario: Individual - Self employment abroad
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA000001D   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Self-employment abroad link
    Then the user should be redirected to the "Did you carry out all of your self-employment abroad?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your details" page under self employment
    And the user clicks the Self Employment Save and continue button

    Then the user should be redirected to the "Have you completed this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

  @ignore
  Scenario: Agent - Self Employment Abroad
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA000001D&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Self-employment abroad link
    Then the user should be redirected to the "Did your client carry out all of their self-employment abroad?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your client’s details" page under self employment
    And the user clicks the Self Employment Save and continue button

    Then the user should be redirected to the "Have you completed this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment


