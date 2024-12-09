Feature: Validate SwagLab Login Functionality
  Scenario: Login to SwagLab with Valid Credentials
    Given the browser is opened,
    And the user is on the login page,
    When the user provides a valid username and password,
    And clicks the login button,
    Then the user should be redirected to the product page.