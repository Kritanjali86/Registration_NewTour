Feature: User should be able to Register to the website
Scenario: User  should able to Register and login to the website with the new user name and password
Given User launch the URL 
Then User clicks on the Register button 
And User enter all the information in the Registration Page
And User clicks on the Submit button 
And User login with the username and password 
Then User should be able to login successfully.
