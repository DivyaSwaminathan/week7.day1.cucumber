Feature: Login to the application


Scenario: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When click on login button
Then verify application home page is loaded 

Scenario: Negative Login
Given Type the username as 'Demosfa'
And Type the password as 'crmsfa'
When click on login button
But The error message should be displayed 