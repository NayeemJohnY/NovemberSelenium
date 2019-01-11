package com.Practise.TestNG;

import org.testng.Assert;
import org.testng.annotations.*;
public class TestNGBasics {

	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Beforesuite");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Beforeclass");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	@Test(groups="Test")
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=2,groups="PGroup")
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=1,groups="PGroup")
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(groups="Test")
	public void test4()
	{
		
		System.out.println("test4");
		Assert.assertTrue(false);
	}
}
