Feature: Test Login page
  Scenario Outline: verify login page
    Given user is on login page
    When user is enter valid "<userid>" and "<password>" details
    And user click on login button
    Then  user should navigate the product page
Examples:
  | userid        | password     |
  | standard_user | secret_sauce |