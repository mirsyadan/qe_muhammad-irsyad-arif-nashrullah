Feature: Login
  As a user 
  I can login
  So that I can use this app

  Scenario: As an User, I can login with valid credentials
    Given I am on the login page
    When I input email field with valid credentials
    Then I input password field with valid credentials
    Then I click login button
    Then I am on the homepage

  Scenario: As an User, I can't Login with all fields is empty
    Given I am on the login page
    When I click login button
    Then I should see an error message indicate enter valid email

  Scenario: As an User, I can't Login with invalid email and password
    Given I am on the login page
    When I input email field with invalid data
    Then I input password field with invalid data
    Then I click login button
    Then I should see an error message indicate wrong email or password

 