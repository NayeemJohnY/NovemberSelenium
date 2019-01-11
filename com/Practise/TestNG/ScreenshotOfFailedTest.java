package com.Practise.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.BrowserSelection;
import com.Practise.Selenium.Utility.CustomListener;
@Listeners(CustomListener.class)
public class ScreenshotOfFailedTest {
	public WebDriver driver;
	@BeforeMethod()
	public void setup()
	
	{
		driver = BrowserSelection.SelectBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@Test(testName="GoogleFailedCase")
	public void takescreenshotTest()
	{
		Assert.assertEquals(driver.getTitle(), "Googled");
	}
	
	@Test(testName="GooglePassedCase")
	public void test2()
	{
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
