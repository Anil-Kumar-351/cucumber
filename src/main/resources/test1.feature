Feature: LoginTest
Description: Registered user Login with valid credentials
Scenario: Login with valid comabinations
Given opens login page in newtours app
When enter user name as mercury and password is mercury
And Click submit button
Then Verify login result
