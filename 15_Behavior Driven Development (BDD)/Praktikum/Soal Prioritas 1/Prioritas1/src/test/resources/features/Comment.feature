Feature: Comment
  As a user
  I want to comment on a linkedin post
  So that I will write and post comments

  Scenario: As a user I want to comment on a LinkedIn post with valid input
    Given I in LinkedIn main homepage
    When I saw a content post on the homepage
    And I pressed the comment feature button
    And I filled in the comments
    And I press the post button
    Then I managed to post and see the comments that have been posted

  Scenario: As a user I cannot to comment on a LinkedIn post with invalid input
    Given I in LinkedIn main homepage
    When I pressed the comment feature button
    And I saw a content post on the homepage
    And I don't fill in comments
    Then I noticed the post button was not working so I couldn't post a comment