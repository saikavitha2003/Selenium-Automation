Feature: Regression Testing Scenarios

  @unittest
  Scenario Outline: Verify that a user is able to login to alius health.
  Given user is able to log in to the application
  And verified Dashboard page is displayed
  Then Navigate to IW Screen and verified that IW Screen is displayed
  And user enters the data for create iw profile in iw page
  #And Navigate to Admin Client Web Portal Screen and verified that Prior Authorization Screen is displayed
  #And User is able to logout the application and verified user is on login page
  
  Examples:
  | testCase|Data |Role|
 |CREATECLAIM|CreateClaimtestData|Admin|
 #|CREATEIWPROFILE|CreateIWprofileScenariosData|Admin|