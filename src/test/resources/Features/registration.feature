Feature: As a user , I want to be able to register

  Scenario: Valid Registration
    Given I navigate to  website
    When I go to the registration
    And I fill in all the registration detail
    Then I should be able to register