@MVP @ZAP @employment

Feature: Employment Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Agent user with one employment checks their details, benefits, student loans and expenses
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2023/additional-parameters?ClientNino=AA133742A&ClientMTDID=1234567890 |
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
    When the user clicks on the view employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the employment details link
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks on the return to employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the return to employment summary link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the view employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your client’s employment benefits" page
    When the user clicks on the return to employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the return to employment summary link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the view employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the student loans link
    Then the user should be redirected to the "Check your client’s student loan repayment details" page
    When the user clicks on the return to employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the return to employment summary link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the view expenses link
    Then the user should be redirected to the "Check your client’s employment expenses" page
    When the user clicks on the return to employment summary link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the return to overview link
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Individual user with multiple employments checks their details, benefits, student loans and expenses
    When the user logs into the service with the following details
      | Redirect url        | /2023/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the view first employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the employment details link
    Then the user should be redirected to the "Check your employment details" page
    When the user clicks on the return to employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page
    When the user clicks on the return to employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the student loans link
    Then the user should be redirected to the "Check your student loan repayment details" page
    When the user clicks on the return to employer link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the return to employment summary link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the view expenses link
    Then the user should be redirected to the "Check your employment expenses" page
    When the user clicks on the return to employment summary link
    Then the user should be redirected to the "PAYE employment" page

  Scenario: User with no employment data can click the employment link
    When the user logs into the service with the following details
      | Redirect url        | /2023/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AA637489D   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user can click the employment link and it navigates to the employment summary page

  Scenario: User is adding their first employment for a tax year
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AA637489D   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the Add an employer link
    Then the user should be redirected to the "What’s the name of your employer?" page
    When the user selects the Employer name field and enters a value of Bear’s Blue House LTD
    And the user clicks the continue button
    Then the user should be redirected to the "What’s the PAYE reference of your employer?" page
    When the user selects the PAYE reference field and enters a value of 123/AB456
    And the user clicks the continue button
    Then the user should be redirected to the "Did you leave this employer in the tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Employment dates" page
    When the user selects the Start Day field and enters a value of 24
    And the user selects the Start Month field and enters a value of 09
    And the user selects the Start Year field and enters a value of 2021
    When the user selects the End Day field and enters a value of 24
    And the user selects the End Month field and enters a value of 03
    And the user selects the End Year field and enters a value of 2022
    And the user clicks the continue button
    Then the user should be redirected to the "What’s your payroll ID for this employment?" page
    When the user selects the Payroll id field and enters a value of 123456
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your employer pay you?" page
    When the user selects the Pay field and enters a value of 2000.54
    And the user clicks the continue button
    Then the user should be redirected to the "How much UK tax was taken from your earnings?" page
    When the user selects the Tax field and enters a value of 20.54
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment details" page

  Scenario: Agent user with at least one prior employment adds a new Employment and no to "Did your client leave this employer in the tax year?"
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=BB444444A&ClientMTDID=1234567890 |
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
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the Add another employer link
    Then the user should be redirected to the "Which period of employment do you want to add?" page
    When the user selects the first radio button: select existing one
    And the user clicks the continue button
    When the user clicks on the Add another employer link
    Then the user should be redirected to the "Which period of employment do you want to add?" page
    When the user selects the third radio button: select Add a new employer
    And the user clicks the continue button
    Then the user should be redirected to the "What’s the name of your client’s employer?" page
    When the user selects the Employer name field and enters a value of Bear’s Blue House LTD
    And the user clicks the continue button
    Then the user should be redirected to the "What’s the PAYE reference of your client’s employer?" page
    When the user selects the PAYE reference field and enters a value of 123/AB456
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client leave this employer in the tax year?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "When did your client start working for their employer?" page
    When the user selects the Day field and enters a value of 14
    And the user selects the Month field and enters a value of 07
    And the user selects the Year field and enters a value of 2012
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

  Scenario: Agent user with at least one prior employment adds a new Employment and yes to "Did your client leave this employer in the tax year?"
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=BB444444A&ClientMTDID=1234567890 |
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
    Then the user should be redirected to the "Which period of employment do you want to add?" page
    When the user selects the third radio button: select new one
    And the user clicks the continue button
    Then the user should be redirected to the "What’s the name of your client’s employer?" page
    When the user selects the Employer name field and enters a value of Bear’s Blue House LTD
    And the user clicks the continue button
    Then the user should be redirected to the "What’s the PAYE reference of your client’s employer?" page
    When the user selects the PAYE reference field and enters a value of 123/AB456
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client leave this employer in the tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Employment dates" page
    When the user selects the Start Day field and enters a value of 24
    And the user selects the Start Month field and enters a value of 09
    And the user selects the Start Year field and enters a value of 2021
    When the user selects the End Day field and enters a value of 24
    And the user selects the End Month field and enters a value of 03
    And the user selects the End Year field and enters a value of 2022
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

  Scenario: Agent user with at least one prior employment edits an employment
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=BB444444A&ClientMTDID=1234567890 |
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
    When the user clicks on the second change employment link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the employment details link
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks on the change Employer link
    Then the user should be redirected to the "What’s the name of your client’s employer?" page
    When the user selects the Employer name field and enters a value of Mishima Zaibatsu
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks on the change start date link
    Then the user should be redirected to the "When did your client start working for their employer?" page
    When the user selects the Day field and enters a value of 14
    And the user selects the Month field and enters a value of 07
    And the user selects the Year field and enters a value of 2012
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks on the change still working reference link
    Then the user should be redirected to the "Did your client leave this employer in the tax year?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks on the change PAYE reference link
    Then the user should be redirected to the "What’s the PAYE reference of your client’s employer?" page
    When the user selects the PAYE reference field and enters a value of 777/7777
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks on the change payroll id link
    Then the user should be redirected to the "What’s your client’s payroll ID for this employment?" page
    When the user selects the Payroll id field and enters a value of 234567
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks on the change pay received link
    Then the user should be redirected to the "How much did your client’s employer pay them?" page
    When the user selects the Pay field and enters a value of 9000.01
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks on the change tax taken from pay link
    Then the user should be redirected to the "How much UK tax was taken from your client’s earnings?" page
    When the user selects the Tax field and enters a value of 720.08
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment details" page
    When the user clicks the continue button
    Then the user should be redirected to the "Employer information" page

  Scenario: Agent user with at least two prior employments removes an employment
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=BB444444A&ClientMTDID=1234567890 |
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
    When the user clicks on the third remove employment link
    Then the user should be redirected to the "Are you sure you want to remove this employment?" page
    When the user clicks the Remove employer button
    Then the user should be redirected to the "PAYE employment" page

#   Car/Van fuel section
  Scenario: Individual user as a new submission, says no to the fuel questions, so skips the amount questions
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the second change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
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

#   New submission tests
  Scenario: Individual user as a new submission, goes through the full benefits flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the second change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    # Vehicles, fuel and mileage section
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
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total company car fuel benefit?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a company van benefit?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total company van benefit?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get fuel benefit for a company van?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total company van fuel benefit?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a mileage benefit for using your own car for work?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much mileage benefit did you get in total for using your own car?" page
    When the user selects the amount field and enters a value of 500.00
    And the user clicks the continue button
    # Accommodation and relocation
    Then the user should be redirected to the "Did you get accommodation or relocation benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any living accommodation benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total living accommodation benefit?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any qualifying relocation benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for qualifying relocation benefits?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any non-qualifying relocation benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for non-qualifying relocation benefits?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    # Travel and entertainment
    Then the user should be redirected to the "Did you get any travel or entertainment benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any travel and subsistence benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for travel and subsistence?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any incidental overnight costs?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for incidental overnight costs?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any entertainment benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for entertainment?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    # Utilities and general services
    Then the user should be redirected to the "Did you get any utility or general service benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a benefit for using a telephone?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for telephone benefits?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a benefit for services provided by your employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for services provided by your employer?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer cover costs for any professional fees or subscriptions?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your employer pay to cover professional fees or subscriptions?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any benefits for other services?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for other services?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    # Medical, dental, childcare, education benefits or loans
    Then the user should be redirected to the "Did you get any medical, dental, childcare, education benefits or loans from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a medical or dental benefit?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your medical or dental benefit in total?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a childcare benefit?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total childcare benefit?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any benefits for educational services?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for educational services?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any beneficial loans?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much were your beneficial loans in total?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    # Income Tax or Incurred Costs
    Then the user should be redirected to the "Did your employer pay any of your Income Tax or incurred costs?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer pay any of your Income Tax?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of your Income Tax did your employer pay?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer pay any of your incurred costs?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of your incurred costs did your employer pay?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    # Reimbursed costs, vouchers or non-cash benefits
    Then the user should be redirected to the "Did you get any reimbursed costs, vouchers or non-cash benefits from your employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Were any of your non-taxable costs reimbursed by your employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of your non-taxable costs were reimbursed by your employer?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Were any of your taxable costs reimbursed by your employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of your taxable costs were reimbursed by your employer?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get vouchers or credit cards?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What is the total value of vouchers and credit card payments?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any non-cash benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for non-cash benefits?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any other benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for other benefits?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    # Assets
    Then the user should be redirected to the "Did you get any assets from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer make any assets available for your use?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much were the assets made available for your use?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer give you any assets to keep?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much were the assets your employer gave you to keep?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user as a new submission, says no to all section questions
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the second change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Did you get any benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any car, van or fuel benefits from this company?" page
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

  Scenario: Individual user as a new submission, says yes to section questions, no to everything else
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the second change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Did you get any benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any car, van or fuel benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a company car benefit?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a company van benefit?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a mileage benefit for using your own car for work?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get accommodation or relocation benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any living accommodation benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any qualifying relocation benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any non-qualifying relocation benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any travel or entertainment benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any travel and subsistence benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any incidental overnight costs?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any entertainment benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any utility or general service benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a benefit for using a telephone?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a benefit for services provided by your employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer cover costs for any professional fees or subscriptions?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any benefits for other services?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any medical, dental, childcare, education benefits or loans from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a medical or dental benefit?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a childcare benefit?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any benefits for educational services?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any beneficial loans?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer pay any of your Income Tax or incurred costs?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer pay any of your Income Tax?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer pay any of your incurred costs?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any reimbursed costs, vouchers or non-cash benefits from your employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Were any of your non-taxable costs reimbursed by your employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Were any of your taxable costs reimbursed by your employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get vouchers or credit cards?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any non-cash benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any other benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any assets from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer make any assets available for your use?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer give you any assets to keep?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  # Prior submission updates for each section
  Scenario: Individual user has prior submission data, updates all car van fuel fields
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 11
    Then the user should be redirected to the "How much mileage benefit did you get in total for using your own car?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 10
    Then the user should be redirected to the "Did you get a mileage benefit for using your own car for work?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 9
    Then the user should be redirected to the "How much was your total company van fuel benefit?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 8
    Then the user should be redirected to the "Did you get fuel benefit for a company van?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 7
    Then the user should be redirected to the "How much was your total company van benefit?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 6
    Then the user should be redirected to the "Did you get a company van benefit?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 5
    Then the user should be redirected to the "How much was your total company car fuel benefit?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 4
    Then the user should be redirected to the "Did you get fuel benefit for a company car?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 3
    Then the user should be redirected to the "How much was your total company car benefit?" page
    When the user selects the amount field and enters a value of 500.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 2
    Then the user should be redirected to the "Did you get a company car benefit?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 1
    Then the user should be redirected to the "Did you get any car, van or fuel benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates all accommodation fields
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change accommodation benefit link in position 7
    Then the user should be redirected to the "How much did you get in total for non-qualifying relocation benefits?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change accommodation benefit link in position 6
    Then the user should be redirected to the "Did you get any non-qualifying relocation benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change accommodation benefit link in position 5
    Then the user should be redirected to the "How much did you get in total for qualifying relocation benefits?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change accommodation benefit link in position 4
    Then the user should be redirected to the "Did you get any qualifying relocation benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change accommodation benefit link in position 3
    Then the user should be redirected to the "How much was your total living accommodation benefit?" page
    When the user selects the amount field and enters a value of 500.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change accommodation benefit link in position 2
    Then the user should be redirected to the "Did you get any living accommodation benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change accommodation benefit link in position 1
    Then the user should be redirected to the "Did you get accommodation or relocation benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates all travel and entertainment fields
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change travel benefit link in position 7
    Then the user should be redirected to the "How much did you get in total for entertainment?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change travel benefit link in position 6
    Then the user should be redirected to the "Did you get any entertainment benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change travel benefit link in position 5
    Then the user should be redirected to the "How much did you get in total for incidental overnight costs?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change travel benefit link in position 4
    Then the user should be redirected to the "Did you get any incidental overnight costs?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change travel benefit link in position 3
    Then the user should be redirected to the "How much did you get in total for travel and subsistence?" page
    When the user selects the amount field and enters a value of 500.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change travel benefit link in position 2
    Then the user should be redirected to the "Did you get any travel and subsistence benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change travel benefit link in position 1
    Then the user should be redirected to the "Did you get any travel or entertainment benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates all utilities fields
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 9
    Then the user should be redirected to the "How much did you get in total for other services?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 8
    Then the user should be redirected to the "Did you get any benefits for other services?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 7
    Then the user should be redirected to the "How much did your employer pay to cover professional fees or subscriptions?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 6
    Then the user should be redirected to the "Did your employer cover costs for any professional fees or subscriptions?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 5
    Then the user should be redirected to the "How much did you get in total for services provided by your employer?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 4
    Then the user should be redirected to the "Did you get a benefit for services provided by your employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 3
    Then the user should be redirected to the "How much did you get in total for telephone benefits?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 2
    Then the user should be redirected to the "Did you get a benefit for using a telephone?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 1
    Then the user should be redirected to the "Did you get any utility or general service benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates all medical benefits fields
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 9
    Then the user should be redirected to the "How much were your beneficial loans in total?" page
    When the user selects the amount field and enters a value of 110.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 8
    Then the user should be redirected to the "Did you get any beneficial loans?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 7
    Then the user should be redirected to the "How much did you get in total for educational services?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 6
    Then the user should be redirected to the "Did you get any benefits for educational services?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 5
    Then the user should be redirected to the "How much was your total childcare benefit?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 4
    Then the user should be redirected to the "Did you get a childcare benefit?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 3
    Then the user should be redirected to the "How much was your medical or dental benefit in total?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 2
    Then the user should be redirected to the "Did you get a medical or dental benefit?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 1
    Then the user should be redirected to the "Did you get any medical, dental, childcare, education benefits or loans from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates all income benefits fields
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change income benefit link in position 5
    Then the user should be redirected to the "How much of your incurred costs did your employer pay?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change income benefit link in position 4
    Then the user should be redirected to the "Did your employer pay any of your incurred costs?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change income benefit link in position 3
    Then the user should be redirected to the "How much of your Income Tax did your employer pay?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change income benefit link in position 2
    Then the user should be redirected to the "Did your employer pay any of your Income Tax?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change income benefit link in position 1
    Then the user should be redirected to the "Did your employer pay any of your Income Tax or incurred costs?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates all reimbursed benefits fields
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 11
    Then the user should be redirected to the "How much did you get in total for other benefits?" page
    When the user selects the amount field and enters a value of 1300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 10
    Then the user should be redirected to the "Did you get any other benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 9
    Then the user should be redirected to the "How much did you get in total for non-cash benefits?" page
    When the user selects the amount field and enters a value of 1300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 8
    Then the user should be redirected to the "Did you get any non-cash benefits?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 7
    Then the user should be redirected to the "What is the total value of vouchers and credit card payments?" page
    When the user selects the amount field and enters a value of 1300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 6
    Then the user should be redirected to the "Did you get vouchers or credit cards?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 5
    Then the user should be redirected to the "How much of your taxable costs were reimbursed by your employer?" page
    When the user selects the amount field and enters a value of 1300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 4
    Then the user should be redirected to the "Were any of your taxable costs reimbursed by your employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 3
    Then the user should be redirected to the "How much of your non-taxable costs were reimbursed by your employer?" page
    When the user selects the amount field and enters a value of 1300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 2
    Then the user should be redirected to the "Were any of your non-taxable costs reimbursed by your employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 1
    Then the user should be redirected to the "Did you get any reimbursed costs, vouchers or non-cash benefits from your employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates all assets benefits fields
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change assets benefit link in position 5
    Then the user should be redirected to the "How much were the assets your employer gave you to keep?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change assets benefit link in position 4
    Then the user should be redirected to the "Did your employer give you any assets to keep?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change assets benefit link in position 3
    Then the user should be redirected to the "How much were the assets made available for your use?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change assets benefit link in position 2
    Then the user should be redirected to the "Did your employer make any assets available for your use?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change assets benefit link in position 1
    Then the user should be redirected to the "Did you get any assets from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates carVanFuel to no, then does the full car section flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 1
    Then the user should be redirected to the "Did you get any car, van or fuel benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change car benefit link in position 1
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
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total company car fuel benefit?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a company van benefit?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total company van benefit?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get fuel benefit for a company van?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total company van fuel benefit?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a mileage benefit for using your own car for work?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much mileage benefit did you get in total for using your own car?" page
    When the user selects the amount field and enters a value of 500.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates accommodation to no, then does the full accommodation relocation flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change accommodation benefit link in position 1
    Then the user should be redirected to the "Did you get accommodation or relocation benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change accommodation benefit link in position 1
    Then the user should be redirected to the "Did you get accommodation or relocation benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any living accommodation benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total living accommodation benefit?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any qualifying relocation benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for qualifying relocation benefits?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any non-qualifying relocation benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for non-qualifying relocation benefits?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates travel and entertainment to no, then does the full travel and entertainment flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change travel benefit link in position 1
    Then the user should be redirected to the "Did you get any travel or entertainment benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change travel benefit link in position 1
    Then the user should be redirected to the "Did you get any travel or entertainment benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any travel and subsistence benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for travel and subsistence?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any incidental overnight costs?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for incidental overnight costs?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any entertainment benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for entertainment?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates utilities to no, then does the full utilities flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 1
    Then the user should be redirected to the "Did you get any utility or general service benefits from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change utilities benefit link in position 1
    Then the user should be redirected to the "Did you get any utility or general service benefits from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a benefit for using a telephone?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for telephone benefits?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a benefit for services provided by your employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for services provided by your employer?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer cover costs for any professional fees or subscriptions?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your employer pay to cover professional fees or subscriptions?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any benefits for other services?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for other services?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates medical to no, then does the full medical flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 1
    Then the user should be redirected to the "Did you get any medical, dental, childcare, education benefits or loans from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change medical benefit link in position 1
    Then the user should be redirected to the "Did you get any medical, dental, childcare, education benefits or loans from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a medical or dental benefit?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your medical or dental benefit in total?" page
    When the user selects the amount field and enters a value of 110.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get a childcare benefit?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your total childcare benefit?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any benefits for educational services?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for educational services?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any beneficial loans?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much were your beneficial loans in total?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates income to no, then does the full income flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change income benefit link in position 1
    Then the user should be redirected to the "Did your employer pay any of your Income Tax or incurred costs?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change income benefit link in position 1
    Then the user should be redirected to the "Did your employer pay any of your Income Tax or incurred costs?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer pay any of your Income Tax?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of your Income Tax did your employer pay?" page
    When the user selects the amount field and enters a value of 110.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer pay any of your incurred costs?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of your incurred costs did your employer pay?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates reimbursed to no, then does the full reimbursed flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 1
    Then the user should be redirected to the "Did you get any reimbursed costs, vouchers or non-cash benefits from your employer?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change reimbursed benefit link in position 1
    Then the user should be redirected to the "Did you get any reimbursed costs, vouchers or non-cash benefits from your employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Were any of your non-taxable costs reimbursed by your employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of your non-taxable costs were reimbursed by your employer?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Were any of your taxable costs reimbursed by your employer?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of your taxable costs were reimbursed by your employer?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get vouchers or credit cards?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What is the total value of vouchers and credit card payments?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any non-cash benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for non-cash benefits?" page
    When the user selects the amount field and enters a value of 200.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did you get any other benefits?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you get in total for other benefits?" page
    When the user selects the amount field and enters a value of 100.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

  Scenario: Individual user has prior submission data, updates assets to no, then does the full assets flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the third change employment link
    Then the user should be redirected to the "Employer information" page
    And the user clicks on the employment benefits link
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change assets benefit link in position 1
    Then the user should be redirected to the "Did you get any assets from this company?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

    When the user clicks on the change assets benefit link in position 1
    Then the user should be redirected to the "Did you get any assets from this company?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer make any assets available for your use?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much were the assets made available for your use?" page
    When the user selects the amount field and enters a value of 300.00
    And the user clicks the continue button
    Then the user should be redirected to the "Did your employer give you any assets to keep?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much were the assets your employer gave you to keep?" page
    When the user selects the amount field and enters a value of 400.00
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment benefits" page

#   Employment expenses tests
  Scenario: Agent user with single employment and as a new submission, goes through the full expenses flow
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=AA133742A&ClientMTDID=1234567890 |
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
    When the user clicks on the add expenses link
    Then the user should be redirected to the "Do you want to claim employment expenses for your client?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Employment expenses" page
    When the user clicks the continue button

    Then the user should be redirected to the "Do you want to claim your client’s business travel and overnight expenses?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "How much do you want to claim for your client’s business travel and overnight stays?" page
    When the user selects the amount field and enters a value of 100.11
    And the user clicks the continue button

    Then the user should be redirected to the "Do you want to claim for uniforms, work clothes, or tools for your client?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "How much do you want to claim for uniforms, work clothes, or tools for your client?" page
    When the user selects the amount field and enters a value of 200.22
    And the user clicks the continue button

    Then the user should be redirected to the "Do you want to claim for professional fees and subscriptions for your client?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "How much do you want to claim for professional fees and subscriptions for your client?" page
    When the user selects the amount field and enters a value of 300.33
    And the user clicks the continue button

    Then the user should be redirected to the "Do you want to claim for buying other equipment for your client?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "How much do you want to claim for buying other equipment for your client?" page
    When the user selects the amount field and enters a value of 400.44
    And the user clicks the continue button

    Then the user should be redirected to the "Check your client’s employment expenses" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page

  Scenario: Agent user with multiple employments as a new submission, answers no to the Do you want to claim employment expenses?, straight to expenses check your answers.
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=BB444444A&ClientMTDID=1234567890 |
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
    When the user clicks on the change expenses link
    Then the user should be redirected to the "Employment expenses" page
    When the user clicks the continue button

    Then the user should be redirected to the "Check your client’s employment expenses" page
    When the user clicks on the change link in position 1
    Then the user should be redirected to the "Do you want to claim employment expenses for your client?" page
    When the user selects the no radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Check your client’s employment expenses" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page

  Scenario: Individual user as a new submission single employment, goes through the full expenses flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AA133742A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the add expenses link

    Then the user should be redirected to the "Do you want to claim employment expenses?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Employment expenses" page
    When the user clicks the continue button

    Then the user should be redirected to the "Do you want to claim business travel and overnight expenses?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "How much do you want to claim for business travel and overnight stays?" page
    When the user selects the amount field and enters a value of 100.11
    And the user clicks the continue button

    Then the user should be redirected to the "Do you want to claim for uniforms, work clothes, or tools?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "How much do you want to claim for uniforms, work clothes, or tools?" page
    When the user selects the amount field and enters a value of 200.22
    And the user clicks the continue button

    Then the user should be redirected to the "Do you want to claim for professional fees and subscriptions?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "How much do you want to claim for professional fees and subscriptions?" page
    When the user selects the amount field and enters a value of 300.33
    And the user clicks the continue button

    Then the user should be redirected to the "Do you want to claim for buying other equipment?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "How much do you want to claim for buying other equipment?" page
    When the user selects the amount field and enters a value of 400.44
    And the user clicks the continue button

    Then the user should be redirected to the "Check your employment expenses" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page

  Scenario: Individual user as a new submission single employment, goes through the full expenses flow answering no to all expenses to skips the amounts pages
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AA133742A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the add expenses link

    Then the user should be redirected to the "Do you want to claim employment expenses?" page
    When the user selects the yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Employment expenses" page
    When the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim business travel and overnight expenses?" page
    When the user selects the no radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim for uniforms, work clothes, or tools?" page
    When the user selects the no radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim for professional fees and subscriptions?" page
    When the user selects the no radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim for buying other equipment?" page
    When the user selects the no radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page

  Scenario: Individual user as a new submission single employment selecting no to do you want to claim expenses and to skip all expenses pages
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AA133742A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the add expenses link

    Then the user should be redirected to the "Do you want to claim employment expenses?" page
    When the user selects the no radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page

  Scenario: Individual user single employment has prior submission data, updates all expenses fields
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AA123459A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the change expenses link
    Then the user should be redirected to the "Employment expenses" page
    When the user clicks the continue button

    Then the user should be redirected to the "Check your employment expenses" page
    When the user clicks on the change link in position 3
    Then the user should be redirected to the "How much do you want to claim for business travel and overnight stays?" page
    When the user selects the amount field and enters a value of 1000.11
    And the user clicks the continue button

    Then the user should be redirected to the "Check your employment expenses" page
    When the user clicks on the change link in position 5
    Then the user should be redirected to the "How much do you want to claim for uniforms, work clothes, or tools?" page
    When the user selects the amount field and enters a value of 2000.22
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page

    When the user clicks on the change link in position 7
    Then the user should be redirected to the "How much do you want to claim for professional fees and subscriptions?" page
    When the user selects the amount field and enters a value of 3000.33
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page

    When the user clicks on the change link in position 9
    Then the user should be redirected to the "How much do you want to claim for buying other equipment?" page
    When the user selects the amount field and enters a value of 4000.44
    And the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page

  Scenario: Individual user single employment has full prior submission data, changes all radio buttons to no
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AA123459A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the change expenses link
    Then the user should be redirected to the "Employment expenses" page
    When the user clicks the continue button

    Then the user should be redirected to the "Check your employment expenses" page
    When the user clicks on the change link in position 2
    Then the user should be redirected to the "Do you want to claim business travel and overnight expenses?" page
    When the user selects the no radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page

    When the user clicks on the change link in position 3
    Then the user should be redirected to the "Do you want to claim for uniforms, work clothes, or tools?" page
    When the user selects the no radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page

    When the user clicks on the change link in position 4
    Then the user should be redirected to the "Do you want to claim for professional fees and subscriptions?" page
    When the user selects the no radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page

    When the user clicks on the change link in position 5
    Then the user should be redirected to the "Do you want to claim for buying other equipment?" page
    When the user selects the no radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page
    And the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page

  Scenario: Individual user single employment has prior submission data, answers no to the 'Do you want to claim employment expenses?' question.
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AA123459A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the change expenses link
    Then the user should be redirected to the "Employment expenses" page
    When the user clicks the continue button
    Then the user should be redirected to the "Check your employment expenses" page
    When the user clicks on the change link in position 1
    Then the user should be redirected to the "Do you want to claim employment expenses?" page
    When the user selects the no radio button
    When the user clicks the continue button
    And the user clicks the save and continue button
    Then the user should be redirected to the "PAYE employment" page

  Scenario: Individual user as a new submission, goes through the full student loans flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | BB444444A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the second change employment link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the student loans link
    Then the user should be redirected to the "Did you repay any student loans?" page
    When the user clicks both the student loan repayments and postgraduate loan repayments checkboxes
    And the user clicks the continue button
    Then the user should be redirected to the "How much student loan did you repay?" page
    When the user selects the amount field and enters a value of 117
    And the user clicks the continue button
    Then the user should be redirected to the "How much postgraduate loan did you repay?" page
    When the user selects the amount field and enters a value of 9000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your student loan repayment details" page
    And the user clicks the continue button
    Then the user should be redirected to the "Employer information" page

  Scenario: Individual user with prior data, changes undergraduate and postgraduate repayments to no in student loans flow
    When the user logs into the service with the following details
      | Redirect url        | /2022/start |
      | Credential Strength | strong      |
      | Confidence Level    | 200         |
      | Affinity Group      | Individual  |
      | Nino                | AA133742A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the employment link
    Then the user should be redirected to the "PAYE employment" page
    When the user clicks on the change employment link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the student loans link
    Then the user should be redirected to the "Check your student loan repayment details" page
    When the user clicks on the change student loan repayments link
    Then the user should be redirected to the "Did you repay any student loans?" page
    When the user clicks the no repayments checkbox
    And the user clicks the continue button
    Then the user should be redirected to the "Check your student loan repayment details" page
    And the user clicks the continue button
    Then the user should be redirected to the "Employer information" page

  Scenario: Agent user with prior data, changes undergraduate and postgraduate repayments to no in student loans flow
    When the user logs into the service with the following details
      | Redirect url        | /test-only/2022/additional-parameters?ClientNino=BB444444A&ClientMTDID=1234567890 |
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
    When the user clicks on the first change employment link
    Then the user should be redirected to the "Employer information" page
    When the user clicks on the student loans link
    Then the user should be redirected to the "Check your client’s student loan repayment details" page
    When the user clicks on the student loans amount change link
    Then the user should be redirected to the "How much student loan did your client repay?" page
    When the user selects the amount field and enters a value of 96000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s student loan repayment details" page
    When the user clicks on the postgraduate loans amount change link
    Then the user should be redirected to the "How much postgraduate loan did your client repay?" page
    When the user selects the amount field and enters a value of 17.38
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s student loan repayment details" page
    And the user clicks the continue button
    Then the user should be redirected to the "Employer information" page