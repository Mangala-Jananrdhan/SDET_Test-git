

Feature: Feature to test Login functionality

  Scenario Outline1: Check login is successful with valid credentials

    Given User
    When User enters <user name> and <password>
    And clicks on login button
    Then User is navigated to the home page

    Examples:
      |user name|password|
      |user1|password1|
      |user2|password2|