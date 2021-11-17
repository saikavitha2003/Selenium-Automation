Feature: Regression Testing Scenarios

  @test
  Scenario: Verify that a user is able to login to alius health.
  Given user is able to log in to the application
  Then Dashboard should be displayed
   
    
  Examples:
  | testCase|Data |Role
  |tc01|iw01|cfo