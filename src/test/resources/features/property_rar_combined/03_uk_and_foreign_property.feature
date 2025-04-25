@property

Feature: UK and Foreign Property Journey - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user adds UK and foreign property details - Property rentals and Rent a room + Expenses
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC210000A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to "Update and submit an Income Tax Return" page
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addProperty tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page

    # UK and foreign property
    When the user clicks on the UK & Foreign Property About link
    Then the user should be redirected to the "UK and foreign property details" page
    And the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from all of your UK and foreign properties?" page
    And the user selects the Less than £1,000 radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Do you want to report your property income?" page
    And the user selects the Yes, I want to report my property income radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Which type of rental property do you have in the UK?" page
    When the user clicks the following checkboxes:
      | first option  |
      | second option |
    And the user clicks the continue button
    Then the user should be redirected to the "Which country did you receive your foreign property rental income from?" page
    When the user selects the country field and enters a value of Canada
    And the user clicks the Country Option button
    And the user clicks the Continue button
    Then the user should be redirected to the "Foreign countries where you rented out property" page
    Then the user selects the Yes, add radio button
    When the user clicks the save and continue button
    Then the user should be redirected to the "Which country did you receive your foreign property rental income from?" page
    When the user selects the country field and enters a value of Spain
    And the user clicks the Country Option button
    And the user clicks the Continue button
    Then the user should be redirected to the "Foreign countries where you rented out property" page
    And the user clicks on the Remove link
    Then the user should be redirected to the "Do you want to remove Canada?" page
    And the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Foreign countries where you rented out property" page
    And the user selects the No, don't add radio button
    And the user clicks the save and continue button
    Then the user should be redirected to the "Claim expenses or rent a room relief" page
    And the user selects the rent a room relief radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Claim property income allowance or expenses" page
    And the user selects the Expenses not PIA radio button
    And the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # UK and foreign property - UK property rentals and rent a room
    When the user clicks on the UK property rentals and rent a room About link
    Then the user should be redirected to the "About your property rental and rent a room" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Jointly let rent a room" page
    When the user selects the Jointly let rent a room, Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much total rent a room income did you receive?" page
    And the user selects the TotalRentaRoomAmt field and enters a value of 45672.76
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Rentals RAR HYFTS Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page

    # UK property rentals and rent a room - Income
    When the user clicks on the UK property rentals and rent a room Income link
    Then the user should be redirected to the "Income" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Non-UK resident landlord" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Deducting Tax from non-UK landlords" page
    And the user selects the Tax deducted Yes radio button
    And the user selects the Tax Deducted Amount field and enters a value of 8762
    When the user clicks the continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user selects the Yes, premiums for a grant of lease radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Have you calculated the figure yourself?" page
    When the user selects the Yes,calculated radio button
    And the user selects the Yes,calculated amount field and enters a value of 7000
    And the user clicks the continue button
    Then the user should be redirected to the "Reverse premiums received" page
    And the user selects the Yes,premiums recieved radio button
    Then the user selects the premium recieved amount field and enters a value of 230
    When the user clicks the continue button
    Then the user should be redirected to the "Other income from property" page
    When the user selects the Other income amount field and enters a value of 3590.78
    Then the user clicks the continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # UK property rentals and rent a room - Expenses
    When the user clicks on the UK property rentals and rent a room Expenses link
    And the user clicks the continue button
    Then the user should be redirected to the "Rents, rates and insurance costs for your property" page
    And the user selects the Rents, rates and insurance amount field and enters a value of 5403
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
    And the user selects the Property business travel costs amount field and enters a value of 135
    When the user clicks the continue button
    Then the user should be redirected to the "Other allowable property expenses" page
    And the user selects the Other allowable property expenses amount field and enters a value of 200
    When the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # UK property rentals and rent a room - Allowances
    When the user clicks on the UK property rentals and rent a room Allowances link
    And the user clicks the continue button
    Then the user should be redirected to the "Capital allowances for a car" page
    And the user selects the Yes,capital allowances for a car radio button
    Then the user selects the Capital allowances for a car amount field and enters a value of 853
    When the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # UK property rentals and rent a room - Adjustments
    When the user clicks on the UK property rentals and rent a room Adjustments link
    And the user clicks the continue button
    Then the user should be redirected to the "How much was your private use adjustment?" page
    And the user selects the Private use adjustment Amount field and enters a value of 698.56
    When the user clicks the continue button
    Then the user should be redirected to the "Balancing charge" page
    And the user selects the BalancingChargeYes radio button
    Then the user selects the How much is the balancing charge? Amount field and enters a value of 1200
    And the user clicks the continue button
    Then the user should be redirected to the "Business premises renovation allowance balancing charge" page
    When the user clicks the Business premises renovation allowance balancing charge Yes button
    And the user selects the Business premises renovation allowance balancing charge Amount field and enters a value of 254.90
    When the user clicks the continue button
    Then the user should be redirected to the "Residential finance costs" page
    When the user selects the How much were your residential finance costs? Amount field and enters a value of 1200
    And the user clicks the continue button
    Then the user should be redirected to the "Unused residential costs brought forward" page
    And the user selects the How much unused residential costs do you want to bring forward? Amount field and enters a value of 1200
    When the user clicks the continue button
    Then the user should be redirected to the "Did you have any unused losses for your property rental in previous years?" page
    When the user clicks the Yes, did you have any unused losses for your property rental in previous years? button
    And the user selects the Yes, how much unused residential costs do you want to bring forward? Amount field and enters a value of 300
    When the user clicks the continue button
    And the user selects the 2020 to 2021 radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign property - Foreign tax
    When the user clicks on the Foreign tax Spain link
    Then the user should be redirected to the "Did you pay foreign tax on the income from your property in Spain?" page
    And the user selects the Foreign income tax Yes radio button
    And the user selects the Foreign income tax Amount field and enters a value of 1200.75
    Then the user clicks the Continue button
    Then the user should be redirected to the "Do you want to claim Foreign Tax Credit Relief?" page
    And the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign property - Foreign income
    When the user clicks on the Foreign income Spain link
    Then the user should be redirected to the "Income from your property in Spain" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Foreign property rental income" page
    And the user selects the Rental income field and enters a value of 600
    And the user clicks the Continue button
    Then the user should be redirected to the "Premiums for the grant of a lease" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Have you calculated the taxable amount for the premium for the grant of a lease?" page
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

    # Foreign property - Foreign expenses
    When the user clicks on the Foreign expenses Spain link
    Then the user should be redirected to the "Expenses for your property in Spain" page
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

    # Foreign property - Foreign allowances
    When the user clicks on the Foreign allowances Spain link
    Then the user should be redirected to the "Allowances for your property in Spain" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Capital allowances for a car" page
    And the user selects the Yes,capital allowances for a car radio button
    Then the user selects the Capital allowances for a car amount field and enters a value of 324
    And the user clicks the Continue button
    And the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "UK property" page

    # Foreign adjustments
    When the user clicks on the Foreign adjustments Spain link
    Then the user should be redirected to the "Adjustments for your property in Spain" page
    And the user clicks the Continue button
    Then the user should be redirected to the "Private use adjustment" page
    And the user selects the Private use adjustment Amount field and enters a value of 1258
    When the user clicks the Continue button
    Then the user should be redirected to the "Balancing charge" page
    And the user selects the BalancingChargeYes radio button
    Then the user selects the How much is the balancing charge? Amount field and enters a value of 122
    And the user clicks the Continue button
    Then the user should be redirected to the "Residential property finance costs" page
    And the user selects the Residential property finance costs amount field and enters a value of 512
    And the user clicks the Continue button
    Then the user should be redirected to the "Unused residential property finance costs brought forward" page
    And the user selects the Yes radio button
    Then the user selects the Foreign unused residential finance cost amount field and enters a value of 7000
    And the user clicks the Continue button
    Then the user should be redirected to the "Did you have any unused losses for your property rental in previous years?" page
    And the user selects the Yes radio button
    Then the user selects the Foreign unused losses in previous years amount field and enters a value of 987
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

  Scenario: Agent user adds UK and Foreign Property details
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
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page

    # UK and foreign property
    When the user clicks on the UK & Foreign Property About link
    Then the user should be redirected to the "UK and foreign property details" page
    And the user clicks the continue button
    Then the user should be redirected to the "How much total income did your client get from all of their UK and foreign properties?" page
    And the user selects the Less than £1,000 radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Do you want to report your client’s property income?" page
    And the user selects the Yes, my client wants to report their property income radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Which type of rental property does your client have in the UK?" page
    When the user clicks the following checkboxes:
      | first option  |
      | second option |
    And the user clicks the continue button
    Then the user should be redirected to the "Which country did your client receive their foreign property rental income from?" page
    When the user selects the country field and enters a value of Canada
    And the user clicks the Country Option button
    And the user clicks the Continue button
    Then the user should be redirected to the "Foreign countries where your client rented out property" page
    Then the user selects the Yes, add radio button
    When the user clicks the save and continue button
    Then the user should be redirected to the "Which country did your client receive their foreign property rental income from?" page
    When the user selects the country field and enters a value of America
    And the user clicks the Country Option button
    And the user clicks the Continue button
    Then the user should be redirected to the "Foreign countries where your client rented out property" page
    And the user clicks on the Remove link
    Then the user should be redirected to the "Do you want to remove Canada?" page
    And the user selects the Yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Foreign countries where your client rented out property" page
    And the user selects the No, don't add radio button
    And the user clicks the save and continue button
    Then the user should be redirected to the "Claim expenses or rent a room relief" page
    And the user selects the expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Claim property income allowance or expenses" page
    And the user selects the use the property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Non-UK resident landlord" page
    And the user selects the Yes radio button
    And the user clicks the Continue button
