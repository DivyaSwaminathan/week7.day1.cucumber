Feature: CreateLead in Leaftaps Application


Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When click on login button
Then verify application home page is loaded 

Scenario Outline:Create Lead with different set of data
Given click link CRM_SFA
And click Leads tab
And click create leads tab
When Type companyname as <companyname>
And Type firstname as <firstname>
And Type email as <email>
And click create leads button
Then Verify view lead page is loaded 

Examples:
|companyname|firstname|email|
|VzIndia|Divya|abc2gmail.com|
|Infosys|Radha|testemail@gmail.com|


