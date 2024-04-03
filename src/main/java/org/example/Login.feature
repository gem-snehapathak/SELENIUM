Feature: Login functionality

  @smoke
  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    Then I should be logged in successfully

  @regression
  Scenario: Login with invalid credentials
    Given I am on the login page
    When I enter invalid username and password
    Then I should see an error message