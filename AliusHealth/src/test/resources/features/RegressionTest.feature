Feature: Regression Testing Scenarios

  @test
  Scenario Outline: Verify that a user is able to login to alius health.
  Given user is able to log in to the application
  And verified Dashboard page is displayed
  Then Navigate to IW Screen and verified that IW Screen is displayed
   And Search the IW by "All"
  #And Create Claim for IW "<testCase>" with "<Data>"
    And Click on Claimant Name and verified that IWDemographics Screen is displayed
    And Click on Transaction History and verified that IWTransaction History Screen is displayed
    And Click on claims and verified that IWClaims Screen is displayed
    And Click on IW Notes and Attachements and verified that IWNotes and Attachements Screen is displayed
    And Click on IWActivity Log and verified that IWActivity Log Screen is displayed
    And Navigate to IW Screen and verified that IW Screen is displayed
  And Click on IWClaimnumber and verified that IWClaim Details Screen is displayed
  And Click on IWclaimTransaction History and verified that IWclaimTransaction History Screen is displayed
  And Click on IWclaimInvoices and verified that IWclaimInvoices Screen is displayed
  And Click on IWclaimTasks and verified that IWclaimTasks Screen is displayed
  And Click on IWclaimPrior Authorization and verified that IWclaimPrior Authorization Screen is displayed
  And Click on IWclaimNotes and Attachements and verified that IWclaimNotes and Attachements Screen is displayed
  And Click on IWclaimActivity Log and verified that Notes and IWclaimActivity Log Screen is displayed
    And Navigate to Client Screen and verified that Client Screen is displayed
    And Click on Client Name and verified that ClientDemographics Screen is displayed
    And Click on Client Hierarchy and verified that ClientHierarchy Screen is displayed
    And Click on Client BusinessAssociates and verified that Client BusinessAssociates Screen is displayed
    And Click on Client Options and verified that Client Options Screen is displayed
    And Click on Monthly Fee & Pricing Options and verified that Monthly Fee & Pricing Options Screen is displayed
    And Click on Organization Options and verified that Organization Options Screen is displayed
    And Click on Client Notes and Attachements and verified that Notes and Attachements Screen is displayed
    And Click on Activity Log and verified that Notes and Activity Log Screen is displayed
   And Navigate to Tasking Screen and verified that Tasking Screen is displayed
    And Verify the Tasking Task Details Screen by clicking on TaskID  
    And Click on Notes and Attachments verified that Tasking Notes and Attachments Screen is displayed
    And Click on Activity Log verified that Activity Log Screen is displayed
    And Click on Task Demographics verified that Task Demographics Screen is displayed
    And Click on Cancel button verified that Tasking Screen is displayed
    ##And Click on TaskingClaimant Name and verified that TaskingDemographics Screen is displayed  
     And Navigate to Billing Screen and verified that Billing Screen is displayed 
 	   And Click on Search button and verified that Billingdata is displayed
 	   And Click on Claimant Name and verified that BillingDemographics Screen is displayed
 	   And Click on Transaction History and verified that BillingTransaction History Screen is displayed
 	   And Click on claims and verified that BillingClaims Screen is displayed
 	   And Click on Billing Notes and Attachements and verified that BillingNotes and Attachements Screen is displayed
 	   And Click on BillingActivity Log and verified that BillingActivity Log Screen is displayed
 	  And Navigate to Billing Screen and verified that Billing Screen is displayed 
 	##And Click on Claimant Name and verified that BillingDemographics Screen is displayed 
  	 And Navigate to Provider Prescriber Screen and verified that Provider Prescriber Screen is displayed
   	 And Navigate to Provider Pharmacy Screen and verified that Provider Pharmacy Screen is displayed
  	 And Navigate to Transaction Screen and verified that Transaction Screen is displayed  
  	 And Click on TransactionClaimnumber and verified that TransactionClaim Details Screen is displayed
  	 And Click on TransactionTransaction History and verified that TransactionTransaction History Screen is displayed
  	 And Click on TransactionInvoices and verified that TransactionInvoices Screen is displayed
  	 And Click on TransactionTasks and verified thatTransactionTasks Screen is displayed
  	 And Click on TransactionPrior Authorization and verified thatTransactionPrior Authorization Screen is displayed
  	 And Click on TransactionNotes and Attachements and verified that TransactionNotes and Attachements Screen is displayed
  	 And Click on TransactionActivity Log and verified that Notes and TransactionActivity Log Screen is displayed
  	 And Navigate to Reporting RXHistory Screen and verified that Rx Histort Report Screen is displayed   
    And Navigate to Admin Client Web Portal Screen and verified that Prior Authorization Screen is displayed
    And Navigate to Pricing Tool Screen and verified that Pricing Tool Screen is displayed
    And Navigate to Prior Authorization Screen and verified that Prior Authorization Screen is displayed
      And Navigate to Report Screen and verified that Report Screen is displayed
     And Navigate to ClaimantProfileClaims and verified that ClaimantProfileClaims Screen is displayed
     And Navigate to Alerts Screen and verified that Alerts Screen is displayed
    And User is able to logout the application and verified user is on login page
  
  Examples:
  | testCase|Data |Role|
 #|CREATECLAIM|CreateClaimtestData|Admin
 |REGRESSION|RegressionScenariosData|Admin|