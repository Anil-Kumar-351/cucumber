Feature: search multiple items

 Scenario: search for products
 When search products
 
 |iphone| 
 |headphones|
 |carpet| 
 
And verify the products
Then close application