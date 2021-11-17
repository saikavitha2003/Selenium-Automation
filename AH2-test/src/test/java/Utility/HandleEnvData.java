package Utility;

import TestBase.testBase;

import java.util.Locale;
import java.util.Properties;

public class HandleEnvData extends testBase {

    Properties prop;

    public String getAppUrl(String env){
        String ret = "";
        switch(env.toUpperCase()){
            case "QA":
                ret = "https://alius-ui-qa.services.aliuscloud.net/login";
                break;
            case "UAT":
                ret = "https://alius-ui-uat.services.aliuscloud.net/login";
                break;
            case "PROD":
                ret = "https://claims.aliushealth.com/login";
                break;
        }
        return ret;
    }

    public String getUsername(String env){
        String ret = "";
        switch(env.toUpperCase()){
            case "QA":
                ret = "";
                break;
            case "UAT":
                ret = "asfsndf";
                break;
            case "PROD":
                ret = "ashf";
        }
        return ret;
    }

    public String getPwd(String env){
        String ret = "";
        switch(env.toUpperCase()){
            case "QA":
                ret = "";
                break;
            case "UAT":
                ret = "kjhaskjfj";
                break;
            case "PROD":
                ret = "kjgjkkkjlk";
                break;
        }
        return ret;
    }
}
