package com.Practise.Selenium.Functions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.BrowserSelection;

public class AlertsPopups {
	
	public void jsAlerts() throws Exception
	
	{ Alert alert;
		WebDriver driver=BrowserSelection.SelectBrowser("chrome");
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		 alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[contains(@href, 'CancelTab')]")).click();
		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		 alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//*[@id='demo']")).getText());
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		System.out.println(driver.findElement(By.xpath("//*[@id='demo']")).getText());
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[contains(@href, 'Textbox')]")).click();
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		alert= driver.switchTo().alert();
		String name="Nayeem";
		alert.sendKeys(name);
		alert.accept();
		String text=driver.findElement(By.xpath("//*[@id='demo1']")).getText();
		Assert.assertTrue(text.contains(name));
		driver.quit();
	}
	//@Test(priority=1)
 public void handleUploadPopup()
 {		WebDriver driver=BrowserSelection.SelectBrowser("chrome");
	  	driver.get("http://demo.automationtesting.in/Register.html");
	  	Actions action= new Actions(driver);
	  	action.moveToElement(driver.findElement(By.xpath("//*[text()='More']")))
	  	.moveToElement(driver.findElement(By.xpath("//*[text()='File Upload']"))).click().build().perform();
	  	driver.findElement(By.xpath("//*[@type='file']")).sendKeys("F:\\Rent Agreement_Vinoth_2018.docx");
	 
 }
	@Test(priority=2)
	public void muliptleWindow()
	{
		WebDriver driver=BrowserSelection.SelectBrowser("chrome");
	  	driver.get("http://demo.automationtesting.in/Register.html");
	  	Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[text()='SwitchTo']"))).moveToElement(driver.findElement(By.xpath("//*[text()='Windows']"))).click().build().perform();
		//driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
		//driver.findElement(By.xpath("//*[contains(@href,'Seperate')]")).click();
		driver.findElement(By.xpath("//*[contains(@href,'Multiple')]")).click();
		//driver.findElement(By.xpath("//*[@id='Seperate']/button")).click();
		driver.findElement(By.xpath("//*[@id='Multiple']/button")).click();
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String>handle= driver.getWindowHandles();
		System.out.println(handle.size());
	Iterator<String> it=handle.iterator();
	while(it.hasNext())
	{ String window=it.next();
		System.out.println(window);
		//if(window.equals(parentwindow)==false)
		//{
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			driver.close();
		//}
		
	}
	}
}
