package com.CMSPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class TaskingPage {
	WebDriver driver;
	public TaskingPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By Taskingpage= By.xpath("//li/div[text()='Tasking']");
	By Taskingpageverification= By.xpath("//button/span[contains(text(),'Create')]");
	By TaskingTaskID=By.xpath("//table/tbody/tr[1]/td[2]/div[contains(@role,'presentation')]");
	By TaskingTaskDetailsscreenverification=By.xpath("//div[text()='Task Details']");
	By TaskingTaskDemographicsscreenverification=By.xpath("//div[text()='Task Demographics']");
	By TaskingNotesandAttachments=By.xpath("//div[text()='Notes and Attachments']");
	By TaskingNotesandAttachmentsscreenverification=By.xpath("//h2[text()='Notes and Attachments']");
	By TaskingActivityLog=By.xpath("//div[text()='Activity Log']");
	By TaskingActivityLogscreenverification=By.xpath("//span[text()='User']");
	By TaskingTaskDemographicsscreen =By.xpath("//div[text()='Task Demographics']");
	By TaskingTaskDemographicswindowverification =By.xpath("//div[text()='Task Demographics']");
	By TaskingTaskDetailsCancelbutton=By.xpath("//button/span[contains(text(),'Cancel')]");

	
	
	By TaskingClaimantName=By.xpath("//table/tbody/tr[1]//a");
	By TaskingDemographicspageverification=By.xpath("//h2[contains(text(),'Create Injured Worker')]");
	public void navigateTaskingpage() throws InterruptedException {
		 	
		driver.findElement(Taskingpage).click();
	}
	public void verifiedTaskingpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, Taskingpageverification);	
		Assert.assertEquals(true, driver.findElement(Taskingpageverification).isDisplayed());
	}
	
	public void TaskingclaimantName() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,TaskingClaimantName);
			Assert.assertEquals(true, driver.findElement(TaskingClaimantName).isDisplayed());

	}

	public void TaskingclaimantNameclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver,TaskingClaimantName);
			 driver.findElement(TaskingClaimantName).click();

	}

	public void verifiedTaskingdemograpicsPage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingDemographicspageverification);
			Assert.assertEquals(true, driver.findElement(TaskingDemographicspageverification).isDisplayed());
	}


	public void TaskingtaskIDclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingTaskID);
		driver.findElement(TaskingTaskID).click();
	}
	public void verifiedTaskingTaskDemographicsscreen() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingTaskDemographicsscreenverification);
			Assert.assertEquals(true, driver.findElement(TaskingTaskDemographicsscreenverification).isDisplayed());
			
	}

	
	public void verifiedTaskingTaskDetailsscreen() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingTaskDetailsscreenverification);
			Assert.assertEquals(true, driver.findElement(TaskingTaskDetailsscreenverification).isDisplayed());
}
	public void TaskingnotesandAttachmentsclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingNotesandAttachments);
		driver.findElement(TaskingNotesandAttachments).click();
	}	
	

	public void verifiedTaskingNotesandAttachmentsscreen() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingNotesandAttachmentsscreenverification);
			Assert.assertEquals(true, driver.findElement(TaskingNotesandAttachmentsscreenverification).isDisplayed());
	
	
	
	}
	public void TaskingactivityLogclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingActivityLog);
		driver.findElement(TaskingActivityLog).click();
	}	
	
	

	public void verifiedTaskingactivityLogscreen() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingActivityLogscreenverification);
			Assert.assertEquals(true, driver.findElement(TaskingActivityLogscreenverification).isDisplayed());
	
	
	
	}
	public void TaskingTaskDemographicsscreenclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingTaskDemographicsscreen);
		driver.findElement(TaskingTaskDemographicsscreen).click();
	}	
	public void verifiedTaskingTaskDemographicswindow() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingTaskDemographicswindowverification);
			Assert.assertEquals(true, driver.findElement(TaskingTaskDemographicswindowverification).isDisplayed());
	}
	public void TaskingTaskDetailsCancelbuttonclick() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, TaskingTaskDetailsCancelbutton);
		commonUtilities.javaScriptclickonbutton(driver, TaskingTaskDetailsCancelbutton);
	}
	
	
}