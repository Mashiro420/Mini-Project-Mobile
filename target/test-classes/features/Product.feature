Feature: Product
  As an User
  I want to buy product
  So that I can see order page

  Scenario Outline: Product scenario
    Given I am on the home page
    When I click "<buy>"
    Then I validate the "<result>"
    Examples:
      |buy|result|
      |satu|1|
      |dua|2|
      |tiga|3|