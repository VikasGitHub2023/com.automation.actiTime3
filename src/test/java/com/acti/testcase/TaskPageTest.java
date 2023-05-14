package com.acti.testcase;
import org.testng.annotations.Test;



public class TaskPageTest extends BaseTest {
	
	@Test()
	public void AddNewCustomer() {
		Logger=report.createTest("Test create new customer");
		lp.enterUsername("admin");
		Logger.pass("enter the user name");
		lp.enterPassword("manager");
		Logger.pass("Enter Password");
		lp.clickLogin();
		Logger.pass("clicked login button");
        ep.clickOnNewTask();
        Logger.pass("User able to click on task page");
		tp.addNewButton();
		Logger.pass("Able to click on add new button");
		tp.selectNewCustomer();
		Logger.pass("Able to select new customer");
		tp.enterNewCustomerNameBlock("Name Test");
		Logger.pass("User able to enter customer name");
		tp.customerDescriptionBox("Test");
		Logger.pass("User able to enter description");
		tp.projectFromCustomer();
		Logger.pass("User able to select project");
		tp.selectBigBangCompany();
		Logger.pass("Big Bang Company");
		tp.createCustomerButton();
		Logger.pass("User able to click create button");
		}
	
	@Test()
	public void GetTaskPageTiltle() {
	    Logger=report.createTest("Test task page title");
		String title=tp.taskPageTitle();
		System.out.println(title);
		Logger.pass("Task page title");
	}

}
