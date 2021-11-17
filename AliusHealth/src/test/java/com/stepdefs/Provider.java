package com.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CMSPages.ProviderPage;
import com.CMSPages.TaskingPage;

import io.cucumber.java.en.Then;

public class Provider extends DriverManager {
	WebDriver driver = DriverManager.driverselection();
	ProviderPage providerScreen = new ProviderPage(driver);
	@Then("Navigate to Provider Screen")
	public void navigateClientpage() throws InterruptedException {
		try {
			 //Thread.sleep(5000);

			providerScreen.navigateProviderpage();
			
		} catch(Exception e) {e.printStackTrace();}
		
	}
	@Then("verified that Provider Screen is displayed")
	public void verifyClientpage() throws InterruptedException {
		try {
			 //Thread.sleep(5000);

			
			
		} catch(Exception e) {e.printStackTrace();}
		
	}
}


	