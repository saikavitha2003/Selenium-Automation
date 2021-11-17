package com.AliusHealth;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
public static WebDriver driver;
public static Properties prop;
public static WebDriver driverselection() {
	if(driver==null) {
		
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/drivers/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
		
		
	
	}
	
	
	return driver;
	
	
	
}


public static Properties configload() {
	
	//String setup=System.getProperty("Env");
	String setup="QA";
	if (setup.equalsIgnoreCase("QA")) {
    String filePath = System.getProperty("user.dir") + "/src/test/resources/config/configQA.properties";
    prop=new Properties();
	
	try {
	prop.load(new FileInputStream(filePath));
	
	}catch(Exception e) {
		System.out.println("...*config file not found...*"+e);
		
		
	}
	}
	else if(setup.equalsIgnoreCase("PROD")){
		String filePath = System.getProperty("user.dir") + "/src/test/resources/config/configPROD.properties";
	    prop=new Properties();
		
		try {
		prop.load(new FileInputStream(filePath));
		
		}catch(Exception e) {
			System.out.println("...*config file not found...*"+e);
			
			
		}
	}
	
	else if(setup.equalsIgnoreCase("UAT")){
		String filePath = System.getProperty("user.dir") + "/src/test/resources/config/configUAT.properties";
	    prop=new Properties();
		
		try {
		prop.load(new FileInputStream(filePath));
		
		}catch(Exception e) {
			System.out.println("...*config file not found...*"+e);
			
			
		}
	}
	else if(setup.equalsIgnoreCase("DEV")){
		String filePath = System.getProperty("user.dir") + "/src/test/resources/config/configDEV.properties";
	    prop=new Properties();
		
		try {
		prop.load(new FileInputStream(filePath));
		
		}catch(Exception e) {
			System.out.println("...*config file not found...*"+e);
			
			
		}
	}
	return prop;
}
}
