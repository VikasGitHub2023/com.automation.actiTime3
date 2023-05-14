package com.acti.utils;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static String captureScreenShot(WebDriver driver)
	{
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String screenpath="C:\\WorkSpace\\com.qa.frontior\\reports\\screenshots\\img.png";
	    try {
			FileHandler.copy(src, new File(screenpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return screenpath;
	}
	

}
