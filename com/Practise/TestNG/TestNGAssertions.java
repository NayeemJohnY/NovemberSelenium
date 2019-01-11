package com.Practise.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Practise.Selenium.Utility.BrowserSelection;

public class TestNGAssertions {

	SoftAssert softAssert= new SoftAssert();
	@Test
	public void test1()
	{
		/*WebDriver driver = BrowserSelection.SelectBrowser("chrome");
		Assert.assertTrue(driver!=null);//browser it is not launched hard assert
		driver.manage().window().maximize();
		driver.get("https://www.google.com");*/
		softAssert.assertEquals(false, true,"True is not = false");//soft assert
		String expected="Googled";
		softAssert.assertEquals("Google", expected,"Title mismmatch");//soft Assert title mismatch
		//driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		softAssert.assertAll();
		
	}
	@Test
	public void test2()
	{
		softAssert.assertEquals(false, true,"True is not = false");
		softAssert.assertAll();
	}
}
