package com.Practise.Selenium.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.BrowserSelection;
import com.Practise.Selenium.Utility.JavaScriptExeFunction;

public class JavaScriptUsage {
	@Test
	 void Test()
	{
		WebDriver driver=BrowserSelection.SelectBrowser("chrome");
		
		JavaScriptExeFunction.LaunchURL(driver, "https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//*[@id='email']"));
		JavaScriptExeFunction.highlightElement(driver,element );
		JavascriptExecutor js=JavaScriptExeFunction.typeKeysJS(driver, element,"Nayeem");
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//*[@title='Show more languages']")));
	}

}
