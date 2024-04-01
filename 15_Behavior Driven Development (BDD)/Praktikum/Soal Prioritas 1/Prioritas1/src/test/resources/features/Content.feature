Feature: Content
  As a user
  I want to post content
  So that I write and post content on my account

  Scenario: As a user I can post new content on my LinkedIn account with valid input
    Given I on LinkedIn main homepage
    When I see a column for creating a new post
    And I hit the feature column to create a new post
    And I filled in the content description in the column provided
    And I hit the post button
    Then I successfully posted and saw my latest content post

  Scenario: As a user I cannot post new content on my LinkedIn account with invalid input
    Given I on LinkedIn main homepage
    When I see a column for creating a new post
    And I hit the feature column to create a new post
    And I didn't fill in anything in the columns provided
    Then I can't post content because the post button doesn't work