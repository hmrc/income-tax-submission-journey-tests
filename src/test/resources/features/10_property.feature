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
   And the user clicks on the UK Properties About link

 # --------- Navigating to the UK Properties pages : Between 1000 and 85000 SASS-5334----------------
  Then the user should be redirected to the "UK Property details" page
  When the user clicks the continue button
  Then the user should be redirected to the "How much total income did you get from your UK properties?" page
  When the user selects the second property radio button: Between 1000 and 85000
  And the user clicks the property continue button



 #  Then the user should be redirected to the "UK Property" page
 #  And the Select which type of property you have is displayed
 #  When the user selects the first radio button: Property Rentals
 #  Then the user should be redirected to the "About your UK Properties" page
 #  And the user should see the correct Property Rentals About url
 #  When the user clicks on the UK Properties About link
 #  Then the user should be redirected to the "Check Your Answers" page


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
    And the user clicks on the UK Properties About link

 # --------- Navigating to the UK Properties pages : Between 1000 and 85000 SASS-5334----------------
    Then the user should be redirected to the "UK Property details" page
    When the user clicks the continue button
    Then the user should be redirected to the "How much total income did your client get from all of their properties?" page
    When the user selects the second property radio button: Between 1000 and 85000
    And the user clicks the property continue button

 # -----------------              ------------------------------
