Feature: Deck page

  Background:
    Given the user is in Login page
    And the user logs in with the  valid credentials
    And the user navigates to "Deck" page
  ​
  @createBoard
  Scenario: Creating new board
    When the user click on the Create New Board
    And enter the Board name as "deneme"
    And click on the check icon
    Then deneme should be in the boards list
    And the acion page should show the statement " You have created a new board deneme"
  ​
  @deleteBoard
  Scenario: Deleting new board
    When the user click on delete tab in the action(...) in line with the deneme board
    Then deneme board should be out of list
    And the acion page should show the statement "You have deleted the board"
