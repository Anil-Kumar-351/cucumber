Feature: Test login

Scenario: Login with valid credentials
Given open newtours applcation
When user enters un "mercury" and psd as "mercury"
And submit login form
Then verifypass



Scenario: Login with invalid credentials
Given open newtours applcation
When user enters un "anilkumar" and psd as "kumar anil"
And submit login form
Then verify failure

