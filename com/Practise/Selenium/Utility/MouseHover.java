package com.Practise.Selenium.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		WebElement contextMenu=driver.findElement(By.xpath("//a[@class='menulink']"));
		Actions mouseHover= new Actions(driver);
		mouseHover.moveToElement(contextMenu).build().perform();
		driver.findElement(By.xpath("//ul[@class='submenu']//a[text()='Courses']")).click();
	}

}
