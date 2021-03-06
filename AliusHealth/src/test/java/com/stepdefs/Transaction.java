package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CMSPages.IWPage;
import com.CMSPages.TransactionPage;
import com.common.commonUtilities;

import io.cucumber.java.en.Then;

public class Transaction extends DriverManager {
	WebDriver driver=DriverManager.driverselection();
	TransactionPage transactionscreen=new TransactionPage(driver);
	@Then("Navigate to Transaction Screen and verified that Transaction Screen is displayed")
	public void navigateTransactionage() throws InterruptedException {
		try {
			 //Thread.sleep(5000);

			transactionscreen.navigateTransactionpage();
			//Thread.sleep(20000);
			transactionscreen.verifiedTransactionpage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
	@Then("verified that Transaction Screen is displayed")
	public void verifyTransactionpage() throws InterruptedException {
		try {
			 //Thread.sleep(20000);

			
			
		} catch(Exception e) {e.printStackTrace();}
		
	}
	@Then("Click on TransactionClaimnumber and verified that TransactionClaim Details Screen is displayed")
	public void clickonTransactionClaimnumber() throws InterruptedException {
		try {
			
			Thread.sleep(20000);
			transactionscreen.clickonTransactionclaimnumber();
			
			transactionscreen.verifiedTransactionClaimDetailspage();
			commonUtilities.waitForPageLoad(driver);
		} catch(Exception e) {e.printStackTrace();}	
}
	
	@Then("Click on TransactionTransaction History and verified that TransactionTransaction History Screen is displayed")
	public void clickonTransactionTransactionHistory() throws InterruptedException {
		try {
			

			transactionscreen.TransactionTransactionHistory();
			commonUtilities.waitForPageLoad(driver);
			transactionscreen.verifiedTransactiontransactionHistoryPage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
	
	@Then("Click on TransactionInvoices and verified that TransactionInvoices Screen is displayed")
	public void clickonTransactionInvoices() throws InterruptedException {
		try {
			

			transactionscreen.TransactionInvoices();
			commonUtilities.waitForPageLoad(driver);
			transactionscreen.verifiedTransactionInvoicesPage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
	@Then("Click on TransactionTasks and verified thatTransactionTasks Screen is displayed")
	public void clickonTransactionClaimTasks() throws InterruptedException {
		try {
			

			transactionscreen.TransactionTasks();
			commonUtilities.waitForPageLoad(driver);
			transactionscreen.verifiedTransactionTasksPage();
		} catch(Exception e) {e.printStackTrace();}
}
	
	@Then("Click on TransactionPrior Authorization and verified thatTransactionPrior Authorization Screen is displayed")
	public void clickonTransactionPriorAuthorization() throws InterruptedException {
		try {
			

			transactionscreen.TransactionPriorAuthorization();
			commonUtilities.waitForPageLoad(driver);
			transactionscreen.verifiedTransactionPriorAuthorizationPage();
		} catch(Exception e) {e.printStackTrace();}
}

	@Then("Click on TransactionNotes and Attachements and verified that TransactionNotes and Attachements Screen is displayed")
	public void clickonTransactionNotesandAttachements() throws InterruptedException {
		try {
			

			transactionscreen.TransactionNotesandAttachments();
			commonUtilities.waitForPageLoad(driver);
			transactionscreen.verifiedTransactionNotesandAttachmentsPage();
		} catch(Exception e) {e.printStackTrace();}
}
	@Then("Click on TransactionActivity Log and verified that Notes and TransactionActivity Log Screen is displayed")
	public void clickonTransactionActivityLog () throws InterruptedException {
		try {
			Thread.sleep(30000);

			transactionscreen.TransactionActivityLog();
			commonUtilities.waitForPageLoad(driver);
			transactionscreen.verifiedTransactionActivityLogPage();
		} catch(Exception e) {e.printStackTrace();}
		
	}
}