package com.CWPPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class Reportpage {
	WebDriver driver;
	public Reportpage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By Reportpage= By.xpath("//h6[contains(text(),'Report')]");
	By Reportpageverification= By.xpath("//div[text()='Claims Report']");
	
	public void navigateReportpage() throws InterruptedException {
			
		driver.findElement(Reportpage).click();
	}
	
public void verifiedReportpage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, Reportpageverification);
		Assert.assertEquals(true, driver.findElement(Reportpageverification).isDisplayed());
	
}
	
	
}
