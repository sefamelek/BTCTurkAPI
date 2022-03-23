Feature: User Detail Feature


  Scenario: User Create Scenario
    Given Customer Id : '2'
    When get user by Id
    Then Check User Response Parameters
