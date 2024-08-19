Feature: Adactin hotel app

Background: 
          Given Launch the URL
   

@Login
Scenario Outline: Login
When Enter the "<username>" in the username field
And Enter the "<password>" in the password field
And Click on the login button
Then User should navigate to the Search hotels page
Examples:
|username|password|
|Arthi| 123|
|Sanjith| 456|
|Deva|892|

