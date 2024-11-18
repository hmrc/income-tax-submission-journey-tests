@SelfEmployment
Feature: Self Employment Cash accounting Journeys

  Background:
    Given the user navigates to the auth login page

  Scenario: Individual - Self employment Income journey - (Cash accounting - Use Less than the maximum of £1,000)
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | CY682344B   |
      | Enrolment Key 1     | HMRC-MTD-IT |
      | Identifier Name 1   | MTDITID     |
      | Identifier Value 1  | 1234567890  |
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addSelfEmployment tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Self Employment link
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Review Self Employment Page ----------#
    When the user clicks on the Review self-employments link
    Then the user should be redirected to the "Self-employment" page under self employment
    When the user clicks on the View Self Employment link
    Then the user should be redirected to the "Check your self-employment details" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Self-employment" page under self employment
    When the user clicks the Continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment
    #-------------- End of Review Self Employment Page ----------#


    #-------------- Self Employment Abroad section ----------#
    When the user clicks on the Self-employment abroad link
    Then the user should be redirected to the "Did you carry out all of your self-employment abroad?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your details" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #--------------Self Employment Income section ----------#
    When the user clicks on the Self-employment Income link
    Then the user should be redirected to the "Income not counted as turnover" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "How much non-turnover income did you get?" page under self employment
    And the user selects the Amount-field field and enters a value of 20000
    And the user clicks the Continue button
    Then the user should be redirected to the "Your turnover" page under self employment
    And the user selects the Amount-field field and enters a value of 50000
    And the user clicks the Continue button
    Then the user should be redirected to the "Is there any other self-employment income you need to tell us about?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "How much other self-employment income did you get?" page under self employment
    And the user selects the Amount-field field and enters a value of 100000
    And the user clicks the Continue button
    Then the user should be redirected to the "Trading allowance" page under self employment

    #Use trading allowance
    When the user selects the Use the trading allowance radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Trading allowance for income under £1,000" page under self employment

    #Use Less than the maximum of £1,000
    When the user selects the second radio button radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "How much trading allowance do you want to use?" page under self employment
    And the user selects the Amount-field field and enters a value of 999
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your income" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

