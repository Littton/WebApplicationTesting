    Feature: NewTours Application Testing
     Scenario Outline: NewTours Application LogIn with Valid Credintials
      Given Open Firefox Browser and Navigate to Application
     When User Enters Valid "<username>" and "<password>"
     Then User Should be able to logIn Successfully and close the Application
       
 
 Examples: 
 | username | password |
 |tutorial  | tutorial |
  |shimu     | pqr789  |
  |Linton    | pqr789  |
  