Feature: Test Google Search Functionality

  Scenario: Verify Google Search is Functioning Correctly
    Given the browser is launched,
    And the user is on the Google search page,
    When the user types text into the search bar,
    And presses Enter,
    Then the user should be redirected to the search results page.