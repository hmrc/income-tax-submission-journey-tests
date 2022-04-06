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