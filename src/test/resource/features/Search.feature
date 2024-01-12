Feature: User Search
Searching for the products in searchbox

Scenario: User search valid product in searchbox
Given User naviagte to homepage
When User enter valid product "Hp" in searchbox
And User click on search button
Then User should get the valid product in searchpage

Scenario: User search invalid product in searchbox
Given User naviagte to homepage
When User enter invalid product "Honda" in searchbox
And User click on search button
Then User should get the no product matched message in searchpage

Scenario: User search  product in searchbox
Given User naviagte to homepage
And User click on search button
Then User should get the no product matched message in searchpage