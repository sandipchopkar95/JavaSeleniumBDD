Feature: Check login function

  @smoke
  Scenario:
    Given the user is on the login page
    When  user enters valid credentials
    And Click on login button
    Then User navigates to the product page

  Scenario:
    Given the user is on the login page
    When  user enters valid credentials
    And Click on login button
    Then User navigates to the product page
