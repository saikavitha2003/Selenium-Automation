package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CWPPages.ClaimantProfileClaimsPage;
import com.CWPPages.Reportpage;

import io.cucumber.java.en.Then;

public class ClaimantProfileClaims extends DriverManager{
	
		WebDriver driver=DriverManager.driverselection();
		ClaimantProfileClaimsPage ClaimantProfileClaimsScreen=new ClaimantProfileClaimsPage(driver);
			@Then("Navigate to ClaimantProfileClaims and verified that ClaimantProfileClaims Screen is displayed")
			public void navigateReportspage() throws InterruptedException {
				try {
					 //Thread.sleep(5000);

					 ClaimantProfileClaimsScreen.navigateClaimantProfileClaimspage();
					//Thread.sleep(20000);
					ClaimantProfileClaimsScreen.verifiedClaimantProfileClaimspage();
					
				} catch(Exception e) {e.printStackTrace();}
				
			}	
		
}
