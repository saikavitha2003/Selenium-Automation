package com.CMSPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.commonUtilities;

public class IWPage {
	WebDriver driver;
	public IWPage(WebDriver driver) {
	this.driver=driver;	
	}
	By IWpage= By.xpath("//li/div[text()='IW']");
	By IWpageverification= By.xpath("//button/span[contains(text(),'Claim')]");
	By IWSearchDropDown=By.xpath("//span/div[1]/div/span");
	By IWSearchTextBox=By.xpath("//input[@name='iwSearch']");
	By IWSearchValueSelection=By.xpath("//li[1]/ul/li[1]");
	By IWSearchDataTableVerification=By.xpath("//tbody/tr[3]/td[1]/a");
	//By IWDemographicspageverification=By.xpath("//h2[contains(text(),'Create Injured Worker')]");
	By IWClaimantName=By.xpath("//table/tbody/tr[1]/td[1]/a[contains(@href,'demographics')]");
	By IWDemographicspageverification=By.xpath("//h2[contains(text(),'Create Injured Worker')]");
	By IWTransactionHistory=By.xpath("//a[contains(text(),'Transaction History')]");
	By IWTransactionHistorypageverification=By.xpath("//span[contains(text(),'Transaction Type')]");
	By IWClaims=By.xpath("//a[contains(text(),'Claims')]");
	By IWClaimspageverification=By.xpath("//h2[contains(text(),'Claims')]");
	By IWNotesandAttachments= By.xpath("//a[text()='Notes & Attachments']");
	By IWNotesandAttachmentspageverification= By.xpath("//h2[text()='Notes and Attachments']");
	By IWActivityLog= By.xpath("//a[text()='Activity Log']");
	By IWActivityLogpageverification= By.xpath("//h2[text()='Activity Log']");
	By IWClaimnumber= By.xpath("//table/tbody/tr[1]/td[3]/a[contains(@href,'claim-profile')] ");
	By IWClaimDetailspageverification= By.xpath("//h2[text()='Claim Details']");
	By IWClaimTransactionHistory=By.xpath("//a[contains(text(),'Transaction History')]");
	By IWClaimTransactionHistorypageverification=By.xpath("//span[contains(text(),'Transaction Type')]");
	By IWClaimInvoices = By.xpath("//a[contains(text(),'Invoices')]");
	By IWClaimInvoicespageverification = By.xpath("//h2[text()='Invoices List']");
	By IWClaimTasks = By.xpath("//a[contains(text(),'Tasks')]");
	By IWClaimTaskspageverification = By.xpath("//h2[text()='Tasks List']");
	By IWClaimPriorAuthorization = By.xpath("//a[contains(text(),'Prior Authorization')]");
	By IWClaimPriorAuthorizationpageverification = By.xpath("//h2[text()='Prior Authorization']");
	By IWClaimNotesandAttachments= By.xpath("//a[text()='Notes & Attachments']");
	By IWClaimNotesandAttachmentspageverification= By.xpath("//h2[text()='Notes and Attachments']");
	By IWClaimActivityLog= By.xpath("//a[text()='Activity Log']");
	By IWClaimActivityLogpageverification= By.xpath("//h2[text()='Activity Log']");
	By CreateIWProfile= By.xpath("//button/span[contains(text(),'IW Profile')]");
	
	By FirstName= By.xpath("//span/input[@name='firstName']");
	By LastName= By.xpath("//span/input[@name='lastName']");
	By ClientName=By.xpath("//div/div/ul/li[text()='CCMSI ']");
	By ClientNameTextField=By.xpath("//div[1]/div/div/ul/li/div/input");
	
    By Address1= By.xpath("//span/input[@name='location.address1']");
    By City= By.xpath("//span/input[@name='location.city']");
    By statedropDownArrow=By.xpath("//div[3]/div[1]/div/div/div[1]/div/span");
    By stateDropdown= By.xpath("//div/ul/li[contains(text(),'Hawaii')]");
    By Zipcode= By.xpath("//span/input[@name='location.zip']");
    By SSN= By.xpath("//span/input[@name='socialSecurityNumber']");
     By PhoneNumberTextField= By.xpath("//span/input[@name='phone']");
    
    By PrimaryPhoneDropdownArrow= By.xpath("//div[5]/div[1]/div/div/div[1]");
    By PhonenumberOption= By.xpath("//ul/li[text()='Phone']");
    By Savebutton= By.xpath("//button/span[contains(text(),'Save')]");
    
    
    
    
    By DateofBirth = By.xpath("//div[1]/div/div/div[1]/div[1]/div/input");
    
	public void navigateIWpage() throws InterruptedException {
		commonUtilities.waitfortheElement(driver, IWpage);	
		driver.findElement(IWpage).click();
	}
	
public void verifiedIWpage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWpageverification);	
	Assert.assertEquals(true, driver.findElement(IWpageverification).isDisplayed());
}
	
public void IWSearch(String dropDownValue) throws InterruptedException {
	
	By IWSearchDropDownValue=By.xpath("//li[text()='"+dropDownValue+"']");
	commonUtilities.waitfortheElement(driver, IWSearchDropDown);
	
	driver.findElement(IWSearchDropDown).click();
	commonUtilities.waitfortheElement(driver, IWSearchDropDownValue);
	driver.findElement(IWSearchDropDownValue).click();
	commonUtilities.waitfortheElement(driver, IWSearchTextBox);
	driver.findElement(IWSearchTextBox).sendKeys("David");
	commonUtilities.waitfortheElement(driver, IWSearchValueSelection);
	driver.findElement(IWSearchValueSelection).click();
	commonUtilities.waitfortheElement(driver, IWSearchDataTableVerification);
	
	Assert.assertEquals(true,driver.findElement(IWSearchDataTableVerification).getText().toString().toLowerCase().contains("david"));

	
}	
		
//public void IWdemograpicPage() throws InterruptedException {
	//commonUtilities.waitfortheElement(driver, IWDemographicspageverification);
		//Assert.assertEquals(true, driver.findElement(IWDemographicspageverification).isDisplayed());




public void IWclaimantName() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,IWClaimantName);
		Assert.assertEquals(true, driver.findElement(IWClaimantName).isDisplayed());

}

public void IWclaimantNameclick() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,IWClaimantName);
		 driver.findElement(IWClaimantName).click();

}

public void verifiedIWdemograpicsPage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWDemographicspageverification);
		Assert.assertEquals(true, driver.findElement(IWDemographicspageverification).isDisplayed());
}

public void IWTransactionHistoryclick() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,IWTransactionHistory);
		 driver.findElement(IWTransactionHistory).click();

}

public void verifiedIWtransactionHistoryPage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWTransactionHistorypageverification);
		Assert.assertEquals(true, driver.findElement(IWTransactionHistorypageverification).isDisplayed());
}

public void IWClaimsclick() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,IWClaims);
		 driver.findElement(IWClaims).click();

}
public void verifiedIWclaimsPage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWClaimspageverification);
		Assert.assertEquals(true, driver.findElement(IWClaimspageverification).isDisplayed());
}
public void clickonnotesandattachments() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWNotesandAttachments);
	driver.findElement(IWNotesandAttachments).click();

}

public void verifiedNotesandattachmentspage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWNotesandAttachmentspageverification);
	Assert.assertEquals(true, driver.findElement(IWNotesandAttachmentspageverification).isDisplayed());

}

public void clickonactivitylog() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWActivityLog);
	driver.findElement(IWActivityLog).click();

}

public void verifiedActivityLogpage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWActivityLogpageverification);
	Assert.assertEquals(true, driver.findElement(IWActivityLogpageverification).isDisplayed());

}

public void clickonIWclaimnumber() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWClaimnumber);
	driver.findElement(IWClaimnumber).click();

}

public void verifiedIWClaimDetailspage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWClaimDetailspageverification);
	Assert.assertEquals(true, driver.findElement(IWClaimDetailspageverification).isDisplayed());

}
public void IWClaimTransactionHistory() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,IWClaimTransactionHistory);
		 driver.findElement(IWClaimTransactionHistory).click();

}

public void verifiedIWClaimtransactionHistoryPage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWClaimTransactionHistorypageverification);
		Assert.assertEquals(true, driver.findElement(IWClaimTransactionHistorypageverification).isDisplayed());
}
public void IWClaimInvoices() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,IWClaimInvoices);
		 driver.findElement(IWClaimInvoices).click();

}

public void verifiedIWClaimInvoicesPage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWClaimInvoicespageverification);
		Assert.assertEquals(true, driver.findElement(IWClaimInvoicespageverification).isDisplayed());


}
public void IWClaimTasks() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,IWClaimTasks);
		 driver.findElement(IWClaimTasks).click();

}

public void verifiedIWClaimTasksPage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWClaimTaskspageverification);
		Assert.assertEquals(true, driver.findElement(IWClaimTaskspageverification).isDisplayed());



}
public void IWClaimPriorAuthorization() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,IWClaimPriorAuthorization);
		 driver.findElement(IWClaimPriorAuthorization).click();

}

public void verifiedIWClaimPriorAuthorizationPage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWClaimPriorAuthorizationpageverification);
		Assert.assertEquals(true, driver.findElement(IWClaimPriorAuthorizationpageverification).isDisplayed());

}
public void IWClaimNotesandAttachments() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,IWClaimNotesandAttachments);
		 driver.findElement(IWClaimNotesandAttachments).click();

}

public void verifiedIWClaimNotesandAttachmentsPage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWClaimNotesandAttachmentspageverification);
		Assert.assertEquals(true, driver.findElement(IWClaimNotesandAttachmentspageverification).isDisplayed());


}
public void IWClaimActivityLog() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,IWClaimActivityLog);
		 driver.findElement(IWClaimActivityLog).click();

}

public void verifiedIWClaimActivityLogPage() throws InterruptedException {
	commonUtilities.waitfortheElement(driver, IWClaimActivityLogpageverification);
		Assert.assertEquals(true, driver.findElement(IWClaimActivityLogpageverification).isDisplayed());



}
public void createIWprofileClick() throws InterruptedException {
	commonUtilities.waitfortheElement(driver,CreateIWProfile);
		// driver.findElement(CreateIWProfile).click();
	commonUtilities.javaScriptclickonbutton(driver, CreateIWProfile);

}



public void enterFirstName(String firstName) throws InterruptedException {
	commonUtilities.waitfortheElement(driver,FirstName);
	commonUtilities.enterTextboxinputdata(driver, FirstName, firstName);	
}
public void enterLastName(String lastName) throws InterruptedException {
	commonUtilities.waitfortheElement(driver,LastName);
	commonUtilities.enterTextboxinputdata(driver, LastName, lastName);	

}



public void enterAddress1(String address1) throws InterruptedException {
	commonUtilities.waitfortheElement(driver,Address1);
	commonUtilities.enterTextboxinputdata(driver, Address1, address1);	

}

public void enterCity(String city) throws InterruptedException {
	commonUtilities.waitfortheElement(driver,City);
	commonUtilities.enterTextboxinputdata(driver, City, city);	
}


public void enterZipcode(String zipcode) throws InterruptedException {
	commonUtilities.waitfortheElement(driver,Zipcode);
	commonUtilities.enterTextboxinputdata(driver, Zipcode,zipcode);	
}
public void enterSsn(String ssn) throws InterruptedException {
	commonUtilities.waitfortheElement(driver,SSN);
	commonUtilities.enterTextboxinputdata(driver, SSN,ssn);	
}
public void selectPrimaryPhoneDropdown() throws InterruptedException {
    
	commonUtilities.javaScriptclickonRadiobutton(driver, PrimaryPhoneDropdownArrow);
	
	commonUtilities.selectDropdownValue(driver, PhonenumberOption);		
}
public void enterPhone(String phone) throws InterruptedException {
	commonUtilities.waitfortheElement(driver,PhoneNumberTextField);
	commonUtilities.enterTextboxinputdata(driver, PhoneNumberTextField,phone);		
}
public void enterDateofBirth(String dateofbirth) throws InterruptedException {
	commonUtilities.waitfortheElement(driver,DateofBirth);
	commonUtilities.enterTextboxinputdata(driver, DateofBirth,dateofbirth);		
}
public void selecteStateDropdown(String dropdownValue) throws InterruptedException {
    By stateDropdown= By.xpath("//div/ul/li[contains(text(),'"+dropdownValue+"')]");

	//commonUtilities.waitfortheElement(driver,stateDropdown);
	commonUtilities.javaScriptclickonRadiobutton(driver, statedropDownArrow);
	
	commonUtilities.selectDropdownValue(driver, stateDropdown);		
}
public void clickGenderRadioButton(String genderValue) throws InterruptedException {
	By GenderRadiobutton= By.xpath("//span[text()='"+genderValue+"']");
	commonUtilities.waitfortheElement(driver,GenderRadiobutton);
	commonUtilities.javaScriptclickonRadiobutton(driver, GenderRadiobutton);		
}

public void selectClientName(String clientName) throws InterruptedException {
	commonUtilities.enterTextboxinputdata(driver, ClientNameTextField, clientName);	
	commonUtilities.waitfortheElement(driver, ClientName);

	driver.findElement(ClientName).click();

}
public void clickonSaveButton() throws InterruptedException {
	
	commonUtilities.waitfortheElement(driver,Savebutton);
	commonUtilities.javaScriptclickonRadiobutton(driver, Savebutton);		
}
}