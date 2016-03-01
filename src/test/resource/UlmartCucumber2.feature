Feature: Proof that customer can order smthng
  Scenario: My processor buying test
    Given I navigate to ulmart.ru site

    When I click on confirmcitybutton
    And I click on choose group "Комплектующие для ПК"
    And I click on choose subgroup "Процессоры"
    And I select random available model
    And I click on confirm order
    And I do login
    And I order delivery

    Then I get to page checkoutnew

  Scenario: My videocard buying test
    Given I navigate to ulmart.ru site

    When I click on confirmcitybutton
    And I click on choose group "Комплектующие для ПК"
    And I click on choose subgroup "Видеокарты"
    And I select random available model
    And I click on confirm order
    And I do login
    And I order delivery

    Then I get to page checkoutnew