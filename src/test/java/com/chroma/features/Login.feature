Feature: Automating login page

@Valeriia @Regression @VNGRS-1
Scenario: Testing login page
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username and password
Then user is navigated to the dashboard page and sees text "Chroma Tech Academy"

@Mari @Regression @VNGRS-2
Scenario: Invalid Credentials login
Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
When user logs with valid username and password
Then message "Invalid Username or Password" displays
