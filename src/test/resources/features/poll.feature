@CS10-326
Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  Background: User should be logged in active stream page
    Given User is on the login page
    Given user should be login

  @CS10-333
  Scenario: User should be able to add users by selecting multiple contacts from Employees and Department's contact lists and add questions and multiple answers and provide multiple choice to attendees by selecting the Allow multiple choice checkbox and delete questions and multiple answers.
    When user clicks on the poll button
    And user type a title as "title"
    And user clicks on add more link
    And user clicks on Employees and departments link
    And user add more than one contacts
    Then verify the added contacts are displayed on the To box
    And user click on the close sign

    When user clicks on Question box
    And user adds question as "question"
    And user deletes the question
    And user clicks add question button
    And user adds question as "new question"
    And user clicks on the first Answer box and adds answer as "Select A"
    And user clicks on the second Answer  box and adds answer as "Select B"
    And user clicks on the third Answer box and adds answer as "Select C"
    And user deletes the third Answer
    And user clicks on Allow multiple choice checkbox
    And user clicks on send button
    And user clicks on checkboxes
    And user clicks on vote button
    Then verify the added answers are selected as multiple

    When user clicks on more button
    And user selects delete
    And user accepts the popup
    Then the post should be deleted and the message should be displayed

  @CS10-334
  Scenario: User should be able to create a poll with title.
    When user clicks on the poll button
    And user clicks on send button
    Then the warning message should be displayed about title

  @CS10-335
  Scenario: User should be able to create a poll with answers.
    When user clicks on the poll button
    And user type a title as "title_1"
    And user clicks on Question box
    And user adds question as "question1"
    And user clicks on send button
    Then the warning message of "question1" should be displayed about answers

  @CS10-336
  Scenario: User should be able to create a poll with question.
    When user clicks on the poll button
    And user type a title as "title_2"
    And user clicks on the first Answer box and adds answer as "Select A2"
    And user clicks on send button
    Then the warning message should be displayed about question

  @CS10-337
  Scenario: User should be able to create a poll with person.
    When user clicks on the poll button
    And user type a title as "title"
    And user deletes everybody in To box
    And user clicks on Question box
    And user adds question as "question"
    And user clicks on the first Answer box and adds answer as "Select A"
    And user clicks on send button
    Then the warning message should be displayed about at least one person