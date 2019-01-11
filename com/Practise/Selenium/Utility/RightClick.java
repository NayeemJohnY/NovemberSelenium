package com.Practise.Selenium.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions action= new Actions(driver);
		action.contextClick(driver.findElement(By.cssSelector(".context-menu-one")))
		.click(driver.findElement(By.cssSelector(".context-menu-icon-paste"))).build().perform();
		
	}

}
