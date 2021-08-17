

Feature: Charities Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  @MVP @ZAP @charities
  Scenario: Minimal flow - Individual User - Charities
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                          |
      |Credential Strength|strong                                               |
      |Confidence Level   |200                                                  |
      |Affinity Group     |Individual                                           |
      |Nino               |AA123456A                                            |
      |Enrolment Key 1    |HMRC-MTD-IT                                          |
      |Identifier Name 1  |MTDITID                                              |
      |Identifier Value 1 |1234567890                                           |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the GiftAid link
    Then the user should be redirected to the "Did you use Gift Aid to donate to charity?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to add any donations made after 5 April 2022 to this tax year?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did you donate qualifying shares, securities, land or property to charity?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  @MVP @ZAP @charities
  Scenario: Maximal flow - Agent User - Charities
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567890    |
      |Credential Strength|weak                                                                                 |
      |Confidence Level   |200                                                                                  |
      |Affinity Group     |Agent                                                                                |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                          |
      |Identifier Name 1  |MTDITID                                                                              |
      |Identifier Value 1 |1234567890                                                                           |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                        |
      |Identifier Name 2  |AgentReferenceNumber                                                                 |
      |Identifier Value 2 |XARN1234567                                                                          |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the GiftAid link
    Then the user should be redirected to the "Did your client use Gift Aid to donate to charity?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client donate to charity by using Gift Aid?" page
    When the user selects the Amount donated using Gift Aid field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client make one-off donations?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client donate to charity as one-off payments?" page
    When the user selects the Amount donated as one-off payments field and enters a value of 700.50
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client use Gift Aid to donate to an overseas charity?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client donate to overseas charities by using Gift Aid?" page
    When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 12.99
    And the user clicks the continue button
    Then the user should be redirected to the "Name of overseas charity your client used Gift Aid to donate to" page
    When the user selects the Name of overseas charity field and enters a value of Bear’s Blue House
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charity your client used Gift Aid to donate to" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Name of overseas charity your client used Gift Aid to donate to" page
    When the user selects the Name of overseas charity field and enters a value of Foster’s Home
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charities your client used Gift Aid to donate to" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to add any of your client’s donations to the last tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of your client’s donation do you want to add to the last tax year?" page
    When the user selects the Amount to add to last tax year field and enters a value of 117
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to add any donations made after 5 April 2022 to this tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of the donations your client made after 5 April 2022 do you want to add to this tax year?" page
    When the user selects the Amount to add to this tax year field and enters a value of 0.48
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client donate qualifying shares, securities, land or property to charity?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client donate qualifying shares or securities to charity?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What is the total value of qualifying shares or securities donated to charity?" page
    When the user selects the Total value of qualifying shares or securities field and enters a value of 1500
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client donate land or property to charity?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What is the value of land or property donated to charity?" page
    When the user selects the Value of land or property field and enters a value of 750
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client donate qualifying shares, securities, land or property to overseas charities?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
    When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 219.05
    And the user clicks the continue button
    Then the user should be redirected to the "Name of overseas charity your client donated shares, securities, land or property to" page
    When the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Dexter’s Laboratory
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charity your client donated shares, securities, land or property to" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Name of overseas charity your client donated shares, securities, land or property to" page
    When the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Arnold’s Block
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charities your client donated shares, securities, land or property to" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  @MVP @ZAP @charities
  Scenario: Account Removal flow - Agent User - Charities
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA123457A&ClientMTDID=1234567890    |
      |Credential Strength|weak                                                                                 |
      |Confidence Level   |200                                                                                  |
      |Affinity Group     |Agent                                                                                |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                          |
      |Identifier Name 1  |MTDITID                                                                              |
      |Identifier Value 1 |1234567890                                                                           |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                        |
      |Identifier Name 2  |AgentReferenceNumber                                                                 |
      |Identifier Value 2 |XARN1234567                                                                          |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the GiftAid link
    Then the user should be redirected to the "Did your client use Gift Aid to donate to charity?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client donate to charity by using Gift Aid?" page
    When the user selects the Amount donated using Gift Aid field and enters a value of 500
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client make one-off donations?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client donate to charity as one-off payments?" page
    When the user selects the Amount donated as one-off payments field and enters a value of 700.50
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client use Gift Aid to donate to an overseas charity?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client donate to overseas charities by using Gift Aid?" page
    When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 12.99
    And the user clicks the continue button
    Then the user should be redirected to the "Name of overseas charity your client used Gift Aid to donate to" page
    When the user selects the Name of overseas charity field and enters a value of Bear’s Blue House
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charity your client used Gift Aid to donate to" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Name of overseas charity your client used Gift Aid to donate to" page
    When the user selects the Name of overseas charity field and enters a value of Foster’s Home
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charities your client used Gift Aid to donate to" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove Bear’s Blue House?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charities your client used Gift Aid to donate to" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove Bear’s Blue House?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charity your client used Gift Aid to donate to" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove Foster’s Home?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to add any of your client’s donations to the last tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of your client’s donation do you want to add to the last tax year?" page
    When the user selects the Amount to add to last tax year field and enters a value of 15
    And the user clicks the continue button
    Then the user should be redirected to the "Do you want to add any donations made after 5 April 2022 to this tax year?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "How much of the donations your client made after 5 April 2022 do you want to add to this tax year?" page
    When the user selects the Amount to add to this tax year field and enters a value of 0.48
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client donate qualifying shares, securities, land or property to charity?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client donate qualifying shares or securities to charity?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What is the total value of qualifying shares or securities donated to charity?" page
    When the user selects the Total value of qualifying shares or securities field and enters a value of 1500
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client donate land or property to charity?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What is the value of land or property donated to charity?" page
    When the user selects the Value of land or property field and enters a value of 750
    And the user clicks the continue button
    Then the user should be redirected to the "Did your client donate qualifying shares, securities, land or property to overseas charities?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
    When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 219.05
    And the user clicks the continue button
    Then the user should be redirected to the "Name of overseas charity your client donated shares, securities, land or property to" page
    When the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Dexter’s Laboratory
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charity your client donated shares, securities, land or property to" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Name of overseas charity your client donated shares, securities, land or property to" page
    When the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Arnold’s Block
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charities your client donated shares, securities, land or property to" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove Dexter’s Laboratory?" page
    When the user selects the no radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charities your client donated shares, securities, land or property to" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove Dexter’s Laboratory?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Overseas charity your client donated shares, securities, land or property to" page
    When the user clicks on the remove account link
    Then the user should be redirected to the "Are you sure you want to remove Arnold’s Block?" page
    When the user selects the yes radio button
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

    #Out of scope - To be included as part of Amend Updates for Gift Aid
  Scenario: Returning flow - Individual User, Review & change - Charities
    When the user logs into the service with the following details
      |Redirect url       |/2022/start                                           |
      |Credential Strength|strong                                                |
      |Confidence Level   |200                                                   |
      |Affinity Group     |Individual                                            |
      |Nino               |AA123459A                                             |
      |Enrolment Key 1    |HMRC-MTD-IT                                           |
      |Identifier Name 1  |MTDITID                                               |
      |Identifier Value 1 |1234567891                                            |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the GiftAid link
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks on the change amount donated to charity using Gift Aid link
    Then the user should be redirected to the "How much did you donate to charity by using Gift Aid?" page
    When the user selects the Amount donated using Gift Aid field and enters a value of 50000
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks on the change amount of one-off donations to charity using Gift Aid link
    Then the user should be redirected to the "How much did you donate to charity as one-off payments?" page
    When the user selects the Amount donated as one-off payments field and enters a value of 7200.39
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks on the change amount donated to overseas charities using Gift Aid link
    Then the user should be redirected to the "How much did you donate to overseas charities using Gift Aid?" page
    When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 130
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks on the change overseas charities’ names link
    Then the user should be redirected to the "Name of overseas charity you used Gift Aid to donate to" page
    When the user selects the Name of overseas charity field and enters a value of Courage’s Shelter
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks on the change amount of donation to add to last tax year link
    Then the user should be redirected to the "How much of your donation do you want to add to the last tax year?" page
    When the user selects the Amount to add to last tax year field and enters a value of 809.9
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks on the change amount of donation added to this tax year link
    Then the user should be redirected to the "How much of the donations you made after 5 April 2022 do you want to add to this tax year?" page
    When the user selects the Amount to add to this tax year field and enters a value of 13
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks on the change value of shares or securities link
    Then the user should be redirected to the "What is the total value of shares or securities donated to charity?" page
    When the user selects the Total value of qualifying shares or securities field and enters a value of 6407.31
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks on the change value of land or property link
    Then the user should be redirected to the "What is the value of land or property donated to charity?" page
    When the user selects the Value of land or property field and enters a value of 520
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks on the change value of shares, securities, land or property link
    Then the user should be redirected to the "What is the value of shares, securities, land or property donated to overseas charities?" page
    When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 4.99
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks on the change overseas charities you donated shares, securities, land or property to link
    Then the user should be redirected to the "Name of overseas charity you donated shares, securities, land or property to" page
    When the user selects the Name of overseas charity you donated shares, securities, land or property to field and enters a value of Jimmy’s Cafe
    And the user clicks the continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user should see the correct View tax calculation to date url

    #Out of scope - To be included as part of Amend Updates for Gift Aid
  Scenario: Returning flow - Agent User - Charities
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA123459A&ClientMTDID=1234567890    |
      |Credential Strength|weak                                                                                 |
      |Confidence Level   |200                                                                                  |
      |Affinity Group     |Agent                                                                                |
      |Enrolment Key 1    |HMRC-MTD-IT                                                                          |
      |Identifier Name 1  |MTDITID                                                                              |
      |Identifier Value 1 |1234567890                                                                           |
      |Enrolment Key 2    |HMRC-AS-AGENT                                                                        |
      |Identifier Name 2  |AgentReferenceNumber                                                                 |
      |Identifier Value 2 |XARN1234567                                                                          |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page
    When the user clicks on the GiftAid link
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks on the change amount of one-off donations to charity using Gift Aid link
    Then the user should be redirected to the "How much did your client donate to charity as one-off payments?" page
    When the user selects the Amount donated as one-off payments field and enters a value of 7200.39
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks on the change amount donated to overseas charities using Gift Aid link
    Then the user should be redirected to the "How much did your client donate to overseas charities using Gift Aid?" page
    When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 130
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks on the change overseas charities’ names link
    Then the user should be redirected to the "Name of overseas charity your client used Gift Aid to donate to" page
    When the user selects the Name of overseas charity field and enters a value of Courage’s Shelter
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks on the change amount of donation to add to last tax year link
    Then the user should be redirected to the "How much of your client’s donation do you want to add to the last tax year?" page
    When the user selects the Amount to add to last tax year field and enters a value of 809.9
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks on the change amount of donation added to this tax year link
    Then the user should be redirected to the "How much of the donations your client made after 5 April 2022 do you want to add to this tax year?" page
    When the user selects the Amount to add to this tax year field and enters a value of 13
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks on the change value of shares or securities link
    Then the user should be redirected to the "What is the total value of shares or securities donated to charity?" page
    When the user selects the Total value of qualifying shares or securities field and enters a value of 6407.31
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks on the change value of land or property link
    Then the user should be redirected to the "What is the value of land or property donated to charity?" page
    When the user selects the Value of land or property field and enters a value of 520
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks on the change value of shares, securities, land or property link
    Then the user should be redirected to the "What is the value of shares, securities, land or property donated to overseas charities?" page
    When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 4.99
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks on the change overseas charities you donated shares, securities, land or property to link
    Then the user should be redirected to the "Name of overseas charity your client donated shares, securities, land or property to" page
    When the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Jimmy’s Cafe
    And the user clicks the continue button
    Then the user should be redirected to the "Check your client’s donations to charity" page
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And the user should see the correct View tax calculation to date url