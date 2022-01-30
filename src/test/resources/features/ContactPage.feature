Feature: Contact page functionality

  Scenario: Contact page is under construction
    Given user is in home page
    When user clicks on contact link
    Then under construction page is displayed

  Scenario: Contact page to home page navigation
    Given user is in home page
    When user clicks on contact link
    And user clicks on back to home image
    Then home page is displayed


