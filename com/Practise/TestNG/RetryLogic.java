package com.Practise.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Practise.Selenium.Utility.RetryAnalyzer;

public class RetryLogic {
	
	
	@Test//(retryAnalyzer=RetryAnalyzer.class)
	public void test1()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, false);
	}
	@Test
	public void test3()
	{
		Assert.assertEquals(true, true);
	}
}
