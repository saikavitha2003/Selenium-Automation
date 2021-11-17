package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;

import com.CWPPages.AlertsPage;

import io.cucumber.java.en.Then;

public class Alerts extends DriverManager {
		WebDriver driver=DriverManager.driverselection();
		AlertsPage alertsScreen=new AlertsPage(driver);
		@Then("Navigate to Alerts Screen and verified that Alerts Screen is displayed")
		public void navigateAlertspage() throws InterruptedException {
			try {
				 //Thread.sleep(5000);

				 alertsScreen.navigateAlertspage();
				//Thread.sleep(20000);
				alertsScreen.verifiedAlertspage();
			} catch(Exception e) {e.printStackTrace();}
			
		}
		@Then("verified that Alerts Screen is displayed")
		public void verifyClientpage() throws InterruptedException {
			try {
				 //Thread.sleep(20000);

				
				
			} catch(Exception e) {e.printStackTrace();}
			
		}
}
