package com.Practise.Selenium.Functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

import com.Practise.Selenium.Utility.BrowserSelection;

public class ExtraLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	/*	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(new ByAll(By.name("firstname123"),By.id("u_0_j123"), By.xpath("//input[@name='firstname']"))).sendKeys("Nayeeem");
		*/
		/*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(new ByIdOrName("firstname")).sendKeys("John");
		*/
		driver.findElement(new ByChained(By.id("u_0_i"),
				//By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"),
				By.name("firstname"))).sendKeys("JohnNayeem");
		driver.quit();
	}

}
