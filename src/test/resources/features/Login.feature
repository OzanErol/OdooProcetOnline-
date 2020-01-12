Feature:Login
  As user, I want to be able to login into Odoo
  under different roles with username and password

  @pos_manager
  Scenario: Login as pos manager
    Given user is on the log in page
    Then user logs in as pos manager
    And user verifies that "#Inbox - Odoo"  page title is displayed

  @inventory_manager
  Scenario: Login as inventory manager
    Given user is on the log in page
    Then user logs in as inventory manager
    And user verifies that "#Inbox - Odoo"  page title is displayed

