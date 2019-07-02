Feature: signup
Scenario Outline: Test signup function with different inputs

Given user open signup page
When user enters fastname as "<firstname>"
And user enters lastname as "<lastname>"
And user enters DOB as "<dob>"
And user enters psd as "<psd>"
And user enters confirmpsd as "<cpsd>"
Then click signup button
And verify signup success message

Examples:
|firstname|lastname|dob|psd|cpsd|
|ANIL|ANIL|10-02-1999|QWERT|QWERT|
|ANIL|KUMAR|10-02-1992|QWERYT|QWERYT|