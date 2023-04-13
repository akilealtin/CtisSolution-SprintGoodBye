Feature:As a user, I should be able to assign tasks under the Quick Navigate Menu.

  @wip
  @CS10-339
  Scenario: 1. HR User should be able to create "High priority" tasks with the mandatory fields.
    Given User is on the Activity Stream page
    When user click on TASK
    And user click on HighPriority
    Then Verify High Priority tik is visible

    And user enters task name
    Then Verify task name is displayed

    And user enters the checklist items
    Then Verify checklist items are displayed

    And user click on Add more button
    And user click on Employees and departments Button
    And user selects three person
    Then Verify three person are displayed

    And user selects Deadline
    Then Verify Deadline is displayed

    And user click on SEND button
    Then Verify task has been created



 #Scenario: 2. HR User should be able to assign a task to more than one user (Test with adding 3 users max.)

 #Scenario: 3. Checklist should be able to be added while creating a task.

 #Scenario: 4. Deadline should be able to be added while creating a task.

  # Task for May
  # First do manuel testing
  # Second do automation testing
  # Third get the results
  # hr77@cybertekschool.com
  # helpdesk49@cybertekschool.com
  # marketing50@cybertekschool.com
  # Deadline = 05/23/2023 08:30 pm
