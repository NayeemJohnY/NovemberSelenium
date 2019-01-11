package com.Practise.Selenium.Functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Practise.Selenium.Utility.BrowserSelection;
import com.Practise.Selenium.Utility.ExcelAPI;

public class WebTableExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=BrowserSelection.SelectBrowser("chrome");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']//tr"));
		System.out.println("Total Rows"+rows.size());
		ExcelAPI excelapi= new ExcelAPI("F:\\Workspace_Selenium\\NovemberSelenium\\FacebookReg.xlsx");
		if(!excelapi.isSheetExist("HTMLWebTable"))
		{
			excelapi.addSheet("HTMLWebTable");
			excelapi.addColumn("HTMLWebTable", "Company");
			excelapi.addColumn("HTMLWebTable", "Contact");
		}
		
		
		for (int i=2;i<=rows.size()-1; i++)
		{
			
			String company=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(company);
			excelapi.setCellData("HTMLWebTable", "Company", i, company);
			
			String contacr=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(contacr);
			excelapi.setCellData("HTMLWebTable", "Contact", i, contacr);
		}

	}

}
