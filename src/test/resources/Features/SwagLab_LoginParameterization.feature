Feature: Validate SwagLab Login Functionality

  Scenario Outline: Login to SwagLab with Valid Credentials

    Given the browser is opened, parameter
    And the user is on the login page, parameter
    When the user provides a valid <username> and <password>, parameter
    And clicks the login button, parameter
    Then the user should be redirected to the product page. parameter

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
