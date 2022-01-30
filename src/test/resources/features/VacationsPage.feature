Feature: Vacations page functionality

  Scenario: Vacations page is under construction
    Given user is in home page
    When user clicks on vacations link
    Then under construction page is displayed

  Scenario: Vacations page to home page navigation
    Given user is in home page
    When user clicks on vacations link
    And user clicks on back to home image
    Then home page is displayed


