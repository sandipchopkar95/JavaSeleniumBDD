Feature: Check Home Page functionality

  Background: User is logged in
    Given User is on login page
    When User enters valid credentials
    And Click on login button
    Then User navigates to the product page

  Scenario: Check logout link
    When User clicks on three dot button
    Then Logout link is displayed

  Scenario: verify products are present
    Then product list are present