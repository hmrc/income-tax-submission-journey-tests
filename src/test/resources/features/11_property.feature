@MVP @ZAP @property


Feature: Property Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user adds UK Property details
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000A   |
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
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    And the user selects the Yes, claim property income allowance radio button
    And the user clicks the save and continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user selects the save and continue radio button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS AboutPropertyYes radio button
    And the user clicks the save and continue button
    Then the user should be redirected to the "UK property" page

  Scenario: Agent user adds UK Property details
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC210000A&ClientMTDID=1234567890 |
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
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did your client get from all of their properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property does your client have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Does your client want to claim property income allowance?" page
    And the user selects the No, claim expenses radio button
    And the user clicks the save and continue button
  Then the user should be redirected to the "Check Your Answers" page
  When the user selects the save and continue radio button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS AboutPropertyYes radio button
    And the user clicks the save and continue button
    Then the user should be redirected to the "UK property" page

  Scenario: Individual user adds UK Property - Property rentals and claims Property Income Allowance
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000B   |
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
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the Yes, claim property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page

  Scenario: Individual user adds UK Property - Property rentals and claims Expenses
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000B   |
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
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page

  Scenario: Individual user change answers ON Property rentals CYA - claims Property Income Allowance
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks on the Change link
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the Yes, claim property income allowance radio button
    And the user clicks the save and continue button
    Then the user should be redirected to the "Check Your Answers" page
    And the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button

  Scenario: Agent user adds UK Property details
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AC210000B&ClientMTDID=1234567890 |
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
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did your client get from all of their properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property does your client have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
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
    And the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button

  Scenario: Individual user adds UK Property Property rentals - Individual user - answers questions in the Income Journey
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the Yes, claim property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
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
    When the user selects the Yes, premiums for a grant of lease radio button
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
    When the user clicks the No, premiums for the grant of lease button
    And the user selects the Amount, premiums for a grant of lease field and enters a value of 9000
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
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the IncomeYes,HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page

  Scenario: Agent user adds UK Property Property rentals - Agent user - answers questions in the Income Journey
    When the user logs into the service with the following details
      | Redirect url        | /test-only/InYear/additional-parameters?ClientNino=AC210000B&ClientMTDID=1234567890 |
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
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did your client get from all of their properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property does your client have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Does your client want to claim property income allowance?" page
    When the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
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
    When the user selects the Yes, premiums for a grant of lease radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client calculate the figure themselves?" page
    When the user selects the No,calculated radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client receive for the grant of a lease?" page
    And the user selects the grant lease amount field and enters a value of 1000
    And the user clicks the continue button
    Then the user should be redirected to the "How many complete 12 month periods were in the term of the lease?" page
    And the user selects the month period field and enters a value of 21
    When the user clicks the continue button
    Then the user should be redirected to the "Premiums for a grant of a lease" page
    When the user clicks the No, premiums for the grant of lease button
    And the user selects the Amount, premiums for a grant of lease field and enters a value of 12500
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
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the IncomeYes,HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page

  Scenario: Individual user adds UK Property - Property rentals - Premiums received, Have you calculated the figure yourself? and Adjustments
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000B   |
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
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    When the user selects the Yes, claim property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
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
    When the user selects the Yes, premiums for a grant of lease radio button
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
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the IncomeYes,HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the AdjustmentsLink link
    Then the user should be redirected to the "Adjustments" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much was your private use adjustment?" page
    And the user selects the Private use adjustment Amount field and enters a value of 698.56
    When the user clicks the continue button
    Then the user should be redirected to the "Balancing charge" page
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
    When the user clicks the continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the AdjustmentsYes,HYFTS radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page

  Scenario: Individual user adds UK Property - Property rentals - Claim Expenses - Claim Consolidated Expenses
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000B   |
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
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    Then the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Income link
    Then the user should be redirected to the "Property income" page
    And the user clicks the continue button
    Then the user should be redirected to the "Non-UK resident landlord" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Deducting Tax from non-UK landlords" page
    And the user selects the Tax deducted Yes radio button
    And the user selects the Tax Deducted Amount field and enters a value of 13400.50
    When the user clicks the continue button
    Then the user should be redirected to the "Income from Property Rentals" page
    When the user selects the Property rental amount field and enters a value of 24000.00
    And the user clicks the continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user selects the Yes, premiums for a grant of lease radio button
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
    And the user clicks the property continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the IncomeYes,HYFTS radio button
    When the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    And the user clicks on the ExpensesLink link
    Then the user should be redirected to the "Expenses" page
    When the user clicks the continue button
    Then the user should be redirected to the "Consolidated or individual expenses" page
    When the user selects the Yes,consolidated expenses radio button
    And the user selects the consolidated expenses amount field and enters a value of 1250.89
    And the user clicks the continue button
    Then the user should be redirected to the "Check Your Answers" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the ExpensesYes,HYFTS radio button
    When the user clicks the continue button
    Then the user should be redirected to the "UK property" page

  Scenario: Individual user adds UK Property - Property rentals - Claim Expenses - Claim Individual Expenses
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000B   |
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
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    Then the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Income link
    Then the user should be redirected to the "Property income" page
    And the user clicks the continue button
    Then the user should be redirected to the "Non-UK resident landlord" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Deducting Tax from non-UK landlords" page
    And the user selects the Tax deducted Yes radio button
    And the user selects the Tax Deducted Amount field and enters a value of 13400.50
    When the user clicks the continue button
    Then the user should be redirected to the "Income from Property Rentals" page
    When the user selects the Property rental amount field and enters a value of 24000.00
    And the user clicks the continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user selects the Yes, premiums for a grant of lease radio button
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
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the IncomeYes,HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
    And the user clicks on the ExpensesLink link
    Then the user should be redirected to the "Expenses" page
    When the user clicks the continue button
    Then the user should be redirected to the "Consolidated or individual expenses" page
    When the user selects the No,consolidated expenses radio button
    When the user clicks the continue button
    Then the user should be redirected to the "Rents, rates and insurance costs for your property" page
    And the user selects the Rents, rates and insurance amount field and enters a value of 300
    When the user clicks the continue button
    Then the user should be redirected to the "Property repairs and maintenance" page
    And the user selects the Property repairs and maintenance amount field and enters a value of 589.45
    When the user clicks the continue button
    Then the user should be redirected to the "Loan interest or other financial costs" page
    And the user selects the Loan interest or other financial costs amount field and enters a value of 1189.45
    When the user clicks the continue button
    Then the user should be redirected to the "Legal, management or other professional fees" page
    And the user selects the Legal, management or other professional fees amount field and enters a value of 1000.89
    When the user clicks the continue button
    Then the user should be redirected to the "Costs of services provided, including wages" page
    And the user selects the Costs of services provided, including wages amount field and enters a value of 349
    When the user clicks the continue button
    Then the user should be redirected to the "Property business travel costs" page
    And the user selects the Property business travel costs amount field and enters a value of 200
    When the user clicks the continue button
    Then the user should be redirected to the "Other allowable property expenses" page
    And the user selects the Other allowable property expenses amount field and enters a value of 200
    When the user clicks the continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the ExpensesYes,HYFTS radio button
    When the user clicks the continue button
    Then the user should be redirected to the "UK property" page

  Scenario: Individual user adds UK Property - Property rentals - Claim Allowances - Cash basis accounting method and claim capital allowances for a car
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start  |
      | Credential Strength | strong         |
      | Confidence Level    | 250            |
      | Affinity Group      | Individual     |
      | Nino                | AC210000A      |
      | Enrolment Key 1     | HMRC-MTD-IT    |
      | Identifier Name 1   | MTDITID        |
      | Identifier Value 1  | 1234567890     |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addProperty tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    Then the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Income link
    Then the user should be redirected to the "Property income" page
    And the user clicks the continue button
    Then the user should be redirected to the "Non-UK resident landlord" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Deducting Tax from non-UK landlords" page
    And the user selects the Tax deducted Yes radio button
    And the user selects the Tax Deducted Amount field and enters a value of 13400.50
    When the user clicks the continue button
    Then the user should be redirected to the "Income from Property Rentals" page
    When the user selects the Property rental amount field and enters a value of 24000.00
    And the user clicks the continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user selects the Yes, premiums for a grant of lease radio button
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
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the IncomeYes,HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Allowanceslink link
    Then the user should be redirected to the "Allowances" page
    When the user clicks the continue button
    Then the user should be redirected to the "Capital allowances for a car" page
    And the user selects the Yes,capital allowances for a car radio button
    Then the user selects the Capital allowances for a car amount field and enters a value of 1290
    When the user clicks the continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the AllowancesYes,HYFTS radio button
    And the user clicks the property continue button

  Scenario: Individual user adds UK Property - Property rentals - Claim Allowances - Traditional accounting method and claim allowances
    When the user logs into the service with the following details
      | Redirect url        | /InYear/start  |
      | Credential Strength | strong         |
      | Confidence Level    | 250            |
      | Affinity Group      | Individual     |
      | Nino                | AC210000B      |
      | Enrolment Key 1     | HMRC-MTD-IT    |
      | Identifier Name 1   | MTDITID        |
      | Identifier Value 1  | 1234567890     |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addProperty tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
   Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    Then the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Income link
    Then the user should be redirected to the "Property income" page
    And the user clicks the continue button
    Then the user should be redirected to the "Non-UK resident landlord" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Deducting Tax from non-UK landlords" page
    And the user selects the Tax deducted Yes radio button
    And the user selects the Tax Deducted Amount field and enters a value of 13400.50
    When the user clicks the continue button
    Then the user should be redirected to the "Income from Property Rentals" page
    When the user selects the Property rental amount field and enters a value of 24000.00
    And the user clicks the continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user selects the Yes, premiums for a grant of lease radio button
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
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the IncomeYes,HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Allowanceslink link
    Then the user should be redirected to the "Allowances" page
    When the user clicks the continue button
    Then the user should be redirected to the "Annual investment allowance" page
    When the user selects the Annual investment allowance amount field and enters a value of 1200
    And the user clicks the continue button
    Then the user should be redirected to the "Zero-emission car allowance" page
    When the user selects the Zero-emission car allowance amount field and enters a value of 1200
    And the user clicks the Continue button
    Then the user should be redirected to the "Zero-emission goods vehicle allowance" page
    When the user selects the Zero-emission goods vehicle allowance amount field and enters a value of 12.90
    And the user clicks the continue button
    Then the user should be redirected to the "Business premises renovation allowance" page
    When the user selects the Business premises renovation allowance amount field and enters a value of 12.90
    And the user clicks the continue button
    Then the user should be redirected to the "Replacement of domestic goods" page
    When the user selects the Replacement of domestic goods amount field and enters a value of 1011.90
    And the user clicks the continue button
    Then the user should be redirected to the "Other capital allowances" page
    When the user selects the Other capital allowances amount field and enters a value of 1011.90
    And the user clicks the continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the AllowancesYes,HYFTS radio button
    And the user clicks the property continue button

  Scenario: Individual user adds UK Property - Property rentals - Claim Expenses - Structures and Buildings Allowance
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start     |
      | Credential Strength | strong         |
      | Confidence Level    | 250            |
      | Affinity Group      | Individual     |
      | Nino                | AC210000B      |
      | Enrolment Key 1     | HMRC-MTD-IT    |
      | Identifier Name 1   | MTDITID        |
      | Identifier Value 1  | 1234567890     |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addProperty tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    Then the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Structures and Buildings AllowanceLink link
    Then the user should be redirected to the "Do you want to claim structures and buildings allowance?" page
    Then the user selects the Yes, claimStructureBuildingAllowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Structures Buildings Allowance" page
    And the user clicks the Add Claim button
    Then the user should be redirected to the "Qualifying date" page
    And the user selects the sba Day field and enters a value of 21
    And the user selects the sba Month field and enters a value of 09
    And the user selects the sba Year field and enters a value of 2021
    When the user clicks the Continue button
    Then the user should be redirected to the "Structures and buildings allowance qualifying amount" page
    When the user selects the Qualifying Amount field and enters a value of 1000
    And the user clicks the Continue button
    Then the user should be redirected to the "How much is your structures and buildings allowance claim?" page
    And the user selects the How much is your structures and buildings allowance claim? amount field and enters a value of 1,659.00
    When the user clicks the Continue button
    Then the user should be redirected to the "Structures and buildings allowance address" page
    And the user selects the Building name field and enters a value of Crest House, London
    And the user selects the Building number field and enters a value of 123B
    And the user selects the Postcode field and enters a value of SW1A 1AA
    When the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    And the user clicks the continue button
    Then the user should be redirected to the "Your structures and buildings allowance claims" page
    And the user selects the Yes,anotherClaim radio button
    And the user clicks the continue button
    And the user clicks the Add Claim button
    Then the user should be redirected to the "Qualifying date" page
    And the user selects the sba Day field and enters a value of 22
    And the user selects the sba Month field and enters a value of 10
    And the user selects the sba Year field and enters a value of 2019
    When the user clicks the Continue button
    Then the user should be redirected to the "Structures and buildings allowance qualifying amount" page
    When the user selects the Qualifying Amount field and enters a value of 3000.90
    And the user clicks the Continue button
    Then the user should be redirected to the "How much is your structures and buildings allowance claim?" page
    And the user selects the How much is your structures and buildings allowance claim? amount field and enters a value of 1659.45
    When the user clicks the Continue button
    Then the user should be redirected to the "Structures and buildings allowance address" page
    And the user selects the Building name field and enters a value of Crest Palace Limited, London
    And the user selects the Building number field and enters a value of 123A
    And the user selects the Postcode field and enters a value of SW1A 1AA
    When the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    And the user clicks the continue button
    Then the user should be redirected to the "Your structures and buildings allowance claims" page
    When the user clicks on the RemoveClaim link
    Then the user should be redirected to the "Do you want to remove this structures and buildings allowance £1,659 claim?" page
    And the user selects the RemoveYes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Your structures and buildings allowance claims" page
    And the user selects the No,anotherClaim radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the sbaYes,HYFTS radio button
    And the user clicks the property continue button
    Then  the user should be redirected to the "UK property" page

  Scenario: Individual user adds UK Property - Property rentals - Claim Expenses - Enhanced Structures and Buildings Allowance
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start     |
      | Credential Strength | strong         |
      | Confidence Level    | 250            |
      | Affinity Group      | Individual     |
      | Nino                | AC180000A      |
      | Enrolment Key 1     | HMRC-MTD-IT    |
      | Identifier Name 1   | MTDITID        |
      | Identifier Value 1  | 1234567890     |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addProperty tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property Rentals checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    Then the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Enhanced Structures and Buildings AllowanceLink link
    Then the user should be redirected to the "Do you want to claim enhanced structures and buildings allowance?" page
    Then the user selects the Yes, claim radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Enhanced structures and buildings allowance claims" page
    And the user clicks the Add Claim button
    Then the user should be redirected to the "Qualifying date" page
    And the user selects the esba Day field and enters a value of 11
    And the user selects the esba Month field and enters a value of 12
    And the user selects the esba Year field and enters a value of 2019
    When the user clicks the Continue button
    Then the user should be redirected to the "Qualifying amount" page
    When the user selects the Qualifying amt field and enters a value of 12350.89
    And the user clicks the Continue button
    Then the user should be redirected to the "How much is your enhanced structures and buildings allowance claim?" page
    And the user selects the How much is your enhanced structures and buildings allowance claim? amount field and enters a value of 1650
    When the user clicks the Continue button
    Then the user should be redirected to the "Where is the new enhanced structure or building located?" page
    And the user selects the Building name field and enters a value of MBNX Fan Mall, Shropshore
    And the user selects the Building number field and enters a value of 11
    And the user selects the Postcode field and enters a value of SA1 1AA
    When the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    And the user clicks the continue button
    Then the user should be redirected to the "Your enhanced structures and buildings allowance claims" page
    And the user selects the No,anotherClaim radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the esbaYes,HYFTS radio button
    And the user clicks the property continue button
    Then  the user should be redirected to the "UK property" page

  Scenario: Individual user adds UK Property - Property rentals - Claim Expenses - Enhanced Structures and Buildings Allowance
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start     |
      | Credential Strength | strong         |
      | Confidence Level    | 250            |
      | Affinity Group      | Individual     |
      | Nino                | AC210000B      |
      | Enrolment Key 1     | HMRC-MTD-IT    |
      | Identifier Name 1   | MTDITID        |
      | Identifier Value 1  | 1234567890     |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addProperty tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
    And the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the Property rentals checkbox
    And the user clicks the Property rentals continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the Check Your Answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Property rentals about link
    Then the user should be redirected to the "Property rentals" page
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to claim property income allowance?" page
    Then the user selects the No, claim expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes HYFTS radio button
    And the user clicks the property continue button
   Then the user should be redirected to the "UK property" page
    When the user clicks on the Enhanced Structures and Buildings AllowanceLink link
    Then the user should be redirected to the "Do you want to claim enhanced structures and buildings allowance?" page
    Then the user selects the Yes, claim radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Enhanced structures and buildings allowance claims" page
    And the user clicks the Add Claim button
    Then the user should be redirected to the "Qualifying date" page
    And the user selects the esba Day field and enters a value of 11
    And the user selects the esba Month field and enters a value of 12
    And the user selects the esba Year field and enters a value of 2019
    When the user clicks the Continue button
    Then the user should be redirected to the "Qualifying amount" page
    When the user selects the Qualifying amt field and enters a value of 12350.89
    And the user clicks the Continue button
    Then the user should be redirected to the "How much is your enhanced structures and buildings allowance claim?" page
    And the user selects the How much is your enhanced structures and buildings allowance claim? amount field and enters a value of 1650
    When the user clicks the Continue button
    Then the user should be redirected to the "Where is the new enhanced structure or building located?" page
    And the user selects the Building name field and enters a value of MBNX Fan Mall, Shropshore
    And the user selects the Building number field and enters a value of 11
    And the user selects the Postcode field and enters a value of SA1 1AA
    When the user clicks the Continue button
    Then the user should be redirected to the "Check Your Answers" page
    And the user clicks the continue button
    Then the user should be redirected to the "Your enhanced structures and buildings allowance claims" page
    And the user selects the No,anotherClaim radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the esbaYes,HYFTS radio button
    And the user clicks the property continue button
    Then  the user should be redirected to the "UK property" page
