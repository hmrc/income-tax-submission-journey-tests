@MVP @ZAP @cis

Feature: Construction Industry Scheme (CIS) Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  #--------------------------------------Individual--------------------------------------#
  Scenario: Individual User with pre populated CIS data - Check contractor's CIS In Year Deductions
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start    |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AC150000B     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"

    When the user clicks on the first contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
#    When the user clicks on the first month view link
#    Then the user should be redirected to the "Check your CIS deductions" page
#    When the user clicks on the return to contractor link
#    Then the user should be redirected to the "Contractor CIS deductions" page
#    When the user clicks on the second month view link
#    Then the user should be redirected to the "Check your CIS deductions" page
#    When the user clicks on the return to contractor link
#    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the return to cis summary link
    Then the user should be redirected to the "CIS deductions" page

    When the user clicks on the second contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
#    When the user clicks on the first month view link
#    Then the user should be redirected to the "Check your CIS deductions" page
#    When the user clicks on the return to contractor link
#    Then the user should be redirected to the "Contractor CIS deductions" page
#    When the user clicks on the second month view link
#    Then the user should be redirected to the "Check your CIS deductions" page
#    When the user clicks on the return to contractor link
#    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the return to cis summary link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the cis return to overview link
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Individual User make changes in CYA page for EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks on the third contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month change link
    Then the user should be redirected to the "Check your CIS deductions" page

         #Change End of tax month
#    When the user clicks on the change end of tax month link
#    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
#    When the user clicks the continue button
#    Then the user should be redirected to the "Check your CIS deductions" page

    #Change Labour
    When the user clicks on the change labour link
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
    When the user selects the amount field and enters a value of 100.11
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page

    #Change CIS deductions
    When the user clicks on the change cis deduction link
    Then the user should be redirected to the "How much was taken by your contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 250.02
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

  Scenario: Individual User adds CIS in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks the Add another contractor button
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employer Reference Number field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user clicks the continue button
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
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

  Scenario: Individual User adds another CIS deductions data EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks the third contractor button
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the Add another CIS deduction link
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user clicks the Tax month ending dropdown and selects 5 October
    And the user clicks the continue button
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
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

  Scenario: Individual User - Check back links for adding new contractor EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks the Add another contractor button
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employer Reference Number field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user clicks the continue button
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
    When the user selects the amount field and enters a value of 2000.05
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by your contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 200
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay for materials for your contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay for building materials for your contractor?" page
    When the user selects the amount field and enters a value of 20.05
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "How much did you pay for building materials for your contractor?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Did you pay for materials for your contractor?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "How much was taken by your contractor in CIS deductions?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Contractor details" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Individual User - Check back links for adding new CIS deductions for existing contractor EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks the third contractor button
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the Add another CIS deduction link
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user clicks the Tax month ending dropdown and selects 5 October
    And the user clicks the continue button
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by your contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 200
    And the user clicks the continue button
    Then the user should be redirected to the "Did you pay for materials for your contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you pay for building materials for your contractor?" page
    When the user selects the amount field and enters a value of 20.05
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "How much did you pay for building materials for your contractor?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Did you pay for materials for your contractor?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "How much was taken by your contractor in CIS deductions?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Individual user adds new CIS deductions data to a contractor with no existing CIS history EOY
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks the third contractor button
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the Add another CIS deduction link
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user clicks the Tax month ending dropdown and selects 5 January
    And the user clicks the continue button
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
    When the user selects the amount field and enters a value of 2000.02
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

      #Change End of tax month
    When the user clicks on the change end of tax month link
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page

      #Change Labour
    When the user clicks on the change labour link
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
    When the user selects the amount field and enters a value of 100.11
    And the user clicks the continue button
    Then the user should be redirected to the "Check your CIS deductions" page

      #Change CIS deductions
    When the user clicks on the change cis deduction link
    Then the user should be redirected to the "How much was taken by your contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 520.02
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


  #--------------------------------------Agent--------------------------------------#
  Scenario: Agent User with pre populated CIS data - Check client's CIS In Year Deductions
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890    |
      | Credential Strength | strong                                                                              |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"

#    When the user clicks on the first contractor link
#    Then the user should be redirected to the "Contractor CIS deductions" page
#    When the user clicks on the first month view link
#    Then the user should be redirected to the "Check your client’s CIS deductions" page
#    When the user clicks on the return to contractor link
#    Then the user should be redirected to the "Contractor CIS deductions" page
#    When the user clicks on the second month view link
#    Then the user should be redirected to the "Check your client’s CIS deductions" page
#    When the user clicks on the return to contractor link
#    Then the user should be redirected to the "Contractor CIS deductions" page
#    When the user clicks on the return to cis summary link
#    Then the user should be redirected to the "CIS deductions" page

#    When the user clicks on the second contractor link
#    Then the user should be redirected to the "Contractor CIS deductions" page
#    When the user clicks on the first month view link
#    Then the user should be redirected to the "Check your client’s CIS deductions" page
#    When the user clicks on the return to contractor link
#    Then the user should be redirected to the "Contractor CIS deductions" page
#    When the user clicks on the second month view link
#    Then the user should be redirected to the "Check your client’s CIS deductions" page
#    When the user clicks on the return to contractor link
#    Then the user should be redirected to the "Contractor CIS deductions" page
#    When the user clicks on the return to cis summary link
#    Then the user should be redirected to the "CIS deductions" page
#    When the user clicks on the cis return to overview link
#    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Agent User make changes in CYA page for EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890  |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567                                                                       |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks on the third contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the first month change link
    Then the user should be redirected to the "Check your client’s CIS deductions" page

     #Change End of tax month
#    When the user clicks on the change end of tax month link
#    Then the user should be redirected to the "When did your client’s contractor make CIS deductions?" page
#    When the user clicks the continue button
#    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change Labour
    When the user clicks on the change labour link
    Then the user should be redirected to the "How much did the contractor pay your client for labour?" page
    When the user selects the amount field and enters a value of 100.11
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change CIS deductions
    When the user clicks on the change cis deduction link
    Then the user should be redirected to the "How much was taken by the contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change Paid for materials from yes to no
    When the user clicks on the change paid for materials link
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change Paid for materials from no to yes
    When the user clicks on the change paid for materials link
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change Cost of materials
    When the user clicks on the change cost of materials link
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

  Scenario: Agent User adds CIS in session data EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890  |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567                                                                       |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks on the Add another contractor link
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employer Reference Number field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did your client’s contractor make CIS deductions?" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much did the contractor pay your client for labour?" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by the contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 200
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

  Scenario: Agent User adds another CIS deductions data EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890  |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567                                                                       |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks on the third contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the Add another CIS deduction link
    Then the user should be redirected to the "When did your client’s contractor make CIS deductions?" page
    When the user clicks the Tax month ending dropdown and selects 5 December
    And the user clicks the continue button
    Then the user should be redirected to the "How much did the contractor pay your client for labour?" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by the contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 200
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

  Scenario: Agent User - Check back links for adding new contractor EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567891  |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567891                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567                                                                       |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks the Add another contractor button
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employer Reference Number field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did your client’s contractor make CIS deductions?" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much did the contractor pay your client for labour?" page
    When the user selects the amount field and enters a value of 2640.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by the contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 210
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user selects the amount field and enters a value of 220.05
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "How much was taken by the contractor in CIS deductions?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "How much did the contractor pay your client for labour?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "When did your client’s contractor make CIS deductions?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Contractor details" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Agent User - Check back links for adding new CIS deductions for existing contractor EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890  |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567                                                                       |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    When the user clicks on the third contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks on the Add another CIS deduction link
    Then the user should be redirected to the "When did your client’s contractor make CIS deductions?" page
    When the user clicks the Tax month ending dropdown and selects 5 October
    And the user clicks the continue button
    Then the user should be redirected to the "How much did the contractor pay your client for labour?" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by the contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 200
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user selects the amount field and enters a value of 20.05
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "How much was taken by the contractor in CIS deductions?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "How much did the contractor pay your client for labour?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "When did your client’s contractor make CIS deductions?" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "CIS deductions" page

  Scenario: Agent user adds new CIS deductions data to a contractor with no existing CIS history EOY
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC150000B&ClientMTDID=1234567890  |
      | Credential Strength | strong                                                                            |
      | Confidence Level    | 250                                                                               |
      | Affinity Group      | Agent                                                                             |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                       |
      | Identifier Name 1   | MTDITID                                                                           |
      | Identifier Value 1  | 1234567890                                                                        |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                     |
      | Identifier Name 2   | AgentReferenceNumber                                                              |
      | Identifier Value 2  | XARN1234567                                                                       |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks on the third contractor link
    Then the user should be redirected to the "Contractor CIS deductions" page
    When the user clicks on the Add another CIS deduction link
    Then the user should be redirected to the "When did your client’s contractor make CIS deductions?" page
    When the user clicks the Tax month ending dropdown and selects 5 October
    And the user clicks the continue button
    Then the user should be redirected to the "How much did the contractor pay your client for labour?" page
    When the user selects the amount field and enters a value of 2000.02
    And the user clicks the continue button
    Then the user should be redirected to the "How much was taken by the contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 200
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change End of tax month
    When the user clicks on the change end of tax month link
    Then the user should be redirected to the "When did your client’s contractor make CIS deductions?" page
    When the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change Labour
    When the user clicks on the change labour link
    Then the user should be redirected to the "How much did the contractor pay your client for labour?" page
    When the user selects the amount field and enters a value of 100.11
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change CIS deductions
    When the user clicks on the change cis deduction link
    Then the user should be redirected to the "How much was taken by the contractor in CIS deductions?" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change Paid for materials from yes to no
    When the user clicks on the change paid for materials link
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change Paid for materials from no to yes
    When the user clicks on the change paid for materials link
    Then the user should be redirected to the "Did your client pay for materials for their contractor?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user selects the amount field and enters a value of 110.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

    #Change Cost of materials
    When the user clicks on the change cost of materials link
    Then the user should be redirected to the "How much did your client pay for building materials for the contractor?" page
    When the user selects the amount field and enters a value of 20.02
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s CIS deductions" page

  Scenario: Individual User - A user with no cis data answers yes on gateway question page and changes to no to remove data
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC151111B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
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
    Given no cis deductions data exists
    When the user clicks the Add a contractor button
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employer Reference Number field and enters a value of 123/4567
    And the user clicks the continue button
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    When the user clicks the continue button
    Then the user should be redirected to the "Amount paid before tax by this contractor" page
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

  Scenario: Individual User - A user with cis data answers yes on gateway question page
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
   Then the user should be redirected to the "CIS deductions" page
   And the status on the page is "Yes for gateway question"
   When the user clicks on the CIS deductions change link
   Then the user should be redirected to the "Have you had CIS deductions taken from your payments by contractors?" page
   When the user selects the yes radio button
   And the user clicks the continue button
   Then the user should be redirected to the "CIS deductions" page
   And the status on the page is "Yes for gateway question"

  Scenario: In Year - user cannot update cis if there is prior data
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start    |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AC150000B     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
   Then the user should be redirected to the "CIS deductions" page
   And the status on the page is "Yes for gateway question"

  Scenario: In Year - user cannot update cis if there is no prior data
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start |
      | Credential Strength | strong        |
      | Confidence Level    | 250           |
      | Affinity Group      | Individual    |
      | Nino                | AC152222B     |
      | Enrolment Key 1     | HMRC-MTD-IT   |
      | Identifier Name 1   | MTDITID       |
      | Identifier Value 1  | 1234567890    |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addCisSection tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the CIS You cannot update text is displayed


  Scenario: Individual User adds new Contractor Details - Back button Error
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC150000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the cis deductions link
    Then the user should be redirected to the "CIS deductions" page
    And the status on the page is "Yes for gateway question"
    When the user clicks the Add another contractor button
    Then the user should be redirected to the "Contractor details" page
    When the user selects the Contractor name field and enters a value of Boots Ltd
    And the user selects the Employer Reference Number field and enters a value of 123/AB4567
    When the user clicks the continue button
    Then the user should be redirected to the "When did your contractor make CIS deductions?" page
    And the user goes back to the previous page in their browser's history
    Then the user should be redirected to the "Contractor details" page
    And the user should see the Contractor name field with the value of Boots Ltd
    And the user should see the Employer Reference Number field with the value of 123/AB4567
