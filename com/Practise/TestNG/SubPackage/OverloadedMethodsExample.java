package com.Practise.TestNG.SubPackage;

import org.testng.annotations.Test;

public class OverloadedMethodsExample {
	

		@Test
		public void NormalMethod()
		{
			System.out.println("Normal Method");
		}
		
		// Overloaded Method
		@Test
		public void NormalMethod(String name)
		{
			System.out.println("Overloaded Method");
		}
	

}
