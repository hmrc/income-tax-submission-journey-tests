@screenshots

Feature: Screenshot tests for welsh translations

  Background:
    Given the user navigates to the auth login page

  Scenario: Setting the language to welsh and removing cookies message
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
#    When the user clicks on the Welsh toggle link
    When the user clicks on the Accept Cookies link
    And the user clicks on the Hide Message link

  Scenario: Full dividends flow - individual user
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
    And I take screenshots of the English, StartPage
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    And I take screenshots of the English, YourIncomeTaxReturnPage
    When the user clicks on the dividends link

#    First time you hit the page
    Then the user should be redirected to the "Did you get dividends from UK-based companies?" page
    And I take screenshots of the English, DidYouReceiveDivsPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did you get dividends from UK-based companies?" page
    And I take screenshots of the English, DidYouReceiveDivsPageNoChoice
    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "How much did you get in dividends from UK-based companies?" page
    And I take screenshots of the English, UkDivsAmountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: How much did you get in dividends from UK-based companies?" page
    And I take screenshots of the English, UkDivsAmountPageNoValue
#    Entering an amount that's invalid
    When the user selects the UK dividends amount field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did you get in dividends from UK-based companies?" page
    And I take screenshots of the English, UkDivsAmountPageInvalidAmount
#    Entering an amount that's too big
    When the user selects the UK dividends amount field and enters a value of 1000000000000
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did you get in dividends from UK-based companies?" page
    And I take screenshots of the English, UkDivsAmountPageTooBigAmount
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Did you get dividends from UK-based trusts or open-ended investment companies?" page
    And I take screenshots of the English, DivsFromUkTrustsPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did you get dividends from UK-based trusts or open-ended investment companies?" page
    And I take screenshots of the English, DivsFromUkTrustsPageNoChoice
    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "How much did you get in dividends from trusts and open-ended investment companies based in the UK?" page
    And I take screenshots of the English, UkDivsFromTrustsAmountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: How much did you get in dividends from trusts and open-ended investment companies based in the UK?" page
    And I take screenshots of the English, UkDivsFromTrustsAmountPageNoValue
#    Entering an amount that's invalid
    When the user selects the UK other dividends amount field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did you get in dividends from trusts and open-ended investment companies based in the UK?" page
    And I take screenshots of the English, UkDivsFromTrustsAmountPageInvalidAmount
#    Entering an amount that's too big
    When the user selects the UK other dividends amount field and enters a value of 1000000000000
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did you get in dividends from trusts and open-ended investment companies based in the UK?" page
    And I take screenshots of the English, UkDivsFromTrustsAmountPageTooBigAmount
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Check your income from dividends" page
    And I take screenshots of the English, CheckYourIncomeFromDividendsPage
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your Income Tax Return" page

  Scenario: Full dividends flow - agent user
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
    And I take screenshots of the English, YourClientsIncomeTaxReturnPage
    When the user clicks on the dividends link

#    First time you hit the page
    Then the user should be redirected to the "Did your client get dividends from UK-based companies?" page
    And I take screenshots of the English, DidYourClientReceiveDivsPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client get dividends from UK-based companies?" page
    And I take screenshots of the English, DidYourClientReceiveDivsPageNoChoice
    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "How much did your client get in dividends from UK-based companies?" page
    And I take screenshots of the English, UkDivsClientAmountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client get in dividends from UK-based companies?" page
    And I take screenshots of the English, UkDivsClientAmountPageNoValue
#    Entering an amount that's invalid
    When the user selects the UK dividends amount field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client get in dividends from UK-based companies?" page
    And I take screenshots of the English, UkDivsClientAmountPageInvalidAmount
#    Entering an amount that's too big error not needed as theres no agent specific content
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Did your client get dividends from UK-based trusts or open-ended investment companies?" page
    And I take screenshots of the English, ClientDivsFromUkTrustsPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client get dividends from UK-based trusts or open-ended investment companies?" page
    And I take screenshots of the English, ClientDivsFromUkTrustsPageNoChoice
    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "How much did your client get in dividends from trusts and open-ended investment companies based in the UK?" page
    And I take screenshots of the English, ClientUkDivsFromTrustsAmountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client get in dividends from trusts and open-ended investment companies based in the UK?" page
    And I take screenshots of the English, ClientUkDivsFromTrustsAmountPageNoValue
#    Entering an amount that's invalid
    When the user selects the UK other dividends amount field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client get in dividends from trusts and open-ended investment companies based in the UK?" page
    And I take screenshots of the English, ClientUkDivsFromTrustsAmountPageInvalidAmount
#    Entering an amount that's too big error not needed as theres no agent specific content
    When the user selects the UK dividends amount field and enters a value of 1000
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Check your client’s income from dividends" page
    And I take screenshots of the English, CheckYourClientsIncomeFromDividendsPage
    When the user clicks the save and continue button
    Then the user should be redirected to the "Your client’s Income Tax Return" page

  Scenario: Full interests flow - individual user
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
    When the user clicks on the interest link

#    First time you hit the page
    Then the user should be redirected to the "Did you get untaxed interest from the UK?" page
    And I take screenshots of the English, DidYouGetUntaxedInterestPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did you get untaxed interest from the UK?" page
    And I take screenshots of the English, DidYouGetUntaxedInterestPageNoChoice
    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Add an account with untaxed UK interest" page
    And I take screenshots of the English, AddUntaxedInterestAccountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Add an account with untaxed UK interest" page
    And I take screenshots of the English, AddUntaxedInterestAccountPageNoChoice
#    Entering invalid data for both input fields
    When the user selects the UK untaxed interest account name field and enters a value of Account123$
    And the user selects the UK untaxed interest amount earned field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: Add an account with untaxed UK interest" page
    And I take screenshots of the English, AddUntaxedInterestAccountPageInvalidData
#    Entering max length name and amount too big
    When the user selects the UK untaxed interest account name field and enters a value of TestAccountTestAccountTestAccount
    And the user selects the UK untaxed interest amount earned field and enters a value of 100,000,000,000
    And the user clicks the continue button
    Then the user should be redirected to the "Error: Add an account with untaxed UK interest" page
    And I take screenshots of the English, AddUntaxedInterestAccountPageMaxLimitData
    When the user selects the UK untaxed interest account name field and enters a value of Tesco Bank
    And the user selects the UK untaxed interest amount earned field and enters a value of 1000
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    And I take screenshots of the English, UntaxedInterestAccountsPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Accounts with untaxed UK interest" page
    And I take screenshots of the English, UntaxedInterestAccountsPageNoChoice
    When the user selects the no radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Did you get taxed interest from the UK?" page
    And I take screenshots of the English, TaxedInterestAccountsPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did you get taxed interest from the UK?" page
    And I take screenshots of the English, TaxedInterestAccountsPageNoChoice
    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Which account did you get taxed UK interest from?" page
    And I take screenshots of the English, WhichAccountTaxedInterestPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Which account did you get taxed UK interest from?" page
    And I take screenshots of the English, WhichAccountTaxedInterestPageNoChoice
    When the user selects the third radio button: add a new account
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Add an account with taxed UK interest" page
    And I take screenshots of the English, AddTaxedInterestAccountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Add an account with taxed UK interest" page
    And I take screenshots of the English, AddTaxedInterestAccountPageNoChoice
#    Entering invalid data for both input fields
    When the user selects the UK taxed interest account name field and enters a value of Account123$
    And the user selects the UK taxed interest amount earned field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: Add an account with taxed UK interest" page
    And I take screenshots of the English, AddTaxedInterestAccountPageInvalidData
#    Entering max length name and amount too big
    When the user selects the UK taxed interest account name field and enters a value of TestAccountTestAccountTestAccount
    And the user selects the UK taxed interest amount earned field and enters a value of 100,000,000,000
    And the user clicks the continue button
    Then the user should be redirected to the "Error: Add an account with taxed UK interest" page
    And I take screenshots of the English, AddTaxedInterestAccountPageMaxLimitData
    When the user selects the UK taxed interest account name field and enters a value of Tesco Bank
    And the user selects the UK taxed interest amount earned field and enters a value of 1000
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    And I take screenshots of the English, TaxedInterestAccountsPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Accounts with taxed UK interest" page
    And I take screenshots of the English, TaxedInterestAccountsPageNoChoice
    When the user selects the no radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Check your UK interest" page
    And I take screenshots of the English, CheckYourUkInterestPage

  Scenario: Full interests flow - agent user
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
    When the user clicks on the interest link

#    First time you hit the page
    Then the user should be redirected to the "Did your client get untaxed interest from the UK?" page
    And I take screenshots of the English, DidYourClientGetUntaxedInterestPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client get untaxed interest from the UK?" page
    And I take screenshots of the English, DidYourClientGetUntaxedInterestPageNoChoice
    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Add an account with untaxed UK interest" page
    And I take screenshots of the English, AddUntaxedInterestClientAccountPage
#    Hitting the page without choosing an option (this is the only agent specific error content)
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Add an account with untaxed UK interest" page
    And I take screenshots of the English, AddUntaxedInterestClientAccountPageNoChoice
    When the user selects the UK untaxed interest account name field and enters a value of Tesco Bank
    And the user selects the UK untaxed interest amount earned field and enters a value of 1000
    And the user clicks the continue button

#    First time you hit the page (error scenario not needed as not agent specific text)
    Then the user should be redirected to the "Accounts with untaxed UK interest" page
    And I take screenshots of the English, UntaxedInterestClientAccountsPage
    When the user selects the no radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Did your client get taxed interest from the UK?" page
    And I take screenshots of the English, ClientTaxedInterestAccountsPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client get taxed interest from the UK?" page
    And I take screenshots of the English, ClientTaxedInterestAccountsPageNoChoice
    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Which account did your client get taxed UK interest from?" page
    And I take screenshots of the English, WhichClientAccountTaxedInterestPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Which account did your client get taxed UK interest from?" page
    And I take screenshots of the English, WhichClientAccountTaxedInterestPageNoChoice
    When the user selects the third radio button: add a new account
    And the user clicks the continue button

#    First time you hit the page has no agent specific content, so no screenshot needed
#    Hitting the page without choosing an option (this is the only agent specific error content)
    Then the user should be redirected to the "Add an account with taxed UK interest" page
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Add an account with taxed UK interest" page
    And I take screenshots of the English, AddClientTaxedInterestAccountPageNoChoice
    When the user selects the UK taxed interest account name field and enters a value of Tesco Bank
    And the user selects the UK taxed interest amount earned field and enters a value of 1000
    And the user clicks the continue button

#    First time you hit the page (error scenario not needed as not agent specific text)
    Then the user should be redirected to the "Accounts with taxed UK interest" page
    And I take screenshots of the English, ClientTaxedInterestAccountsPage
    When the user selects the no radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Check your client’s UK interest" page
    And I take screenshots of the English, CheckYourClientsUkInterestPage
