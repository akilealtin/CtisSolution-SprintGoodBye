@wip
Feature: As a user, I should be able to add link, insert video, mention, quote, add tag in message.

  Background:Login Page
    Given User is on the login Page
    Given user should be login

    Scenario: 1. User should be able to add mentions
      Given user click massage space
      When user click add mention button
      And User click first box
      Then User see selected email

    Scenario: 2. User should be able to attach a link to the specified text.
    Given  user click massage space
      When user click Link button
      And Write text massage
      And Write Link Massage
      And click Save Button
      Then see Text massage in MassageSpace


    Scenario:3. User should be able to insert YouTube and Vimeo videos.
      Given  user click massage space
      When user click insertVideo
      And write youtube or vimeo link
    And user click Save button
      Then user see the link in the mesage box


  Scenario: 5. User should be able to add tags to messages.
  Given user click massage space
    When user click add tagg button
    And user write mesage in to button
    And click add button
    Then Verify Button is displayed
    And User click X button
    Then Verify button is removed


