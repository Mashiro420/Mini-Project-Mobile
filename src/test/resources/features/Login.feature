Feature: Login
  As an User
  I want to success login
  So that I can see my home page

  Scenario Outline: Login scenario
    Given I click a login button
    When I input "<email>" email
    And I input "<password>" password
    And I click again login button
    Then I get the "<result>"
    And I click login button again for next test case
    Examples:
      |email|password|result|
      |test|test|home page|
      |tast|test|Email atau password tidak valid.|
      |test|tist|Email atau password tidak valid.|
      |tust|tost|Email atau password tidak valid.|