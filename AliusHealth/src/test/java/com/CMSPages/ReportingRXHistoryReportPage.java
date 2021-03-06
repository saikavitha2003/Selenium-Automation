package com.CMSPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.common.commonUtilities;

public class ReportingRXHistoryReportPage {
	WebDriver driver;
	public ReportingRXHistoryReportPage(WebDriver driver) {
	this.driver=driver;
}
	
	
	By reportingPage= By.xpath("//span[text()='Reporting']");
	By RXHistoryreportPage= By.xpath("//div[text()='Rx History']");
	By RXHistoryreportPageverification= By.xpath("//h1[text()='Rx History Report']");
	By RxHistoryRunReport =	By.xpath("//button/span[text()='Run Report']");	
	public void navigateReportingpage() throws InterruptedException {
			
		driver.findElement(reportingPage).click();
		
	}
	public void navigateRXHistoryReportpage() throws InterruptedException {
		
		driver.findElement(RXHistoryreportPage).click();
		
	}
	
public void rxHistoryreportPageverification() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, RXHistoryreportPageverification);	
		Assert.assertEquals(true, driver.findElement(RXHistoryreportPageverification).isDisplayed());
		
	}
	
public void rxHistoryRunReport() throws InterruptedException {
	
	Actions actions=new Actions(driver);
	actions.moveToElement(driver.findElement(RxHistoryRunReport)).click().perform();
	Thread.sleep(2000);
	//driver.findElement(RxHistoryRunReport).click();
	
}
	
	



}



