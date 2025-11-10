Feature: Coverfox Health Insurance Test

Background:
Given I am on home page
Given I login to application
@login
Scenario: TC01: validate coverfox health insurance for single person
When I click on getstarted button
And I click on next button
And I provide age as "34" , click on next button
And I provide pincode as "412208", mobNum as "8888888888" and click on continue button
Then matching health insurance plans should be displayed as "48"
@payment
Scenario: TC02: Validate CoverFox Car Insurance
When I click on CarInsurance button
And I provide valid RTO Number and click on view quotes button
And I provide valid details and click on view quotes button
Then I should get plan details

Scenario: TC03: Validate CoverFox Bike Insurance
When I click on BikeInsurance button
And I provide valid RTO Number and click on view quotes button
And I provide valid details and click on view quotes button
Then I should get plan details
