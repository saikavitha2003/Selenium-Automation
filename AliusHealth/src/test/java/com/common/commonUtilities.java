package com.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonUtilities {
	WebDriver driver;
	public commonUtilities(WebDriver driver) {
	this.driver=driver;	
	}
	public static void waitfortheElement(WebDriver driver, By locator) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,120);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public static void waitForPageLoad(WebDriver driver) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
//Thread.sleep(2000);
	    wait.until(new ExpectedCondition<Boolean>() {
	        public Boolean apply(WebDriver wdriver) {
	            return ((JavascriptExecutor) driver).executeScript(
	                "return document.readyState"
	            ).equals("complete");
	        }
	    });
	}
	
	public static void javaScriptclickonbutton(WebDriver driver, By locator) throws InterruptedException {
		
		
		WebElement element = driver.findElement(locator);
		

JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", element);


	}
	
public static void javaScriptclickonRadiobutton(WebDriver driver, By locator) throws InterruptedException {
		
		
		WebElement element = driver.findElement(locator);
		

JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", element);


	}
	
	public static void enterTextboxinputdata(WebDriver driver, By locator,String textdata) {
		//driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(textdata);
		driver.findElement(locator).sendKeys(Keys.ENTER);
	}
	public static void selectDropdownValue(WebDriver driver, By locator) {
		
		driver.findElement(locator).click();
		
		//Select dropdownSelect = new Select(driver.findElement(locator));
		//dropdownSelect.selectByVisibleText(dropdownValue);
	}
	
}

