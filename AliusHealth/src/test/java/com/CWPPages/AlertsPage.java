package com.CWPPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class AlertsPage {
	WebDriver driver;
	public AlertsPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By Alertspage= By.xpath("//a[contains(@href,'alerts')]");
	By alertspageverification= By.xpath("//h2[contains(text(),' Alerts to Process :')]");
	public void navigateAlertspage() throws InterruptedException {
			
		driver.findElement(Alertspage).click();
	}
	
	public void verifiedAlertspage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Alertspage);
		driver.findElement(Alertspage).click();
	}
}
