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
Feature: Test Goverment Functionality

  Scenario: Check Karanatak-One web page is successful
  Given the browser is open
  When the user launches the Karnataka-One web application
  And the user click on delete cookies
  And the user clicks on the English tab
  And the user clicks on the Kannada tab
 And the user clicks on the bengaluru tab
 # Then the drop-down menu should appear, displaying all relevant contents
  #And print all the contents of the drop-down menu
  When the user clicks on any item in the drop-down menu (e.g., Bagalkot)
  And the user clicks on the Sign-In tab
  And the user clicks on the About Us tab
  #Then the drop-down menu should appear, displaying all relevant contents
  #And print all the contents of the drop-down menu
  When the user clicks on any item in the drop-down menu (e.g.,About Karnataka One)
  And the user clicks on the Online Services tab
  #Then the drop-down menu should appear, displaying all relevant contents
 # Then the user click on online service tab
  #When the user clicks on any item in the drop-down menu (e.g., Payment of Property Tax)
  #And the user clicks on the Contact Us tab
  #Then the user should be navigated to the Guide Me Forward page