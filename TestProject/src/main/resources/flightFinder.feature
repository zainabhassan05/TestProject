Feature: Find a flight

Background: user Logged in
Given User in Website
When User Logs in

Scenario: User Going Round Trip
When User select Round Trip
Then Round Trip selected

Scenario: user Going one way
When Users selects One Way
Then One way is selected
