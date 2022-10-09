Feature: Login test to web tabel page


  @wip
  Scenario: positive login test
    Given user go to web table login page
    When user enter username and password
    Then URL should end with orders

  Scenario: negative login test
    Given user go to web table login page
    When user enter wrong username and password
    Then URL should not end with orders