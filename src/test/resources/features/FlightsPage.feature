@Smoke
Feature: Flight booking functionality

  Scenario: Book oneway flight
    Given user is in home page
    When user clicks on flights link
    And user fills all oneway booking details
    And user clicks on continue button
    Then flights results page is displayed

  Scenario: Book round trip flight
    Given user is in home page
    When user clicks on flights link
    And user fills all round trip booking details
    And user clicks on continue button
    Then flights results page is displayed