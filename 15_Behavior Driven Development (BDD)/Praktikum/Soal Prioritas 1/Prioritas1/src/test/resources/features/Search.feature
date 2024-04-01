Feature: Search
  As a user
  I want to find my LinkedIn profile
  So that I can find my LinkedIn profile account correctly

  Scenario: As a user I can search my linkedin profile account with valid input
    Given I am on LinkedIn main home page
    When I see a search icon
    And I pressed the search icon
    And I entered my name in the search feature column
    And I pressed the enter key
    Then I see search results that display my LinkedIn profile account

  Scenario: As a user I cannot search my linkedin profile account with invalid input
    Given I am on LinkedIn main home page
    When I see a search icon
    And I pressed the search icon
    And I entered someone else's name in the search feature column
    And I pressed the enter key
    Then I saw search results that displayed other people's LinkedIn profile accounts