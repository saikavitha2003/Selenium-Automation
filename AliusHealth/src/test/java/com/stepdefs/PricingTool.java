package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CWPPages.AlertsPage;
import com.CWPPages.PricingToolPage;

import io.cucumber.java.en.Then;

public class PricingTool extends DriverManager {
		WebDriver driver=DriverManager.driverselection();
		PricingToolPage pricingToolScreen=new PricingToolPage(driver);
		@Then("Navigate to Pricing Tool Screen and verified that Pricing Tool Screen is displayed")
		public void navigateAlertspage() throws InterruptedException {
			try {
				 //Thread.sleep(5000);

				 pricingToolScreen.navigatePricingToolpage();
				//Thread.sleep(20000);
				pricingToolScreen.verifiedPricingToolpage();
			} catch(Exception e) {e.printStackTrace();}
			
		}
		@Then("verified that Pricing Tool Screen is displayed")
		public void verifyClientpage() throws InterruptedException {
			try {
				 //Thread.sleep(20000);

				
				
			} catch(Exception e) {e.printStackTrace();}
			
		}
}
