package com.Practise.Selenium.Functions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.BrowserSelection;


public class ParallelTest {
	
private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
    
    public static WebDriver getDriver() {
        return webDriver.get();
    }
 
    static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }
	
	@BeforeMethod
	public void browserSetup()
	{
		
		setWebDriver(BrowserSelection.SelectBrowser("chrome"));	
		
	}
	@Test(dataProvider="Websites")
	public void launchUrl(String url)
	{
		getDriver().get(url);
	}
	@AfterMethod
	public  void teardown()
	{
		getDriver().quit();
	}
	
	@DataProvider(name="Websites",parallel=true)
	public Object[] urldata()
	{
		Object[] data= new Object[3];
		data[0]="https://www.facebook.com";
		data[1]="https://www.google.com";
		data[2]="https://www.freecrm.com";
		return data;
	}
	

}
