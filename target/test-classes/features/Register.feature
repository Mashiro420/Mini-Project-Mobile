Feature: Register
  As a New User
  I want to success register
  So that I can success login

  Scenario Outline: Register Scenario
    Given I click login button
    And I click linked text register
    When I input "<fullname>" username
    And I input an "<email>" email
    And I input a "<password>" password
    And I click register button
    Then I get "<result>"
    Examples:
      |fullname|email|password|result|
      |test|new|test|home page|
      |    |test|test|fullname can not empty|
      |test|    |test|email can not empty|
      |test|test|    |password can not empty|
      |    |    |test|fullname can not empty|
      |test|    |    |email can not empty|
      |    |test|    |password can not empty|
      |    |    |    |email can not empty|