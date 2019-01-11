package com.Practise.Selenium.Grid;

import java.net.URL;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;


public class SeleniumGridPractise {

	
	
	/*//@Test
	public void OpenFacebook() throws Exception
	
	public static final String USERNAME = "nayeemjohn1";
	  public static final String AUTOMATE_KEY = "4HeKLEgcsmqeq75JTaCp";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
RemoteWebDriver rmtedriver;
String hubUrl = "http://localhost:8888/wd/hub";
	RemoteWebDriver rmtedriver;
	String nodeurl="https://192.168.31.1:46435";
	{  System.out.println("Before Test");
		//.setProperty("webdriver.gecko.driver", ".\\lib\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		DesiredCapabilities caps=DesiredCapabilities.chrome();
		//caps.setPlatform(Platform.WINDOWS);
		
		rmtedriver = new RemoteWebDriver(new URL(nodeurl), caps);
		rmtedriver.get("http://www.facebook.com");
		rmtedriver.manage().window().maximize();
		rmtedriver.getTitle();
		Thread.sleep(10000);
		rmtedriver.quit();
	}*/

	@Test
	public void LaunchPage() throws Exception
	
	{
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setBrowserName("firefox");
		/*ChromeOptions options= new ChromeOptions();*/
		FirefoxOptions options= new FirefoxOptions();
		options.merge(caps);
		String url="http://192.168.31.1:4444/wd/hub";
		RemoteWebDriver driver= new RemoteWebDriver(new URL(url), options);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
	}
}
