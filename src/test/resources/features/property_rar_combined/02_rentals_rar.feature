@ZAP @property @rar @combined


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
    Then the user should be redirected to the "Update and submit an Income Tax Return" page
    When the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the addSections link
    Then the user should be redirected to the "Add sections to your Income Tax Return" page
    When the user clicks the addProperty tailoring option
    And the user clicks the continue button
    Then the user should be redirected to the "Your Income Tax Return" page
    When the user clicks on the Property link
    Then the user should be redirected to the "UK property" page
