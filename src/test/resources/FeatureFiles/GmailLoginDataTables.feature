Feature: Study Data Table in BDD

Scenario: Test Gmail Login
Given I am on login page
When I provide details and click on login button
      | userName | password | msg       |
      | test123  | 1234     | welcome   |
      | test789  | 8799     | thank you |
Then I should navigate to inbox
