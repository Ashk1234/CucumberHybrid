@Functional
Feature: Verify the login functionality of Rediff mail
 @Regression
  Scenario: Verify user should login with valid username and pwd
    Given User should be able to lunch the application
    
    When Enter the Correct user name and password
   And click on Login button
    Then capture the title of application
  
   @Smoke 
    Scenario: Verify the create new account is clickable
    Given User should be able to lunch the application
    When Click on create new account
    Then capture the title of application
    

 