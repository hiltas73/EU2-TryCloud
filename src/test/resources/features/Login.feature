@login
Feature:

  Scenario: login
    Given the user is in Login page
    When the user logs in with the  valid credentals
    Then the user should see the title as "Files - Trycloud"

