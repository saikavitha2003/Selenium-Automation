package StepDefinition;

import TestBase.HtmlBasePage;
import TestBase.testBase;

import Utility.HandleEnvData;
import io.cucumber.core.backend.TestCaseState;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Field;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import Pages.LoginPage;

public class CommonSteps extends testBase {

    HandleEnvData hd = new HandleEnvData();
    
    public HtmlBasePage page;
    
    @Then("Wait for \\\"([^\\\"]*)\\\" seconds$")
    public void hardCodeWait(String data) {
    	try {
			Thread.sleep(Integer.parseInt(data)*1000);
		} catch (NumberFormatException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   
    @Given("Navigate to URL \"([^\"]*)\"$")
    public void navigate_to_url(String data) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(hd.getAppUrl(data));
    }
    
    @Then("Click on button \"([^\"]*)\"$")
    public void clickButton(WebElement btnEle) {
        // Write code here that turns the phrase above into concrete actions
        btnEle.click();
    }
    
    @Then("Enter text value \\\"([^\\\"]*)\\\" in textbox \\\"([^\\\"]*)\\\"$")
    public void enterValueInTextBox(String value, String ele) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        // Write code here that turns the phrase above into concrete actions
        page.enterText(getElement(ele), value);
    }

    public WebElement getElement(String eleName) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
    	Field field = page.getClass().getDeclaredField(eleName);
    	field.setAccessible(true);
    	return (WebElement) field.get(page);
    }
    
    @When("Browser title displayed as \"([^\"]*)\"$")
    public void browser_title_should_be_displayed_as(String data) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(driver.getTitle(), data);
        System.out.println("Title is displayed as : " + driver.getTitle());
    }

    @AfterStep(value = "@website")
    public void afterSite() {
        System.out.println("AFTER SITE");

        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        TestCaseState scenario = null;
        scenario.log("this is my failure message……….");
        scenario.attach(screenshot, "image/png", "");
        driver.quit();
    }
}
