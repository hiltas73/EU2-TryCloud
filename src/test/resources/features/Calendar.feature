@calendar
Feature: Calendar Functions

  Background:
    Given the user is in Login page
    And the user logs in with the  valid credentals
    And the user should see the title as "Files - Trycloud"
    And the user navigates to "Calendar" page


  Scenario: Add new calendar
    When the user click on the New Calendar
    And the user write "Yusuf Çelik" as a calendar name
    And the user click on the submit button
    Then the user should be able to see "Yusuf Çelik" at the end of the calendar list






  Scenario: Add new event




  Scenario: Try day/week/month views