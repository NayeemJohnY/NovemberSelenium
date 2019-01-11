package com.Practise.Selenium.Functions;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.BrowserSelection;
import com.Practise.Selenium.Utility.getDataFromExcel;

public class FacebookDataProvider {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{ 	driver=BrowserSelection.SelectBrowser("chrome");
		driver.get("https://www.facebook.com");
		
	}
	
	@Test(dataProvider="RegisterData")
	public void facebookDataTest(String firstname,String surname,String email, String password,String gender,String dob)
	{
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(surname);
		driver.findElement(new ByAll(By.name("reg_email__"),By.id("u_0_s"))).sendKeys(email);
		driver.findElement(By.xpath("//*[@type='password'][@id!='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//label[text()='"+gender+"']")).click();
		Select selday=new Select(driver.findElement(By.id("day")));
		selday.selectByVisibleText("15");
	}
	
	@DataProvider(name="RegisterData", parallel=true)
	public Iterator<Object[]> Testdata()
	{
		ArrayList<Object[]> data=getDataFromExcel.getTestdata();
		return data.iterator();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
