
@login
Feature: Users should be able to login

  @driver
  Scenario: Login as a driver
    Given the user is on the login page
    When the user enters the driver credentials
    Then the user shoudl be able to login

    @sales_manager @VYT-123
    Scenario: Login as a sales manager
      Given the user is on the login page
      When the user enters the sales manager credentials
      Then the user shoudl be able to login

      @store_manager @smoke @wip
      Scenario: Login as a store manager
        Given the user is on the login page
        When the user enters the store manager credentials
        Then the user shoudl be able to login


