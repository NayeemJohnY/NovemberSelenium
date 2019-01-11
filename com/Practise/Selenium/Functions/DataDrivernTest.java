package com.Practise.Selenium.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;

import com.Practise.Selenium.Utility.BrowserSelection;
import com.Practise.Selenium.Utility.ExcelAPI;

public class DataDrivernTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*WebDriver driver;
		driver=BrowserSelection.SelectBrowser("chrome");
		driver.get("https://www.facebook.com/");*/
		
		ExcelAPI excelapi= new ExcelAPI("F:\\Workspace_Selenium\\NovemberSelenium\\FacebookReg.xlsx");
		String firstname=excelapi.getCellData("RegisterData", "firstname", 2);
		System.out.println(firstname);
		String surname=excelapi.getCellData("RegisterData", "surname", 2);
		System.out.println(surname);
		String email=excelapi.getCellData("RegisterData", "email", 2);
		System.out.println(email);
		String password=excelapi.getCellData("RegisterData", "password", 2);
		System.out.println(password);
		String gender=excelapi.getCellData("RegisterData", "gender", 2);
		System.out.println(gender);
		String dob=excelapi.getCellData("RegisterData", "dob", 2);
		System.out.println(dob);
		/*driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(surname);
		driver.findElement(new ByAll(By.name("reg_email__"),By.id("u_0_s"))).sendKeys(email);
		driver.findElement(By.xpath("//*[@type='password'][@id!='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//label[text()='"+gender+"']")).click();
		/*Select selday=new Select(driver.findElement(By.id("day")));
		selday.selectByVisibleText();*/
		
	}

}
