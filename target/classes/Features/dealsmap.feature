Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters username and password
| username | password |
| dhaval.s.patel30@gmail.com | Canada@2020 |

Then user clicks on login button
Then user is on home page
Then user move to new deal page
Then user enters deal details
|    title   |amount|probability|commission|
| test deal1 | 1000 | 50 | 100 |
| test deal2 | 2000 | 60 | 200 |
| test deal3 | 3000 | 70 | 300 |  

Then close the browser