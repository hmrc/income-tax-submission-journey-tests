@smoke

Feature: Smoke tests for end of year Employment Journeys to DES/IF in QA - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Returning flow - Individual User with prior UK employment views their details, benefits and expenses - Employment Smoke
    When the user logs into the service with the following details
      |Redirect url       |/2021/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |BB666555A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the change employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the employment details link
    Then the user should be redirected to the "Check your employment details" page
    When the user clicks the back button
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page
    When the user clicks the back button
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the student loans link
    Then the user should be redirected to the "Check your student loan repayment details" page
    When the user clicks the back button
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the return to employment summary link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the view expenses link
    Then the user should be redirected to the "Check your employment expenses" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page



  Scenario: Returning flow - Agent User with prior UK employment views their clients details, benefits and expenses - Employment Smoke
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2021/additional-parameters?ClientNino=BB666555A&ClientMTDID=1234567890  |
      |Credential Strength|weak                                                                               |
      |Confidence Level   |200                                                                                |
      |Affinity Group     |Agent                                                                              |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                        |
      |Identifier Name 1  |MTDITID                                                                            |
      |Identifier Value 1 |1234567890                                                                         |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                      |
      |Identifier Name 2  |AgentReferenceNumber                                                               |
      |Identifier Value 2 |XARN7654321                                                                        |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the change employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the employment details link
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks the back button
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your client’s employment benefits" page
    When the user clicks the back button
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the student loans link
    Then the user should be redirected to the "Check your client’s student loan repayment details" page
    When the user clicks the back button
    When the user clicks on the return to employment summary link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the view expenses link
    Then the user should be redirected to the "Check your client’s employment expenses" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page

  Scenario: User is adding their first employment for a tax year
    When the user logs into the service with the following details
      | Redirect url        | /2021/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AB654321C   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "Do you want to add an employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What’s the name of your employer?" page
    When the user selects the Employer name field and enters a value of Bear’s Blue House LTD
    And the user clicks the continue button
    Then the user should be redirected to the "What’s the PAYE reference of your employer?" page
    When the user selects the PAYE reference field and enters a value of 123/AB456
    And the user clicks the continue button
    Then the user should be redirected to the "When did you start working for your employer?" page
    When the user selects the Day field and enters a value of 04
    And the user selects the Month field and enters a value of 05
    And the user selects the Year field and enters a value of 2016
    And the user clicks the continue button
    Then the user should be redirected to the "Are you still working for your employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What’s your payroll ID for this employment?" page
    When the user selects the Payroll id field and enters a value of 123456
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your employer pay you?" page
    When the user selects the Pay field and enters a value of 2,500
    And the user clicks the continue button
    Then the user should be redirected to the "How much UK tax was taken from your earnings?" page
    When the user selects the Tax field and enters a value of 36.01
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment details" page
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any car, van or fuel benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a company car benefit?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total company car benefit?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get fuel benefit for a company car?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a company van benefit?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total company van benefit?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get fuel benefit for a company van?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a mileage benefit for using your own car for work?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get accommodation or relocation benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any travel or entertainment benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any utility or general service benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any medical, dental, childcare, education benefits or loans from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer pay any of your Income Tax or incurred costs?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any reimbursed costs, vouchers or non-cash benefits from your employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any assets from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page
    And the user clicks the continue button
    Then the user should be redirected to the "Did you repay any student loan while employed by Bear’s Blue House LTD?" page
    When the user clicks both the undergraduate repayments and postgraduate repayments checkboxes
    And the user clicks the continue button
    Then the user should be redirected to the "How much undergraduate loan did you repay while employed by Bear’s Blue House LTD?" page
    When the user selects the amount field and enters a value of 117
    And the user clicks the continue button
    Then the user should be redirected to the "How much postgraduate loan did you repay while employed by Bear’s Blue House LTD?" page
    When the user selects the amount field and enters a value of 9000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your student loan repayment details" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim employment expenses?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Employment expenses" page
    When the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim business travel and overnight expenses?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much do you want to claim for business travel and overnight stays?" page
    When the user selects the amount field and enters a value of 100
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim for uniforms, work clothes, or tools?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim for professional fees and subscriptions?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim for buying other equipment?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the remove employment link
    Then the user should be redirected to the "Are you sure you want to remove this employment?" page
    When the user clicks the Remove employer button
    Then the user should be redirected to the "Do you want to add an employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Agent user with at least one prior employment adds a new Employment
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2021/additional-parameters?ClientNino=AC123456B&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                              |
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
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the Add another employer link
    Then the user should be redirected to the "What’s the name of your client’s employer?" page
    When the user selects the Employer name field and enters a value of Bear’s Blue House LTD
    And the user clicks the continue button
    Then the user should be redirected to the "What’s the PAYE reference of your client’s employer?" page
    When the user selects the PAYE reference field and enters a value of 123/AB456
    And the user clicks the continue button
    Then the user should be redirected to the "When did your client start working for their employer?" page
    When the user selects the Day field and enters a value of 14
    And the user selects the Month field and enters a value of 07
    And the user selects the Year field and enters a value of 2012
    And the user clicks the continue button
    Then the user should be redirected to the "Is your client still working for their employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did your client leave their employer?" page
    When the user selects the Day field and enters a value of 24
    And the user selects the Month field and enters a value of 09
    And the user selects the Year field and enters a value of 2020
    And the user clicks the continue button
    Then the user should be redirected to the "What’s your client’s payroll ID for this employment?" page
    When the user selects the Payroll id field and enters a value of 123456
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client’s employer pay them?" page
    When the user selects the Pay field and enters a value of 2000.54
    And the user clicks the continue button
    Then the user should be redirected to the "How much UK tax was taken from your client’s earnings?" page
    When the user selects the Tax field and enters a value of 20.54
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment details" page
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get any benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get any car, van or fuel benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get a company car benefit?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your client’s total company car benefit?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get fuel benefit for a company car?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get a company van benefit?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your client’s total company van benefit?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get fuel benefit for a company van?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get a mileage benefit for using their own car for work?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get accommodation or relocation benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get any travel or entertainment benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get any utility or general service benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get any medical, dental, childcare, education benefits or loans from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client’s employer pay any of their Income Tax or incurred costs?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get any reimbursed costs, vouchers or non-cash benefits from their employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client get any assets from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment benefits" page
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client repay any student loan while employed by Bear’s Blue House LTD?" page
    When the user clicks the no repayments checkbox
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s student loan repayment details" page
    And the user clicks the continue button
#    TODO:  change to "do you want to amend expenses for this employer?" page when available
    Then the user should be redirected to the "Do you want to claim employment expenses for your client?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment expenses" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the first remove employment link
    Then the user should be redirected to the "Are you sure you want to remove this employment?" page
    When the user clicks the Remove employer button
    Then the user should be redirected to the "PAYE employment" page
