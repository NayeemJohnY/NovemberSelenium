package com.Practise.Selenium.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.BrowserSelection;
import com.Practise.Selenium.Utility.JavaScriptExeFunction;

public class CalenderHandle {

	@Test
	public  void main() {
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");

		driver.get("https://www.freecrm.com");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("username"));
		JavaScriptExeFunction.highlightElement(driver,username );
		username.sendKeys("NayeemJohn");
		WebElement password=driver.findElement(By.name("password"));
		JavaScriptExeFunction.highlightElement(driver,password );
		password.sendKeys("Vino@1702");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@value='Login']"));
		JavaScriptExeFunction.highlightElement(driver,loginBtn );
		loginBtn.click();
		driver.switchTo().frame("mainpanel");
		String date="26-December-2018";
		String[] datearray=date.split("-");
		String day=datearray[0];
		String month=datearray[1];
		String year=datearray[2];
		Select selectmnth=new Select(driver.findElement(By.name("slctMonth")));
		selectmnth.selectByVisibleText(month);
		Select selectyear=new Select(driver.findElement(By.name("slctYear")));
		selectyear.selectByVisibleText(year);
		String actualday;
		boolean flag=false;
		for(int row=2; row<=6; row++)
		{
			for(int col=1; row<=7; col++)
			{
				try{
				actualday=driver.findElement(By.xpath("//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr["+row+"]/td["+col+"]")).getText();
				}
				catch(NoSuchElementException e)
				{
					System.out.println("pLease select valid date");
					flag=false;
					break;
				}
				if(actualday.equals(day))
				{
					driver.findElement(By.xpath("//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr["+row+"]/td["+col+"]")).click();
					flag=true;
					break;
				}
			}
			if(flag)
				break;
		}
	}
}
