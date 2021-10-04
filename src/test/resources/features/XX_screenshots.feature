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


    Scenario: Full Gift Aid flow - individual user
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

#    First time you hit the page
      Then the user should be redirected to the "Did you use Gift Aid to donate to charity?" page
      And I take screenshots of the English, DidYouDonateToCharityPage
#    Hitting continue without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Did you use Gift Aid to donate to charity?" page
      And I take screenshots of the English, DidYouDonateToCharityPageNoChoice
      When the user selects the yes radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "How much did you donate to charity by using Gift Aid?" page
      And I take screenshots of the English, DonateToCharityAmountPage
#    Hitting continue without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to charity by using Gift Aid?" page
      And I take screenshots of the English, DonateToCharityAmountPageNoChoice
#    Entering invalid data
      When the user selects the Amount donated using Gift Aid field and enters a value of abc
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to charity by using Gift Aid?" page
      And I take screenshots of the English, DonateToCharityAmountPageInvalidData
#    Entering an amount too large
      When the user selects the Amount donated using Gift Aid field and enters a value of 999999999999
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to charity by using Gift Aid?" page
      And I take screenshots of the English, DonateToCharityAmountPageTooLarge

      When the user selects the Amount donated using Gift Aid field and enters a value of 100
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Did you make one-off donations?" page
      And I take screenshots of the English, OneOffDonationsPage
#    Hitting continue without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Did you make one-off donations?" page
      And I take screenshots of the English, OneOffDonationsPageNoChoice

      When the user selects the yes radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "How much did you donate to charity as one-off payments?" page
      And I take screenshots of the English, OneOffDonationsAmountPage
#    Hitting continue without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to charity as one-off payments?" page
      And I take screenshots of the English, OneOffDonationsAmountPageNoChoice
#    Entering invalid data
      When the user selects the Amount donated as one-off payments field and enters a value of abc
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to charity as one-off payments?" page
      And I take screenshots of the English, OneOffDonationsAmountPageInvalidData
#    Entering an amount too large
      When the user selects the Amount donated as one-off payments field and enters a value of 999999999999
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to charity as one-off payments?" page
      And I take screenshots of the English, OneOffDonationsAmountPageTooLarge
#    Entering an amount larger than the total donation
      When the user selects the Amount donated as one-off payments field and enters a value of 101
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to charity as one-off payments?" page
      And I take screenshots of the English, OneOffDonationsAmountPageGreater

      When the user selects the Amount donated as one-off payments field and enters a value of 10
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Did you use Gift Aid to donate to an overseas charity?" page
      And I take screenshots of the English, OverseasGiftAidDonationsPage
#    Hitting continue without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Did you use Gift Aid to donate to an overseas charity?" page
      And I take screenshots of the English, OverseasGiftAidDonationsPageNoChoice

      When the user selects the yes radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "How much did you donate to overseas charities by using Gift Aid?" page
      And I take screenshots of the English, OverseasGiftAidDonatedAmountPage
#    Hitting continue without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to overseas charities by using Gift Aid?" page
      And I take screenshots of the English, OverseasGiftAidDonatedAmountPageNoChoice
#    Entering invalid data
      When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of abc
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to overseas charities by using Gift Aid?" page
      And I take screenshots of the English, OverseasGiftAidDonatedAmountPageInvalidData
#    Entering an amount too large
      When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 999999999999
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to overseas charities by using Gift Aid?" page
      And I take screenshots of the English, OverseasGiftAidDonatedAmountPageTooLarge
#    Entering an amount larger than the total donation
      When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 101
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much did you donate to overseas charities by using Gift Aid?" page
      And I take screenshots of the English, OverseasGiftAidDonatedAmountPageGreater

      When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 10
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Name of overseas charity you used Gift Aid to donate to" page
      And I take screenshots of the English, OverseasGiftAidNamePage
#    Hitting continue without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Name of overseas charity you used Gift Aid to donate to" page
      And I take screenshots of the English, OverseasGiftAidNamePageNoChoice
#    Entering invalid data
      When the user selects the Name of overseas charity field and enters a value of $$$
      And the user clicks the continue button
      Then the user should be redirected to the "Error: Name of overseas charity you used Gift Aid to donate to" page
      And I take screenshots of the English, OverseasGiftAidNamePageInvalidData
#    Entering a name over the max character limit
      When the user selects the Name of overseas charity field and enters a value of exceedingly long account nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
      And the user clicks the continue button
      Then the user should be redirected to the "Error: Name of overseas charity you used Gift Aid to donate to" page
      And I take screenshots of the English, OverseasGiftAidNamePageMaxLimit

      When the user selects the Name of overseas charity field and enters a value of Bank of money
      And the user clicks the continue button

      When the user selects the yes radio button
      And the user clicks the continue button

#    Entering a duplicate name
      When the user selects the Name of overseas charity field and enters a value of Bank of money
      And the user clicks the continue button
      Then the user should be redirected to the "Error: Name of overseas charity you used Gift Aid to donate to" page
      And I take screenshots of the English, OverseasGiftAidNamePageDuplicateName

      When the user navigates to the overseas gift aid summary page

#    First time you hit the page
      Then the user should be redirected to the "Overseas charity you used Gift Aid to donate to" page
      And I take screenshots of the English, OverseasCharitySummaryPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Overseas charity you used Gift Aid to donate to" page
      And I take screenshots of the English, OverseasCharitySummaryPageNoChoice

      When the user clicks on the Remove link

#    First time you hit the page
      Then the user should be redirected to the "Are you sure you want to remove Bank of money?" page
      And I take screenshots of the English, RemoveCharityPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Are you sure you want to remove Bank of money?" page
      And I take screenshots of the English, RemoveCharityPageNoChoice

      When the user selects the no radio button
      And the user clicks the continue button
      When the user selects the no radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Do you want to add any of your donations to the last tax year?" page
      And I take screenshots of the English, AddToLastTaxYearPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Do you want to add any of your donations to the last tax year?" page
      And I take screenshots of the English, AddToLastTaxYearPageNoChoice

      When the user selects the yes radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "How much of your donation do you want to add to the last tax year?" page
      And I take screenshots of the English, AddToLastTaxYearAmountPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: How much of your donation do you want to add to the last tax year?" page
      And I take screenshots of the English, AddToLastTaxYearAmountPageNoChoice
#    Entering invalid data
      When the user selects the Amount to add to last tax year field and enters a value of abc
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much of your donation do you want to add to the last tax year?" page
      And I take screenshots of the English, AddToLastTaxYearAmountPageInvalidData
#    Entering an amount too large
      When the user selects the Amount to add to last tax year field and enters a value of 999999999999
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much of your donation do you want to add to the last tax year?" page
      And I take screenshots of the English, AddToLastTaxYearAmountPageTooLarge
#    Entering an amount larger than the total donation
      When the user selects the Amount to add to last tax year field and enters a value of 101
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much of your donation do you want to add to the last tax year?" page
      And I take screenshots of the English, AddToLastTaxYearAmountPageGreater

      When the user selects the Amount to add to last tax year field and enters a value of 10
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Do you want to add any donations made after 5 April 2022 to this tax year?" page
      And I take screenshots of the English, AddToThisTaxYearPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Do you want to add any donations made after 5 April 2022 to this tax year?" page
      And I take screenshots of the English, AddToThisTaxYearPageNoChoice

      When the user selects the yes radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "How much of the donations you made after 5 April 2022 do you want to add to this tax year?" page
      And I take screenshots of the English, AddToThisTaxYearAmountPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: How much of the donations you made after 5 April 2022 do you want to add to this tax year?" page
      And I take screenshots of the English, AddToThisTaxYearAmountPageNoChoice
#    Entering invalid data
      When the user selects the Amount to add to this tax year field and enters a value of abc
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much of the donations you made after 5 April 2022 do you want to add to this tax year?" page
      And I take screenshots of the English, AddToThisTaxYearAmountPageInvalidData
#    Entering an amount too large
      When the user selects the Amount to add to this tax year field and enters a value of 999999999999
      And the user clicks the continue button
      Then the user should be redirected to the "Error: How much of the donations you made after 5 April 2022 do you want to add to this tax year?" page
      And I take screenshots of the English, AddToThisTaxYearAmountPageTooLarge

      When the user selects the Amount to add to this tax year field and enters a value of 10
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Did you donate qualifying shares, securities, land or property to charity?" page
      And the user clicks on the progressive disclosure link
      And I take screenshots of the English, donateSSLPPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Did you donate qualifying shares, securities, land or property to charity?" page
      And I take screenshots of the English, donateSSLPPageNoChoice

      When the user selects the yes radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Did you donate qualifying shares or securities to charity?" page
      And I take screenshots of the English, donateSharesSecuritiesPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Did you donate qualifying shares or securities to charity?" page
      And I take screenshots of the English, donateSharesSecuritiesPageNoChoice

      When the user selects the yes radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "What is the total value of qualifying shares or securities donated to charity?" page
      And I take screenshots of the English, donateSharesSecuritiesAmountPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: What is the total value of qualifying shares or securities donated to charity?" page
      And I take screenshots of the English, donateSharesSecuritiesAmountPageNoChoice
#    Entering invalid data
      When the user selects the Total value of qualifying shares or securities field and enters a value of abc
      And the user clicks the continue button
      Then the user should be redirected to the "Error: What is the total value of qualifying shares or securities donated to charity?" page
      And I take screenshots of the English, donateSharesSecuritiesAmountPageInvalidData
#    Entering an amount too large
      When the user selects the Total value of qualifying shares or securities field and enters a value of 999999999999
      And the user clicks the continue button
      Then the user should be redirected to the "Error: What is the total value of qualifying shares or securities donated to charity?" page
      And I take screenshots of the English, donateSharesSecuritiesAmountPageTooLarge

      When the user selects the Total value of qualifying shares or securities field and enters a value of 10
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Did you donate land or property to charity?" page
      And I take screenshots of the English, donateLandPropertyPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Did you donate land or property to charity?" page
      And I take screenshots of the English, donateLandPropertyPageNoChoice

      When the user selects the yes radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "What is the value of land or property donated to charity?" page
      And I take screenshots of the English, donateLandPropertyAmountPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: What is the value of land or property donated to charity?" page
      And I take screenshots of the English, donateLandPropertyAmountPageNoChoice
#    Entering invalid data
      When the user selects the Value of land or property field and enters a value of abc
      And the user clicks the continue button
      Then the user should be redirected to the "Error: What is the value of land or property donated to charity?" page
      And I take screenshots of the English, donateLandPropertyAmountPageInvalidData
#    Entering an amount too large
      When the user selects the Value of land or property field and enters a value of 999999999999
      And the user clicks the continue button
      Then the user should be redirected to the "Error: What is the value of land or property donated to charity?" page
      And I take screenshots of the English, donateLandPropertyAmountPageTooLarge

      When the user selects the Value of land or property field and enters a value of 10
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Did you donate qualifying shares, securities, land or property to overseas charities?" page
      And the user clicks on the progressive disclosure link
      And I take screenshots of the English, donateOverseasSSLPPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Did you donate qualifying shares, securities, land or property to overseas charities?" page
      And I take screenshots of the English, donateOverseasSSLPPageNoChoice

      When the user selects the yes radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
      And I take screenshots of the English, donateOverseasSSLPAmountPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
      And I take screenshots of the English, donateOverseasSSLPAmountPageNoChoice
#    Entering invalid data
      When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of abc
      And the user clicks the continue button
      Then the user should be redirected to the "Error: What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
      And I take screenshots of the English, donateOverseasSSLPAmountPageInvalidData
#    Entering an amount too large
      When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 999999999999
      And the user clicks the continue button
      Then the user should be redirected to the "Error: What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
      And I take screenshots of the English, donateOverseasSSLPAmountPageTooLarge
#    Entering an amount larger than the total donation
      When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 21
      And the user clicks the continue button
      Then the user should be redirected to the "Error: What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
      And I take screenshots of the English, donateOverseasSSLPAmountPageGreater

      When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 10
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Name of overseas charity you donated shares, securities, land or property to" page
      And I take screenshots of the English, OverseasSSLPNamePage
#    Hitting continue without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Name of overseas charity you donated shares, securities, land or property to" page
      And I take screenshots of the English, OverseasSSLPNamePageNoChoice
#    Entering invalid data
      When the user selects the Name of overseas charity you donated shares, securities, land or property to field and enters a value of $$$
      And the user clicks the continue button
      Then the user should be redirected to the "Error: Name of overseas charity you donated shares, securities, land or property to" page
      And I take screenshots of the English, OverseasSSLPNamePageInvalidData
#    Entering a name over the max character limit
      When the user selects the Name of overseas charity you donated shares, securities, land or property to field and enters a value of exceedingly long account nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
      And the user clicks the continue button
      Then the user should be redirected to the "Error: Name of overseas charity you donated shares, securities, land or property to" page
      And I take screenshots of the English, OverseasSSLPNamePageMaxLimit

      When the user selects the Name of overseas charity you donated shares, securities, land or property to field and enters a value of Bank of money
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Overseas charity you donated shares, securities, land or property to" page
      And I take screenshots of the English, OverseasSSLPSummaryPage
#    Hitting the page without choosing an option
      When the user clicks the continue button
      Then the user should be redirected to the "Error: Overseas charity you donated shares, securities, land or property to" page
      And I take screenshots of the English, OverseasSSLPSummaryPageNoChoice

      When the user selects the no radio button
      And the user clicks the continue button

#    First time you hit the page
      Then the user should be redirected to the "Check your donations to charity" page
      And I take screenshots of the English, GiftAidCYAPage

#    Changing the page
      When the user clicks on the change link in position 2
      Then the user should be redirected to the "How much did you donate to charity by using Gift Aid?" page
      And I take screenshots of the English, DonateToCharityAmountPageChange

      And the user clicks the continue button

#    Changing the page
      When the user clicks on the change link in position 3
      Then the user should be redirected to the "Did you make one-off donations?" page
      And I take screenshots of the English, OneOffDonationsPageChange

      And the user clicks the continue button
      Then the user should be redirected to the "How much did you donate to charity as one-off payments?" page
      And I take screenshots of the English, OneOffDonationsAmountPageChange

      And the user clicks the continue button

#    Changing the page
      When the user clicks on the change link in position 6
      Then the user should be redirected to the "How much did you donate to overseas charities by using Gift Aid?" page
      And I take screenshots of the English, OverseasGiftAidDonatedAmountPageChange

      And the user clicks the continue button

#    Changing the page
      When the user clicks on the change link in position 8
      Then the user should be redirected to the "Do you want to add any of your donations to the last tax year?" page
      And I take screenshots of the English, AddToLastTaxYearPageChange

      And the user clicks the continue button
      Then the user should be redirected to the "How much of your donation do you want to add to the last tax year?" page
      And I take screenshots of the English, AddToLastTaxYearAmountPageChange

      And the user clicks the continue button

#    Changing the page
      When the user clicks on the change link in position 11
      Then the user should be redirected to the "How much of the donations you made after 5 April 2022 do you want to add to this tax year?" page
      And I take screenshots of the English, AddToThisTaxYearAmountPageChange

      And the user clicks the continue button

#    Changing the page
      When the user clicks on the change link in position 14
      Then the user should be redirected to the "What is the total value of qualifying shares or securities donated to charity?" page
      And I take screenshots of the English, donateSharesSecuritiesAmountPageChange

      And the user clicks the continue button

#    Changing the page
      When the user clicks on the change link in position 16
      Then the user should be redirected to the "What is the value of land or property donated to charity?" page
      And I take screenshots of the English, donateLandPropertyAmountPageChange

      And the user clicks the continue button

#    Changing the page
      When the user clicks on the change link in position 18
      Then the user should be redirected to the "What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
      And I take screenshots of the English, donateOverseasSSLPAmountPageChange

  Scenario: Full Gift Aid flow - agent user
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

#    First time you hit the page
    Then the user should be redirected to the "Did your client use Gift Aid to donate to charity?" page
    And I take screenshots of the English, DidYouDonateToCharityPage
#    Hitting continue without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client use Gift Aid to donate to charity?" page
    And I take screenshots of the English, DidYouDonateToCharityPageNoChoice
    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "How much did your client donate to charity by using Gift Aid?" page
    And I take screenshots of the English, DonateToCharityAmountPage
#    Hitting continue without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to charity by using Gift Aid?" page
    And I take screenshots of the English, DonateToCharityAmountPageNoChoice
#    Entering invalid data
    When the user selects the Amount donated using Gift Aid field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to charity by using Gift Aid?" page
    And I take screenshots of the English, DonateToCharityAmountPageInvalidData
#    Entering an amount too large
    When the user selects the Amount donated using Gift Aid field and enters a value of 999999999999
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to charity by using Gift Aid?" page
    And I take screenshots of the English, DonateToCharityAmountPageTooLarge

    When the user selects the Amount donated using Gift Aid field and enters a value of 100
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Did your client make one-off donations?" page
    And I take screenshots of the English, OneOffDonationsPage
#    Hitting continue without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client make one-off donations?" page
    And I take screenshots of the English, OneOffDonationsPageNoChoice

    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "How much did your client donate to charity as one-off payments?" page
    And I take screenshots of the English, OneOffDonationsAmountPage
#    Hitting continue without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to charity as one-off payments?" page
    And I take screenshots of the English, OneOffDonationsAmountPageNoChoice
#    Entering invalid data
    When the user selects the Amount donated as one-off payments field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to charity as one-off payments?" page
    And I take screenshots of the English, OneOffDonationsAmountPageInvalidData
#    Entering an amount too large
    When the user selects the Amount donated as one-off payments field and enters a value of 999999999999
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to charity as one-off payments?" page
    And I take screenshots of the English, OneOffDonationsAmountPageTooLarge
#    Entering an amount larger than the total donation
    When the user selects the Amount donated as one-off payments field and enters a value of 101
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to charity as one-off payments?" page
    And I take screenshots of the English, OneOffDonationsAmountPageGreater

    When the user selects the Amount donated as one-off payments field and enters a value of 10
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Did your client use Gift Aid to donate to an overseas charity?" page
    And I take screenshots of the English, OverseasGiftAidDonationsPage
#    Hitting continue without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client use Gift Aid to donate to an overseas charity?" page
    And I take screenshots of the English, OverseasGiftAidDonationsPageNoChoice

    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "How much did your client donate to overseas charities by using Gift Aid?" page
    And I take screenshots of the English, OverseasGiftAidDonatedAmountPage
#    Hitting continue without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to overseas charities by using Gift Aid?" page
    And I take screenshots of the English, OverseasGiftAidDonatedAmountPageNoChoice
#    Entering invalid data
    When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to overseas charities by using Gift Aid?" page
    And I take screenshots of the English, OverseasGiftAidDonatedAmountPageInvalidData
#    Entering an amount too large
    When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 999999999999
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to overseas charities by using Gift Aid?" page
    And I take screenshots of the English, OverseasGiftAidDonatedAmountPageTooLarge
#    Entering an amount larger than the total donation
    When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 101
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much did your client donate to overseas charities by using Gift Aid?" page
    And I take screenshots of the English, OverseasGiftAidDonatedAmountPageGreater

    When the user selects the Amount donated to overseas charities using Gift Aid field and enters a value of 10
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Name of overseas charity your client used Gift Aid to donate to" page
    And I take screenshots of the English, OverseasGiftAidNamePage
#    Hitting continue without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Name of overseas charity your client used Gift Aid to donate to" page
    And I take screenshots of the English, OverseasGiftAidNamePageNoChoice
#    Entering invalid data
    When the user selects the Name of overseas charity field and enters a value of $$$
    And the user clicks the continue button
    Then the user should be redirected to the "Error: Name of overseas charity your client used Gift Aid to donate to" page
    And I take screenshots of the English, OverseasGiftAidNamePageInvalidData
#    Entering a name over the max character limit
    When the user selects the Name of overseas charity field and enters a value of exceedingly long account nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
    And the user clicks the continue button
    Then the user should be redirected to the "Error: Name of overseas charity your client used Gift Aid to donate to" page
    And I take screenshots of the English, OverseasGiftAidNamePageMaxLimit

    When the user selects the Name of overseas charity field and enters a value of Bank of money
    And the user clicks the continue button

    When the user selects the yes radio button
    And the user clicks the continue button

#    Entering a duplicate name
    When the user selects the Name of overseas charity field and enters a value of Bank of money
    And the user clicks the continue button
    Then the user should be redirected to the "Error: Name of overseas charity your client used Gift Aid to donate to" page
    And I take screenshots of the English, OverseasGiftAidNamePageDuplicateName

    When the user navigates to the overseas gift aid summary page

#    First time you hit the page
    Then the user should be redirected to the "Overseas charity your client used Gift Aid to donate to" page
    And I take screenshots of the English, OverseasCharitySummaryPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Overseas charity your client used Gift Aid to donate to" page
    And I take screenshots of the English, OverseasCharitySummaryPageNoChoice

    When the user clicks on the Remove link

#    First time you hit the page
    Then the user should be redirected to the "Are you sure you want to remove Bank of money?" page
    And I take screenshots of the English, RemoveCharityPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Are you sure you want to remove Bank of money?" page
    And I take screenshots of the English, RemoveCharityPageNoChoice

    When the user selects the no radio button
    And the user clicks the continue button
    When the user selects the no radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Do you want to add any of your client’s donations to the last tax year?" page
    And I take screenshots of the English, AddToLastTaxYearPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Do you want to add any of your client’s donations to the last tax year?" page
    And I take screenshots of the English, AddToLastTaxYearPageNoChoice

    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "How much of your client’s donation do you want to add to the last tax year?" page
    And I take screenshots of the English, AddToLastTaxYearAmountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: How much of your client’s donation do you want to add to the last tax year?" page
    And I take screenshots of the English, AddToLastTaxYearAmountPageNoChoice
#    Entering invalid data
    When the user selects the Amount to add to last tax year field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much of your client’s donation do you want to add to the last tax year?" page
    And I take screenshots of the English, AddToLastTaxYearAmountPageInvalidData
#    Entering an amount too large
    When the user selects the Amount to add to last tax year field and enters a value of 999999999999
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much of your client’s donation do you want to add to the last tax year?" page
    And I take screenshots of the English, AddToLastTaxYearAmountPageTooLarge
#    Entering an amount larger than the total donation
    When the user selects the Amount to add to last tax year field and enters a value of 101
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much of your client’s donation do you want to add to the last tax year?" page
    And I take screenshots of the English, AddToLastTaxYearAmountPageGreater

    When the user selects the Amount to add to last tax year field and enters a value of 10
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Do you want to add any donations made after 5 April 2022 to this tax year?" page
    And I take screenshots of the English, AddToThisTaxYearPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Do you want to add any donations made after 5 April 2022 to this tax year?" page
    And I take screenshots of the English, AddToThisTaxYearPageNoChoice

    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "How much of the donations your client made after 5 April 2022 do you want to add to this tax year?" page
    And I take screenshots of the English, AddToThisTaxYearAmountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: How much of the donations your client made after 5 April 2022 do you want to add to this tax year?" page
    And I take screenshots of the English, AddToThisTaxYearAmountPageNoChoice
#    Entering invalid data
    When the user selects the Amount to add to this tax year field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much of the donations your client made after 5 April 2022 do you want to add to this tax year?" page
    And I take screenshots of the English, AddToThisTaxYearAmountPageInvalidData
#    Entering an amount too large
    When the user selects the Amount to add to this tax year field and enters a value of 999999999999
    And the user clicks the continue button
    Then the user should be redirected to the "Error: How much of the donations your client made after 5 April 2022 do you want to add to this tax year?" page
    And I take screenshots of the English, AddToThisTaxYearAmountPageTooLarge

    When the user selects the Amount to add to this tax year field and enters a value of 10
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Did your client donate qualifying shares, securities, land or property to charity?" page
    And the user clicks on the progressive disclosure link
    And I take screenshots of the English, donateSSLPPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client donate qualifying shares, securities, land or property to charity?" page
    And I take screenshots of the English, donateSSLPPageNoChoice

    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Did your client donate qualifying shares or securities to charity?" page
    And I take screenshots of the English, donateSharesSecuritiesPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client donate qualifying shares or securities to charity?" page
    And I take screenshots of the English, donateSharesSecuritiesPageNoChoice

    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "What is the total value of qualifying shares or securities donated to charity?" page
    And I take screenshots of the English, donateSharesSecuritiesAmountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: What is the total value of qualifying shares or securities donated to charity?" page
    And I take screenshots of the English, donateSharesSecuritiesAmountPageNoChoice
#    Entering invalid data
    When the user selects the Total value of qualifying shares or securities field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: What is the total value of qualifying shares or securities donated to charity?" page
    And I take screenshots of the English, donateSharesSecuritiesAmountPageInvalidData
#    Entering an amount too large
    When the user selects the Total value of qualifying shares or securities field and enters a value of 999999999999
    And the user clicks the continue button
    Then the user should be redirected to the "Error: What is the total value of qualifying shares or securities donated to charity?" page
    And I take screenshots of the English, donateSharesSecuritiesAmountPageTooLarge

    When the user selects the Total value of qualifying shares or securities field and enters a value of 10
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Did your client donate land or property to charity?" page
    And I take screenshots of the English, donateLandPropertyPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client donate land or property to charity?" page
    And I take screenshots of the English, donateLandPropertyPageNoChoice

    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "What is the value of land or property donated to charity?" page
    And I take screenshots of the English, donateLandPropertyAmountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: What is the value of land or property donated to charity?" page
    And I take screenshots of the English, donateLandPropertyAmountPageNoChoice
#    Entering invalid data
    When the user selects the Value of land or property field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: What is the value of land or property donated to charity?" page
    And I take screenshots of the English, donateLandPropertyAmountPageInvalidData
#    Entering an amount too large
    When the user selects the Value of land or property field and enters a value of 999999999999
    And the user clicks the continue button
    Then the user should be redirected to the "Error: What is the value of land or property donated to charity?" page
    And I take screenshots of the English, donateLandPropertyAmountPageTooLarge

    When the user selects the Value of land or property field and enters a value of 10
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Did your client donate qualifying shares, securities, land or property to overseas charities?" page
    And the user clicks on the progressive disclosure link
    And I take screenshots of the English, donateOverseasSSLPPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Did your client donate qualifying shares, securities, land or property to overseas charities?" page
    And I take screenshots of the English, donateOverseasSSLPPageNoChoice

    When the user selects the yes radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
    And I take screenshots of the English, donateOverseasSSLPAmountPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
    And I take screenshots of the English, donateOverseasSSLPAmountPageNoChoice
#    Entering invalid data
    When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of abc
    And the user clicks the continue button
    Then the user should be redirected to the "Error: What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
    And I take screenshots of the English, donateOverseasSSLPAmountPageInvalidData
#    Entering an amount too large
    When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 999999999999
    And the user clicks the continue button
    Then the user should be redirected to the "Error: What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
    And I take screenshots of the English, donateOverseasSSLPAmountPageTooLarge
#    Entering an amount larger than the total donation
    When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 21
    And the user clicks the continue button
    Then the user should be redirected to the "Error: What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
    And I take screenshots of the English, donateOverseasSSLPAmountPageGreater

    When the user selects the Value of qualifying shares, securities, land or property donated to overseas charities field and enters a value of 10
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Name of overseas charity your client donated shares, securities, land or property to" page
    And I take screenshots of the English, OverseasSSLPNamePage
#    Hitting continue without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Name of overseas charity your client donated shares, securities, land or property to" page
    And I take screenshots of the English, OverseasSSLPNamePageNoChoice
#    Entering invalid data
    When the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of $$$
    And the user clicks the continue button
    Then the user should be redirected to the "Error: Name of overseas charity your client donated shares, securities, land or property to" page
    And I take screenshots of the English, OverseasSSLPNamePageInvalidData
#    Entering a name over the max character limit
    When the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of exceedingly long account nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
    And the user clicks the continue button
    Then the user should be redirected to the "Error: Name of overseas charity your client donated shares, securities, land or property to" page
    And I take screenshots of the English, OverseasSSLPNamePageMaxLimit

    When the user selects the Name of overseas charity your client donated shares, securities, land or property to field and enters a value of Bank of money
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Overseas charity your client donated shares, securities, land or property to" page
    And I take screenshots of the English, OverseasSSLPSummaryPage
#    Hitting the page without choosing an option
    When the user clicks the continue button
    Then the user should be redirected to the "Error: Overseas charity your client donated shares, securities, land or property to" page
    And I take screenshots of the English, OverseasSSLPSummaryPageNoChoice

    When the user selects the no radio button
    And the user clicks the continue button

#    First time you hit the page
    Then the user should be redirected to the "Check your client’s donations to charity" page
    And I take screenshots of the English, GiftAidCYAPage

#    Changing the page
    When the user clicks on the change link in position 2
    Then the user should be redirected to the "How much did your client donate to charity by using Gift Aid?" page
    And I take screenshots of the English, DonateToCharityAmountPageChange

    And the user clicks the continue button

#    Changing the page
    When the user clicks on the change link in position 3
    Then the user should be redirected to the "Did your client make one-off donations?" page
    And I take screenshots of the English, OneOffDonationsPageChange

    And the user clicks the continue button
    Then the user should be redirected to the "How much did your client donate to charity as one-off payments?" page
    And I take screenshots of the English, OneOffDonationsAmountPageChange

    And the user clicks the continue button

#    Changing the page
    When the user clicks on the change link in position 6
    Then the user should be redirected to the "How much did your client donate to overseas charities by using Gift Aid?" page
    And I take screenshots of the English, OverseasGiftAidDonatedAmountPageChange

    And the user clicks the continue button

#    Changing the page
    When the user clicks on the change link in position 8
    Then the user should be redirected to the "Do you want to add any of your client’s donations to the last tax year?" page
    And I take screenshots of the English, AddToLastTaxYearPageChange

    And the user clicks the continue button
    Then the user should be redirected to the "How much of your client’s donation do you want to add to the last tax year?" page
    And I take screenshots of the English, AddToLastTaxYearAmountPageChange

    And the user clicks the continue button

#    Changing the page
    When the user clicks on the change link in position 11
    Then the user should be redirected to the "How much of the donations your client made after 5 April 2022 do you want to add to this tax year?" page
    And I take screenshots of the English, AddToThisTaxYearAmountPageChange

    And the user clicks the continue button

#    Changing the page
    When the user clicks on the change link in position 14
    Then the user should be redirected to the "What is the total value of qualifying shares or securities donated to charity?" page
    And I take screenshots of the English, donateSharesSecuritiesAmountPageChange

    And the user clicks the continue button

#    Changing the page
    When the user clicks on the change link in position 16
    Then the user should be redirected to the "What is the value of land or property donated to charity?" page
    And I take screenshots of the English, donateLandPropertyAmountPageChange

    And the user clicks the continue button

#    Changing the page
    When the user clicks on the change link in position 18
    Then the user should be redirected to the "What is the value of qualifying shares, securities, land or property donated to overseas charities?" page
    And I take screenshots of the English, donateOverseasSSLPAmountPageChange

  Scenario: Checking the client authorisation link for agents
    When the user logs into the service with the following details
      |Redirect url       |/test-only/2022/additional-parameters?ClientNino=AA123456A&ClientMTDID=1234567890   |
      |Credential Strength|weak                                                                                |
      |Confidence Level   |200                                                                                 |
      |Affinity Group     |Agent                                                                               |
      |Enrolment Key 1    |HMRC-AS-AGENT                                                                       |
      |Identifier Name 1  |AgentReferenceNumber                                                                |
      |Identifier Value 1 |XARN1234567                                                                         |
    Then the user should be redirected to the "There’s a problem" page
    And the user should see the correct Authorise you as an agent url
    And I take screenshots of the English, UnauthorisedAgent
