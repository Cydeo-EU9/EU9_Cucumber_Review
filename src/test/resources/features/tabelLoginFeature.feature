Feature: Login test to web tabel page


#  @wip
  Scenario: positive login test
    Given user go to web table login page
    When user enter username and password
    Then URL should end with orders

#  @wip
  Scenario: negative login test
    Given user go to web table login page
    When user enter wrong username and password
    Then URL should not end with orders


    @wip
  Scenario: login test with data table
    Given user go to web table login page
    When user enters below credentials
      | username | Test   |
      | password | Tester |
    Then URL should end with orders