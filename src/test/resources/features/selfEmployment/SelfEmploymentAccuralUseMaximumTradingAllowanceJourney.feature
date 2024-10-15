@SelfEmployment
Feature: SelfEmployment Accural accounting -Use Maximum trading allowance Journeys

  Background:
    Given the user navigates to the auth login page

  Scenario: Agent Check self employment details
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=BB000001A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Review self-employments link
    Then the user should be redirected to the "Self-employment" page under self employment
    When the user clicks on the View Self Employment link
    Then the user should be redirected to the "Check your client’s self-employment details" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks the Continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

  Scenario: Agent - Self Employment Abroad
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=BB000001A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Self-employment abroad link
    Then the user should be redirected to the "Did your client carry out all of their self-employment abroad?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your client’s details" page under self employment
    And the user clicks the Self Employment Save and continue button

    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

  Scenario: Agent - Self employment InYear Income journey - (Accural accounting - maximum trading allowance)
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=BB000001A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Self-employment Income link
    Then the user should be redirected to the "Income not counted as turnover" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much non-turnover income did your client get?" page under self employment
    And the user selects the Amount-field field and enters a value of 20000
    And the user clicks the Continue button

    Then the user should be redirected to the "Your turnover" page under self employment
    And the user selects the Amount-field field and enters a value of 50000
    And the user clicks the Continue button

    Then the user should be redirected to the "Is there any other self-employment income your client needs to tell us about?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much other self-employment income did your client get?" page under self employment
    And the user selects the Amount-field field and enters a value of 100000
    And the user clicks the Continue button

    Then the user should be redirected to the "Turnover exempt from tax" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of your client’s turnover is exempt from being taxed as profit?" page under self employment
    And the user selects the Amount-field field and enters a value of 120,000
    And the user clicks the Continue button

    Then the user should be redirected to the "Trading allowance" page under self employment
    #Use trading allowance
    When the user selects the Use the trading allowance radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Trading allowance for income under £1,000" page under self employment
    #Use The maximum £1,000
    When the user selects the first radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your client’s income" page under self employment
    And the user clicks the Self Employment Save and continue button

    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment


  #-------- Self Employment - Allowances for vehicles, equipment and building  tailoring journey -----#

  Scenario: Agent - Self employment - Allowances for vehicles, equipment and building journey
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=BB000001A&ClientMTDID=1234567890 |
      | Credential Strength | weak                                                                                |
      | Confidence Level    | 250                                                                                 |
      | Affinity Group      | Agent                                                                               |
      | Enrolment Key 1     | HMRC-MTD-IT                                                                         |
      | Identifier Name 1   | MTDITID                                                                             |
      | Identifier Value 1  | 1234567890                                                                          |
      | Enrolment Key 2     | HMRC-AS-AGENT                                                                       |
      | Identifier Name 2   | AgentReferenceNumber                                                                |
      | Identifier Value 2  | XARN1234567                                                                         |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your client’s Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Allowances for vehicles, equipment and buildings link

    Then the user should be redirected to the "Allowances for vehicles, equipment and buildings" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Choose which allowances your client wants to claim" page under self employment
    When the user clicks the Zero-emission car allowance checkbox
    When the user clicks the Zero-emission goods vehicle allowance checkbox

    When the user clicks the Structures and buildings allowance checkbox
    When the user clicks the Freeport structures and buildings allowance checkbox
    When the user clicks the Annual investment allowance (business equipment) checkbox
    When the user clicks the Writing down allowance checkbox
    When the user clicks the Balancing allowance (allowance on sales) checkbox
    When the user clicks the Balancing charge checkbox
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your client’s answers" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

   #-----------Allowances for vehicles, equipment and building -  Balancing allowance journey ----- #
    When the user clicks on the Balancing allowance link

    Then the user should be redirected to the "Does your client have a balancing allowance to report?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much is the total of your client’s balancing allowances?" page under self employment
    And the user selects the Amount-field field and enters a value of 900.67
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your client’s answers" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

  #------ Allowances for vehicles, equipment and building,  Zero-Emission cars... full journey ----- #

  Scenario: Individual - Self employment Expenses - Questions Allowances for vehicles, equipment and building
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | BB000001A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

   #------   Zero-Emission cars    full journey ----- #

    When the user clicks on the Zero-emission cars link

    Then the user should be redirected to the "Zero-emission cars" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Zero-emission car allowance" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "What was the total cost of the car, in pounds?" page under self employment
    And the user selects the Amount-field field and enters a value of 700
    And the user clicks the Continue button

    Then the user should be redirected to the "Did you only use the car for your self-employment?" page under self employment
    When the user selects the no radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much did you use the car outside your self-employment?" page under self employment
    When the user selects the 10 percent radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of your car’s cost do you want to claim under the 100% allowance?" page under self employment
    When the user selects the full cost radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your answers" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

   #---------- zero emission goods Vehicle journey ----- #
    When the user clicks on the Zero-emission goods vehicles link

    Then the user should be redirected to the "Zero-emission goods vehicles" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Zero-emission goods vehicle allowance" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "What was the total cost of the vehicle, in pounds?" page under self employment
    And the user selects the Amount-field field and enters a value of 900
    And the user clicks the Continue button

    Then the user should be redirected to the "Did you only use the vehicle for your self-employment?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the vehicle’s cost do you want to claim under this 100% allowance?" page under self employment
    When the user selects the full cost radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your answers" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment


     #---------  structure and building allowance journey  ----- #

    When the user clicks on the Structures and Buildings Allowance link

    Then the user should be redirected to the "Structures and buildings allowance" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Can you still claim?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Qualifying use" page under self employment
    When the user selects the QualifyingUse Day field and enters a value of 01
    And the user selects the QualifyingUse Month field and enters a value of 01
    And the user selects the QualifyingUse Year field and enters a value of 2023
    And the user clicks the Continue button

    Then the user should be redirected to the "Where is the new structure or building located?" page under self employment
    When the user selects the Self employment building number field and enters a value of 10
    When the user selects the Self employment postcode field and enters a value of AB1 2ED
    And the user clicks the Continue button

    Then the user should be redirected to the "Claim amount" page under self employment
    And the user selects the Amount-field field and enters a value of 900
    And the user clicks the Continue button

    Then the user should be redirected to the "New structures or buildings" page under self employment
    When the user selects the no radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Can you still claim?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Claim amount" page under self employment
    And the user selects the Amount-field field and enters a value of 100
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your answers" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment


    #---------- Annual investment allowance journey  ----- #

    When the user clicks on the Annual Investment Allowance link

    Then the user should be redirected to the "Annual Investment Allowance" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much annual investment allowance do you want to claim?" page under self employment
    And the user selects the Amount-field field and enters a value of 100
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your answers" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-----------  Writing down allowance  -------- #

    When the user clicks on the Writing down link

    Then the user should be redirected to the "‘Writing down’ allowance" page under self employment
    And the user clicks the Continue button

    Then the user should be redirected to the "Special rate (6%) pool" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Claim amount" page under self employment
    And the user selects the Amount-field field and enters a value of 100
    And the user clicks the Continue button

    Then the user should be redirected to the "Main rate (18%) pool" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Claim amount" page under self employment
    And the user selects the Amount-field field and enters a value of 100
    And the user clicks the Continue button

    Then the user should be redirected to the "Single asset pools" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Claim amount for single asset pools" page under self employment
    And the user selects the Amount-field field and enters a value of 100
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your answers" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

   #---------  freeport sites journey  ------------ #
  Scenario: Individual - Self employment Expenses - freeport site journey
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | BB000001A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    When the user clicks on the Freeport sites link

    Then the user should be redirected to the "Special tax sites allowance" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Date construction started" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "When was the earliest contract entered into?" page under self employment
    When the user selects the Construction start Day field and enters a value of 01
    And the user selects the Construction start Month field and enters a value of 01
    And the user selects the Construction start Year field and enters a value of 2023
    And the user clicks the Continue button

    Then the user should be redirected to the "Qualifying use" page under self employment
    When the user selects the Qualifying start Day field and enters a value of 01
    And the user selects the Qualifying start Month field and enters a value of 01
    And the user selects the Qualifying start Year field and enters a value of 2023
    And the user clicks the Continue button

    Then the user should be redirected to the "Where is the special tax site located?" page under self employment
    When the user selects the Self employment building number field and enters a value of 10
    When the user selects the Self employment postcode field and enters a value of AB1 2ED
    And the user clicks the Continue button

    #todo - SASS-8982 8983 (remove comments and fix test when bugs are fixed)
    Then the user should be redirected to the "How much enhanced structures and buildings allowance do you want to claim?" page under self employment
    And the user selects the Amount-field field and enters a value of 100
    And the user clicks the Continue button

    Then the user should be redirected to the "New special tax site structures or buildings" page under self employment
    When the user selects the no radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Do you have a continuing claim for enhanced structures and buildings allowance?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    #todo - SASS-8983
    Then the user should be redirected to the "Do you want to continue to claim this allowance for an existing site?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Claim amount" page under self employment
    And the user selects the Amount-field field and enters a value of 100
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your answers" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

