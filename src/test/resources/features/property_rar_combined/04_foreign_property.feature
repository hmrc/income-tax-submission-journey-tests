#Tags to be added later + Agent journey

Feature: Foreign Property Journey - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user adds foreign property details
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AC190000B   |
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
    When the user clicks on the Foreign tax link
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
    Then the user should be redirected to the "Reverse premiums received" page
    And the user selects the Yes,premiums recieved radio button
    Then the user selects the premium recieved amount field and enters a value of 300
    When the user clicks the Continue button
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

