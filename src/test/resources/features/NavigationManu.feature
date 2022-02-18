@navigate
Feature: As a sales manager, I should be able to navigate to pages using the top menu

  Scenario: Verify that Vehicles page title is correct
    Given sales manager is on the main page
    When sales manager clicks on Fleet button
    And Clicks on Vehicles button
    Then sales manager should see the title as "Vehicles

    @db
Scenario: Navigating to Marketing -- Campaigns
  Given sales manager is on the main page
  When sales manager clicks on MArketing button
  And sales manager clicks on Campaigns butom
  Then The title should apear as Campaigns

  Scenario: Navigating Activities -- Calendar Events
    Given sales manager is on the main page
    When sales manager clicks on Activities button
    And sales manager clicks on Calendar Events button
    Then title should be Calendars

