Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given The user is telecom project homepage
    And The user travels to payment gateway project
   	And The user travels to generate card number
   	When The user copys the card details and checks card limit
   	Given The user navigates to cart webpage
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
