package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//p[contains(text(),'Hi')]")
	WebElement Label_Welcome;

	@FindBy(xpath="//li[@class='ant-menu-item']/div[text()='IW']")
	WebElement Tab_IW;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyWelcomeText() {
		return Label_Welcome.isDisplayed();
	}
	
	public void clickIwTab() {
		Tab_IW.click();
	}
}
