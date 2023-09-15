Feature: PIM OrangeHRM

  Background: User adding, editing and finding employees
    Given I am in orange web page

    @AddANewEmployee
    Scenario Outline: Adding a new employee
      Given I set the username text field with "Admin"
      And I set the password text field with "admin123"
      When I click on the login button
      Then The DashBoard should be displayed
      Given I click on PIM
      And I click on AddButton
      Then I set the first name field with "<FirstName>"
      And I set the last name field with "<LastName>"
      And I set the middle name field with "<MiddleName>"
      And I set the employee id with "<ID>"
      And I click on Create Login Details
      When I set the username with "<Username>"
      And I set the password with "estudianteUPB2023"
      And I confirm the password with "estudianteUPB2023"
      Then I click on the save button
      And Personal details should be displayed
      And I click on drop down
      Then I click on logout button
      Examples:
        | FirstName | MiddleName | LastName | ID    | Username   |
        | Mateo     | V          | Mercado  | 71391 | kingWarrio |
#        | Megu      | G          | Villalto | 61461 | StarlightNinja  |
#        | Walter    | T          | Dog      | 62405 | ElectricVoyager |
#        | Mauricio  | H          | Guevara  | 78152 | LunarWarlock    |

    @AddEmergencyContact
    Scenario Outline: Adding an emergency contact to our profile created
      Given I set the username text field with "<Username>"
      And I set the password text field with "estudianteUPB2023"
      When I click on the login button
      Then The DashBoard should be displayed
      Then I click on My Info tab
      And I click on Emergency Contacts
      And I click on Add Emergency Contact
      Then I set the name of my emergency contact with "<ContactName>"
      And I set the relationship with my emergency contact with "<Relationship>"
      And I set the mobile of my contact with "<MobileNumber>"
      Then I click on save the contact
      And Emergency Contact should be displayed
      And I click on drop down
      Then I click on logout button
      Examples:
        | Username   | ContactName | Relationship | MobileNumber |
        | kingWarrio | Pepe        | Friend       | 7892625      |
#        | StarlightNinja | Camila      | Mother       | 911          |

    @AddPost
    Scenario Outline: Adding a post into Buzz Newsfeed from user profile
      Given I set the username text field with "<Username>"
      And I set the password text field with "estudianteUPB2023"
      When I click on the login button
      Then The DashBoard should be displayed
      Then I click on Buzz tab
      And I set the message field with "<Message>" to post
      Then I click on Post button
      Then The post should be displayed
      And I click on drop down
      Then I click on logout button
      Examples:
        | Username   | Message                                      |
        | kingWarrio | Buenas noches, esta es mi presentacion final |
#        | StarlightNinja | Dia de presentacion, nervios!                |

#  @ChangePasswordOfUser
#    Scenario Outline: Login and renew password from user created
#      Given I set the username text field with "<Username>"
#      And I set the password text field with "estudianteUPB2023"
#      And I click on drop down
#      Then I click on Change Password
#      And I type my current password
#      Then I set my new password in password field with "<NewPassword>"
#      And I confirm my "<NewPassword>"
#      Then I click on Save button
#      And I click on drop down
#      Then I click on logout button
#      Given I set the username text field with "<Username>"
#      And I set the password text field with "<NewPassword>"
#      And I click on drop down
#      Then I click on logout button
#      Examples:
#        | Username       | NewPassword                   |  |
#        | kingWarrior    | ContraseniaSegura129          |  |
#        | StarlightNinja | estaEsUnaMejorContrasenia2023 |  |