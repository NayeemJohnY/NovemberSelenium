package com.Practise.Selenium.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExeFunction {
	public static JavascriptExecutor js;
	 
	public  static void LaunchURL(WebDriver driver, String url)
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("window.location='"+url+"';");
		
		
	}
	public static JavascriptExecutor typeKeysJS(WebDriver driver ,WebElement element,String sendValue)
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+sendValue+"';",element);
		return js;
	}

	public static void highlightElement(WebDriver driver, WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				element);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px white;');",
				element);
	}
	public static void selectDatebyJS(WebDriver driver, WebElement element,String date)
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+date+"');",element);
	}

}
