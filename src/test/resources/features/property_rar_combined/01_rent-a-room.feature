@MVP @ZAP @property @rar @combined

Feature: Property Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual user adds UK Property details
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
    When the user clicks the Rent-a-room checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the Check your answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Rentaroom About link
    Then the user should be redirected to the "Rent a room" page
    And the user clicks the continue button
    Then the user should be redirected to the "Jointly let rent a room" page
    When the user selects the Jointly let rent a room, Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much total rent a room income did you receive?" page
    And the user selects the TotalRentaRoomAmt field and enters a value of 1750.00
    And the user clicks the continue button
    Then the user should be redirected to the "Claim expenses or rent a room relief" page
    When the user selects the Expenses radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the RaRAboutHYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    ##-------rent-a-room Expenses test ----##
    And the user clicks on the RaREpensesLink link
    Then the user should be redirected to the "Rent a room expenses" page
    When the user clicks the continue button
    Then the user should be redirected to the "Consolidated or individual expenses" page
    When the user selects the Claim consolidated expenses radio button
    And the user selects the Claim consolidated expensesAmt field and enters a value of 160.89
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
   And the user clicks the continue button
   Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the RaRExpensesHYFTS,Yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "UK property" page


  Scenario: Agent user adds UK Property details - Rent-a-room Expenses
    When the user logs into the service with the following details
      | Redirect url        | /test-only/EOY/additional-parameters?ClientNino=AC210000B&ClientMTDID=1234567890    |
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
    When the user clicks the Rent-a-room checkbox
    And the user clicks the UK Property continue button
    Then the user should be redirected to the "Check your answers" page
    When the user clicks the Check your answers continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the HYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    When the user clicks on the Rentaroom About link
    Then the user should be redirected to the "Rent a room" page
    And the user clicks the continue button
    Then the user should be redirected to the "Jointly let rent a room" page
    When the user selects the Jointly let rent a room, Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much total rent a room income did your client receive?" page
    And the user selects the TotalRentaRoomAmt field and enters a value of 1750.00
    And the user clicks the continue button
    Then the user should be redirected to the "Claim expenses or rent a room relief" page
    When the user selects the Expenses radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the RaRAboutHYFTS,Yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "UK property" page
    ##-------rent-a-room Expenses test ----##
    And the user clicks on the RaREpensesLink link
    Then the user should be redirected to the "Rent a room expenses" page
    When the user clicks the continue button
    Then the user should be redirected to the "Consolidated or individual expenses" page
    When the user selects the Claim consolidated expenses radio button
    And the user selects the Claim consolidated expensesAmt field and enters a value of 160.89
    And the user clicks the continue button
    Then the user should be redirected to the "Check your answers" page
    And the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the RaRExpensesHYFTS,Yes radio button
    When the user clicks the continue button
    Then the user should be redirected to the "UK property" page
