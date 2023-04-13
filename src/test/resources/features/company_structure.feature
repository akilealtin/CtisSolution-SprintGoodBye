@CS10-325
Feature: As a user, I should be able to use functions on Company Structure under
  Employee menu.

  @CS10-343
  Scenario: Helpdesk user types should be able to display company structure.
    Given user logins as helpdesk user
    When user clicks Employee option form left bar
    And verify that helpdesk user is in the Company Structure Page
    Then verify that helpdesk user cannot reach add department option
    And user logouts as helpdesk user

  @CS10-344
  Scenario: Marketing user types should be able to display company structure.
    Given user logins as marketing user
    When user clicks Employee option form left bar
    And verify that marketing user is in the Company Structure Page
    Then verify that marketing user cannot reach add department option
    And user logouts as marketing user

  @CS10-345
  Scenario: Hr user types should be able to display company structure.
    Given user logins as hr user
    When user clicks Employee option form left bar
    Then verify that hr user is in the Company Structure Page
    And verify Add Department option is visible

  @CS10-346
  Scenario: Hr user should be able to add a department from the company structure.
    When user clicks Add Department option from top right
    And user doesn't enter department name
    Then verify that Section name is not specified. message appear
    And user enters new department name

  @CS10-347
  Scenario: Hr user should be able to select a parent department from the department dropdown.
    When user clicks parent department dropdown menu
    And user chooses a parent department

  @CS10-348
  Scenario: Hr user should be able to select a supervisor from "recent", "company" and "search"
    When user clicks select from structure options
    And select supervisor from Recent then delete it
    And user clicks select from structure options
    And select supervisor from Company then delete it
    When user click Close button or X option from top right of pop-up
    When user clicks Add Department option from top right
    And user enters new department name
    When user clicks parent department dropdown menu
    And user chooses a parent department
    And user clicks select from structure options
    And select supervisor from Search
    And enters a supervisor to choose

  @CS10-349
  Scenario: Hr user should be able to edit departments, add child departments, and delete departments after adding the department.
    When click Edit department change name is Changed Name
    And click Add Child Department as Added Department
    And click Delete Department on Added Department

  @CS10-350
  Scenario: Hr user should be able to drag and drop the existing department under another department as a subdepartment.
    When user drag and drop one department to under another one
    Then verify that dragged department is the child department and dropped department is parent department