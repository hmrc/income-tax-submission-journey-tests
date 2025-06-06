Feature: Additional Information Journeys (Interest Securities & Gains) - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User maximal flow - Interest from gilt-edged or accrued income securities
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | PW911133A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
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
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | PW911133A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
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
  @GainsSmoke
  Scenario: Individual User maximal flow - Gains - User says yes to all questions
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA000555A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
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
    When the user selects the Policy number field and enters a value of P-89879-123
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
    When the user clicks the Policy remove button
    Then the user should be redirected to the "Are you sure you want to remove this policy?" page
    When the user clicks the remove button
    Then the user should be redirected to the "Your policies" page

  @GainsSmoke
  Scenario: Individual User minimum flow - Gains - User answers no on gain gateway question page
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | PW911421A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
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
    And the status on the page is "Excluded for Gains"
    When the user clicks on the Gains from policies and contracts link
    Then the user should be redirected to the "Gains from life insurance policies and contracts" page

  @GainsSmoke
  Scenario: Returning flow - Individual User with prior Gains Data, Reviews data
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | PW911422A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
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

    ################################# Gains Voided ISA Journey ####################################################################################
  @GainsSmoke
  Scenario: Individual User maximal flow - Gains - User says yes to all questions
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | PW911423A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
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
    When the user selects the Voided ISA radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Policy number" page
    When the user selects the Policy number field and enters a value of P-89879-123
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
    Then the user should be redirected to the "How much tax did you pay on your gain?" page
    When the user selects the amount field and enters a value of 123.45
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
    Then the user should be redirected to the "How much tax did you pay on your gain?" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Your policies" page

  When the user clicks the Policy remove button
  Then the user should be redirected to the "Are you sure you want to remove this policy?" page
  When the user clicks the remove button
  Then the user should be redirected to the "Your policies" page

  @GainsSmoke
  Scenario: Agent User maximal flow - Gains - User says yes to all questions and removes policy
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=PW911424A&ClientMTDID=1234567893 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567893                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addGains tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Gains from policies and contracts link
    Then the user should be redirected to the "Gains from life insurance policies and contracts" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What type of policy gave your client a gain?" page
    When the user selects the Voided ISA radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Policy number" page
    When the user selects the Policy number field and enters a value of P-89879-123
    And the user clicks the continue button
    Then the user should be redirected to the "Chargeable event gain" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Policy event" page
    When the user selects the Other radio button
    And the user selects the What caused this gain? field and enters a value of Inheritance
    And the user clicks the continue button
    Then the user should be redirected to the "Has your client had a gain from this policy in an earlier tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Years since your client's last gain" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Policy held" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "How much tax did your client pay on their gain?" page
    When the user selects the amount field and enters a value of 123.45
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 1
    Then the user should be redirected to the "What type of policy gave your client a gain?" page
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
    Then the user should be redirected to the "Has your client had a gain from this policy in an earlier tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Years since your client's last gain" page
    When the user selects the Gains Year field and enters a value of 99
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 6
    Then the user should be redirected to the "Years since your client's last gain" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 7
    Then the user should be redirected to the "Policy held" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks on the change link in position 8
    Then the user should be redirected to the "How much tax did your client pay on their gain?" page
    And the user clicks the continue button
    Then the user should be redirected to the "Policy summary" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client's policies" page
    When the user clicks the Policy remove button
    Then the user should be redirected to the "Are you sure you want to remove this policy?" page
    When the user clicks the remove button
    Then the user should be redirected to the "Your client's policies" page

    When the user clicks the Add a policy button
    Then the user should be redirected to the "What type of policy gave your client a gain?" page

  @GainsSmoke
  Scenario: Individual User minimum flow - Gains - User answers no on gain gateway question page
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | PW911425A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
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
    And the status on the page is "Excluded for Gains"

  @GainsSmoke
  Scenario: Returning flow - Individual User with prior Gains Data, Reviews data
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA010203A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
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

    ###################################### Stock Dividends #########################################################

  Scenario: Maximal flow - User with no prior data - Dividends
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | PW911133A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addDividend tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Did you get dividends from shares?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get dividends from UK-based companies?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in dividends from UK-based companies?" page
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get dividends from UK-based trusts or open-ended investment companies?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in dividends from trusts and open-ended investment companies based in the UK?" page
    When the user selects the UK other dividends amount field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get stock dividends?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get free or redeemable shares?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in free or redeemable shares?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Close company loans written off" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did the close company write off or release from your loan?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your dividends" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Returning flow - Individual User with prior UK Dividends & Stock Dividends, Review & change - Dividends Smoke
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA911433A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 9876543210  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the dividends link
    Then the user should be redirected to the "Check your income from dividends" page
    When the user clicks on the change uk dividends amount link
    Then the user should be redirected to the "How much did you get in dividends from UK-based companies?" page
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your income from dividends" page
    When the user clicks on the change other dividends amount link
    Then the user should be redirected to the "How much did you get in dividends from trusts and open-ended investment companies based in the UK?" page
    When the user selects the UK other dividends amount field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Check your income from dividends" page

    When the user clicks on the change value of stock dividends link
    Then the user should be redirected to the "Did you get stock dividends?" page
    Then the user should be redirected to the "How much did you get?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your income from dividends" page

    When the user clicks on the change value of free or redeemable shares link
    Then the user should be redirected to the "How much did you get in free or redeemable shares?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your income from dividends" page

    When the user clicks on the change value of close company loan written off or released link
    Then the user should be redirected to the "How much did the close company write off or release from your loan?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Check your income from dividends" page

    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page