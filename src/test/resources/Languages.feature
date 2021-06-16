Feature: Check languages

  Scenario: Check that 44 languages and 'Українська' language exist in 'Language' dropdown in the top menu
    Given that I am on the main page of site
    When I click on Language dropdown in the top menu
    Then I will see 44 languages in dropdown list
    Then I will see 'Українська' in dropdown list