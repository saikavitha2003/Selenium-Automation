package com.CWPPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class ClientWebPortalPage {
	WebDriver driver;
	public ClientWebPortalPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By ClientWebPortalpage= By.xpath("//li/div[text()='Client']");
	By ClientWebPortalpageverification=By.xpath("//h2[contains(text(),'Unresolved Rejected Transactions :')]");
	public void navigateClientWebPortalpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, ClientWebPortalpage);	
		driver.findElement(ClientWebPortalpage).click();
	}
	
	
	public void verifiedClientWebPortalpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, ClientWebPortalpageverification);	
		Assert.assertEquals(true, driver.findElement(ClientWebPortalpageverification).isDisplayed());
	}
	
	
}
