Feature: Get all post data
  As a admin
  I want to get all post data
  So that I can see all post data

  #positive
  Scenario: As a admin I can get all post data with valid endpoint and method
    Given I set valid API endpoint and method
    When I send a request to get all post data
    Then I receive the status code 200 OK
    And I get all post data with valid

  #negative
  Scenario: As a admin I can't get all post data with valid endpoint and wrong method
    Given I set valid API endpoint and wrong method
    When I send request to get all post data with invalid method
    Then I receive the status code 404 not found

  #negative
  Scenario: As a admin I can't get all post data with valid method and wrong endpoint
    Given I set valid method and wrong API endpoint
    When I send request to get all post data with invalid endpoint
    Then I receive in status code 404 not found