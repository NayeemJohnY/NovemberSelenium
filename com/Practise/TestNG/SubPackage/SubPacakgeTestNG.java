package com.Practise.TestNG.SubPackage;

import org.testng.annotations.Test;

public class SubPacakgeTestNG {

	@Test
	public void MyFirstTest()
	{
		System.out.println("MyFirstTest in SubPacakgeTestNG Class");
	}
	
	@Test
	public void MySecondTest()
	{
		System.out.println("MySecondTest in SubPacakgeTestNG Class");
	}
	
	class SubClassInSubPacakge{
	@Test
	void SubClassMethod()
	{
		System.out.println("Test in SubClassInSubPacakge");
	}
}
}
