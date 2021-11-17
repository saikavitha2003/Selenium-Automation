Feature: Login to Alius Health with incorrect password
  
 @Test1 
 Scenario: Verify that a user is not able to login with incorrect password
    Given Navigate to URL "QA"
    Then Enter "kdhanyasi@aliushealth.com" in username textbox
    Then Enter "Sairam@171" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
 
 @Test1    
Scenario: Verify that a user is able to login as CFO with incorrect password
    Given Navigate to URL "QA"
    Then Enter "CFO_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
    
  @Test1   
  Scenario: Verify that a user is able to login as Executive with incorrect password
    Given Navigate to URL "QA"
    Then Enter "Executive_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
    
  @Test1  
  Scenario: Verify that a user is able to login as Pharmacy Management with incorrect password
    Given Navigate to URL "QA"
    Then Enter "Pharmacy_Management_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
    
  @Test1 
  Scenario: Verify that a user is able to login as Pharmacy Supervisor with incorrect password
    Given Navigate to URL "QA"
    Then Enter "Pharmacy_Supervisor_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
    
  @Test1  
  Scenario: Verify that a user is able to login as Pharmacy Support Rep with incorrect password
    Given Navigate to URL "QA"
    Then Enter "Pharmacy_Support_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
    
  @Test1  
  Scenario: Verify that a user is able to login as Billing & A/R Agent with incorrect password
    Given Navigate to URL "QA"
    Then Enter "Billing_Agent_AR_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
    
  @Test1  
  Scenario: Verify that a user is able to login as Clinical Management with incorrect password
    Given Navigate to URL "QA"
    Then Enter "Clinical_Management_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
    
  @Test1  
  Scenario: Verify that a user is able to login as Clinical Staff with incorrect password
    Given Navigate to URL "QA"
    Then Enter "Clinical_Staff_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
    
  @Test1  
  Scenario: Verify that a user is able to login as Account Manager with incorrect password
    Given Navigate to URL "QA"
    Then Enter "Account_Manager_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
    
  @Test1  
  Scenario: Verify that a user is able to login as Sales/Acct Mgmt Service Assistant with incorrect password
    Given Navigate to URL "QA"
    Then Enter "Sales_Assistant_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message
    
  @Test1   
  Scenario: Verify that a user is able to login as Compliance with incorrect password
    Given Navigate to URL "QA"
    Then Enter "Compliance_user@aliushealth.com" in username textbox
    Then Enter "L3tme!n2" in password textbox
    Then Click Login Button
    Then Wait for "5" seconds
    Then Verify Login Failure Message