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
  When the user click on the Week on the Calendar Name
    Then the user click any one column
    And the user write "meeting" as a Title of the Event and select text "caner" from dropdown
    Given the user write starts datetime "07/03/2020" "20:00 AM" ends "07/03/2020" "23:59 AM"
    And the user click on the create button



  Scenario: Try day/week/month views