Feature: Validate SwagLab Login Functionality

  Scenario: Login to SwagLab with Valid Credentials

    Given the browser is opened, POM
    And the user is on the login page, POM
    When the user provides a valid username and password, POM
    And clicks the login button, POM
    Then the user should be redirected to the product page. POM