package com.Practise.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void login()
	{
		System.out.println("login");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="login")
	public void home()
	{
		System.out.println("home");
	}
	@Test(dependsOnMethods="home")
	public void search()
	{
		System.out.println("search");
	}
	@Test(invocationCount=10)
	public void invocationtest()
	{ 
	System.out.println("test");
	}
	@Test(timeOut=3000)
	public void infinitelooptest()
	{int i=1;
	while(i==1)
	{
		System.out.println(i);
		
	}
	
	}
	@Test(expectedExceptions=NumberFormatException.class)
	public void ExpectionCheck()
	{
	 String x="100B";
	 Integer.parseInt(x);
		}
	
	

}
