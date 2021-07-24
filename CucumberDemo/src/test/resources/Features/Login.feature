Feature: Test login functionality

  Scenario Outline: check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Mayank   |    12345 |
      | Anuj     |    12345 |
