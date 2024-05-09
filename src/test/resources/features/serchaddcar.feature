Feature: Search Add Car

  Scenario: Search for available cars by specifying a date and add a car
    Given User is on the home page of ilcarro
    When User enters the date "2024-05-10" in the search field
    And User clicks the search button
    Then User should see a list of available cars for the specified date
    When User clicks on the first available car
    And User clicks on the "Let the car work" page
    And User fills out the car details
    And User clicks the "Add Car" button
    Then User should see a success message confirming the car has been added

