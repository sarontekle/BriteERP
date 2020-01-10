@vendor
Feature: As a post manager, I should be able to see Vendor Bills page
  Background: user should log in
    Given the user is on the login page
    When the user inputs valid credentials

  Scenario: pos manager navigates to Vendor's Bill page
    When the pos manager click on the purchase tab
    And The pos manager clicks on the vendor bills tab on the left
    Then verify that the page subtitle is "Vendor Bills"

  Scenario: pos manager is able to create vendor bill

