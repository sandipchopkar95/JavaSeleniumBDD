Feature: Validate SwagLab Login Functionality page factory

  Scenario: Login to SwagLab with Valid Credentials page factory

    Given the browser is opened, page factory
    And the user is on the login page, page factory
    When the user provides a valid username and password, page factory
    And clicks the login button, page factory
    Then the user should be redirected to the product page. page factory
    And close the browser