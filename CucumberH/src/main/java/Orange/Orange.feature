
@Regression
Feature: Test OrangeHRM Functionality
Scenario: To validate valid login scenario
Given Browser is open
 When the user launches the application
    When User enter valid username
    And User enter valid password
    And User click on login button
    Then User should be able to login successfully
       When user is navigated to home page
And user click on admin module