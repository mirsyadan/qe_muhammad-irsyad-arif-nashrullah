Feature: Delete post data
  As a admin
  I want to delete post data
  So that I can see post data has delete

  #positive
  Scenario: As a admin I can delete post data with valid endpoint and method
    Given I set valid endpoint and method
    When I send a request to delete post data
    Then I receive in status code 200 OK
    And I see post data has delete with valid

  #negative
  Scenario: As a admin I can't delete post data with valid method and wrong endpoint
    Given I set valid method and wrong endpoint
    When I send request to delete post data with invalid endpoint
    Then I received in status code 404 not found