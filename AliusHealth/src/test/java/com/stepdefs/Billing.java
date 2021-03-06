package com.stepdefs;



import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CMSPages.BillingPage;
import com.common.commonUtilities;

import io.cucumber.java.en.Then;

public class Billing extends DriverManager {
	WebDriver driver = DriverManager.driverselection();
	BillingPage BillingScreen = new BillingPage(driver);
	
	@Then("Navigate to Billing Screen and verified that Billing Screen is displayed")
	public void navigateTaskingPage() throws InterruptedException {

		try {
			//Thread.sleep(5000);
			BillingScreen.navigateBillingpage();
			//Thread.sleep(5000);
			BillingScreen.verifiedBillingpage();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Then("verified that Billing Screen is displayed")
	public void verifyBillingPage() throws InterruptedException {

		try {
			//Thread.sleep(5000);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void navigateBillingpage() {
		// TODO Auto-generated method stub
		
	}
	
	

	@Then("Click on Search button and verified that Billingdata is displayed")
	public void BillingpageSearchbutton() throws InterruptedException {
		try {
			
			BillingScreen.billingpageInvoiceDateFromclick();
			BillingScreen.billingpageInvoiceDateToclick();
			BillingScreen.BillingpageSearchbuttonclick();
			System.out.println("------0");
			Thread.sleep(7000);
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}
	}

	
	@Then("Click on Claimant Name and verified that BillingDemographics Screen is displayed")
	public void BillingClaimantName() throws InterruptedException {
		try {
			BillingScreen.BillingclaimantName();
			System.out.println("------0");
			BillingScreen.BillingClaimantNameclick();
			System.out.println("------1");
			BillingScreen.verifiedBillingdemograpicsPage();
		
		} catch(Exception e) {e.printStackTrace();}
	}
	
	@Then("Click on Transaction History and verified that BillingTransaction History Screen is displayed")
	public void clickonTransactionHistory() throws InterruptedException {
		try {
			

			BillingScreen.BillingTransactionHistoryclick();
			commonUtilities.waitForPageLoad(driver);
			BillingScreen.verifiedBillingtransactionHistoryPage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
	
	@Then("Click on claims and verified that BillingClaims Screen is displayed")
	public void clickonClaims() throws InterruptedException {
		try {
			

			BillingScreen.BillingClaimsclick();
			commonUtilities.waitForPageLoad(driver);
			BillingScreen.verifiedBillingclaimsPage();
		} catch(Exception e) {e.printStackTrace();}
		
		}
	@Then("Click on Billing Notes and Attachements and verified that BillingNotes and Attachements Screen is displayed")
	public void clickonBillingNotesandAttachments() throws InterruptedException {
		try {
			

			BillingScreen.clickonnotesandattachments();
			
			BillingScreen.verifiedNotesandattachmentspage();
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}	
}
	@Then("Click on BillingActivity Log and verified that BillingActivity Log Screen is displayed")
	public void clickonBillingActivityLog() throws InterruptedException {
		try {
			Thread.sleep(30000);

			BillingScreen.clickonactivitylog();
			
			BillingScreen.verifiedActivityLogpage();
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}	
	
}
	
	
	
	
}
