#Feature: Login OrangeHRM
#
#  Background:User Login into the orange DashBoard
#    Given I am in orange web page
#
#    @loginWithValidCredentials
#    Scenario: Login into Orange Web DashBoard with valid credentials
#      Given I set the user name text field with "Admin"
#      And I set the password text field with "admin123"
#      When I click on the login button
#      Then The DashBoard should be displayed
#      And I click on drop down
#      Then I click on logout button
#
#    @loginWithInvalidCredentials
#    Scenario: Login into Orange Web DashBoard with invalid credentials
#      Given I set the user name text field with "Admin"
#      And I set the password text field with "invalidCredential"
#      When I click on the login button
#      Then An error message comes up
#
#    @ForgotPassword
#    Scenario: The user forgot his password and looks another way to login
#      When I click on forgot password
#      Given I set the username text field with "Admin"
#      And I click on the Reset Password
#      Then The operation succeed message should be displayed