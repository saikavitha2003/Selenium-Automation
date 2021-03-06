package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CMSPages.ProviderPharmacyPage;
import com.CMSPages.ReportingRXHistoryReportPage;

import io.cucumber.java.en.Then;

public class ReportingRxHistory extends DriverManager{
	WebDriver driver = DriverManager.driverselection();
	ReportingRXHistoryReportPage RxHistoryScreen = new ReportingRXHistoryReportPage(driver);
		@Then("Navigate to Reporting RXHistory Screen and verified that Rx Histort Report Screen is displayed")
		public void generateRXHistoryReport() throws InterruptedException {
			try {
				 //Thread.sleep(5000);
				 RxHistoryScreen.navigateReportingpage();
				 RxHistoryScreen.navigateRXHistoryReportpage();
				 //Thread.sleep(5000);
				 RxHistoryScreen.rxHistoryreportPageverification();
				 //Thread.sleep(5000);

				 RxHistoryScreen.rxHistoryRunReport();
				 Thread.sleep(5000);
			} catch(Exception e) {e.printStackTrace();}
			
		}

	
	
	
	
	
}
