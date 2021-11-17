package com.CMSPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class AdminPage {
	WebDriver driver;
	public AdminPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By Adminpage= By.xpath("//span[text()='Admin']");
	By ClientWebPortal=By.xpath("//div[text()='Client Web Portal']");
	By PriorAuthorizationpageverification=By.xpath("//h2[text()='Unresolved Rejected Transactions :']");
	
	public void navigateAdminpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Adminpage);	
		driver.findElement(Adminpage).click();
	}
	
	
	public void navigateclientWebPortal() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, ClientWebPortal);	
		driver.findElement(ClientWebPortal).click();
	
	}
	
public void adminclientwebportalpageverification() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, PriorAuthorizationpageverification);	
		Assert.assertEquals(true, driver.findElement(PriorAuthorizationpageverification).isDisplayed());
}
		
}
