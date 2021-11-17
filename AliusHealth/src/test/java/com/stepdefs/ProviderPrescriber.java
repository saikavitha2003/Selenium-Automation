package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CMSPages.ProviderPrescriberPage;

import io.cucumber.java.en.Then;

public class ProviderPrescriber extends DriverManager {
	WebDriver driver = DriverManager.driverselection(); 
	ProviderPrescriberPage providerprescriberScreen = new ProviderPrescriberPage(driver);
	@Then("Navigate to Provider Prescriber Screen and verified that Provider Prescriber Screen is displayed")
	public void navigateProviderPharmacyPage() throws InterruptedException {
		try {
			 //Thread.sleep(5000);

			 providerprescriberScreen.navigateproviderprescriberpage();
			 //Thread.sleep(5000);

			 providerprescriberScreen.verifiedproviderprescriberpage();
			
		} catch(Exception e) {e.printStackTrace();}
		
	}
}