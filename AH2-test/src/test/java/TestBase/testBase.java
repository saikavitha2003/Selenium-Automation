package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {

    public static WebDriver driver;
    public static Properties prop;

    public testBase(){
        loadProperties();
    }

    public WebDriver selectBrowser() {
    	if(prop.getProperty("Browser").equalsIgnoreCase("Chrome")) {
    		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();	
    	}
        
        return driver;
    }

    public void loadProperties(){
        String filePath = System.getProperty("user.dir") + "/src/test/java/Config/Config.properties";
        prop = new Properties();
        try{
            prop.load(new FileInputStream(filePath));
        }catch (FileNotFoundException f){
            f.printStackTrace();
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
