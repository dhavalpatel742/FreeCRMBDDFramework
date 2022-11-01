@FunctionalTest
Feature: Free CRM application testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a deal test case

@RegressionTest
Scenario: Create a task
Given This is a task test case

@SmokeTest
Scenario: Create a case
Given This is a case test case

@SmokeTest @RegressionTest
Scenario: Verify left panel links
Given clicking on left panel

@SmokeTest
Scenario: search a deal
Given This is a search deal test case

@SmokeTest
Scenario: search a contact
Given This is a search contact test case

@SmokeTest @RegressionTest
Scenario: search a task
Given This is a search task test case

@SmokeTest @End2End
Scenario: search a call
Given This is a search call test case

@SmokeTest @End2End
Scenario: search a email
Given This is a search email test case

@SmokeTest @End2End
Scenario: search a docs
Given This is a search docs test case

@SmokeTest @End2End
Scenario: search a forms
Given This is a search forms test case

@End2End
Scenario: validate a report
Given This is a report test

@End2End
Scenario:  Application logout
Given This is a logout test 

Scenario:  browser closed
Given This is a close browser test 
