package com.Practise.Selenium.Functions;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.HelperSelenium;

public class HeadlessBrowser {
	WebDriver driver=null;
	//@Test
	public void htmlUniDriver() throws Exception {
		
		 driver= new HtmlUnitDriver();
		Date date= new Date();
		System.out.println(date);
		driver.get("https://www.facebook.com");
		System.out.println("Title " +driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8015110219");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Nayeem94");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		System.out.println("Title " +driver.getTitle());
		HelperSelenium.captureScreenshot(driver,"htmlUniDriver" );
		Date date1= new Date();
		System.out.println(date1);
		driver.quit();
		
		
	}
	//@Test
	public void chromeHeadless() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("headless");
		 driver= new ChromeDriver(option);
		Date date= new Date();
		System.out.println(date);
		driver.get("https://www.facebook.com");
		System.out.println("Title "+driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8015110219");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Nayeem94");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		System.out.println("Title "+driver.getTitle());
		HelperSelenium.captureScreenshot(driver,"chromeHeadless" );
		Date date1= new Date();
		System.out.println(date1);
		driver.quit();
		
	}
	//@Test
	public void firefoxHeadless() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", ".\\lib\\geckodriver-v0.21.0-win32\\geckodriver.exe");
		FirefoxOptions option= new FirefoxOptions();
		option.addArguments("--headless");
		 driver= new FirefoxDriver(option);
		Date date= new Date();
		System.out.println(date);
		driver.get("https://www.facebook.com");
		System.out.println("Title " +driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("8015110219");
		driver.findElement(By.id("pass")).sendKeys("Nayeem94");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Title "+driver.getTitle());
		HelperSelenium.captureScreenshot(driver,"FiefoxHeadless" );
		Date date1= new Date();
		System.out.println(date1);
		driver.quit();
		
	}
	//@Test
	/*public void phantomJS() {
		File file= new File(".\\lib\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		driver= new PhantomJSDriver();
		Date date= new Date();
		System.out.println(date);
		driver.get("https://www.facebook.com");
		System.out.println("Title "+driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("8015110219");
		driver.findElement(By.id("pass")).sendKeys("Nayeem94");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Title " +driver.getTitle());
		Date date1= new Date();
		System.out.println(date1);
		driver.quit();
		
	}*/
	
	
}
