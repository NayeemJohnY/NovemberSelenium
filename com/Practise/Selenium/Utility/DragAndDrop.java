package com.Practise.Selenium.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions action= new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		driver.navigate().refresh();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 source=driver.findElement(By.id("draggable"));
		 target=driver.findElement(By.id("droppable"));
		action.clickAndHold(source).moveToElement(target).release().build().perform();
		
	}
}
