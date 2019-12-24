@login
Feature: Login

  Scenario: User should be able to login with valid credential
    Given user is already on login page
    When user enters "username" and "password" and clicks Sign in button
    Then user should be on Account Summary page

  Scenario: User should not be able to login with invalid credential
    Given user is already on login page
    When user enters "abc" and "def" and clicks Sign in button
    Then user should not be able to login
    And error message should be displayed

  @wip
  Scenario: User should not be able to login with blank credential
    Given user is already on login page
    When user enters "" and "" and clicks Sign in button
    Then user should not be able to login
    And error message should be displayed

