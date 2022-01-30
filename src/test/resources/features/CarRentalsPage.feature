Feature: Car Rentals page functionality

  Scenario: Car Rentals page is under construction
    Given user is in home page
    When user clicks on car rentals link
    Then under construction page is displayed

  Scenario: Car Rentals page to home page navigation
    Given user is in home page
    When user clicks on car rentals link
    And user clicks on back to home image
    Then home page is displayed


