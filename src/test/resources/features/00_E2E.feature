@MVP @ZAP

Feature: End to End Income Tax Submission feature

  Scenario: Minimal flow - Individual User - Interest & Dividends
    Given an individual user navigates to the Income Tax Submission start page
    When I click the provide updates button
    Then I should be on the individual overview page

  Scenario: Minimal flow - Agent User - Interest & Dividends
    Given an agent navigates to the Income Tax Submission start page
    When I click the provide updates button
    Then I should be on the agent overview page
