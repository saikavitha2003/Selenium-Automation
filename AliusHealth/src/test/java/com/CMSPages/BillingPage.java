package com.CMSPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class BillingPage {
	WebDriver driver;
	public BillingPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By Billingpage= By.xpath("//li/div[text()='Billing']");
	By Billingpageverification= By.xpath("//button/span[contains(text(),'AUDIT TASKS')]");
	By BillingpageInvoiceDateFrom= By.xpath("//div[1]/div[2]/div/div/div[1]/div/div/input");
	By BillingpageInvoiceDateTo= By.xpath("//div[1]/div[3]/div/div/div[1]/div/div/input");
	By BillingpageSearchbutton=By.xpath("//button/span[contains(text(),'Search')]");
	By BillingClaimantName=By.xpath("//table/tbody/tr[1]/td[2]/a[contains(@href,'demographics')]");
	By BillingDemographicspageverification=By.xpath("//h2[contains(text(),'Create Injured Worker')]");
	By BillingTransactionHistory=By.xpath("//a[contains(text(),'Transaction History')]");
	By BillingTransactionHistorypageverification=By.xpath("//span[contains(text(),'Transaction Type')]");
	By  BillingClaims=By.xpath("//a[contains(text(),'Claims')]");
	By  BillingClaimspageverification=By.xpath("//h2[contains(text(),'Claims')]");
	By  BillingNotesandAttachments= By.xpath("//a[text()='Notes & Attachments']");
	By  BillingNotesandAttachmentspageverification= By.xpath("//h2[text()='Notes and Attachments']");
	By  BillingActivityLog= By.xpath("//a[text()='Activity Log']");
	By  BillingActivityLogpageverification= By.xpath("//h2[text()='Activity Log']");
	
	public void navigateBillingpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Billingpage);	
		driver.findElement(Billingpage).click();
	}
	
	public void billingpageInvoiceDateFromclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, BillingpageInvoiceDateFrom);
		commonUtilities.javaScriptclickonbutton(driver,BillingpageInvoiceDateFrom);
		driver.findElement(BillingpageInvoiceDateFrom).sendKeys("09-21-2021");
		driver.findElement(BillingpageInvoiceDateFrom).sendKeys(Keys.ENTER);
		 //driver.findElement(BillingpageSearchbutton).click();
	
	
  }
	
	public void billingpageInvoiceDateToclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, BillingpageInvoiceDateTo);
		commonUtilities.javaScriptclickonbutton(driver,BillingpageInvoiceDateTo);
		driver.findElement(BillingpageInvoiceDateTo).sendKeys("10-20-2021");
		driver.findElement(BillingpageInvoiceDateTo).sendKeys(Keys.ENTER);
	
	
  }
	
	
	
	
	public void BillingpageSearchbuttonclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, BillingpageSearchbutton);
		commonUtilities.javaScriptclickonbutton(driver,BillingpageSearchbutton);
		 //driver.findElement(BillingpageSearchbutton).click();
	
	
  }
	public void verifiedBillingpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Billingpageverification);	
		Assert.assertEquals(true, driver.findElement(Billingpageverification).isDisplayed());
	}
	
	
	public void BillingclaimantName() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,BillingClaimantName);
			Assert.assertEquals(true, driver.findElement(BillingClaimantName).isDisplayed());

	}


	public void BillingClaimantNameclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,BillingClaimantName);
			 driver.findElement(BillingClaimantName).click();

	}

	public void verifiedBillingdemograpicsPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, BillingDemographicspageverification);
			Assert.assertEquals(true, driver.findElement(BillingDemographicspageverification).isDisplayed());
	}

	public void BillingTransactionHistoryclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,BillingTransactionHistory);
			 driver.findElement(BillingTransactionHistory).click();

	}

	public void verifiedBillingtransactionHistoryPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, BillingTransactionHistorypageverification);
			Assert.assertEquals(true, driver.findElement(BillingTransactionHistorypageverification).isDisplayed());
	}

	public void BillingClaimsclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,BillingClaims);
			 driver.findElement(BillingClaims).click();

	}
	public void verifiedBillingclaimsPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, BillingClaimspageverification);
			Assert.assertEquals(true, driver.findElement(BillingClaimspageverification).isDisplayed());
	}
	public void clickonnotesandattachments() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,BillingNotesandAttachments);
		driver.findElement(BillingNotesandAttachments).click();

	}

	public void verifiedNotesandattachmentspage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, BillingNotesandAttachmentspageverification);
		Assert.assertEquals(true, driver.findElement(BillingNotesandAttachmentspageverification).isDisplayed());

	}

	public void clickonactivitylog() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, BillingActivityLog);
		driver.findElement(BillingActivityLog).click();

	}

	public void verifiedActivityLogpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, BillingActivityLogpageverification);
		Assert.assertEquals(true, driver.findElement(BillingActivityLogpageverification).isDisplayed());

	}

	
}




