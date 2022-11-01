Feature: Free CRM Login Feature

#Without Examples Keyword

#Scenario: Free CRM Login Test Scenario

#Given user is already on Login Page
#When title of login page is Cogmento CRM
#Then user enters "dhaval.s.patel30@gmail.com" and "Canada@2020"
#Then user clicks on login button
#Then user is on home page


#With Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
				|         username         |  password |
				|dhaval.s.patel30@gmail.com|Canada@2020|
				|     hiren@gmail.com      |Canada@2021|