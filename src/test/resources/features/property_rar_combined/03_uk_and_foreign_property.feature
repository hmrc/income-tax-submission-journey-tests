@property @wip

Feature: UK and Foreign Property Journey - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user adds UK and foreign property details
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
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addProperty tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
    When the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from your UK properties?" page
    And the user selects the second option radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Which rental property do you have in the UK?" page
    When the user clicks the following checkboxes:
      | first option  |
      | second option |
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page

    # Foreign property
    When the user clicks on the Foreign property select country link
    Then the user should be redirected to the "Foreign property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did you get from all of your foreign properties?" page
    And the user selects the second option radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Which country did you receive this income from?" page
    When the user selects the Country field and enters a value of Canada
    And the user clicks the Country option button
    And the user clicks the continue button
    Then the user should be redirected to the "Countries where you rented out property" page
    Then the user selects the No radio button
    When the user clicks the save and continue button
    Then the user should be redirected to the "Claim property income allowance or expenses" page
    And the user selects the Use the property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the continue button
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
    When the user selects the country field and enters a value of America
    And the user clicks the Country Option button
    And the user clicks the Continue button
    Then the user should be redirected to the "Foreign countries where you rented out property" page
    And the user clicks on the Remove link
    Then the user should be redirected to the "Do you want to remove Canada country?" page
    And the user selects the Yes remove country radio button
    Then the user should be redirected to the "Foreign countries where you rented out property" page
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
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    And the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    And the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
    When the user clicks on the UK property About link
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did your client get from all of their properties?" page
    And the user selects the second option radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Which rental property does your client have in the UK?" page
    When the user clicks the following checkboxes:
      | first option  |
      | second option |
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page

    # Foreign property
    When the user clicks on the Foreign property select country link
    Then the user should be redirected to the "Foreign property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did your client get from all of their foreign properties?" page
    And the user selects the second option radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Which country did your client receive this income from?" page
    When the user selects the Country field and enters a value of Canada
    And the user clicks the Country option button
    And the user clicks the continue button
    Then the user should be redirected to the "Countries where your client rented out property" page
    Then the user selects the No radio button
    When the user clicks the save and continue button
    Then the user should be redirected to the "Claim property income allowance or expenses" page
    And the user selects the Use the property income allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the Yes radio button
    And the user clicks the continue button
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
    Then the user should be redirected to the "Do you want to remove Canada country?" page
    And the user selects the Yes remove country radio button
    Then the user should be redirected to the "Foreign countries where your client rented out property" page
    Then Wait 5
    And the user clicks on the Change country link
    Then the user should be redirected to the "Which country did your client receive their foreign property rental income from?" page
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
