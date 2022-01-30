Feature: Destinations page functionality

  Scenario: Destinations page is under construction
    Given user is in home page
    When user clicks on destinations link
    Then under construction page is displayed

  Scenario: Destinations page to home page navigation
    Given user is in home page
    When user clicks on destinations link
    And user clicks on back to home image
    Then home page is displayed


