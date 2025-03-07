@property

Feature: Foreign Property Journey - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user adds foreign property details using an accural based nino
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page

    # Foreign property
    When the user clicks on the Foreign property select country link
    Then the user should be redirected to the "Foreign property details" page
    When the user clicks the Continue button
    Then the user should be redirected to the "How much total income did you get from all of your foreign properties?" page
    And the user selects the second option radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Which country did you receive this income from?" page
    When the user selects the Country field and enters a value of Spain
    And the user clicks the Country option button
    And the user clicks the Continue button
    Then the user should be redirected to the "Countries where you rented out property" page
    Then the user selects the No radio button
    When the user clicks the save and continue button
    Then the user should be redirected to the "Claim property income allowance or expenses" page
    And the user selects the Foreign property Declare expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign tax
    When the user clicks on the Foreign tax Spain link
    Then the user should be redirected to the "Did you pay foreign tax on the income from your property in Spain?" page
    And the user selects the Foreign income tax Yes radio button
    And the user selects the Foreign income tax Amount field and enters a value of 1200.75
    Then the user clicks the Continue button
    Then the user should be redirected to the "Do you want to claim foreign tax credit relief?" page
    And the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign income
    When the user clicks on the Foreign income Spain link
    Then the user should be redirected to the "Income from your property in Spain" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Foreign property rental income" page
    And the user selects the Rental income field and enters a value of 600
    And the user clicks the Continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Have you calculated the premium for the grant of a lease taxable amount?" page
    When the user selects the No, calculate it for me radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "How much did you receive for the grant of a lease?" page
    And the user selects the grant lease amount field and enters a value of 1000
    And the user clicks the Continue button
    Then the user should be redirected to the "How many complete 12 month periods were in the term of the lease?" page
    And the user selects the 12 month period field and enters a value of 2
    When the user clicks the Continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user clicks the No disagree premiums grant lease button
    And the user selects the Calculated premiums grant lease field and enters a value of 7000
    And the user clicks the Continue button
    Then the user should be redirected to the "Other income from property" page
    When the user selects the Foreign other income amount field and enters a value of 1050.78
    Then the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign expenses
    When the user clicks on the Foreign expenses Spain link
    Then the user should be redirected to the "Expenses for your property in Spain" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Consolidated or individual expenses" page
    When the user selects the Claim individual expenses foreign radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Rents, rates and insurance costs for your property" page
    When the user selects the Rents, rates and insurance field and enters a value of 6230.40
    Then the user clicks the Continue button
    Then the user should be redirected to the "Property repairs and maintenance" page
    When the user selects the Property repairs and maintenance field and enters a value of 500
    Then the user clicks the Continue button
    Then the user should be redirected to the "Non-residential property finance costs" page
    When the user selects the Non-residential property finance costs field and enters a value of 200
    Then the user clicks the Continue button
    Then the user should be redirected to the "Legal, management or other professional fees" page
    When the user selects the Legal, management or other professional fees field and enters a value of 350
    Then the user clicks the Continue button
    Then the user should be redirected to the "Costs of services provided, including wages" page
    When the user selects the Costs of services provided, including wages field and enters a value of 150
    Then the user clicks the Continue button
    Then the user should be redirected to the "Other allowable property expenses" page
    When the user selects the Other allowable property expenses field and enters a value of 70
    Then the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign allowances
    When the user clicks on the Foreign allowances Spain link
    Then the user should be redirected to the "Allowances for your property in Spain" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Zero-emission car allowance" page
    And the user selects the Zero-emission car allowance amount field and enters a value of 300.25
    And the user clicks the Continue button
    Then the user should be redirected to the "Zero-emission goods vehicles" page
    And the user selects the Zero-emission goods vehicles amount field and enters a value of 600
    And the user clicks the Continue button
    Then the user should be redirected to the "Replacement of domestic goods" page
    And the user selects the Replacement of domestic goods amount field and enters a value of 32
    And the user clicks the Continue button
    Then the user should be redirected to the "Other capital allowances" page
    And the user selects the Other capital allowances amount field and enters a value of 180.27
    And the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign strutures and building allowance
    When the user clicks on the Foreign structures and building allowance Spain link
    Then the user should be redirected to the "Do you want to claim structures and buildings allowance?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Structures Buildings Allowance" page
    And the user clicks the Add a claim button
    Then the user should be redirected to the "Structures and buildings allowance qualifying date" page
    And the user selects the Day field and enters a value of 12
    And the user selects the Month field and enters a value of 2
    And the user selects the Year field and enters a value of 2024
    When the user clicks the Continue button
    Then the user should be redirected to the "Structures and buildings allowance qualifying amount" page
    And the user selects the sba foreign qualifying amount field and enters a value of 750
    When the user clicks the Continue button
    Then the user should be redirected to the "How much is your structures and buildings allowance claim?" page
    And the user selects the sba foreign claim amount field and enters a value of 15
    When the user clicks the Continue button
    And the user selects the Building name field and enters a value of Crest House
    And the user selects the Building number field and enters a value of 83
    And the user selects the Postcode field and enters a value of KN1 4AB
    And the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the Foreign sba save and continue button

    Then the user should be redirected to the "Your structures and buildings allowance claims" page
    And the user selects the no radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign adjustments
    When the user clicks on the Foreign adjustments Spain link
    Then the user should be redirected to the "Adjustments for your property in Spain" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Private use adjustment" page
    And the user selects the Private use adjustment Amount field and enters a value of 4307
    When the user clicks the Continue button
    Then the user should be redirected to the "Balancing charge" page
    And the user selects the BalancingChargeYes radio button
    Then the user selects the How much is the balancing charge? Amount field and enters a value of 367
    And the user clicks the Continue button
    Then the user should be redirected to the "Residential property finance costs" page
    And the user selects the Residential property finance costs amount field and enters a value of 240
    And the user clicks the Continue button
    Then the user should be redirected to the "Unused residential property finance costs brought forward" page
    And the user selects the Yes radio button
    Then the user selects the Foreign unused residential finance cost amount field and enters a value of 6000
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you have any unused losses for your property rental in previous years?" page
    And the user selects the Yes radio button
    Then the user selects the Foreign unused losses in previous years amount field and enters a value of 2100
    And the user clicks the Continue button
    Then the user should be redirected to the "When you reported the loss" page
    And the user selects the 2021 to 2022 radio button
    And the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page


  Scenario: Agent user adds foreign property details using a cash basis nino
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
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page

    # Foreign property
    When the user clicks on the Foreign property select country link
    Then the user should be redirected to the "Foreign property details" page
    When the user clicks the Continue button
    Then the user should be redirected to the "How much total income did your client get from all of their foreign properties?" page
    And the user selects the second option radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Which country did your client receive this income from?" page
    When the user selects the Country field and enters a value of Italy
    And the user clicks the Country option button
    And the user clicks the Continue button
    Then the user should be redirected to the "Countries where your client rented out property" page
    Then the user selects the No radio button
    When the user clicks the save and continue button
    Then the user should be redirected to the "Claim property income allowance or expenses" page
    And the user selects the Foreign property Property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign tax
    When the user clicks on the Foreign tax Italy link
    Then the user should be redirected to the "Did your client pay foreign tax on the income from their property in Italy?" page
    And the user selects the Yes radio button
    And the user selects the Foreign income tax Amount field and enters a value of 899.72
    Then the user clicks the Continue button
    Then the user should be redirected to the "Does your client want to claim foreign tax credit relief?" page
    And the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign income
    When the user clicks on the Foreign income Italy link
    Then the user should be redirected to the "Income from your client’s property in Italy" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Foreign property rental income" page
    And the user selects the Rental income field and enters a value of 200
    And the user clicks the Continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user selects the No radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Other income from property" page
    When the user selects the Foreign other income amount field and enters a value of 1050.78
    Then the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign adjustments
    When the user clicks on the Foreign adjustments Italy link
    Then the user should be redirected to the "Adjustments for your property in Italy" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Private use adjustment" page
    And the user selects the Private use adjustment Amount field and enters a value of 13504
    When the user clicks the Continue button
    Then the user should be redirected to the "Balancing charge" page
    And the user selects the BalancingChargeNo radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Your Property Income Allowance claim" page
    And the user selects the PIA claim amount field and enters a value of 240
    And the user clicks the Continue button

#    Then the user should be redirected to the "Residential property finance costs" page
#    And the user selects the Residential property finance costs amount field and enters a value of 240
#    And the user clicks the Continue button
#    Then the user should be redirected to the "Unused residential property finance costs brought forward" page
#    And the user selects the Yes radio button
#    Then the user selects the Foreign unused residential finance cost amount field and enters a value of 6000
#    And the user clicks the Continue button
    Then the user should be redirected to the "Did your client have any unused losses for their property rental in previous years?" page
    And the user selects the No radio button
    And the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page





