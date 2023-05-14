package com.acti.testcase;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.acti.driver.DriverManager;
import com.acti.pages.EnterPage;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskPage;
import com.acti.utils.ExelLib;
import com.acti.utils.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest extends DriverManager{
	
	protected static ExtentHtmlReporter extent;
	protected static ExtentReports report;
	protected static ExtentTest Logger;
	LoginPage lp;
	TaskPage tp;
	EnterPage ep;
	
    @BeforeSuite
	public void setUpReport() {
		extent = new ExtentHtmlReporter("./reports/actiindex.html");
		report = new ExtentReports();
		report.attachReporter(extent);
	}
	
    @BeforeMethod
	public void preTest() {
		initApplication();
		lp = new LoginPage();
		tp = new TaskPage();
		ep = new EnterPage();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
				try {
					Logger.fail("Test Failed", 
							MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
		}
		report.flush();
		quitBrowser();
	}
   @DataProvider(name="actidata")
   public Object[][]testData()
   {
	   ExelLib excel = new ExelLib("./src/test/resources/testdata/actidata.xlsx");
	   int rows=excel.getRowCount(0);
	   
	   Object[][]data= new Object[rows][2];
	   
	   for(int i=0;i<rows;i++)
	   {
		   data[i][0]=excel.getCellData(0, i, 0);
		   data[i][1]=excel.getCellData(0, i, 1);
		   
	   }
	   return data;
		   
	   }

	   
   }

