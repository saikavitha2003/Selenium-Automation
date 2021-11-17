Feature: Navigate to IW Screen

 
    
   @Test2
  Scenario: Verify that a user is able to CREATE IW PROFILE.
       Given Navigate to URL "QA"
       Then Enter "kdhanyasi@aliushealth.com" in username textbox
       Then Enter "Sairam@17" in password textbox
       Then Click Login Button
       Then Wait for "5" seconds
       Then Verify Homepage
       Then Navigate to IW screen
       Then Wait for "5" seconds
       Then Click Create IW Profile
       Then Wait for "5" seconds
       Then Enter Mandatory Fields to create IW Profile
       Then Verify IW has been saved successfully updated message is displayed
       
   
   @Test5
   Scenario: Verify that a user is able to CREATE CLAIM.
   			Given Navigate to URL "QA"
       Then Enter "kdhanyasi@aliushealth.com" in username textbox
       Then Enter "Sairam@17" in password textbox
       Then Click Login Button
       Then Wait for "5" seconds
       Then Verify Homepage
       Then Navigate to IW screen
       Then Wait for "5" seconds
       Then Navigate to Create Claim
       Then Enter "Laura" in Associated IW textbox
       And select "Robertson Laura" from the List
       Then Enter "10-01-2021" in DOI textbox
       Then Enter "Commonwealth of Virginia" in EmployerName textbox
       Then Enter "Spinal Injury" in InjuryDescription textbox
       Then select "District of Columbia" in State of Jurisdiction dropdown
       Then Enter "10-11-2021" in DateofReferral textbox
       Then select "Pending" in Claim Status
       Then Enter "10-11-2021 " in EligibilityStartDate textbox
       Then Enter " 10-11-2031 " in EligibilityEndDate textbox
       Then Click "SAVE" button
       Then verify The Calim has been saved successfully saved message is displayed
       
    
   Scenario: Verify that a user is able to Search in IW screen.
       Given Navigate to "IW" screen
       Then select 'All" from dropdown
       Then Enter "Robert Thomas" in All textbox
       And  select "Robert Thomas" from the List
       Then select 'Injuredworker" from dropdown
       Then Enter "Robert Thomas" in All textbox
       And  select "Robert Thomas" from the List
       Then select 'Claim" from dropdown
       Then Enter "4728" in All textbox
       And select "4728" from the List
       Then Click "4728" claim#
       Then verify that "Claim Details" screen is displayed
       Then Click on TransactionHistory Screen
       Then verify that "TransactionHistory" screen is displayed
       Then Click on "Invoices" Screen
       Then verify that "Invoices List" screen is displayed
       Then Click on "Tasks" Screen
       Then verify that "Tasks List" screen is displayed
       Then Click on "Prior Authorization" Screen
       Then verify that "Prior Authorization" screen is displayed
       Then Click on "Notes&Attachments" Screen
       Then verify that "Notes and Attachments" screen is displayed
       Then Click on "Activity Log" Screen
       Then verify that "Activity Log" screen is displayed