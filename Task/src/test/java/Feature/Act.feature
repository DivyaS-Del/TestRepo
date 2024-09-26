#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regression

 Feature: Actitime test login functionality

  Scenario Outline: Check  Actitime login is successful with valid credentials
     Given browser is open
     When user enter the webpage current url
     And user click on Login
     And user enter email 
     And click on send code
  	 And user click on Tasks button
     And user click on add new button
     
     And user click on the new customer module
     And user close the customer module
     And user click on the add new button
     And user click on the new project module
     And user close the new Project module
     And user click on search bar and enter the value
     And user click on status button
     And user click on priority button 
     Then browser is closed