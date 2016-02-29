Feature: Proof that customer can order smthng
  Scenario: My first test
    Given I navigate to ulmart.ru site

    When I click on confirmcitybutton
    And I click on choose processors
    And I click on select random available model
    And I click on confirm order
    And I do login
    And I order delivery

    Then I get to page checkoutnew