@MVP @ZAP @cis

Feature: Construction Industry Scheme (CIS) Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  #--------------------------------------Individual--------------------------------------#
  Scenario: Individual User with pre populated CIS data - Check contractor's CIS In Year Deductions
    When the user logs into the service with the following details
      | Redirect url        | /2023/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page

    When the user clicks on the first contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the return to cis summary link
    Then the user should be redirected to the "CIS deductions" page

    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the return to cis summary link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the cis return to overview link
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Individual User adds CIS data for the first time EOY
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B6   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |

    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Do you want to add a CIS contractor" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employment Reference field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did Boots Ltd make CIS Deductions" page
    When the user selects the Tax month ending field and enters a value of 5th May 2022
    And the user clicks the continue button
    Then the user should be redirected to the "How much did Boots LTD pay for labour" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by Boots Ltd in CIS Deductions" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay for building materials at Boots Ltd" page
    And the user clicks the yes button
    Then the user should be redirected to the "How much did you pay for materials at Boots Ltd" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS Deductions" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "Boots Ltd" page
    And the user clicks the Return to summary button
    Then the user should be redirected to the "CIS Deductions" page

  Scenario: Individual User adds CIS in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the yes button
    Then the user should be redirected to the "CIS Deductions" page
    And the user clicks the add another contractor button
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employment Reference field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did Boots Ltd make CIS Deductions" page
    When the user selects the Tax month ending field and enters a value of 5th May 2022
    And the user clicks the continue button
    Then the user should be redirected to the "How much did Boots LTD pay for labour" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by Boots Ltd in CIS Deductions" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay for building materials at Boots Ltd" page
    And the user clicks the yes button
    Then the user should be redirected to the "How much did you pay for materials at Boots Ltd" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS Deductions" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "Boots Ltd" page
    And the user clicks the Return to summary button
    Then the user should be redirected to the "CIS Deductions" page

  Scenario: Individual User changes CIS in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |

    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the yes button
    Then the user should be redirected to the "CIS Deductions" page
    And the user clicks on the ABC Construction Ltd link
    Then the user should be redirected to the "ABC Construction Ltd" page
    And the user clicks the change button
    Then the user should be redirected to the "Check your CIS Deductions" page
    And the user clicks the change button
    Then the user should be redirected to the "How much did ABC Construction Ltd pay for labour" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by ABC Construction Ltd in CIS Deductions" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay for building materials at ABC Construction Ltd" page
    And the user clicks the yes button
    Then the user should be redirected to the "How much did you pay for materials at ABC Construction Ltd" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS Deductions" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "Boots Ltd" page
    And the user clicks the Return to summary button
    Then the user should be redirected to the "CIS Deductions" page

  Scenario: Individual User removes CIS in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |

    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the yes button
    Then the user should be redirected to the "CIS Deductions" page
    And the user clicks on the ABC Construction Ltd link
    Then the user should be redirected to the "ABC Construction Ltd" page
    And the user clicks the remove button
    Then the user should be redirected to the "Are you sure you want to remove this CIS period" page
    And the user clicks the remove button
    Then the user should be redirected to the "CIS Deductions" page


  #--------------------------------------Agent--------------------------------------#
  Scenario: Agent User with pre populated CIS data - Check client's CIS In Year Deductions
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2023/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 200                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567                                                                       |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page

    When the user clicks on the first contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the return to cis summary link
    Then the user should be redirected to the "CIS deductions" page

    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the return to cis summary link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the cis return to overview link
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Agent User adds CIS data for the first time EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2023/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 200                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567

    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Do you want to add a CIS contractor" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employment Reference field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did Boots Ltd make CIS Deductions" page
    When the user selects the Tax month ending field and enters a value of 5th May 2022
    And the user clicks the continue button
    Then the user should be redirected to the "How much did Boots LTD pay for labour" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by Boots Ltd in CIS Deductions" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay for building materials at Boots Ltd" page
    And the user clicks the yes button
    Then the user should be redirected to the "How much did you pay for materials at Boots Ltd" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS Deductions" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "Boots Ltd" page
    And the user clicks the Return to summary button
    Then the user should be redirected to the "CIS Deductions" page

  Scenario: Agent User adds CIS in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2023/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 200                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567

    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the yes button
    Then the user should be redirected to the "CIS Deductions" page
    And the user clicks the add another contractor button
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employment Reference field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did Boots Ltd make CIS Deductions" page
    When the user selects the Tax month ending field and enters a value of 5th May 2022
    And the user clicks the continue button
    Then the user should be redirected to the "How much did Boots LTD pay for labour" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by Boots Ltd in CIS Deductions" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay for building materials at Boots Ltd" page
    And the user clicks the yes button
    Then the user should be redirected to the "How much did you pay for materials at Boots Ltd" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS Deductions" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "Boots Ltd" page
    And the user clicks the Return to summary button
    Then the user should be redirected to the "CIS Deductions" page

  Scenario: Agent User changes CIS in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2023/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 200                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567

    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the yes button
    Then the user should be redirected to the "CIS Deductions" page
    And the user clicks on the ABC Construction Ltd link
    Then the user should be redirected to the "ABC Construction Ltd" page
    And the user clicks the change button
    Then the user should be redirected to the "Check your CIS Deductions" page
    And the user clicks the change button
    Then the user should be redirected to the "How much did ABC Construction Ltd pay for labour" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by ABC Construction Ltd in CIS Deductions" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay for building materials at ABC Construction Ltd" page
    And the user clicks the yes button
    Then the user should be redirected to the "How much did you pay for materials at ABC Construction Ltd" page
    When the user selects the for example £600 or £193.34 field and enters a value of £200
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS Deductions" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "Boots Ltd" page
    And the user clicks the Return to summary button
    Then the user should be redirected to the "CIS Deductions" page

  Scenario: Agent User removes CIS in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2023/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 200                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567

    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the yes button
    Then the user should be redirected to the "CIS Deductions" page
    And the user clicks on the ABC Construction Ltd link
    Then the user should be redirected to the "ABC Construction Ltd" page
    And the user clicks the remove button
    Then the user should be redirected to the "Are you sure you want to remove this CIS period" page
    And the user clicks the remove button
    Then the user should be redirected to the "CIS Deductions" page

