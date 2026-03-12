Feature: Login to Ndosi Mobile App As a registered user I want to log in to the Ndosi mobile application So that I can access my account

  Scenario Outline: Successful login with valid credentials
    Given the user is on the login screen
    When the user enters username "<username>"
    And the user enters password "<password>"
    And the user taps the login button
    Then the user should be logged into the mobile application

    Examples:
      | username          | password  |
      | Admin@gmail.com   | @12345678 |