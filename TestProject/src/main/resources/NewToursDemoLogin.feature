Feature: Login 

Background:
Given User is on New Tours website

Scenario: User is able to login to New Tours 
Given User is on already on website
When User enters username
And User enters password
And User clicks sign in
Then User is signed in 

Scenario Outline: User is unable to login
Given User is on already on website
When User enter Invalid username "<username>"
And User enter Invalid password "<password>"
And User clicks sign in
Then User fails to sign in

Examples:
	|   username   |   password   |
	|   zia        |   hassan     |
	|   hello      |   world      |
	|   eclipse    |   seleniumx  |
	|   #hello@$   |  world$#*    |
	
	
	
	