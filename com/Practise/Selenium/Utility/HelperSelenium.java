package com.Practise.Selenium.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HelperSelenium {

	public static void captureScreenshot(WebDriver driver, String screesnhotName) throws Exception {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".\\Screenshots\\"+screesnhotName+".png"));

	}

}
