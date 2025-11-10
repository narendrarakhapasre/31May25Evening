Feature: Multiple Data test for coverfox HealthInsurance

Scenario Outline: TC01: validate coverfox Health Insurance plan for single person with multiple data
Given I am on home page
When I click on getstarted button
And I click on next button
And I provide age as "<age>" , click on next button
And I provide pincode as "<pincode>", mobNum as "<mobNum>" and click on continue button
Then matching health insurance plans should be displayed as "<results>"
Examples:
|age|pincode|mobNum|results|
|23|412208|8888888888|78|
|45|453678|7777777777|90|
|78|786543|9999999999|87|