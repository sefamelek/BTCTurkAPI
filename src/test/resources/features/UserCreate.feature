Feature: User Create Feature


  Scenario Outline: User Create Scenario
    Given User Name '<name>', User Job '<job>'
    When Create User
    Then Check response
    Examples:
      | name    | job          |
      | Sefa    | Engineer     |
      | Sinan   | Engineer     |
      | John    | Doctor       |
      | Walter  | Designer     |
      | Kane    | Architect    |