package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IWPage {
	WebDriver driver;
	
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-default'])[1]")
	WebElement Link_CreateNewProfile;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement TextBox_FirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement TextBox_LastName;
	
	@FindBy(xpath="//input[@class='ant-select-search__field']")
	WebElement TextBox_ClientName;
	
	@FindBy(xpath="//input[@name='location.address1']")
	WebElement TextBox_Address1;
	
	@FindBy(xpath="//input[@name='location.city']")
	WebElement TextBox_City;
	
	@FindBy(xpath="(//div[contains(@class,'select-dropdown')])[1]")
	WebElement List_State;
	
	@FindBy(xpath="(//div[@role='combobox'])[2]")
	WebElement DropDown_State;
	
	@FindBy(xpath="(//div[contains(@class,'select-dropdown')])[2]")
	WebElement List_Country;
	
	@FindBy(xpath="(//div[contains(@class,'ant-select-selection__rendered')])[3]")
	WebElement DropDown_Country;
	
	@FindBy(xpath="//input[@name='location.zip']")
	WebElement TextBox_Zip;
	
	@FindBy(xpath="//input[@name='socialSecurityNumber']")
	WebElement TextBox_SSN;
	
	@FindBy(xpath="(//div[contains(@class,'select-dropdown')])[3]")
	WebElement List_PrimaryPhone;
	
	@FindBy(xpath="(//div[contains(@class,'ant-select-selection__rendered')])[4]")
	WebElement DropDown_PrimaryPhone;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement TextBox_Phone;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	WebElement Radio_GenderMale;
	
	@FindBy(xpath="(//input[@type='radio'])[4]")
	WebElement Radio_GenderFemale;
	
	@FindBy(xpath="(//div[contains(@class,'react-datepicker__i')])[1]/input")
	WebElement TextBox_DateOfBirth;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Button_Save;
	
	@FindBy(xpath="//button/span[text()='Edit']")
	WebElement Button_Edit;
	
	public IWPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreateNewIwProfile() {
		Link_CreateNewProfile.click();
	}
	
	public void enterDetailsInCreateIwProfile(String firstName, String lastName, String clientName, 
			String address1, String ssn, String zip, String dob, 
			String city, String state, String phoneType ,String phoneNumber) throws InterruptedException {
		TextBox_FirstName.sendKeys(firstName);
		TextBox_LastName.sendKeys(lastName);
		TextBox_ClientName.sendKeys(clientName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='"+ clientName +" ']")).click();
		TextBox_Address1.sendKeys(address1);
		TextBox_SSN.sendKeys(ssn);
		TextBox_Zip.sendKeys(zip);
		TextBox_DateOfBirth.sendKeys(dob + Keys.TAB);
		TextBox_City.sendKeys(city);
		
		//Select State
		selectState(state);
		
		//Select Country
		
		//Select Phone
		selectPhone(phoneType);
		
		TextBox_Phone.sendKeys(phoneNumber);
		
		//Select Gender
		Radio_GenderMale.click();
		
		//Click Save
		Button_Save.click();
	}
	
	public boolean verifyIwProfileCreated() throws InterruptedException {
		Thread.sleep(2000);
		return Button_Edit.isDisplayed();
	}
	
	public void selectState(String stateName) throws InterruptedException {
		DropDown_State.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='"+ stateName +"']")).click();
		
	}
	
	public void selectPhone(String PhoneType) throws InterruptedException {
		DropDown_PrimaryPhone.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='"+ PhoneType +"']")).click();
	}

}
