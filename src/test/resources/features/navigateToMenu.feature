@navigate
Feature:

  Scenario: login
    Given the user is in Login page
    When the user logs in with the  valid credentials
    Then the user should see the title as "Files - Trycloud"
    And the user navigates to "Calendar" page
