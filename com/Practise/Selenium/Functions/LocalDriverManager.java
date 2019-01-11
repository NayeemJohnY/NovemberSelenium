package com.Practise.Selenium.Functions;

import org.openqa.selenium.WebDriver;

import com.Practise.Selenium.Utility.BrowserSelection;

public class LocalDriverManager {
   
 
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
    
    public static WebDriver getDriver() {
        return webDriver.get();
    }
 
    static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }
}
