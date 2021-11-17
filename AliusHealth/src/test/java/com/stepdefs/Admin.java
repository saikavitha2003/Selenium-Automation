package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CMSPages.AdminPage;
import com.CMSPages.ReportingRXHistoryReportPage;

import io.cucumber.java.en.Then;

public class Admin extends DriverManager{
		WebDriver driver = DriverManager.driverselection();
		AdminPage adminscreen = new AdminPage(driver);
			@Then("Navigate to Admin Client Web Portal Screen and verified that Prior Authorization Screen is displayed")
			public void Clientwebportalscreen() throws InterruptedException {
				try {
					 //Thread.sleep(5000);
					 adminscreen.navigateAdminpage();
					 adminscreen.navigateclientWebPortal();
					 
					 //Thread.sleep(5000);
					 
					 adminscreen.adminclientwebportalpageverification();
					 
					 
					 

				} catch(Exception e) {e.printStackTrace();}
				
			}
	
	
	
	
	
	
	
}
