package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CWPPages.AlertsPage;
import com.CWPPages.Reportpage;

import io.cucumber.java.en.Then;

public class Report extends DriverManager{

	WebDriver driver=DriverManager.driverselection();
	Reportpage reportScreen=new Reportpage(driver);
		@Then("Navigate to Report Screen and verified that Report Screen is displayed")
		public void navigateReportspage() throws InterruptedException {
			try {
				 //Thread.sleep(5000);

				 reportScreen.navigateReportpage();
				//Thread.sleep(20000);
				reportScreen.verifiedReportpage();
				
			} catch(Exception e) {e.printStackTrace();}
			
		}	
	
	
}
