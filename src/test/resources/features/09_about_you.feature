@MVP @Tailoring @about_you @ignore

  #TODO remove ignore tag when TYR II About you Journey navigation is complete
Feature: About You Journeys Tailor Your Return - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User maximal flow - About you - Tailor your return
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
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    Then the user navigates to the UK residence status page
    Then the user should be redirected to the "UK residence status" tailor your return page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" tailor your return page
    When the user selects the Donations using Gift Aid radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Marriage Allowance" tailor your return page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you, your partner or someone else get Child Benefit for a child living with you?" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Was your income over £50,000?" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "High Income Child Benefit Charge" tailor your return page
    When the user selects the My income radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you make any patent royalty payments?" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax avoidance schemes" tailor your return page
    When the user selects the Tax avoidance radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  #TODO remove ignore tag when tailor you return Agent navigation is fixed
  @ignore
  Scenario: Agent User maximal flow - About you - Tailor your return
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
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    #And the user clicks the About you button
    Then the user navigates to the UK residence status page
    Then the user should be redirected to the "UK residence status" tailor your return page
    When the user selects the yes, but permanent home is abroad radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" tailor your return page
    When the user selects the Donations using Gift Aid radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Marriage Allowance" tailor your return page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you, your partner or someone else get Child Benefit for a child living with you?" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Was your income over £50,000?" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "High Income Child Benefit Charge" tailor your return page
    When the user selects the My income radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you make any patent royalty payments?" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax avoidance schemes" tailor your return page
    When the user selects the Tax avoidance radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  Scenario: Individual User answers no for all questions - About you - Tailor your return
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
   #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    Then the user navigates to the UK residence status page
    Then the user should be redirected to the "UK residence status" tailor your return page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Your residence status" tailor your return page
    When the user selects the I was a dual resident in the UK and another country radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" tailor your return page
    When the user selects the No, I did not donate to charity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Marriage Allowance" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you, your partner or someone else get Child Benefit for a child living with you?" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you make any patent royalty payments?" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax avoidance schemes" tailor your return page
    When the user selects the No, I was not in any tax avoidance schemes radio button
    And the user clicks the Continue button
    #Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  #TODO remove ignore tag when tailor you return Agent navigation is fixed
  @ignore
  Scenario: Agent User answers no for all questions - About you - Tailor your return
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
    Then the user should be redirected to the "Your Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    Then the user navigates to the UK residence status page
    Then the user should be redirected to the "UK residence status" tailor your return page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Your residence status" tailor your return page
    When the user selects the I was a dual resident in the UK and another country radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Charitable donations" tailor your return page
    When the user selects the No, I did not donate to charity radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Marriage Allowance" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you, your partner or someone else get Child Benefit for a child living with you?" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Were you a foster carer or shared lives carer?" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you make any patent royalty payments?" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax avoidance schemes" tailor your return page
    When the user selects the No, I was not in any tax avoidance schemes radio button
    And the user clicks the Continue button
   #TODO remove comments when tailor you return is hooked with submission frontend
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page