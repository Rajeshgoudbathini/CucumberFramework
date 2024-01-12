Feature: User Login
Registered user must login successfully

Scenario: User login with vaild creadentials
Given User navigate to application
When User enter valid email address "goud10@gmail.com" in emailtextfield
And User enter valid password "abcdef" in passwordtextfield
And User click on login button
Then User get logged in successfully verify

Scenario: User login with invaild creadentials
Given User navigate to application
When User enter invalid email address "goudd@gmail.com" in emailtextfield
And User enter invalid password "1234567" in passwordtextfield
And User click on login button
Then User Should get proper warning message with creadentials mismatch

Scenario: User login with vaild username and invalid password creadentials
Given User navigate to application
When User enter valid email address "goud10@gmail.com" in emailtextfield
And User enter valid password "1234567" in passwordtextfield
And User click on login button
Then User Should get proper warning message with creadentials mismatch

Scenario: User login with invaild username valid password creadentials
Given User navigate to application
When User enter valid email address "goud@gmail.com" in emailtextfield
And User enter valid password "abcdef" in passwordtextfield
And User click on login button
Then User Should get proper warning message with creadentials mismatch

Scenario: User login with no creadentials
Given User navigate to application
When User enter valid email address " " in emailtextfield
And User enter valid password " " in passwordtextfield
And User click on login button
Then User Should get proper warning message with creadentials mismatch