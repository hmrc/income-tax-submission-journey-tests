@SelfEmployment
Feature: SelfEmployment Accural accounting -declear expenses

  Background:
    Given the user navigates to the auth login page

  #-------------- Review Self Employment Page ----------#
  Scenario: Individual Check self employment details
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | BB000002A   |
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

  #-------------- Self Employment Abroad  ----------#

  Scenario: Individual - Self employment abroad
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | BB000002A   |
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

  #-------------- Self Employment Income  ----------#
  Scenario: Individual - Self employment EOY Income journey - (Accural accounting - declare expenses)
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | BB000002A   |
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

    Then the user should be redirected to the "Turnover exempt from tax" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of your turnover is exempt from being taxed as profit?" page under self employment
    And the user selects the Amount-field field and enters a value of 120,000
    And the user clicks the Continue button

    Then the user should be redirected to the "Trading allowance" page under self employment
    #Use trading allowance
    When the user selects the Use the trading allowance radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Trading allowance for income under £1,000" page under self employment
    #Use Less than the maximum
    When the user selects the second radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much trading allowance do you want to use?" page under self employment
    And the user selects the Amount-field field and enters a value of 999
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your income" page under self employment

    When the user clicks on the Do you want to use trading allowance or declare expense link

    #Change to declare expenses
    When the user selects the Declare expenses radio button
    And the user clicks the Continue button
    Then the user should be redirected to the "Check your income" page under self employment

    And the user clicks the Self Employment Save and continue button

    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment


  #-------------- Self Employment Expenses tailoring journey ----------#
  Scenario: Individual - Self employment Expenses Tailoring journey
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | BB000002A   |
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

    When the user clicks on the Self-employment Expenses categories link
    Then the user should be redirected to the "How will you report your expenses?" page under self employment
    When the user selects the second radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Office supplies" page under self employment
    When the user selects the second radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Goods to sell or use" page under self employment
    When the user selects the second radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Repairs and maintenance" page under self employment
    When the user selects the second radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Did you work from home?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Did you work from your own business premises?" page under self employment
    When the user selects the second radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Travel and accommodation for work" page under self employment
    When the user selects the second radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Advertising or marketing" page under self employment
    When the user selects the second radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Entertainment costs" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Staff, construction industry and professional services expenses" page under self employment
    When the user clicks the first option checkbox
    When the user clicks the second option checkbox
    When the user clicks the third option checkbox
    And the user clicks the Continue button

    Then the user should be redirected to the "Disallowable staff costs" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Disallowable construction industry subcontractors costs" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Disallowable professional fees" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Financial expenses" page under self employment
    When the user clicks the first option checkbox
    When the user clicks the second option checkbox
    When the user clicks the third option checkbox
    And the user clicks the Continue button

    Then the user should be redirected to the "Is any of your interest on bank and other business loans disallowable?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Are any of your bank, credit card and other financial charges disallowable?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Are any of your irrecoverable debts disallowable?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Depreciation and loss or profit on the sale of assets" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Other expenses" page under self employment
    When the user selects the second radio button radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your expenses categories" page under self employment

    And the user clicks the Self Employment Save and continue button

    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment


  #---------- Self Employment Expenses - Questions page from task list  ----------#

  Scenario: Individual - Self employment Expenses - Questions page from task list
    When the user logs into the service with the following details
      | Redirect url        | /EOY/start  |
      | Credential Strength | strong      |
      | Confidence Level    | 250         |
      | Affinity Group      | Individual  |
      | Nino                | BB000002A   |
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

    #-------------- Self Employment Expenses - Office Supplies   ----------#

    When the user clicks on the Office supplies link

    Then the user should be redirected to the "How much did you spend on office supplies?" page under self employment
    And the user selects the Amount-field field and enters a value of 3000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £3,000.89 you spent on office supplies is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your office supplies expenses" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - Goods to sell   ----------#
    When the user clicks on the Goods to sell or use link

    Then the user should be redirected to the "Were you a taxi, minicab or road haulage industry driver?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much did you spend on goods to sell or use?" page under self employment
    And the user selects the Amount-field field and enters a value of 7,677.00
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £7,677.00 you spent on goods to sell or use is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your goods to sell or use expenses" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - Repairs and Maintenance   ----------#
    When the user clicks on the Repairs and maintenance link

    Then the user should be redirected to the "How much did you spend on repairs and maintenance?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £1,677.57 you spent on repairs and maintenance is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your repairs and maintenance costs" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - Advertising or Marketing   ---------- #
    When the user clicks on the Advertising or marketing link

    Then the user should be redirected to the "How much did you spend on advertising or marketing?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £1,677.57 you spent on advertising or marketing is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your advertising or marketing expenses" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - Entertainment cost   ---------- #
    When the user clicks on the Entertainment costs link

    Then the user should be redirected to the "How much did you spend on entertainment?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your entertainment expenses" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - Staff  cost   ---------- #
    When the user clicks on the Staff costs link

    Then the user should be redirected to the "How much did you spend on staff costs?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £1,677.57 you spent on staff costs is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your staff costs" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - construction industry contractors   ---------- #
    When the user clicks on the Construction industry subcontractors link

    Then the user should be redirected to the "How much did you spend on construction industry expenses?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £1,677.57 you spent on construction industry expenses is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your construction industry subcontractors expenses" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - Professional fees   ---------- #

    When the user clicks on the Professional fess link

    Then the user should be redirected to the "How much did you spend on professional fees?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £1,677.57 you spent on professional fees is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your professional fees" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - Interest paid on bank and other business loans   ---------- #
    When the user clicks on the Interest paid on bank and other business loans link

    Then the user should be redirected to the "How much did you spend on interest on bank and other business loans?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £1,677.57 you spent on interest on bank and other business loans is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your interest paid on loans expenses" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - Bank, credit card and other financial charges   ---------- #
    When the user clicks on the Bank, credit card and other financial charges link

    Then the user should be redirected to the "How much did you spend on bank, credit card and other financial charges?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £1,677.57 you spent on bank, credit card and other financial charges is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your financial charges expenses" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - Irrecoverable debts   ---------- #
    When the user clicks on the Irrecoverable debt link

    Then the user should be redirected to the "What is the value of the irrecoverable debts you’ve written off?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £1,677.57 you’re claiming in irrecoverable debts is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check you irrecoverable debts" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - depreciation costs  ---------- #
    When the user clicks on the Depreciation costs link

    Then the user should be redirected to the "How much are you claiming in depreciation costs?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your depreciation costs" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

     #-------------- Self Employment Expenses - other expenses  ---------- #
    When the user clicks on the Other expenses link

    Then the user should be redirected to the "How much did you spend on other expenses?" page under self employment
    And the user selects the Amount-field field and enters a value of 1,677.57
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £1,677.57 you spent on other expenses is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your other expenses" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment

    #-------------- Self Employment Expenses - Work Place Running Cost (including working from home) ---------- #

    When the user clicks on the Workplace running costs (including working from home) link

    Then the user should be redirected to the "Did you work from home for more than 25 hours a month?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much did you work from home?" page under self employment
    And the user selects the 25 - 50 hours field and enters a value of 5
    And the user selects the 51 - 100 hours field and enters a value of 5
    And the user selects the 101 hours or more field and enters a value of 2
    And the user clicks the Continue button

    Then the user should be redirected to the "Your flat rate for working from home is £192" page under self employment
    When the user selects the Actual costs radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Working-from-home expenses" page under self employment
    And the user clicks the Continue button

    Then the user should be redirected to the "Your working-from-home expenses" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "Did you live at your business premises?" page under self employment
    When the user selects the yes radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "Business premises expenses" page under self employment
    And the user selects the Amount-field field and enters a value of 1000.89
    And the user clicks the Continue button

    Then the user should be redirected to the "How much of the £1,000.89 you spent on business premises expenses is disallowable?" page under self employment
    And the user selects the Amount-field field and enters a value of 900.89
    And the user clicks the Continue button

    Then the user should be redirected to the "How many months did someone live at your business premises?" page under self employment
    And the user selects the 1 person field and enters a value of 5
    And the user selects the 2 people field and enters a value of 5
    And the user selects the 3 or more people field and enters a value of 2
    And the user clicks the Continue button

    Then the user should be redirected to the "Your personal use amount for living at your business premises is £5,550" page under self employment
    When the user selects the Actual costs radio button
    And the user clicks the Continue button

    Then the user should be redirected to the "How much are you claiming as your personal use amount?" page under self employment
    And the user selects the Amount-field field and enters a value of 600.67
    And the user clicks the Continue button

    Then the user should be redirected to the "Check your workplace running costs" page under self employment
    And the user clicks the Self Employment Save and continue button
    Then the user should be redirected to the "Have you finished this section?" page under self employment
    When the user selects the Yes, I’ve completed this section radio button
    When the user clicks the Continue button
    Then the user should be redirected to the "Self-employment" page under self employment