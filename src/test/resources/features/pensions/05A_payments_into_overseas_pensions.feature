@ZAP @pensions

Feature: Pensions Journeys - 05A Overseas Pensions - Payments into Overseas Pensions - Income Tax Submission
  Background:
    Given the user navigates to the auth login page
    And the existing data in service pensions is cleared for nino AA000001C

  Scenario: Individual user as a new submission - Payment into overseas pension (No customer Reference)
  When the user logs into the service with the following details
  | Redirect url        | /EOY/start  |
  | Credential Strength | strong      |
  | Confidence Level    | 250         |
  | Affinity Group      | Individual  |
  | Nino                | AA000001C   |
  | Enrolment Key 1     | HMRC-MTD-IT |
  | Identifier Name 1   | MTDITID     |
  | Identifier Value 1  | 1234567890  |
  Then the user should be redirected to the "Update and submit an Income Tax Return" page
  When the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the addSections link
  Then the user should be redirected to the "Add sections to your Income Tax Return" page
  When the user clicks the addPension tailoring option
  And the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the pensions link
  Then the user should be redirected to the "Pensions" page
  When the user clicks on the Overseas pensions link
  Then the user should be redirected to the "Overseas pensions" page
  When the user clicks on the Payment into overseas pensions link

  Then the user should be redirected to the "Payments into overseas pension schemes" page
  When the user selects the yes radio button
  When the user selects the amount in pounds field and enters a value of 100.20
  And the user clicks the continue button

  Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
  When the user selects the yes radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
  When the user selects the yes radio button
  And the user clicks the continue button
  Then the user should be redirected to the "Check payments into overseas pensions" page

  When the user clicks the save and continue button
  Then the user should be redirected to the "Have you finished this section?" page for pensions

  When the user selects the Yes, I’ve completed this section radio button
  And the user clicks the Continue button
  Then the user should be redirected to the "Overseas pensions" page

  Scenario: Payment into overseas pensions (InYear) - user has prior data
  When the user logs into the service with the following details
  | Redirect url        | /InYear/start |
  | Credential Strength | strong        |
  | Confidence Level    | 250           |
  | Affinity Group      | Individual    |
  | Nino                | AA000001C     |
  | Enrolment Key 1     | HMRC-MTD-IT   |
  | Identifier Name 1   | MTDITID       |
  | Identifier Value 1  | 1234567890    |
  Then the user should be redirected to the "Update and submit an Income Tax Return" page
  When the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the addSections link
  Then the user should be redirected to the "Add sections to your Income Tax Return" page
  When the user clicks the addPension tailoring option
  And the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the pensions link
  Then the user should be redirected to the "Pensions" page
  When the user clicks on the Overseas pensions link
  Then the user should be redirected to the "Overseas pensions" page

  When the user clicks on the Payment into overseas pensions link

  Then the user should be redirected to the "Check payments into overseas pensions" page

  When the user clicks the save and continue button
  Then the user should be redirected to the "Have you finished this section?" page for pensions

  When the user selects the Yes, I’ve completed this section radio button
  And the user clicks the Continue button
  Then the user should be redirected to the "Overseas pensions" page

  Scenario: Individual user as a new submission - Payment into overseas pension (Migrant member relief - add QOPS)
  When the user logs into the service with the following details
  | Redirect url        | /EOY/start  |
  | Credential Strength | strong      |
  | Confidence Level    | 250         |
  | Affinity Group      | Individual  |
  | Nino                | AA000001C   |
  | Enrolment Key 1     | HMRC-MTD-IT |
  | Identifier Name 1   | MTDITID     |
  | Identifier Value 1  | 1234567890  |
  Then the user should be redirected to the "Update and submit an Income Tax Return" page
  When the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the addSections link
  Then the user should be redirected to the "Add sections to your Income Tax Return" page
  When the user clicks the addPension tailoring option
  And the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the pensions link
  Then the user should be redirected to the "Pensions" page
  When the user clicks on the Overseas pensions link
  Then the user should be redirected to the "Overseas pensions" page
  When the user clicks on the Payment into overseas pensions link

  Then the user should be redirected to the "Payments into overseas pension schemes" page
  When the user selects the yes radio button
  When the user selects the amount in pounds field and enters a value of 100.20
  And the user clicks the continue button

  Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
  When the user selects the yes radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
  When the user selects the no radio button
  And the user clicks the continue button

  Then the user should be redirected to the "What’s your customer reference number?" page
  And the user selects the Customer reference number field and enters a value of PENSIONINCOME245
  And the user clicks the continue button

  Then the user should be redirected to the "Untaxed employer payments" page
  When the user selects the amount field and enters a value of 100.10
  And the user clicks the continue button

  Then the user should be redirected to the "What tax relief did you get on payments into overseas pensions?" page
  When the user selects the Migrant member relief radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Qualifying overseas pension scheme (QOPS) reference number (optional)" page
  When the user selects the QOPS Number field and enters a value of 123456
  And the user clicks the continue button

  Then the user should be redirected to the "Pension scheme details" page
  And the user clicks the continue button

  Then the user should be redirected to the "Schemes with untaxed employer payments" page
  And the user clicks the continue button

  Then the user should be redirected to the "Check payments into overseas pensions" page
  When the user clicks the save and continue button
  Then the user should be redirected to the "Have you finished this section?" page for pensions

  When the user selects the Yes, I’ve completed this section radio button
  And the user clicks the Continue button
  Then the user should be redirected to the "Overseas pensions" page

  Scenario: Individual user as a new submission - Payment into overseas pension (Migrant member relief - NO QOPS)
  When the user logs into the service with the following details
  | Redirect url        | /EOY/start  |
  | Credential Strength | strong      |
  | Confidence Level    | 250         |
  | Affinity Group      | Individual  |
  | Nino                | AA000001C   |
  | Enrolment Key 1     | HMRC-MTD-IT |
  | Identifier Name 1   | MTDITID     |
  | Identifier Value 1  | 1234567890  |
  Then the user should be redirected to the "Update and submit an Income Tax Return" page
  When the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the addSections link
  Then the user should be redirected to the "Add sections to your Income Tax Return" page
  When the user clicks the addPension tailoring option
  And the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the pensions link
  Then the user should be redirected to the "Pensions" page
  When the user clicks on the Overseas pensions link
  Then the user should be redirected to the "Overseas pensions" page
  When the user clicks on the Payment into overseas pensions link

  Then the user should be redirected to the "Payments into overseas pension schemes" page
  When the user selects the yes radio button
  When the user selects the amount in pounds field and enters a value of 100.20
  And the user clicks the continue button

  Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
  When the user selects the yes radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
  When the user selects the no radio button
  And the user clicks the continue button

  Then the user should be redirected to the "What’s your customer reference number?" page
  And the user selects the Customer reference number field and enters a value of PENSIONINCOME245
  And the user clicks the continue button

  Then the user should be redirected to the "Untaxed employer payments" page
  When the user selects the amount field and enters a value of 100.10
  And the user clicks the continue button

  Then the user should be redirected to the "What tax relief did you get on payments into overseas pensions?" page
  When the user selects the Migrant member relief radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Qualifying overseas pension scheme (QOPS) reference number (optional)" page
  And the user clicks the continue button
  Then the user should be redirected to the "Pension scheme details" page
  And the user clicks the continue button

  Then the user should be redirected to the "Schemes with untaxed employer payments" page
  And the user clicks the continue button

  Then the user should be redirected to the "Check payments into overseas pensions" page
  When the user clicks the save and continue button
  Then the user should be redirected to the "Have you finished this section?" page for pensions

  When the user selects the Yes, I’ve completed this section radio button
  And the user clicks the Continue button
  Then the user should be redirected to the "Overseas pensions" page

  Scenario: Individual user as a new submission - Payment into overseas pension (Double taxation relief)
  When the user logs into the service with the following details
  | Redirect url        | /EOY/start  |
  | Credential Strength | strong      |
  | Confidence Level    | 250         |
  | Affinity Group      | Individual  |
  | Nino                | AA000001C   |
  | Enrolment Key 1     | HMRC-MTD-IT |
  | Identifier Name 1   | MTDITID     |
  | Identifier Value 1  | 1234567890  |
  Then the user should be redirected to the "Update and submit an Income Tax Return" page
  When the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the addSections link
  Then the user should be redirected to the "Add sections to your Income Tax Return" page
  When the user clicks the addPension tailoring option
  And the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the pensions link
  Then the user should be redirected to the "Pensions" page
  When the user clicks on the Overseas pensions link
  Then the user should be redirected to the "Overseas pensions" page
  When the user clicks on the Payment into overseas pensions link

  Then the user should be redirected to the "Payments into overseas pension schemes" page
  When the user selects the yes radio button
  When the user selects the amount in pounds field and enters a value of 100.20
  And the user clicks the continue button

  Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
  When the user selects the yes radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
  When the user selects the no radio button
  And the user clicks the continue button

  Then the user should be redirected to the "What’s your customer reference number?" page
  And the user selects the Customer reference number field and enters a value of PENSIONINCOME245
  And the user clicks the continue button

  Then the user should be redirected to the "Untaxed employer payments" page
  When the user selects the amount field and enters a value of 100.10
  And the user clicks the continue button

  Then the user should be redirected to the "What tax relief did you get on payments into overseas pensions?" page
  When the user selects the Double taxation relief radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Double taxation agreement details" page
  When the user selects the Country field and enters a value of Ghana
  And the user clicks the Country List button
  When the user selects the amount in pounds field and enters a value of 100.20
  And the user clicks the continue button

  Then the user should be redirected to the "Pension scheme details" page
  And the user clicks the continue button

  Then the user should be redirected to the "Schemes with untaxed employer payments" page
  And the user clicks the continue button

  Then the user should be redirected to the "Check payments into overseas pensions" page
  When the user clicks the save and continue button
  Then the user should be redirected to the "Have you finished this section?" page for pensions

  When the user selects the Yes, I’ve completed this section radio button
  And the user clicks the Continue button
  Then the user should be redirected to the "Overseas pensions" page

  Scenario: Individual user as a new submission - Payment into overseas pension (Transitional corresponding relief)
  When the user logs into the service with the following details
  | Redirect url        | /EOY/start  |
  | Credential Strength | strong      |
  | Confidence Level    | 250         |
  | Affinity Group      | Individual  |
  | Nino                | AA000001C   |
  | Enrolment Key 1     | HMRC-MTD-IT |
  | Identifier Name 1   | MTDITID     |
  | Identifier Value 1  | 1234567890  |
  Then the user should be redirected to the "Update and submit an Income Tax Return" page
  When the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the addSections link
  Then the user should be redirected to the "Add sections to your Income Tax Return" page
  When the user clicks the addPension tailoring option
  And the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the pensions link
  Then the user should be redirected to the "Pensions" page
  When the user clicks on the Overseas pensions link
  Then the user should be redirected to the "Overseas pensions" page
  When the user clicks on the Payment into overseas pensions link

  Then the user should be redirected to the "Payments into overseas pension schemes" page
  When the user selects the yes radio button
  When the user selects the amount in pounds field and enters a value of 100.20
  And the user clicks the continue button

  Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
  When the user selects the yes radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
  When the user selects the no radio button
  And the user clicks the continue button

  Then the user should be redirected to the "What’s your customer reference number?" page
  And the user selects the Customer reference number field and enters a value of PENSIONINCOME245
  And the user clicks the continue button

  Then the user should be redirected to the "Untaxed employer payments" page
  When the user selects the amount field and enters a value of 100.10
  And the user clicks the continue button

  Then the user should be redirected to the "What tax relief did you get on payments into overseas pensions?" page
  When the user selects the Transitional corresponding relief radio button
  And the user clicks the continue button

  Then the user should be redirected to the "SF74 reference" page
  When the user selects the SF74 reference field and enters a value of 123456
  And the user clicks the continue button

  Then the user should be redirected to the "Pension scheme details" page
  And the user clicks the continue button

  Then the user should be redirected to the "Schemes with untaxed employer payments" page
  And the user clicks the continue button

  Then the user should be redirected to the "Check payments into overseas pensions" page
  When the user clicks the save and continue button
  Then the user should be redirected to the "Have you finished this section?" page for pensions

  When the user selects the Yes, I’ve completed this section radio button
  And the user clicks the Continue button
  Then the user should be redirected to the "Overseas pensions" page

  Scenario: Individual user as a new submission - Payment into overseas pension (None of these)
  When the user logs into the service with the following details
  | Redirect url        | /EOY/start  |
  | Credential Strength | strong      |
  | Confidence Level    | 250         |
  | Affinity Group      | Individual  |
  | Nino                | AA000001C   |
  | Enrolment Key 1     | HMRC-MTD-IT |
  | Identifier Name 1   | MTDITID     |
  | Identifier Value 1  | 1234567890  |
  Then the user should be redirected to the "Update and submit an Income Tax Return" page
  When the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the addSections link
  Then the user should be redirected to the "Add sections to your Income Tax Return" page
  When the user clicks the addPension tailoring option
  And the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the pensions link
  Then the user should be redirected to the "Pensions" page
  When the user clicks on the Overseas pensions link
  Then the user should be redirected to the "Overseas pensions" page
  When the user clicks on the Payment into overseas pensions link

  Then the user should be redirected to the "Payments into overseas pension schemes" page
  When the user selects the yes radio button
  When the user selects the amount in pounds field and enters a value of 100.20
  And the user clicks the continue button

  Then the user should be redirected to the "Did your employers pay into your overseas pension schemes?" page
  When the user selects the yes radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Did you pay tax on the amount your employer paid?" page
  When the user selects the no radio button
  And the user clicks the continue button

  Then the user should be redirected to the "What’s your customer reference number?" page
  And the user selects the Customer reference number field and enters a value of PENSIONINCOME245
  And the user clicks the continue button

  Then the user should be redirected to the "Untaxed employer payments" page
  When the user selects the amount field and enters a value of 100.10
  And the user clicks the continue button

  Then the user should be redirected to the "What tax relief did you get on payments into overseas pensions?" page
  When the user selects the None of these radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Pension scheme details" page
  And the user clicks the continue button

  Then the user should be redirected to the "Schemes with untaxed employer payments" page
  And the user clicks the continue button

  Then the user should be redirected to the "Check payments into overseas pensions" page
  When the user clicks the save and continue button
  Then the user should be redirected to the "Have you finished this section?" page for pensions

  When the user selects the Yes, I’ve completed this section radio button
  And the user clicks the Continue button
  Then the user should be redirected to the "Overseas pensions" page

  Scenario: Payment into overseas pensions (InYear) - user selects NO on first question
  When the user logs into the service with the following details
  | Redirect url        | /InYear/start |
  | Credential Strength | strong        |
  | Confidence Level    | 250           |
  | Affinity Group      | Individual    |
  | Nino                | AA000001C     |
  | Enrolment Key 1     | HMRC-MTD-IT   |
  | Identifier Name 1   | MTDITID       |
  | Identifier Value 1  | 1234567890    |
  Then the user should be redirected to the "Update and submit an Income Tax Return" page
  When the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the addSections link
  Then the user should be redirected to the "Add sections to your Income Tax Return" page
  When the user clicks the addPension tailoring option
  And the user clicks the continue button
  Then the user should be redirected to the "Your Income Tax Return" page
  When the user clicks on the pensions link
  Then the user should be redirected to the "Pensions" page
  When the user clicks on the Overseas pensions link
  Then the user should be redirected to the "Overseas pensions" page

  When the user clicks on the Payment into overseas pensions link

  Then the user should be redirected to the "Payments into overseas pension schemes" page
  When the user selects the no radio button
  And the user clicks the continue button

  Then the user should be redirected to the "Check payments into overseas pensions" page

  When the user clicks the save and continue button
  Then the user should be redirected to the "Have you finished this section?" page for pensions

  When the user selects the Yes, I’ve completed this section radio button
  And the user clicks the Continue button
  Then the user should be redirected to the "Overseas pensions" page
