Feature: Logout
  As an User
  I want to success login
  So that I can logut

  Scenario Outline: Logout scenario
    Given I click the login button
    When I input the "<email>" email
    And I input the "<password>" password
    And I click again the login button
    Then I get a result
    And I click logout button
    Examples:
      |email|password|
      |test|test|