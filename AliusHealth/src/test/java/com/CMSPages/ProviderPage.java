package com.CMSPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class ProviderPage {
	WebDriver driver;
	public ProviderPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By Providerpage= By.xpath("//li/div[text()='Provider']");
	public void navigateProviderpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Providerpage);
		driver.findElement(Providerpage).click();
	}
	

	
	
}
