Feature: Support page functionality

  Scenario: Support page is under construction
    Given user is in home page
    When user clicks on support link
    Then under construction page is displayed

  Scenario: Support page to home page navigation
    Given user is in home page
    When user clicks on support link
    And user clicks on back to home image
    Then home page is displayed


