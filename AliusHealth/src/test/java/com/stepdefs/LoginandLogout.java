package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.AliusHealth.DriverManager;
import com.CMSPages.LoginandLogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginandLogout extends DriverManager{
	
	
	WebDriver driver=DriverManager.driverselection();
	
	@Given("user is able to log in to the application")
	public void user_is_able_to_log_in_to_the_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		LoginandLogoutPage homePage=new LoginandLogoutPage(driver);
		homePage.login(DriverManager.configload().getProperty("url"),DriverManager.configload().getProperty("username"),DriverManager.configload().getProperty("password"));
		
		
	}

	@Then("verified Dashboard page is displayed")
	public void dashboard_should_be_displayed() throws InterruptedException {
		LoginandLogoutPage homePage=new LoginandLogoutPage(driver);
		homePage.dashboardpageverification();
		//driver.get("https://alius-ui-qa.services.aliuscloud.net/login");
	}
	
	@Given("User is able to logout the application and verified user is on login page")
	public void user_is_able_to_log_out_to_the_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		LoginandLogoutPage homePage=new LoginandLogoutPage(driver);
		homePage.logoutbuttonclick();
		homePage.logoutpageverification();
	
	}
	

}


