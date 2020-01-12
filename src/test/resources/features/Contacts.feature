Feature: Contacts
  As a user I want to use all functionality under Contacts module

  @search_names
  Scenario: user should be able to search names
    Given user is on the log in page
    Then user logs in as inventory manager
    Then user navigates to Contacts module
    Then user sends "Online11Batch12" to search box
    And user verifies that contact "CybrCo, Online11" is displayed


