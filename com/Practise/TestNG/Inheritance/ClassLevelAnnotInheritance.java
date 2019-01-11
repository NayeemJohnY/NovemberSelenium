package com.Practise.TestNG.Inheritance;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
@Test
class ParentAnoot
{	
	public void $Method()
	{
		System.out.println("$Method");
	}
@BeforeMethod
void aMethod()
{
	System.out.println("a method");
}


public void Amethod()
{
	System.out.println("A method");
}
	 
	 private void display6()
		{
			System.out.println("diplay 6");
		}
}


public class ClassLevelAnnotInheritance extends ParentAnoot{

	
	public void Zebra()
	{
		System.out.println("Zebra");
	}
	public void vinoth()
	{
		System.out.println("vinoth");
	}
	public void arun()
	{
		System.out.println("arun");
		
		
	}
	void kamil()
	{
		System.out.println("kamil");
		
	}
 
}
