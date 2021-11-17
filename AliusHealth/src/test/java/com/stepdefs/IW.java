package com.stepdefs;

import java.io.FileNotFoundException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.AliusHealth.DataManager;
import com.AliusHealth.DriverManager;
import com.CMSPages.IWPage;
import com.common.DataHook;
import com.common.commonUtilities;
import com.github.javafaker.Faker;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;

public class IW extends DriverManager {
	WebDriver driver=DriverManager.driverselection();
	IWPage iwscreen=new IWPage(driver);
	Faker fakedata=new Faker();
	DataHook datahook=new DataHook();
	public IW() {
		datahook.setFirstName(fakedata.name().firstName());
		datahook.setLastName(fakedata.name().lastName());
		datahook.setAddress1(fakedata.address().streetAddress());
	}
	@Then("Navigate to IW Screen and verified that IW Screen is displayed")
	public void navigatetoIWscreen() {
		try {
			commonUtilities.waitForPageLoad(driver);
		
			iwscreen.navigateIWpage();
		
			iwscreen.verifiedIWpage();
			
		} catch(Exception e) {
			
			
			e.printStackTrace();
			
			
		}
		
	}
	@Then("Search the IW by {string}")
	public void searchOnIWscreen(String searchValue) {
		try {
			
			 
			
			iwscreen.IWSearch(searchValue);
			
			
		} catch(Exception e) {
			
			
			e.printStackTrace();
			
			
		}
		
	}
	
	
	@Then("Create Claim for IW {string} with {string}")
	
	public void verified_that_iw_screen_is_displayed(String Scenario,String CreateClaimTestData) throws FileNotFoundException {
	    
	   System.out.println(DataManager.createclaimtestData(Scenario,CreateClaimTestData));
	}
	
	@AfterStep
	public void tearDown(Scenario scenario) {
	   // if (scenario.isFailed()) {
	      // Take a screenshot...
	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.attach(screenshot, "image/png", "test"); // ... and embed it in the report.
	   // }
	}
	
	@Then("Click on Claimant Name and verified that IWDemographics Screen is displayed")
	public void IWClaimantName() throws InterruptedException {
		try {
			iwscreen.IWclaimantName();
			System.out.println("------0");
			iwscreen.IWclaimantNameclick();
			System.out.println("------1");
			iwscreen.verifiedIWdemograpicsPage();
		
		} catch(Exception e) {e.printStackTrace();}
	}
	
	@Then("Click on Transaction History and verified that IWTransaction History Screen is displayed")
	public void clickonTransactionHistory() throws InterruptedException {
		try {
			

			iwscreen.IWTransactionHistoryclick();
			commonUtilities.waitForPageLoad(driver);
			iwscreen.verifiedIWtransactionHistoryPage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
	
	@Then("Click on claims and verified that IWClaims Screen is displayed")
	public void clickonClaims() throws InterruptedException {
		try {
			

			iwscreen.IWClaimsclick();
			commonUtilities.waitForPageLoad(driver);
			iwscreen.verifiedIWclaimsPage();
		} catch(Exception e) {e.printStackTrace();}
		
		}
	@Then("Click on IW Notes and Attachements and verified that IWNotes and Attachements Screen is displayed")
	public void clickonIWNotesandAttachments() throws InterruptedException {
		try {
			

			iwscreen.clickonnotesandattachments();
			
			iwscreen.verifiedNotesandattachmentspage();
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}	
}
	@Then("Click on IWActivity Log and verified that IWActivity Log Screen is displayed")
	public void clickonIWActivityLog() throws InterruptedException {
		try {
			Thread.sleep(30000);

			iwscreen.clickonactivitylog();
			
			iwscreen.verifiedActivityLogpage();
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}	
	
}
	
	@Then("Click on IWClaimnumber and verified that IWClaim Details Screen is displayed")
	public void clickonIWClaimnumber() throws InterruptedException {
		try {
			
			Thread.sleep(20000);
			iwscreen.clickonIWclaimnumber();
			
			iwscreen.verifiedIWClaimDetailspage();
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}	
}
	
	@Then("Click on IWclaimTransaction History and verified that IWclaimTransaction History Screen is displayed")
	public void clickonIWClaimTransactionHistory() throws InterruptedException {
		try {
			

			iwscreen.IWClaimTransactionHistory();
			commonUtilities.waitForPageLoad(driver);
			iwscreen.verifiedIWtransactionHistoryPage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
	
	@Then("Click on IWclaimInvoices and verified that IWclaimInvoices Screen is displayed")
	public void clickonIWClaimInvoices() throws InterruptedException {
		try {
			

			iwscreen.IWClaimInvoices();
			commonUtilities.waitForPageLoad(driver);
			iwscreen.verifiedIWClaimInvoicesPage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
	@Then("Click on IWclaimTasks and verified that IWclaimTasks Screen is displayed")
	public void clickonIWClaimTasks() throws InterruptedException {
		try {
			

			iwscreen.IWClaimTasks();
			commonUtilities.waitForPageLoad(driver);
			iwscreen.verifiedIWClaimTasksPage();
		} catch(Exception e) {e.printStackTrace();}
}
	
	@Then("Click on IWclaimPrior Authorization and verified that IWclaimPrior Authorization Screen is displayed")
	public void clickonIWPriorAuthorization() throws InterruptedException {
		try {
			

			iwscreen.IWClaimPriorAuthorization();
			commonUtilities.waitForPageLoad(driver);
			iwscreen.verifiedIWClaimPriorAuthorizationPage();
		} catch(Exception e) {e.printStackTrace();}
}

	@Then("Click on IWclaimNotes and Attachements and verified that IWclaimNotes and Attachements Screen is displayed")
	public void clickonIWclaimNotesandAttachements() throws InterruptedException {
		try {
			

			iwscreen.IWClaimNotesandAttachments();
			commonUtilities.waitForPageLoad(driver);
			iwscreen.IWClaimNotesandAttachments();
		} catch(Exception e) {e.printStackTrace();}
}
	@Then("Click on IWclaimActivity Log and verified that Notes and IWclaimActivity Log Screen is displayed")
	public void clickonIWClaimActivityLog () throws InterruptedException {
		try {
			//Thread.sleep(30000);

			iwscreen.IWClaimActivityLog();
			commonUtilities.waitForPageLoad(driver);
			iwscreen.verifiedIWClaimActivityLogPage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
	@Then("user enters the data for create iw profile in iw page")
	public void createIWprofileDataEntry () throws InterruptedException {
		try {
			//Thread.sleep(30000);

			iwscreen.createIWprofileClick();
			iwscreen.enterFirstName(datahook.getFirstName());
			iwscreen.enterLastName(datahook.getLastName());
			iwscreen.enterAddress1(datahook.getAddress1());
			iwscreen.enterCity(datahook.getCity());
			iwscreen.enterState(datahook.getState());
			iwscreen.enterZipcode(datahook.getZipCode());
			iwscreen.enterSsn(datahook.getSSN());
			iwscreen.enterPhone(datahook.getPhone());
			iwscreen.enterDateofBirth(datahook.getDOB());
			
			
			
			
			
			
			
			
		} catch(Exception e) {e.printStackTrace();}
		
	}
}