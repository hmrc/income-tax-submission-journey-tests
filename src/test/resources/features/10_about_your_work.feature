@MVP @about_your_work

Feature: About Your Work Journeys Tailor Your Return - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User maximal flow - Income from work and taxable state benefits - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    ##---- About you steps have to be completed in order for About your work steps to work ----##
    ##---- About your work steps ----##
    Then the user navigates to the About your work page
    Then the user should be redirected to the "About Your Work" tailor your return page
    And the user selects the Employed radio button
    And the user selects the Self-employed radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Employment lump sums" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Share schemes at your work" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Taxable state benefits" tailor your return page
    When the user selects the yes radio button
    Then the Hidden message is displayed
    And the user clicks the Continue button
    Then the user should be redirected to the "Statutory benefits paid by HMRC" tailor your return page
    When the user selects the yes radio button
    Then the Hidden message is displayed
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax refunds" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  @ignore
  Scenario: Agent User answers yes for all questions - Income from work and taxable state benefits - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567893 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567893                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    ##---- About you steps have to be completed in order for About your work steps to work ----##
    ##---- About your work steps ----##
    Then the user navigates to the About your work page
    Then the user should be redirected to the "About Your Work" tailor your return page
    And the user selects the Employed radio button
    And the user selects the Self-employed radio button
    When the user selects the Partnership radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Employment lump sums" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Share schemes at your work" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Taxable state benefits" tailor your return page
    When the user selects the yes radio button
    Then the Hidden message is displayed
    And the user clicks the Continue button
    Then the user should be redirected to the "Statutory benefits paid by HMRC" tailor your return page
    When the user selects the yes radio button
    Then the Hidden message is displayed
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax refunds" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  Scenario: Individual user without employed or self-employed - Income from work and taxable state benefits - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123488A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
     ##---- About you steps have to be completed in order for About your work steps to work ----##
    ##---- About your work steps ----##
    Then the user navigates to the About your work page
    Then the user should be redirected to the "About Your Work" tailor your return page
    When the user selects the None of the above radio button
    And the user deselects the Employed radio button
    And the user deselects the Self-employed radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Employment lump sums" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Jobseeker’s Allowance and Employment and Support Allowance" tailor your return page
    When the user selects the Jobseeker's Allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Taxable state benefits" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax refunds" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  @ignore
  Scenario: Agent User answers no for all questions - Income from work and taxable state benefits - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567893 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567893                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
      # #---- About you steps have to be completed in order for About your work steps to work ----##
    ##---- About your work steps ----##
    Then the user navigates to the About your work page
    Then the user should be redirected to the "About Your Work" tailor your return page
    When the user selects the Employed radio button
    When the user selects the Self-employed radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Employment lump sums" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Share schemes at your work" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Taxable state benefits" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Statutory benefits paid by HMRC" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax refunds" tailor your return page
    When the user selects the no radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  Scenario: Individual User maximal flow user selects self employed only - Income from work and taxable state benefits - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    ##---- About you steps have to be completed in order for About your work steps to work ----##
    ##---- About your work steps ----##
    Then the user navigates to the About your work page
    Then the user should be redirected to the "About Your Work" tailor your return page
    And the user selects the Self-employed radio button
    And the user deselects the Employed radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Employment lump sums" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Construction Industry Scheme (CIS)" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Taxable state benefits" tailor your return page
    When the user selects the yes radio button
    Then the Hidden message is displayed
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax refunds" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page

  Scenario: Individual User selects Employed only- Income from work and taxable state benefits - Tailor your return
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AA123456A     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    #TODO remove comments when tailor you return is hooked with submission frontend
    #When the user clicks on the addSections link
    #Then the user should be redirected to the "Add sections to your Income Tax Return" page
    #And the user clicks the About you button
    ##---- About you steps have to be completed in order for About your work steps to work ----##
    ##---- About your work steps ----##
    Then the user navigates to the About your work page
    Then the user should be redirected to the "About Your Work" tailor your return page
    And the user selects the Employed radio button
    And the user deselects the Self-employed radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Employment lump sums" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Share schemes at your work" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Taxable state benefits" tailor your return page
    When the user selects the yes radio button
    Then the Hidden message is displayed
    And the user clicks the Continue button
    Then the user should be redirected to the "Statutory benefits paid by HMRC" tailor your return page
    When the user selects the yes radio button
    Then the Hidden message is displayed
    And the user clicks the Continue button
    Then the user should be redirected to the "Tax refunds" tailor your return page
    When the user selects the yes radio button
    And the user clicks the Continue button
   # Then the user should be redirected to the "Add sections to your Tax Return" tailor your return page