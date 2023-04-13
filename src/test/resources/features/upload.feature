Feature:As a user, I should be able to upload files and pictures as messages
  Background: login page
    Given User is on the login page
    Given user should be login

  Scenario: User should be able to upload multiple files at the same time

    And user should click message button
    And user should click upload files button
    And user should choose files for uploading and attach the files to the message
    Then user should see uploaded files under the message

  Scenario: User should be able to upload files in different format

    And user should click message button
    And user should click upload files button
    And user should choose different types files for uploading and attach the files to the message
    Then user clicks the send button

  Scenario: User should be able to upload pictures

    And user should click message button
    And user should click upload files button
    And user should upload picture
    Then user should see uploaded pictures under the message

