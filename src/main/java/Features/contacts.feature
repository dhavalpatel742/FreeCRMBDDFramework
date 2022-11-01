Feature: Free CRM Create Contacs

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user move to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
		| username | password | firstname | lastname | position |
		| dhaval.s.patel30@gmail.com | Canada@2020 | raj | kumar | manager |
		| dhaval.s.patel30@gmail.com | Canada@2020 | vishal | patel | technician |
		