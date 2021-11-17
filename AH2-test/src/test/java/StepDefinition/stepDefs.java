package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.IWPage;
import Pages.LoginPage;
import TestBase.testBase;
import io.cucumber.java.en.Then;

public class stepDefs extends testBase{
	
	
	LoginPage lp;
	HomePage hp;
	IWPage ip;
	
	@Then("Enter \\\"([^\\\"]*)\\\" in username textbox$")
	public void enter_text_value_test_in_text_box_username(String txt) throws InterruptedException {
		lp = new LoginPage(driver);
    	// Write code here that turns the phrase above into concrete actions
    	lp.enterUsername(txt);
	}
	
	@Then("Enter \\\"([^\\\"]*)\\\" in password textbox$")
	public void enter_text_value_test_in_text_box_password(String txt) throws InterruptedException {
		lp = new LoginPage(driver);
    	// Write code here that turns the phrase above into concrete actions
    	lp.enterPassword(txt);
	}
	
	@Then("Click Login Button$")
	public void click_Login_Button() throws InterruptedException {
		lp = new LoginPage(driver);
    	// Write code here that turns the phrase above into concrete actions
    	lp.clickLoginButton();
	}
	
	@Then("Verify Homepage$")
	public void verifyHomePage() {
		hp = new HomePage(driver);
		hp.verifyWelcomeText();
	}
	
	@Then("Verify Login Failure Message$")
	public void verifyLoginFailMessage() {
		lp.verifyLoginFailMessage();
	}

	@Then("Navigate to IW screen$")
	public void navigate_to_screen() {
	    hp.clickIwTab();
	}

	@Then("Click Create IW Profile$")
	public void navigate_to() {
	    ip = new IWPage(driver);
	    ip.clickCreateNewIwProfile();
	}
	
	@Then("Enter Mandatory Fields to create IW Profile$")
	public void enter_in_firstname_textbox() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    ip = new IWPage(driver);
	    ip.enterDetailsInCreateIwProfile("Penny", "Eigster", "CCMSI", 
	    		"7932 Wingate Dr", "522789965", "20769", "01-17-1983", "Glendale","Arizona" ,"Phone", "4637418965");
	}
	
	@Then("Verify IW has been saved successfully updated message is displayed$")
	public void enter_in_lastname_textbox() throws InterruptedException {
	   ip.verifyIwProfileCreated();
	}
	
	
	@Then("Enter {string} in clientname dropdown")
	public void enter_in_clientname_dropdown(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter {string} in Address1 textbox")
	public void enter_in_address1_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter {string} in city textbox")
	public void enter_in_city_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter {string} in state textbox")
	public void enter_in_state_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter {string} in Zipcode textbox")
	public void enter_in_zipcode_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter {string} in SSN textbox")
	public void enter_in_ssn_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("select  {string} in PrimaryPhone dropdown")
	public void select_in_primary_phone_dropdown(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter {string} in Phone textbox")
	public void enter_in_phone_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Select {string} in Gender radio button")
	public void select_in_gender_radio_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click {string} button")
	public void click_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify IW has been saved successfully updated message is displayed")
	public void verify_iw_has_been_saved_successfully_updated_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}

