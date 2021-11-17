package TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HtmlBasePage extends testBase {
	
	protected WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public void enterText(WebElement ele, String txt) {
		ele.clear();
		ele.sendKeys(txt);
	}
	
	public void clickButton(WebElement ele) {
		ele.click();
	}

}
