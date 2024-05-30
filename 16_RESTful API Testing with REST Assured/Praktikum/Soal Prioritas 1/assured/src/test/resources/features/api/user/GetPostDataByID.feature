Feature: Get post data by ID
  As a admin
  I want to get post data by ID
  So that I can see post data by ID

  #positive
  Scenario: As a admin I can get post data by ID with valid endpoint and method
    Given I set API endpoint and method with valid
    When I send a request to get post data by ID
    Then I get status code 200 OK
    And I get post data by ID with valid

  #negative
  Scenario: As a admin I can't get post data by ID with valid method and wrong endpoint
    Given I set with valid method and wrong API endpoint
    When I send request to get post data by ID with invalid endpoint
    Then I get status code 404 not found