package com.Practise.Selenium.Functions;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Practise.Selenium.Utility.BrowserSelection;

public class BrokenLinks{
	
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");
		driver.get("http://makeseleniumeasy.com/");
		driver.manage().window().maximize();
		
		List<WebElement> linkList= driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total Links& Images----->"+linkList.size());
		
		List<WebElement> activeLinkList= new ArrayList<WebElement>();
		for (WebElement eachLink:linkList)
		{
			if(eachLink.getAttribute("href")!=null && !(eachLink.getAttribute("href").contains("javascript")))
			{
				activeLinkList.add(eachLink);
			}
		}
		
		System.out.println("Total Active  Links& Images----->"+linkList.size());
		int i=0;
		for(WebElement eachActiveLink:activeLinkList)
		{ 
			HttpURLConnection httpconnection= (HttpURLConnection)new URL(eachActiveLink.getAttribute("href")).openConnection();
			httpconnection.connect();
			String response=httpconnection.getResponseMessage();
			System.out.println(eachActiveLink.getAttribute("href")+"--Response is--->"+response);
			if (response.contentEquals("OK"))
			{
				i++;
			}
			httpconnection.disconnect();
			
			
		}
		System.out.println("Total unbroken Links & iamges-->"+i);
		System.out.println("Total broken Links & iamges-->"+(activeLinkList.size()-i));
		driver.quit();
	}
}