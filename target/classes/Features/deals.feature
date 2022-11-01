Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters username and password
| dhaval.s.patel30@gmail.com | Canada@2020 |
Then user clicks on login button
Then user is on home page
Then user move to new deal page
Then user enters deal details
| test deal | 1000 | 50 | 100 |
Then close the browser