Feature: Vytrack App login with different roles

  @wip
  Scenario: login as driver
    Given user is on the login page
    When user enters driver credentials
    Then user should see driver navigation options



  @wip
  Scenario: login as sales manage or store manager
    Given user is on the login page
    When user enters "role" information
    Then user should see manager navigation options
