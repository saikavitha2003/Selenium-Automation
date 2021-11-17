package com.CMSPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class ClientPage {
	WebDriver driver;
	public ClientPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By Clientpage= By.xpath("//li/div[text()='Client']");
	By Clientpageverification= By.xpath("//button/span[contains(text(),'Add Client')]");
	By Clientname= By.xpath("//a[text() =' COUNTY CLAIMS OF OKLAHOMA']");
	By Clientdemographicspageverification= By.xpath("//h2[text()='Client Demographics']");
	By ClientHierarchy= By.xpath("//a[text()='Client Hierarchy']");
	By ClientHierarchypageverification= By.xpath("//h2[contains(text(),'Client Structure')]");
	By ClientBusinessAssociates= By.xpath("//a[text()='Business Associates']");
	By ClientBusinessassociatespageverification= By.xpath("//h2[text()='Business Associates']");
	By ClientOptions= By.xpath("//a[text()='Client Options']");
	By ClientOptionsgeneralpageverification= By.xpath("//div[text()='General']");
	By ClientOptionsmonthlyfeepricingoptionspageverification= By.xpath("//div[text()='Monthly Fee & Pricing Options']");
	By ClientOptionsorganizationoptionspageverification= By.xpath("//div[text()='Organization Options']");
	By ClientNotesandAttachments= By.xpath("//a[text()='Notes & Attachments']");
	By ClientNotesandAttachmentspageverification= By.xpath("//h2[text()='Notes and Attachments']");
	By ClientActivityLog= By.xpath("//a[text()='Activity Log']");
	By ClientActivityLogpageverification= By.xpath("//h2[text()='Activity Log']");

	public void navigateClientpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Clientpage);		
		driver.findElement(Clientpage).click();
	}
	
	
	public void verifiedClientpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Clientpageverification);	
		Assert.assertEquals(true, driver.findElement(Clientpageverification).isDisplayed());
	
}
	public void clickonclientname() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Clientname);	
		driver.findElement(Clientname).click();
	}
	

	public void verifiedClientdemographicspage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Clientdemographicspageverification);
		Assert.assertEquals(true, driver.findElement(Clientdemographicspageverification).isDisplayed());
	
}


	public void clickonclienthierarchy() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, ClientHierarchy);
		driver.findElement(ClientHierarchy).click();
	}	
	
	
public void verifiedClienthierarchypage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientHierarchypageverification);
		Assert.assertEquals(true, driver.findElement(ClientHierarchypageverification).isDisplayed());
	
}
	

public void clickonclientbusinessassociates() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientBusinessAssociates);
	driver.findElement(ClientBusinessAssociates).click();
}		
	

public void verifiedClientbusinessassociatepage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientBusinessassociatespageverification);
	Assert.assertEquals(true, driver.findElement(ClientBusinessassociatespageverification).isDisplayed());

}
public void clickonclientoptions() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientOptions);
	driver.findElement(ClientOptions).click();
}	
public void verifiedClientoptionsgeneralpage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientOptionsgeneralpageverification);
	Assert.assertEquals(true, driver.findElement(ClientOptionsgeneralpageverification).isDisplayed());

}	
public void clickonmonthlyfeepricingoptions() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientOptionsmonthlyfeepricingoptionspageverification);
	driver.findElement(ClientOptionsmonthlyfeepricingoptionspageverification).click();
}
public void clickonorganizationoptions() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientOptionsorganizationoptionspageverification);
	driver.findElement(ClientOptionsorganizationoptionspageverification).click();

}

public void clickonnotesandattachments() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientNotesandAttachments);
	driver.findElement(ClientNotesandAttachments).click();

}

public void verifiedNotesandattachmentspage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientNotesandAttachmentspageverification);
	Assert.assertEquals(true, driver.findElement(ClientNotesandAttachmentspageverification).isDisplayed());

}
public void clickonactivitylog() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientActivityLog);
	driver.findElement(ClientActivityLog).click();

}

public void verifiedActivityLogpage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, ClientActivityLogpageverification);
	Assert.assertEquals(true, driver.findElement(ClientActivityLogpageverification).isDisplayed());

}
}