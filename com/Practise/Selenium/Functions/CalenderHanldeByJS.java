package com.Practise.Selenium.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Practise.Selenium.Utility.BrowserSelection;
import com.Practise.Selenium.Utility.JavaScriptExeFunction;

public class CalenderHanldeByJS {

	public static void main(String[] args) {
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");

		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		WebElement dateElement=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String date="26/12";
		JavaScriptExeFunction.selectDatebyJS(driver, dateElement, date);
	}

}
