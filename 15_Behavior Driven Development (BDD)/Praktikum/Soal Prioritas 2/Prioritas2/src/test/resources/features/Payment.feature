Feature: Payment
  As a user
  I want to get credit
  So I have to complete the payment process for purchasing credit

  Scenario: As a user I get credit when I have completed the payment process
    Given I in the main home page
    When I chose the credit top up service
    And I entered a valid phone number
    And I selected an available credit nominal
    And I selected an available payment method
    And I have made and completed the payment process
    Then I successfully completed the credit top up process

  Scenario: As a user I don't get credit if I don't complete the payment process
    Given I in the main home page
    When I chose the credit top up service
    And I entered a valid phone number
    And I selected an available credit nominal
    And I selected an available payment method
    And I didn't carry out and complete the payment process
    Then I failed to complete the credit top up process