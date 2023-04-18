

Feature: As a user I should be able to interact with employees on the posts

  Background:
    #@CS10-358
    Given User is on the login page
    Given user should be login2


  @CS10-359
  Scenario: User should be able to make a comment like or unfollow other employees posts

    And User should be able to click like button on the any employee
    And User should be able to click comment button and  make a comment
    And  User should be able to click unfollow button
    And User should be able to click like the button of own comment
    And User should be able to click reply button of own comment
    And User should be able to click more button and choose edit button
    And User should be able to edit her/his comment
    And User should be able to delete the comment
    And  user should see be ale to add and remove other's posts to favorites by clicking on the star icon