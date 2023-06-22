Feature: Cucumber Crash Course
Description: This feature file contains cucumber crash course scenarios
Background: 
Given a chroma tech student "Diego" is attending this class.

  @whatever @juarez345 @homepage
  Scenario: Test Login with valid credentials
    When the student asks questions
    Then the user says hi

  @whatever @juarez345 @homepage @Progression
  Scenario Outline: Test Login with valid credentials
    When the student asks a question
    Then the user says hi

    Examples: 
      | Username |
      | Testing  |

  @whatever @juarez345 @homepage
  Scenario: Test Login with valid credentials
    When the student goes to school
    Then the user says hi

  @whatever @juarez345 @homepage
  Scenario: Test Login with valid credentials
    When user clicks on button
    Then the user says hi
