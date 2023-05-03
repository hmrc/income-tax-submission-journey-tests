@smoke @cis

Feature: Construction Industry Scheme (CIS) Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User adds and removes CIS deductions in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | PW911433A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addCisSection tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "Have you had CIS deductions taken from your payments by contractors?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    Given no cis deductions data exists
    When the user clicks the Add a contractor button
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employer Reference Number field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much did your contractor pay you for labour?" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by your contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 200
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay for materials for your contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay for building materials for your contractor?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks the CIS save and continue button
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month change link
    Then the user should be redirected to the "Check your CIS deductions" page

    #Change End of tax month
    When the user clicks on the change end of tax month link
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page

    #Change Labour
    When the user clicks on the change labour link
    Then the user should be redirected to the "How much did your contractor pay you for labour?" page
    When the user selects the amount field and enters a value of 100.11
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page

    #Change CIS deductions
    When the user clicks on the change cis deduction link
    Then the user should be redirected to the "How much was taken by your contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page

    #Change Paid for materials from yes to no
    When the user clicks on the change paid for materials link
    Then the user should be redirected to the "Did you pay for materials for your contractor?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page

    #Change Paid for materials from no to yes
    When the user clicks on the change paid for materials link
    Then the user should be redirected to the "Did you pay for materials for your contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay for building materials for your contractor?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page

    #Change Cost of materials
    When the user clicks on the change cost of materials link
    Then the user should be redirected to the "How much did you pay for building materials for your contractor?" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page

    When the user clicks the CIS save and continue button
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month remove link
    Then the user should be redirected to the "Are you sure you want to remove this CIS deduction?" page
    When the user clicks the Remove period button
    Then the user should be redirected to the "Your Income Tax Return" page

 # TODO: Scenario: EOY - Individual User with prior CIS Data, Reviews data


  Scenario: In Year - Individual User with prior CIS Data, Reviews data
    When the user logs into the service with the following details
      |Redirect url       |/InYear/start                                        |
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
    When the user clicks the addCisSection tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the status on the page is "Cannot Update for Cis"
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
