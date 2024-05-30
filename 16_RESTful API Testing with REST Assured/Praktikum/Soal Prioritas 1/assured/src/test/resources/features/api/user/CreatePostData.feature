Feature: Create post data
  As a admin
  I want to create post data
  So that I can see new post data

  #positive
  Scenario: As a admin I can create post data with valid endpoint and method
    Given I set endpoint and method with valid
    When I send a request to create post data
    Then I receive status code 201 created
    And I see new post data has create with valid

  #negative
  Scenario: As a admin I can't create post data with valid endpoint and wrong method
    Given I set wrong API endpoint and valid method
    When I send request to see new post data with invalid endpoint
    Then I received a status code 404 not found