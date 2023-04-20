
Feature: Additional Information Journeys (Interest Securities & Gains) - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User maximal flow - Interest from gilt-edged or accrued income securities
    When the user logs into the service with the following details
      |Redirect url       |/EOY/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |250                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |PW911133A                                            |
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
    Then the user should be redirected to the "How much interest did you get?" page
    When the user selects the amount field and enters a value of 400.40
    And the user clicks the continue button
    Then the user should be redirected to the "Was tax taken off your interest?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax was taken off your interest?" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Check your interest from gilt-edged or accrued income securities" page

  Scenario: Individual User says no on "gateway question page" - Interest from gilt-edged or accrued income securities
    When the user logs into the service with the following details
      |Redirect url       |/EOY/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |250                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |PW911133A                                            |
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

    ################################# Gains Journey ####################################################################################

  Scenario: Individual User maximal flow - Gains - User says yes to all questions
    When the user logs into the service with the following details
      |Redirect url       |/InYear/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |250                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |PW911433A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addGains tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Gains from policies and contracts link
    Then the user should be redirected to the "Gains from life insurance policies and contracts" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What type of policy gave you a gain?" page
    When the user selects the Life Insurance radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Policy number" page
    When the user selects the Policy number field and enters a value of LA/2881/07
    And the user clicks the continue button
    Then the user should be redirected to the "Chargeable event gain" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Policy event" page
    When the user selects the Other radio button
    And the user selects the What caused this gain? field and enters a value of Inheritance
    And the user clicks the continue button
    Then the user should be redirected to the "Have you had a gain from this policy in an earlier tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Years since your last gain" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Policy held" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Was your gain treated as tax paid?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Are you entitled to deficiency relief?" page
    When the user selects the yes radio button
    And the user selects the amount field and enters a value of 193
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 1
    Then the user should be redirected to the "What type of policy gave you a gain?" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 2
    Then the user should be redirected to the "Policy number" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 3
    Then the user should be redirected to the "Chargeable event gain" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 4
    Then the user should be redirected to the "Policy event" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 5
    Then the user should be redirected to the "Have you had a gain from this policy in an earlier tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Years since your last gain" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 6
    Then the user should be redirected to the "Years since your last gain" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 7
    Then the user should be redirected to the "Policy held" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 8
    Then the user should be redirected to the "Was your gain treated as tax paid?" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 9
    Then the user should be redirected to the "Are you entitled to deficiency relief?" page
    When the user selects the yes radio button
    And the user selects the amount field and enters a value of 193
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your policies" page


  Scenario: Individual User minimum flow - Gains - User answers no on gain gateway question page
    When the user logs into the service with the following details
      |Redirect url       |/InYear/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |250                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |PW911433A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addGains tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Gains from policies and contracts link
    Then the user should be redirected to the "Gains from life insurance policies and contracts" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your gains from life insurance policies and contracts" page
    When the user clicks the return to overview button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning flow - Individual User with prior Gains Data, Reviews data
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
    When the user clicks the addGains tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the status on the page is "Updated Tag"
    When the user clicks on the Gains from policies and contracts link
    Then the user should be redirected to the "Your policies" page
    When the user clicks the return to overview button
    Then the user should be redirected to the "Your Income Tax Return" page