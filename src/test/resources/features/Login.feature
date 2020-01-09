@login
Feature: Users should be able to login
  Scenario: USer should be able to log in
    Given the user is on the login page
    When the user inputs valid credentials
    Then the user should be able to login
