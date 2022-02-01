Feature: Register functionality

  Scenario: Register with all details
    Given user is in home page
    When user clicks on register link
    And user fills all registration details
    And user clicks on submit button
    Then registration success page is displayed