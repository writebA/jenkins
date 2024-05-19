Feature: Alerts
  I am user
  I want to handle alert
  To be able accept it

  Scenario: Alert Handling
    Given I go to "JavaScript Alerts" link on the Main page
    When I generate JS alert
    And I accept the Alert
    Then Success message displayed
    When I click to JS Confirm button
    And I accept the Alert
    Then I see success message
