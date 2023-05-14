package com.acti.testcase;

import org.testng.Assert;

import org.testng.annotations.Test;




public class LoginPageTest extends BaseTest {
	
	
	
	@Test(priority=1,enabled=true)
	public void isTheImagePresent() {
		Logger=report.createTest("Test actiLink logo present");
		boolean flag = lp.IsImagePresrent();
		System.out.println(flag);
		Assert.assertTrue(flag);
		Logger.pass("actilink Logo present");
	}
		
		
	
	@Test
   public void isTheActiLinkPresent() {
		Logger=report.createTest("Test actiLink present");
    	boolean flag = lp.isactiLinkPresent();
    	System.out.println(flag);
    	Assert.assertTrue(flag);
    	Logger.pass("ActiLink Present");
	}
    	
    
    @Test(priority =4)
    public void testLoginUserNameAndPassword() {
    	Logger = report.createTest("Test user able to login");
    	lp.enterUsername("admin");
    	lp.enterPassword("manager");
    	lp.clickLogin();
    	Logger.pass("User able to login");
    }
    
    @Test(priority =5,dataProvider="actidata")
    public void testLoginWithInvalidUserName(String username,String password) {
    	Logger = report.createTest("Test user able to login using data driven");
    	lp.enterUsername(username);
    	lp.enterPassword(password);
    	lp.clickLogin();
    	Logger.pass("User able to login");
    }
    @Test
    public void testLoginPageTitle() {
    	Logger = report.createTest("Test page title");
    	String title = lp.getLoginPageTitle();
    	System.out.println(title);
    	Logger.pass("Page Title");
    	
    	
    }
}
