package com.Practise.Selenium.Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int min=1;
	int max=3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(min<=max)
		{
			
			System.out.println("Retry of testMethod  "+ result.getName()+"-->"+min);
			min ++;
			return true;
		}
		return false;
	}
	
	

}
