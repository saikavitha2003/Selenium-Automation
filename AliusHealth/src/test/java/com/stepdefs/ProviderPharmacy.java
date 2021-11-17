package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CMSPages.ProviderPage;
import com.CMSPages.ProviderPharmacyPage;

import io.cucumber.java.en.Then;

public class ProviderPharmacy extends DriverManager {
	WebDriver driver = DriverManager.driverselection();
	ProviderPharmacyPage providerpharmacyScreen = new ProviderPharmacyPage(driver);
	@Then("Navigate to Provider Pharmacy Screen and verified that Provider Pharmacy Screen is displayed")
	public void navigateProviderPharmacyPage() throws InterruptedException {
		try {
			 //Thread.sleep(5000);

			 providerpharmacyScreen.navigateproviderpharmacypage();
			 //Thread.sleep(5000);

			 providerpharmacyScreen.verifiedproviderpharmacypage();
			
		} catch(Exception e) {e.printStackTrace();}
		
	}

}
