Feature: Hotels page functionality

  Scenario: Hotels page is under construction
    Given user is in home page
    When user clicks on hotels link
    Then under construction page is displayed

  Scenario: Hotels page to home page navigation
    Given user is in home page
    When user clicks on hotels link
    And user clicks on back to home image
    Then home page is displayed


