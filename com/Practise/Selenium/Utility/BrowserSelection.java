package com.Practise.Selenium.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelection {
	 
	  public static WebDriver driver;
	

	public static WebDriver SelectBrowser(String browserName)
	{
	

		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\lib\\geckodriver-v0.21.0-win32\\geckodriver.exe");
			 driver= new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", ".\\lib\\IEDriverServer_Win32_3.13.0\\IEDriverServer.exe");
			 driver= new InternetExplorerDriver();
			
		}
		else
			System.out.println("match not found");
	
		driver.manage().window().maximize();
		return driver;
		
	
}
}

