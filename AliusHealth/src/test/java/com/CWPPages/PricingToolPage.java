package com.CWPPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class PricingToolPage {
	WebDriver driver;
	public PricingToolPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By PricingToolpage= By.xpath("//h6[contains(text(),'Pricing Tool')]");
	By pricingToolpageverification= By.xpath("//span[contains(text(),'Pricing Tool')]");
	public void navigatePricingToolpage() throws InterruptedException {
			
		driver.findElement(PricingToolpage).click();
	}
	
	public void verifiedPricingToolpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, pricingToolpageverification);
		driver.findElement(pricingToolpageverification).click();
	
}
}