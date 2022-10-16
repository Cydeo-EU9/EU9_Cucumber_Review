Feature: Check table data

  @wip
  Scenario Outline: Check table data
    Given User is on web table page
    When Name is "<name>"
    Then The pizza type should be "<pizza type>"
    And Amount should be "<amount>"
    And State should be "<state>"
    And Card number should be "<card number>"

    Examples:
      | name           | pizza type | amount | state  | card number  |
      | Alexandra Gray | Thin Crust | 2      | US     | 321456789012 |
      | John Doe       | Pepperoni  | 3      | Canada | 980077987700 |
      | Ned Stark      | Italian    | 5      | Italy  | 777888777888 |
      | Samuel Jackson | Italian    | 3      | US     | 555743242342 |


