package com.CMSPages;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class TransactionPage {
	WebDriver driver;
	public TransactionPage(WebDriver driver) {
	this.driver=driver;	
	}
	By Transactionpage= By.xpath("//li/div[text()='Transaction']");
	By Transactionpageverification= By.xpath("//button/span[contains(text(),'Create')]");
	By TransactionClaimnumber= By.xpath("//table/tbody/tr[1]/td[5]/a[contains(@href,'claim-profile')] ");
	By TransactionClaimDetailspageverification= By.xpath("//h2[text()='Claim Details']");
	By TransactionTransactionHistory=By.xpath("//a[contains(text(),'Transaction History')]");
	By TransactionTransactionHistorypageverification=By.xpath("//span[contains(text(),'Transaction Type')]");
	By TransactionInvoices = By.xpath("//a[contains(text(),'Invoices')]");
	By TransactionInvoicespageverification = By.xpath("//h2[text()='Invoices List']");
	By TransactionTasks = By.xpath("//a[contains(text(),'Tasks')]");
	By TransactionTaskspageverification = By.xpath("//h2[text()='Tasks List']");
	By TransactionPriorAuthorization = By.xpath("//a[contains(text(),'Prior Authorization')]");
	By TransactionPriorAuthorizationpageverification = By.xpath("//h2[text()='Prior Authorization']");
	By TransactionNotesandAttachments= By.xpath("//a[text()='Notes & Attachments']");
	By TransactionNotesandAttachmentspageverification= By.xpath("//h2[text()='Notes and Attachments']");
	By TransactionActivityLog= By.xpath("//a[text()='Activity Log']");
	By TransactionActivityLogpageverification= By.xpath("//h2[text()='Activity Log']");
	
	public void navigateTransactionpage() throws InterruptedException {
			
		driver.findElement(Transactionpage).click();
	}
	public void verifiedTransactionpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Transactionpageverification);
		
		Assert.assertEquals(true, driver.findElement(Transactionpageverification).isDisplayed());
	}
	public void clickonTransactionclaimnumber() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TransactionClaimnumber);
		driver.findElement(TransactionClaimnumber).click();

	}

	public void verifiedTransactionClaimDetailspage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TransactionClaimDetailspageverification);
		Assert.assertEquals(true, driver.findElement(TransactionClaimDetailspageverification).isDisplayed());

	}
	public void TransactionTransactionHistory() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,TransactionTransactionHistory);
			 driver.findElement(TransactionTransactionHistory).click();

	}

	public void verifiedTransactiontransactionHistoryPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TransactionTransactionHistorypageverification);
			Assert.assertEquals(true, driver.findElement(TransactionTransactionHistorypageverification).isDisplayed());
	}
	public void TransactionInvoices() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,TransactionInvoices);
			 driver.findElement(TransactionInvoices).click();

	}

	public void verifiedTransactionInvoicesPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TransactionInvoices);
			Assert.assertEquals(true, driver.findElement(TransactionInvoices).isDisplayed());


	}
	public void TransactionTasks() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,TransactionTasks);
			 driver.findElement(TransactionTasks).click();

	}

	public void verifiedTransactionTasksPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TransactionTaskspageverification);
			Assert.assertEquals(true, driver.findElement(TransactionTaskspageverification).isDisplayed());



	}
	public void TransactionPriorAuthorization() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,TransactionPriorAuthorization);
			 driver.findElement(TransactionPriorAuthorization).click();

	}

	public void verifiedTransactionPriorAuthorizationPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TransactionPriorAuthorizationpageverification);
			Assert.assertEquals(true, driver.findElement(TransactionPriorAuthorizationpageverification).isDisplayed());

	}
	public void TransactionNotesandAttachments() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,TransactionNotesandAttachments);
			 driver.findElement(TransactionNotesandAttachments).click();

	}

	public void verifiedTransactionNotesandAttachmentsPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TransactionNotesandAttachmentspageverification);
			Assert.assertEquals(true, driver.findElement(TransactionNotesandAttachmentspageverification).isDisplayed());


	}
	public void TransactionActivityLog() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,TransactionActivityLog);
			 driver.findElement(TransactionActivityLog).click();

	}

	public void verifiedTransactionActivityLogPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TransactionActivityLogpageverification);
			Assert.assertEquals(true, driver.findElement(TransactionActivityLogpageverification).isDisplayed());



	}
	
}
