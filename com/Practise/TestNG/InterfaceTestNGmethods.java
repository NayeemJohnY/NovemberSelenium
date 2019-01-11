package com.Practise.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public interface InterfaceTestNGmethods {


		// TestNG annotated methods in an Interface 
		
		@BeforeTest
		public static void beforeTestMethod()
		{
			System.out.println("Before method");
		}
		
		@AfterTest
		public static void afterTestMethod()
		{
			System.out.println("After method");
		}
		
		@Test
		public static void staticMethod() {
	        System.out.println("Static method");
	    }

		@Test
		public default void DefaultMethod() {
	        System.out.println("Default Method");
	    }
		
	}

