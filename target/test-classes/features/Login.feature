@login
Feature: Login

  Scenario: Only authorized users should be able to login
    Given user is already on login page
    When user enters valid credentials and click Sign in button
    Then user should be on Account Summary page