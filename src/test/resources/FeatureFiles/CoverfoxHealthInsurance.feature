Feature: Coverfox Health Insurance Test
Scenario: TC01: validate coverfox health insurance for single person
Given I am on home page
When I click on getstarted button
And I click on next button
And I provide age as "34" , click on next button
And I provide pincode as "412208", mobNum as "8888888888" and click on continue button
Then matching health insurance plans should be displayed as "48"

Scenario: TC02: Validate CoverFox address details page error messages
Given I am on home page
When I click on getstarted button
And I click on next button
And I provide age as "34" , click on next button
And I click on continue button
Then Validate error messages 

 