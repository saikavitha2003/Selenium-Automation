package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CMSPages.ClientPage;
import com.common.commonUtilities;

import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Then;

public class Client extends DriverManager{
	WebDriver driver=DriverManager.driverselection();
	ClientPage clientScreen=new ClientPage(driver);
	@Then("Navigate to Client Screen and verified that Client Screen is displayed")
	public void navigateClientpage() throws InterruptedException {
		try {
			 
			clientScreen.navigateClientpage();
			commonUtilities.waitForPageLoad(driver);
					clientScreen.verifiedClientpage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
	@Then("verified that Client Screen is displayed")
	public void verifyClientpage() throws InterruptedException {
		try {
			
			
					} catch(Exception e) {e.printStackTrace();}
		
	}
	@Then("Click on Client Name and verified that ClientDemographics Screen is displayed")
	public void clickonClientname() throws InterruptedException {
		try {
			

			clientScreen.clickonclientname();
			commonUtilities.waitForPageLoad(driver);
			clientScreen.verifiedClientdemographicspage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
	
	@Then("Click on Client Hierarchy and verified that ClientHierarchy Screen is displayed")
	public void clickonClienthierarchy() throws InterruptedException {
		try {
			

			clientScreen.clickonclienthierarchy();
			commonUtilities.waitForPageLoad(driver);
			clientScreen.verifiedClienthierarchypage();
		} catch(Exception e) {e.printStackTrace();}	
		
}
	@Then("Click on Client BusinessAssociates and verified that Client BusinessAssociates Screen is displayed")
	public void clickonClientbusinessassociates() throws InterruptedException {
		try {
			

			clientScreen.clickonclientbusinessassociates();
			
			clientScreen.verifiedClientbusinessassociatepage();
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}	
	
	
	}	
	
	@Then("Click on Client Options and verified that Client Options Screen is displayed")
	public void clickonClientOptions() throws InterruptedException {
		try {
			 

			clientScreen.clickonclientoptions();
			
			clientScreen.verifiedClientoptionsgeneralpage();
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}	
	
}
	@Then("Click on Monthly Fee & Pricing Options and verified that Monthly Fee & Pricing Options Screen is displayed")
	public void clickonClientOptionsmonthlyfeepricingoptionspageverification() throws InterruptedException {
		try {
		
			clientScreen.clickonmonthlyfeepricingoptions();
			commonUtilities.waitForPageLoad(driver);
			
		} catch(Exception e) {e.printStackTrace();}	
}
	@Then("Click on Organization Options and verified that Organization Options Screen is displayed")
	public void clickonClientOptionsorganizationoptionspageverification() throws InterruptedException {
		try {
			

			clientScreen.clickonorganizationoptions();
			commonUtilities.waitForPageLoad(driver);

		} catch(Exception e) {e.printStackTrace();}	
}
	
	@Then("Click on Client Notes and Attachements and verified that Notes and Attachements Screen is displayed")
	public void clickonClientNotesandAttachments() throws InterruptedException {
		try {
			

			clientScreen.clickonnotesandattachments();
			
			clientScreen.verifiedNotesandattachmentspage();
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}	
	
}
	@Then("Click on Activity Log and verified that Notes and Activity Log Screen is displayed")
	public void clickonClientActivityLog() throws InterruptedException {
		try {
			

			clientScreen.clickonactivitylog();
			
			clientScreen.verifiedActivityLogpage();
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}	
	
}
	//@AfterStep
	public void waitforpageload() throws InterruptedException {
		commonUtilities.waitForPageLoad(driver);
	}
}