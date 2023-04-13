Feature: As a user, i want to login so i can access my profile

  Background: login page
    Given User is on the login page

  Scenario Template: Verify that User logins with valid credentials
    When User enters valid username "<username>"
    And User enters valid password "<password>"
    And User clicks login button
    Then User should land on Activity Stream page

    Examples: ID and Passwords.

      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |


  Scenario: "Incorrect login or password." should be displayed for
  invalid (valid username-invalid password and invalid username-valid password) credentials

    When user enters invalid username "asdasd"
    And user enters invalid password "UserUsers"
    And user click login button
    Then User should see Incorrect login or password massage displayed

  Scenario: "Please fill out this field" message should be
  displayed if the password or username is empty

    When user enters invalid username "asdasd"
    And user enters invalid password ""
    And user click login button
    Then User should see Please fill out this field massage displayed

  Scenario:User land on the ‘Get Password’ page after clicking on the "Forgot your password?" link
    When user click Forgot your password Button
    Then user see get Password Page

  Scenario: User can see "Remember Me" link exists and is clickable on the login page
    When user click remember me link
    Then user see Remember Me link

  Scenario: User should see the password in bullet signs by default
    When user enters invalid username "asdasd"
    And user enters invalid password "UserUsers"
    Then user see "•••••••••" image




  Scenario:  Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
    When user enters invalid username "asdasd"
    And user enters invalid password "UserUsers"
    And Press Enter
    Then User should see Incorrect login or password massage displayed

  Scenario Template: All users can see their own usernames in the profile menu, after successful login
    When User enters valid username "<username>"
    And User enters valid password "<password>"
    And User clicks login button
    And User click on your name
    And User click My Profile buttn
    Then User see "<ownName>"

    Examples: ID and Passwords.

      | username                      | password | ownName                       |
      | helpdesk1@cybertekschool.com  | UserUser | helpdesk1@cybertekschool.com  |
      | hr2@cybertekschool.com        | UserUser | hr2@cybertekschool.com        |
      | marketing1@cybertekschool.com | UserUser | marketing1@cybertekschool.com |


  Scenario: Verify that user is able to login
    Given user should be login

