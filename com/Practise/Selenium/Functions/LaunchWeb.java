package com.Practise.Selenium.Functions;



import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.BrowserSelection;

public class LaunchWeb {
	WebDriver driver;
	String url;
	String expectedTilte;
	
	@BeforeMethod
	public void beforeStart()
	{
		 driver=null;
		  url="https://www.google.com";
		  expectedTilte="Google";
	}	
	@Test
	public  void lauchChromeJS() {
		
		
		driver=BrowserSelection.SelectBrowser("chrome");
		driver.navigate().to(url);
		Assert.assertEquals(driver.getTitle(), expectedTilte,"Title mismatch");
		driver.quit();
		
		
	}
	@Test
	public void launchfirefox()
	{
		 driver=BrowserSelection.SelectBrowser("firefox");
			driver.navigate().to(url);
			Assert.assertEquals(driver.getTitle(), expectedTilte,"Title mismatch");
			driver.quit();
	}
	@Test
	public void launchIE()
	{
		 driver=BrowserSelection.SelectBrowser("ie");
			driver.navigate().to(url);
			Assert.assertEquals(driver.getTitle(), expectedTilte,"Title mismatch");
			driver.quit();
	}
	
	
	
}
