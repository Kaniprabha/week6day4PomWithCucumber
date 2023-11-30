Feature: Leads Functionality
#Background:
#Given Launch the browser
#And Load the url

@CreateLead @functional @tc001
Scenario: CreateLead testcase with possitive Credentials

#Given Launch the browser
#And Load the url
Given Enter the username 
And Enter the password
When Click on the Login button
#Then Verify login is successfull
When Click on the crmsfa
When Click on the Leads tab
And Click on the Create Lead
Given Enter the company name
And Enter the first name 
And Enter the last name 
And Enter phnum
When Click on the submit button
Then Verify Create Lead is successfull
Given Get the lead id
#Then Close the browser




