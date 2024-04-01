Feature: Product
  As a user
  I want to top up my credit
  So that I credit will increase later

  Scenario: As a user I can top up credit using a valid telephone number
    Given I on the main home page
    When I select the credit service feature
    And I filled in a valid phone number
    And I chose the available credit nominal
    And I chooses the available payment method
    And I carried out and completed the payment process
    Then I completed the credit top up process successfully

  Scenario: As a user I cannot top up credit with an invalid telephone number
    Given I on the main home page
    When I select the credit service feature
    And I filled in the phone number with an invalid input
    Then I get an error message stating that the phone number is overloaded, the maximum is 13 digits