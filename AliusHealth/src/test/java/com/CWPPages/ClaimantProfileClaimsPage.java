package com.CWPPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class ClaimantProfileClaimsPage {
	WebDriver driver;
	public ClaimantProfileClaimsPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By ClaimantProfileClaimspage= By.xpath("//h6[contains(text(),'Claimant')]");
	By claimantProfileClaimspageverification= By.xpath("//span[contains(text(),'Search for Claimant')]");
	public void navigateClaimantProfileClaimspage() throws InterruptedException {
			
		driver.findElement(ClaimantProfileClaimspage).click();
	}
	
	
	public void verifiedClaimantProfileClaimspage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, claimantProfileClaimspageverification);
		Assert.assertEquals(true, driver.findElement(claimantProfileClaimspageverification).isDisplayed());
	
}
}