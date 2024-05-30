Feature: Update post data by ID
  As a admin
  I want to update post data by ID
  So that I can see post data has updated

  #positive
  Scenario: As a admin I can update post data by ID with valid endpoint and method
    Given I set with valid API endpoint and method
    When I send a request to update post data by ID
    Then I receive a status code 200 OK
    And I see post data has updated with valid

  #negative
  Scenario: As a admin I can't update post data by ID with valid endpoint and wrong method
    Given I set with valid method and wrong endpoint
    When I send request to update post data by ID with invalid endpoint
    Then I receive a status code 404 not found