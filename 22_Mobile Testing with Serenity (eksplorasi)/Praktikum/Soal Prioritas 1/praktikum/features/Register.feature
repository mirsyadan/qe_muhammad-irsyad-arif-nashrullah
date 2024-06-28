Feature: Register
  As a user 
  I want to register
  So that I can login to the app

  Scenario: As a User, I can register with valid credentials
    Given I am on the login page
    When I see create account text
    And I click create account
    And I am on the register page
    And I input my name with valid credentials
    And I input my email with valid credentials
    And I input my password with valid credentials
    And I confirm my password with valid credentials
    And I click register button
    Then I see a pop-up message indicating register success  

  Scenario: As a User, I can't register with all fields empty
    Given I am on the login page
    When I see create account text
    And I click create account
    And I am on the register page
    And I click register button without filling any fields
    Then I see an error message indicating to enter full name first

 