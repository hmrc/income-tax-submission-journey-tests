@MVP @ZAP @cis

Feature: Construction Industry Scheme (CIS) Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User with pre populated CIS data - Navigate to CIS deductions Summary Page
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Navigate to Your Income Tax Return from CIS deductions Page using Back link
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the back link
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Individual User with pre populated CIS data - Navigate to Your Income Tax Return from CIS deductions Page using Return to overview
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the cis return to overview link
    Then the user should be redirected to the "Your Income Tax Return" page

  @cis
  Scenario: Individual User with pre populated CIS data - Navigate to first CIS contractor Page
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the first contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Navigate to CIS deductions Page from first CIS Contractor Page using Back link
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the first contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the back link
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Navigate to CIS deductions Page from first CIS Contractor Page using Return to CIS summary
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the first contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the return to cis summary link
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Navigate to second CIS contractor Page
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Navigate to CIS deductions Page from second CIS Contractor Page using Back link
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the back link
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Navigate to CIS deductions Page from second CIS Contractor Page using Return to CIS summary
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the return to cis summary link
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Navigate to first month CIS deductions of first contractor
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the first contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Navigate to second month CIS deductions of first contractor
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the first contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Navigate to first month CIS deductions of second contractor
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Navigate to second month CIS deductions of second contractor
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your CIS deductions" page

  Scenario: Individual User with pre populated CIS data - Check if the Back and Return to contractor links are working as expected in Check your CIS deductions page
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
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    #First Contractor
    When the user clicks on the first contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the back link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the back link
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
    #Second Contractor
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the back link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the back link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page

  #########################-----AGENT-----############################
  
  Scenario: Agent User with pre populated CIS data - Navigate to CIS deductions Summary Page
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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

  Scenario: Agent User with pre populated CIS data - Navigate to Your client’s Income Tax Return from CIS deductions Page using Back link
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    When the user clicks on the back link
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Agent User with pre populated CIS data - Navigate to Your client’s Income Tax Return from CIS deductions Page using Return to overview
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    When the user clicks on the cis return to overview link
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Agent User with pre populated CIS data - Navigate to first CIS contractor Page
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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

  Scenario: Agent User with pre populated CIS data - Navigate to CIS deductions Page from first CIS Contractor Page using Back link
        When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    When the user clicks on the back link
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Agent User with pre populated CIS data - Navigate to CIS deductions Page from first CIS Contractor Page using Return to CIS summary
        When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    When the user clicks on the return to cis summary link
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Agent User with pre populated CIS data - Navigate to second CIS contractor Page
        When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page

  Scenario: Agent User with pre populated CIS data - Navigate to CIS deductions Page from second CIS Contractor Page using Back link
        When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the back link
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Agent User with pre populated CIS data - Navigate to CIS deductions Page from second CIS Contractor Page using Return to CIS summary
        When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the return to cis summary link
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Agent User with pre populated CIS data - Navigate to first month CIS deductions of first contractor
        When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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

  Scenario: Agent User with pre populated CIS data - Navigate to second month CIS deductions of first contractor
        When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page

  Scenario: Agent User with pre populated CIS data - Navigate to first month CIS deductions of second contractor
        When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page

  Scenario: Agent User with pre populated CIS data - Navigate to second month CIS deductions of second contractor
        When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page

  Scenario: Agent User with pre populated CIS data - Check if the Back and Return to contractor links are working as expected in Check your client’s CIS deductions page
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890 |
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
    #First Contractor
    When the user clicks on the first contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user clicks on the back link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user clicks on the back link
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
    #Second Contractor
    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user clicks on the back link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user clicks on the back link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the second month view link
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user clicks on the return to contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page