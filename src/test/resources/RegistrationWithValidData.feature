Feature: Registration with valid data

  Scenario: Create account with valid data
    Given I am on the main page of site
    When I click on Sign in button in the right top corner of the page I will move on LogPage
    And I click on No account button in the bottom of the page and I will move on the CreateNewAccountPage
    And I click on Mr window
    And I enter 'Peter' into First name field
    And I enter 'Johns' into Last name field
    And I enter '12345678910' into Password field
    And I enter 'P_Johns@i.ua' into Email field
    And I enter '01/01/1970' into Birthdate field
    And I click on Receive offers from our partners window
    And I click on Customer data privacy window
    And I click on Sign up for our newsletter window
    And I click Agree field
    And I click Save button and I will move on NewAccountPage
    Then I will see Peter Johns in the right top corner of the page
