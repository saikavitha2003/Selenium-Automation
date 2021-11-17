package StepDefinition;

import TestBase.testBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Hooks {

    WebDriver driver;

    @Before
    /*public void Initialize() {
        testBase tb = new testBase();
        if (testBase.prop.get("Browser").toString().equalsIgnoreCase("chrome")) {
            driver = tb.selectBrowser("chrome");
        } else if (testBase.prop.get("Browser").toString().equalsIgnoreCase("firefox")) {
            driver = tb.selectBrowser("firefox");
        }

    }*/

    @After
    public void TearDown(Scenario scenario) {
        byte src[] = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(src, "image/png", "");
        //driver.close();
    }
}
