package com.Practise.Selenium.Functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Practise.Selenium.Utility.BrowserSelection;

public class ReadProperties {

	public static void main(String[] args) throws Exception {
		
	Properties prop= new Properties();
	FileInputStream inStream=new FileInputStream(".\\src\\com\\Practise\\Selenium\\Functions\\config.properties");
	prop.load(inStream);
	String browser=prop.getProperty("browser");
	WebDriver driver=BrowserSelection.SelectBrowser(browser);
	driver.get(prop.getProperty("url"));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	/*prop.setProperty("browser", "firefox");
	FileOutputStream out= new FileOutputStream(".\\src\\com\\Practise\\Selenium\\Functions\\config.properties");
	prop.store(out,"This is Lgesh");*/
	}
}
