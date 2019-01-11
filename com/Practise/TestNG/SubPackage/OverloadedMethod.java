package com.Practise.TestNG.SubPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OverloadedMethod {

	@Test
	public void NormalMethod()
	{
		System.out.println("Normal Method");
	}
	
	// Overloaded Method
	@Parameters("name")
	@Test
	public void NormalMethod(String name)
	{
		System.out.println("Overloaded Method"+name);
	
	}
	@Parameters({"name1", "age"})
	@Test
	public void NormalMethod(String name, int Age)
	{
		System.out.println("Overloaded Method"+name +Age);
	}
}
