Feature: Feature to demo tags

  @smoke
  Scenario: Sample 1
    Given I am on the homepage
    When I perform an action
    Then I should see the result

  @regression
  Scenario: Sample 2
    Given I am on the homepage
    When I perform an action
    Then I should see the result

  @smoke @regression
  Scenario: Sample 3
    Given I am on the homepage
    When I perform an action
    Then I should see the result
