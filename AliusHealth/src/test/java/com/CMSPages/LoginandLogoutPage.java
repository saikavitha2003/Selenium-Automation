package com.CMSPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class LoginandLogoutPage {
	WebDriver driver;
	public LoginandLogoutPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By Username =By.xpath("//input[@name='username']");
	By Password =By.xpath("//input[@name='password']");		
	By Loginbutton =By.xpath("//button[@type='submit']");
	By Dashboardpageverification=By.xpath("//p[contains(text(),'Hi')]");
	By Logoutbutton =By.xpath("//button/span[contains(text(),'Logout')]");
	By Logoutpageverification=By.xpath("//button[@type='submit']");
	By Logoutimage=By.xpath("//div[contains(@aria-owns,'logout')]");
	By Logoutimagebutton =By.xpath("//div[contains(text(),'logout')]");
	
	public void login(String url,String userName, String passWord) throws InterruptedException {
		driver.get(url);
		driver.findElement(Username).sendKeys(userName);
		driver.findElement(Password).sendKeys(passWord);
		//Thread.sleep(10000);
		commonUtilities.waitfortheElement(driver, Loginbutton);
		driver.findElement(Loginbutton).click();
			//Thread.sleep(1000);
	}
	
	public void dashboardpageverification() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Dashboardpageverification);	
			Assert.assertEquals(true, driver.findElement(Dashboardpageverification).isDisplayed());
	}
	
	public void logoutbuttonclick() throws InterruptedException {
		
		
		//driver.findElement(Logoutbutton).click();
		try {
			commonUtilities.javaScriptclickonbutton(driver,Logoutbutton);
			
		}catch(org.openqa.selenium.NoSuchElementException e) {
			driver.findElement(Logoutimage).click();
			driver.findElement(Logoutimagebutton).click();
			//commonUtilities.javaScriptclickonbutton(driver,Logoutbutton);
			
		}
		
			//Thread.sleep(1000);
	}
	
	
	
	public void logoutpageverification() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Logoutpageverification);	
			Assert.assertEquals(true, driver.findElement(Logoutpageverification).isDisplayed());
	}
	
	
}

