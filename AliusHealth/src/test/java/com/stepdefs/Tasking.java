package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CMSPages.TaskingPage;

import io.cucumber.java.en.Then;

public class Tasking extends DriverManager {
	WebDriver driver = DriverManager.driverselection();
	TaskingPage taskingScreen = new TaskingPage(driver);

	@Then("Navigate to Tasking Screen and verified that Tasking Screen is displayed")
	public void navigateTaskingPage() throws InterruptedException {

		try {
			//Thread.sleep(20000);
			taskingScreen.navigateTaskingpage();
			//Thread.sleep(20000);
			taskingScreen.verifiedTaskingpage();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Then("verified that Tasking Screen is displayed")
	public void verifyTaskingPage() throws InterruptedException {

		try {
			//Thread.sleep(20000);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Then("Click on TaskingClaimant Name and verified that TaskingDemographics Screen is displayed")
	public void IWClaimantName() throws InterruptedException {
		try {
			taskingScreen.TaskingclaimantName();
			System.out.println("------0");
			taskingScreen.TaskingclaimantNameclick();
			System.out.println("------1");
			taskingScreen.verifiedTaskingdemograpicsPage();
		
		} catch(Exception e) {e.printStackTrace();}
	
	
	}
	@Then("Verify the Tasking Task Details Screen by clicking on TaskID")
	public void verifyTaskingTaskDeatilsPage() throws InterruptedException {

		try {
			taskingScreen.TaskingtaskIDclick();
			taskingScreen.verifiedTaskingTaskDetailsscreen();
			taskingScreen.verifiedTaskingTaskDemographicsscreen();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
	@Then("Click on Notes and Attachments verified that Tasking Notes and Attachments Screen is displayed")
	public void verifyTaskingNotesandAttachments() throws InterruptedException {

		try {
			taskingScreen.TaskingnotesandAttachmentsclick();
			taskingScreen.verifiedTaskingNotesandAttachmentsscreen();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	
 }	
	
	@Then("Click on Activity Log verified that Activity Log Screen is displayed")
	public void verifyActivityLog () throws InterruptedException {

		try {
			taskingScreen.TaskingactivityLogclick();
			taskingScreen.verifiedTaskingactivityLogscreen();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	
 }	
	@Then("Click on Task Demographics verified that Task Demographics Screen is displayed")
	public void verifyTaskingTaskDemographicsscreen () throws InterruptedException {

		try {
			taskingScreen.TaskingTaskDemographicsscreenclick();
			taskingScreen.verifiedTaskingTaskDemographicswindow();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	@Then("Click on Cancel button verified that Tasking Screen is displayed")
	public void verifyTaskingScreen() throws InterruptedException {

		try {
			Thread.sleep(20000);
			taskingScreen.TaskingTaskDetailsCancelbuttonclick();
			taskingScreen.verifiedTaskingpage();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	
 }	
}
