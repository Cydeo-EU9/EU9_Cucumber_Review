Feature: Verify contents on Dashboard


#  @wip
  Scenario: Verify dashboard page contents
    Given user is loged in
    Then user should see below contents
      | Web Table App     |
      | View all orders   |
      | View all products |
      | Order             |
      | Logout            |
      | Select All        |
      | Deselect All      |