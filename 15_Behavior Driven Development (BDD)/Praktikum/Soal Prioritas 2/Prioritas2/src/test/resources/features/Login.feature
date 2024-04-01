Feature: Login
  As a user
  I want to login
  So that I will be able to access the dashboard page

  Scenario: As a user I can login with valid inputs
    Given I am on the login page
    When I fill in a valid registered email address or telephone number
    And I filled in the registered password validly
    And I pressed the login button
    Then I was directed to the main home page

  Scenario: As a user I cannot login with invalid inputs
    Given I am on the login page
    When I fill in an email address or telephone number that is not registered and invalid
    And I filled in an unregistered and invalid password
    And I pressed the login button
    Then I get an error message stating that the email address or phone number or password is incorrect