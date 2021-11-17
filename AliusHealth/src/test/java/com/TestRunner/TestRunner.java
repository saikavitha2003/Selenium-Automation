package com.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.stepdefs"}, 
        plugin = { "pretty", "html:target/TestExecutionReports.html" },
        		monochrome = true
        		

        ,tags =  "@unittest" 
        
        
)

public class TestRunner { }
