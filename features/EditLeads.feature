Feature: EditLead in Leaftaps Application


Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When click on login button
Then verify application home page is loaded 

Scenario Outline:Edit Lead with different set of data
Given click link CRM_SFA for Edit
And click Leads tab for Edit
And click Find leads tab
When Enter firstname as <firstname>
And click find leads button
And click firstresulting leadID from the results
And click Edit button
And change the companyname as <companyName>
And click update button 
Then Verify lead is edited with companyName as <companyName>

Examples:
|firstname|companyName|
|Divya|Airtel|
|Radha|Wipro|


