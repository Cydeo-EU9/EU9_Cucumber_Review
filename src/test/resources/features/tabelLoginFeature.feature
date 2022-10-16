Feature: Login test to web tabel page

  Background:
    Given user go to web table login page


  @smoke
  Scenario: positive login test
    When user enter username and password
    Then URL should end with orders

#    @wip
  Scenario: positive login test with data
    When user enter "Tes" and "Tester"
    Then URL should end with orders

#  @wip
  Scenario: negative login test
    When user enter wrong username and password
    Then URL should not end with orders


#  @wip
  Scenario: login test with data table
    When user enters below credentials
      | username | Test   |
      | password | Tester |
    Then URL should end with orders