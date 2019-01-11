package com.Practise.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.BrowserSelection;

public class ParameterTest {
	
	
	@Test
	@Parameters({"url", "email","browser"})
	public void pareameterTest(String url, String email, String browser)
	{
		WebDriver driver = BrowserSelection.SelectBrowser(browser);
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@name='signin']")).click();
	}

	

}
