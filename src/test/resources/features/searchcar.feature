Feature: Search Car Page
   Scenario: Select city,select date,and view available cars
  Given User launches Chrome browser
  When User opens ilCarro HomePage
  And User clicks on Login link
  And User enters valid data
  And User clicks on Yalla button
  And User verifies Success Message is displayed
  And User select "Tel Aviv, Israel" from the city dropdown
  And User select  from the date picker
  Then User select on the "Search" button
  And User quites browser
