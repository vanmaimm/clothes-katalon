Feature: login

Scenario: Login with valid account

Given User is on login pgae
When User enters username
And User enters password
And User clicks on login button
Then User can be login successfully

