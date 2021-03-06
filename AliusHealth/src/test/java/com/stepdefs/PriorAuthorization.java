package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CWPPages.AlertsPage;
import com.CWPPages.PriorAuthorizationPage;

import io.cucumber.java.en.Then;

public class PriorAuthorization extends DriverManager {
	WebDriver driver=DriverManager.driverselection();
	PriorAuthorizationPage priorAuthorizationScreen=new PriorAuthorizationPage(driver);
		@Then("Navigate to Prior Authorization Screen and verified that Prior Authorization Screen is displayed")
		public void navigatePriorAuthorizationPage() throws InterruptedException {
			try {
				 //Thread.sleep(5000);

				 priorAuthorizationScreen.navigatepriorAuthorizationPage();
				//Thread.sleep(20000);
				priorAuthorizationScreen.verifiedPriorAuthorizationPage();
			} catch(Exception e) {e.printStackTrace();}
			
		}
		@Then("verified that Prior Authorization Screen is displayed")
		public void verifyClientpage() throws InterruptedException {
			try {
				 //Thread.sleep(20000);

				
				
			} catch(Exception e) {e.printStackTrace();}
			
		}
}
