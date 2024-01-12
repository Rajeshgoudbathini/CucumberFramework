Feature: User Register
User Should Register the new account successfully

Scenario: User create account with mandatory fields to register
Given User navigate to Register accountpage
When User enter the mandatory fields below
|firstname         |Bathini                |
|lastname          |Rajesh                 |
|telephone         |9876543210             |
|password          |1234567890             |
|conformpassword   |1234567890             |
And User click on privacy policy button
And User click on continue button
Then User shoud get registered and redirected to acccount success page

Scenario: User create account with all fields to register
Given User navigate to Register accountpage
When User enter the mandatory fields below
|firstname         |Bathini                 |
|lastname          |Rajesh                  |
|telephone         |9876543210              |
|password          |1234567890              |
|conformpassword   |1234567890              |
And User click on newsletter subscribe option
And User click on privacy policy button
And User click on continue button
Then User shoud get registered and redirected to acccount success page

Scenario: User create duplicate account with existing email
Given User navigate to Register accountpage
When User enter the mandatory fields with existing email below
|firstname         |Bathini                |
|lastname          |Rajesh                 | 
|email             |goud10@gmail.com       |
|telephone         |9876543210             |
|password          |1234567890             |
|conformpassword   |1234567890             |
And User click on privacy policy button
And User click on continue button
Then User shoud get email already exists warning  message

Scenario: User create  account with empty fields
Given User navigate to Register accountpage
When User enter the empty fields 
And User click on privacy policy button
And User click on continue button
Then User shoud get proper warning message for every mandatory fields