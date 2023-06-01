@Regression
Feature: Sign in/Sign Up Features

  Background: 
    Given User is on retail website
    When User click on Sign in option
    Then User should be logged in into Account

  @SignInRetail @Regression
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'malal.foshanjee@tekschool.us' and password 'malal@123'
    And User click on login button

  @CreateAccountRetail @Regression
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                          | password  | confirmPassword |
      | Malalai | malal.Gfoshanjee12345@tekschool.us | Malal@123 | Malal@123       |
    And User click on SignUp button
