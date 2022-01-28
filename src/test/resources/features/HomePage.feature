Feature: Home page functionality

  Scenario: Login with blank username and blank password
    Given user is in home page
    When user enters username "" and password ""
    And user clicks on submit button
    Then login success page is displayed

  Scenario: Login with blank username
    Given user is in home page
    When user enters username "" and password "qq"
    And user clicks on submit button
    Then login error "Enter your userName and password correct" is displayed

  Scenario: Login with blank password
    Given user is in home page
    When user enters username "pp" and password ""
    And user clicks on submit button
    Then login error "Enter your userName and password correct" is displayed


  Scenario: Login with invalid credentials
    Given user is in home page
    When user enters username "qqq" and password "qq"
    And user clicks on submit button
    Then login error "Enter your userName and password correct" is displayed

  Scenario: Login with valid credentials
    Given user is in home page
    When user enters username "qwe" and password "asd"
    And user clicks on submit button
    Then login success page is displayed