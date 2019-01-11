package com.Practise.TestNG;

import org.testng.annotations.Test;

public class MyFirstTestNGClass implements InterfaceTestNGmethods{
	
	@Test
	public void MyFirstTest()
	{
		System.out.println("MyFirstTest in First Class");
	}
	
	@Test
	public void MySecondTest()
	{
		System.out.println("MySecondTest in First Class");
	}

}
