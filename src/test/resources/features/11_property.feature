@MVP @property

Feature: Property Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

 Scenario: Individual user adds UK Property details
   When the user logs into the service with the following details
     | Redirect url        | /EOY/start  |
     | Credential Strength | strong      |
     | Confidence Level    | 250         |
     | Affinity Group      | Individual  |
     | Nino                | AA123456A   |
     | Enrolment Key 1     | HMRC-MTD-IT |
     | Identifier Name 1   | MTDITID     |
     | Identifier Value 1  | 1234567890  |
   Then the user should be redirected to the "Update and submit an Income Tax Return" page
   When the user clicks the continue button
   Then the user should be redirected to the "Your Income Tax Return" page
   When the user clicks on the addSections link
   Then the user should be redirected to the "Add sections to your Income Tax Return" page
   When the user clicks the addProperty tailoring option
   And the user clicks the continue button
   Then the user should be redirected to the "Your Income Tax Return" page
   When the user clicks on the Property link
   Then the user should be redirected to the "About your UK Properties" page
   And the user clicks on the About your UK Properties About link

 # --------- Navigating to the UK Properties pages : Between 1000 and 85000 SASS-5334----------------
  Then the user should be redirected to the "UK Property details" page
  When the user clicks the continue button
  Then the user should be redirected to the "How much total income did you get from your UK properties?" page
  When the user selects the second property radio button: Between 1000 and 85000
  And the user clicks the property continue button

 #--------- SASS-5401- Property Rentals -------------------
  Then the user should be redirected to the "Select UK property" page
  When the user clicks the Property Rentals checkbox
  And the user clicks the UK Property continue button
  Then the user should be redirected to the "Check Your Answers" page
  When the user clicks the Check Your Answers continue button

 #--------- SASS-5418- Property Rentals About journey -------------------
 Then the user should be redirected to the "About your UK Properties" page
 When the user clicks on the Property rentals about link
 Then the user should be redirected to the "Property rentals" page
 And the user clicks the continue button
 Then the user should be redirected to the "Expenses less than £1,000" page
 And the user selects the Property rentals Yes radio button
 And the user clicks the continue button


  Scenario: Agent user adds UK Property details
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA133742A&ClientMTDID=1234567890 |
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
    When the user clicks the addProperty tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "About your UK Properties" page
    And the user clicks on the About your UK Properties About link

 # --------- Navigating to the UK Properties pages : Between 1000 and 85000 SASS-5334----------------
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did your client get from all of their properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button

  # ----------------- SASS-5401 - Property Rentals  ------------------------------
    Then the user should be redirected to the "Select UK property" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button

  #--------- SASS-5418- Property Rentals About journey -------------------
    Then the user should be redirected to the "About your UK Properties" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Expenses less than £1,000" page
    And the user selects the Property rentals Yes radio button
    And the user clicks the continue button


  Scenario: Individual user adds UK Property - Property rentals and claims Property Income Allowance
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "About your UK Properties" page
    And the user clicks on the About your UK Properties About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Select UK property" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "About your UK Properties" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Expenses less than £1,000" page
    And the user selects the Property rentals Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the Yes, claim property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "About your UK Properties" page


  Scenario: Individual user adds UK Property - Property rentals and claims Expenses
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "About your UK Properties" page
    And the user clicks on the About your UK Properties About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Select UK property" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "About your UK Properties" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Expenses less than £1,000" page
    And the user selects the Property rentals No radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "About your UK Properties" page


  Scenario: Individual user change answers ON Property rentals CYA - claims Property Income Allowance
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "About your UK Properties" page
    And the user clicks on the About your UK Properties About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Select UK property" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "About your UK Properties" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Expenses less than £1,000" page
    And the user selects the Property rentals Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks on the Change link
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the Yes, claim property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page


  Scenario: Agent user adds UK Property details
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AA133742A&ClientMTDID=1234567890 |
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
    When the user clicks on the Property link
    Then the user should be redirected to the "About your UK Properties" page
    And the user clicks on the About your UK Properties About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did your client get from all of their properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Select UK property" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "About your UK Properties" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Expenses less than £1,000" page
    And the user selects the Property rentals Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Does your client want to claim property income allowance?" page
    When the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks on the Change link
    Then the user should be redirected to the "Does your client want to claim property income allowance?" page
    When the user selects the Yes, claim property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page


  Scenario: Individual user adds UK Property - Property rentals - Income
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "About your UK Properties" page
    And the user clicks on the About your UK Properties About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Select UK property" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "About your UK Properties" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Expenses less than £1,000" page
    And the user selects the Property rentals Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the Yes, claim property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "About your UK Properties" page
    When the user clicks on the Income link
    Then the user should be redirected to the "Property income" page
    And the user clicks the continue button
    Then the user should be redirected to the "Non-UK resident landlord" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Deducting Tax from non-UK landlords" page
    And the user selects the Tax deducted Yes radio button
    And the user selects the Tax Deducted Amount field and enters a value of 340.55
    When the user clicks the continue button
    Then the user should be redirected to the "Income from Property Rentals" page
    When the user selects the Property rental amount field and enters a value of 340.55
    And the user clicks the continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Have you calculated the figure yourself?" page
    When the user selects the No,calculated radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did you receive for the grant of a lease?" page
    And the user selects the grant lease amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "How many complete 12 month periods were in the term of the lease?" page
    And the user selects the month period field and enters a value of 2
    When the user clicks the continue button
    Then the user should be redirected to the "Premiums for a grant of a lease" page
    When the user selects the premium amount field and enters a value of 9000
    And the user clicks the continue button
    Then the user should be redirected to the "Reverse premiums received" page
    And the user selects the Yes,premiums recieved radio button
    Then the user selects the premium recieved amount field and enters a value of 1200
    When the user clicks the continue button
    Then the user should be redirected to the "Other income from property" page
    When the user selects the Other income amount field and enters a value of 1350.78
    Then the user clicks the continue button
    And the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "About your UK Properties" page


  Scenario: Individual user adds UK Property - Property rentals - Premiums received, Have you calculated the figure yourself?
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "About your UK Properties" page
    And the user clicks on the About your UK Properties About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Select UK property" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "About your UK Properties" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Expenses less than £1,000" page
    And the user selects the Property rentals Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the Yes, claim property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "About your UK Properties" page
    When the user clicks on the Income link
    Then the user should be redirected to the "Property income" page
    And the user clicks the continue button
    Then the user should be redirected to the "Non-UK resident landlord" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Deducting Tax from non-UK landlords" page
    And the user selects the Tax deducted Yes radio button
    And the user selects the Tax Deducted Amount field and enters a value of 340.55
    When the user clicks the continue button
    Then the user should be redirected to the "Income from Property Rentals" page
    When the user selects the Property rental amount field and enters a value of 340.55
    And the user clicks the continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Have you calculated the figure yourself?" page
    When the user selects the Yes,calculated radio button
    And the user selects the Yes,calculated amount field and enters a value of 7000
    And the user clicks the continue button
    Then the user should be redirected to the "Reverse premiums received" page
    And the user selects the Yes,premiums recieved radio button
    Then the user selects the premium recieved amount field and enters a value of 1200
    When the user clicks the continue button
    Then the user should be redirected to the "Other income from property" page
    When the user selects the Other income amount field and enters a value of 3590.78
    Then the user clicks the continue button
    And the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "About your UK Properties" page
    When the user clicks on the AdjustmentsLink link
    Then the user should be redirected to the "Adjustments" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much was your private use adjustment?" page
    And the user selects the Private use adjustment Amount field and enters a value of 698.56
    When the user clicks the continue button
    Then the user should be redirected to the "Balancing Charge" page
    And the user selects the BalancingChargeYes radio button
    Then the user selects the How much is the balancing charge? Amount field and enters a value of 1200
    And the user clicks the continue button
    Then the user should be redirected to the "How much Property Income Allowance (PIA) do you want to claim?" page
    And the user selects the Enter your share of PIA for this property Amount field and enters a value of 1000
    When the user clicks the continue button
    Then the user should be redirected to the "Business premises renovation allowance balancing charge" page
    When the user clicks the Yes,How much is the renovation allowance balancing charge? button
    And the user selects the How much is the renovation allowance balancing charge? amount field and enters a value of 254.90
    When the user clicks the continue button
    Then the user should be redirected to the "Residential finance costs" page
    When the user selects the How much were your residential finance costs? Amount field and enters a value of 1200
    And the user clicks the continue button
    Then the user should be redirected to the "Unused residential costs brought forward" page
    And the user selects the How much unused residential costs do you want to bring forward? Amount field and enters a value of 1200
