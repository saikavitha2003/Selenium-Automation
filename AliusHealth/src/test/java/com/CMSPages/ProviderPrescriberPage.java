package com.CMSPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class ProviderPrescriberPage {

	WebDriver driver;
	public ProviderPrescriberPage(WebDriver driver) {
	this.driver=driver;	
	}
	By providerTab=By.xpath("//span[text()='Provider']");
	By providerprescriberpage= By.xpath("//div[text()='Prescriber']");
	By providerprescriberpageverification= By.xpath("//button/span[contains(text(),'Add')]");
	public void navigateproviderprescriberpage() throws InterruptedException {
		driver.findElement(providerTab).click();
			
		driver.findElement(providerprescriberpage).click();
	}
	
public void verifiedproviderprescriberpage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, providerprescriberpageverification);
	Assert.assertEquals(true, driver.findElement(providerprescriberpageverification).isDisplayed());
}
	
	
	
	
}
