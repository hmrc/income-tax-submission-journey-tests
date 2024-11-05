@TYR_Charitable_Donations @TYR_Common_Task_List @TYR_private_beta

Feature: Charitable Donations Journeys - Income Tax Submission

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual User - Charities - Donations using Gift Aid
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567000  |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Donations using Gift Aid task list link
    ##TODO Remove comment when the journey is correctly split
   ##TODO Mini Journey implemented here when ready
  # Then the user should be redirected to the "How much did you donate to charity by using Gift Aid?" page
  # When the user selects the Amount donated using Gift Aid field and enters a value of 50000
  # And the user clicks the continue button
  # Check your answers page for Donations using Gift Aid
  # And the user clicks the continue button
  ##TODO remove steps when mini journey is ready for gift aid
    Then the user should be redirected to the "Did you make donations to charity?" page
    When the user selects the no radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Check your donations to charity" page
    When the user clicks the continue button
    Then the user should be redirected to the "Have you finished this section?" page
    When the user selects the yes radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Individual User - Charities - Gifts of shares or securities
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567000  |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Gifts of shares or securities task list link
  ##TODO Remove comment when the journey is correctly split
  ##TODO Mini Journey implemented here when ready
  # Then the user should be redirected to the "What is the total value of qualifying shares or securities donated to charity?" page
  # When the user selects the Total value of qualifying shares or securities field and enters a value of 1500
  # And the user clicks the continue button
  # Check your answers page for qualifying shares or securities
  # And the user clicks the continue button
  ##TODO SASS-10191 to add have you completed this section to the navigation, however mini journey is not ready for gift aid yet
  # Then the user should be redirected to the "Have you finished this section?" page
  # When the user selects the yes radio button
  # When the user clicks the Continue button
  # Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Individual User - Charities - Gifts of land or property
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567000  |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Gifts of land or property task list link
    ##TODO Remove comment when the journey is correctly split
  ##TODO Mini Journey implemented here when ready
  # Then the user should be redirected to the "What is the value of land or property donated to charity?" page
  # When the user selects the Value of land or property field and enters a value of 750
  # And the user clicks the continue button
  # Check your answers page for land or property
  # And the user clicks the continue button
  ##TODO SASS-10191 to add have you completed this section to the navigation, however mini journey is not ready for gift aid yet
  # Then the user should be redirected to the "Have you finished this section?" page
  # When the user selects the yes radio button
  # When the user clicks the Continue button
  # Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Individual User - Charities - Gifts to overseas charities
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | AA123456A   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567000  |
    Then the user navigates to the Tailor return start page
     ##---- clear Test data ----##
    When the user navigates to the Test only clear data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    ##---- add Test data ----##
    When the user navigates to the Test only add data page for EOY
    Then the user should be redirected to the "Update and submit a Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Add sections to your Tax Return" page
    When the user clicks the Continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Gifts of overseas charities task list link
    ##TODO Remove comment when the journey is correctly split
    ##TODO Mini Journey implemented here when ready
  # Then the user should be redirected to the "How much did your client donate to overseas charities by using Gift Aid?" page
  # When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 12.99
  # And the user clicks the continue button
  # Check your answers page for qualifying shares or securities
  # And the user clicks the continue button
  ##TODO SASS-10191 to add have you completed this section to the navigation, however mini journey is not ready for gift aid yet
  # Then the user should be redirected to the "Have you finished this section?" page
  # When the user selects the yes radio button
  # When the user clicks the Continue button
  # Then the user should be redirected to the "Your Income Tax Return" page