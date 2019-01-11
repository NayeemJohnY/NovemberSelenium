package com.Practise.Selenium.Functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.BrowserSelection;
import com.Practise.Selenium.Utility.JavaScriptExeFunction;

public class BootStrapDropdownHandle {

	//@Test
	public  void bootstrapDropdown() {
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='btn-group']")).click();
		List <WebElement> listOptions=driver.findElements(By.xpath("//*[@class='btn-group open']/ul/li"));
		for(WebElement e:listOptions)
			
		{
			System.out.println(e.getText());
			if(e.getText().equalsIgnoreCase("Java")&&!(e.isSelected()))
			{
				e.click();//to select
			}
			 if(e.getText().equalsIgnoreCase("CSS"))
			{
				e.click();//to deselect
			}
		}
	}
	
	@Test
	public  void bootstrapDropdownGoogle() {
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");

		driver.get("https://accounts.google.com/SignUp?hl=en-AU");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@class='btn-group']")).click();
		List <WebElement> listOptions=driver.findElements(By.xpath("//div[@id='accountDetailsNext']//following::content"));
		for(WebElement e:listOptions)
			
		{
			System.out.println(e.getText());
		}
	}
	
	//@Test
	public  void dDropdown() {
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//*[@id='option-droup-demo']"));
		JavaScriptExeFunction.highlightElement(driver, ele);
		Select select= new Select(driver.findElement(By.xpath("//*[@id='option-droup-demo']")));
		select.selectByIndex(1);
		select.selectByVisibleText("Java");
	}
	
}
