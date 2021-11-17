package com.CMSPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class ProviderPharmacyPage {
	WebDriver driver;
	public ProviderPharmacyPage(WebDriver driver) {
	this.driver=driver;	
	}
	By providerTab=By.xpath("//span[text()='Provider']");

	By providerpharmacypage= By.xpath("//div[text()='Pharmacy']");
	By providerpharmacypageverification= By.xpath("//button/span[contains(text(),'Add')]");
	public void navigateproviderpharmacypage() throws InterruptedException {
		driver.findElement(providerTab).click();
		driver.findElement(providerpharmacypage).click();
	}
	public void verifiedproviderpharmacypage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, providerpharmacypageverification);
		Assert.assertEquals(true, driver.findElement(providerpharmacypageverification).isDisplayed());
}
}
