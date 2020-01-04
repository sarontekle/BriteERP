@login
Feature: As a post manager, I should be able to see Vendor Bills page

  Scenario: Pos manager wants to log in
    Given  The pos manager is on the log in page
    When The pos manager enters the pos manager creditials
    Then The pos manager should be able to log in
    When the pos manager click on the purchase tab
    Then the pos manager should be able to navigate to purchase page
    When The pos manager clicks on the vendor bills tab on the left
    Then The pos manager should be able to naviagte to vendor bills page
