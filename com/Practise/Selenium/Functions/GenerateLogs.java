package com.Practise.Selenium.Functions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.BrowserSelection;

public class GenerateLogs {

	/*public static void main(String[] args) {
		
		Logger log=Logger.getLogger(GenerateLogs.class);
		WebDriver driver=driver = BrowserSelection.SelectBrowser("chrome");
		log.info("Launching Browser");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		log.info("Google page launched");
		log.info("Page Title"+driver.getTitle());
	
	}*/
	WebDriver driver;
	Logger log= Logger.getLogger(GenerateLogs.class);
	
	@BeforeTest
	public void launch()
	{
		driver=BrowserSelection.SelectBrowser("chrome");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		log.info("Browser launched");
	}
	@Test
	public void verifyGoogleTitle()
	{
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
		log.info("Title is Verified"+driver.getTitle());
	}
	@Test(dependsOnMethods="verifyGoogleTitle")
	public void verifySignInOption()
	{ log.info("*******************************");
		boolean bool=driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		Assert.assertTrue(bool);
		log.warn("This is warining");
		log.error("This is error");
		log.debug("Debug");
		log.fatal("fatal");
	}
}
