Feature: Testbackground keyword
Background: display
Given   WELCOME
@accenture

Scenario: signin
Given user entered un and psd
And signin
@TCS
Scenario: search for product
When user enters for product sports shoes
@wipro
Scenario: add to cart
When product added to the cart
@accenture
Scenario: payments process
When user payed through netbanking
@TCS
Scenario: signout
Then signout  