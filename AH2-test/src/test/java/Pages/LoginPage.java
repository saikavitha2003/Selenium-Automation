package Pages;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.HtmlBasePage;
import TestBase.testBase;

public class LoginPage{

	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement TextBox_Username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement TextBox_Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Button_Login;
	
	@FindBy(xpath="//div[contains(text(),'Login Error')]")
	WebElement Label_LoginFailureMessage;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void verifyLoginFailMessage() {
		try {
			Label_LoginFailureMessage.isDisplayed();
		}catch(ElementNotVisibleException nv) {
			nv.printStackTrace();
		}
	}
	
	public void enterUsername(String username) {
		TextBox_Username.sendKeys(username);
	}
	
	
	public void enterPassword(String pwd) {
		TextBox_Password.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		Button_Login.click();
	}
	
}
