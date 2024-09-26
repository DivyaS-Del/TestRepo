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

Feature: Rubix of your feature
  I want to use this template for my web-application feature file

  @test-1	
	  Scenario: Application launch on different platforms
	  Given the application is installed on the desired platform (IE, Edge, Chrome, Mac)
	  When the user launches the application
	  Then the application should open successfully on the respective platform
	  @test-2
    Scenario: Display of "Rubixe" logo on the UI page
	  Then the "Rubixe" logo should be displayed on the UI page
	  @test-3
	   Scenario: Animation on the UI page without lag
	  Given the application is launched
	  When the animation is displayed on the UI page
	  Then the animation should display smoothly without lag or delay