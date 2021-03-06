package com.CWPPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class PriorAuthorizationPage {
	WebDriver driver;
	public PriorAuthorizationPage(WebDriver driver) {
	this.driver=driver;	
	}
	By PriorAuthorizationPage= By.xpath("//h6[contains(text(),'Prior Authorization')]");
	By priorAuthorizationpageverification= By.xpath("//h2[contains(text(),'Unresolved Rejected Transactions :')]");
	public void navigatepriorAuthorizationPage() throws InterruptedException {
			
		driver.findElement(PriorAuthorizationPage).click();
	}
	
	public void verifiedPriorAuthorizationPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, priorAuthorizationpageverification);
		driver.findElement(priorAuthorizationpageverification).click();
	}
}
