Feature: Login application feature

Scenario Outline: Application login with valid credentials

Given Login to "https://synchroshaktiacademy.com/" site
When Click on login button and enter valid <username> and <password> and click on login button
Then Validate if login successful
And Close all browsers

Examples:
|username				|password		|
|poornimacs11@gmail.com |Csp11@synchro  |
|test@123.com			|21322423       |