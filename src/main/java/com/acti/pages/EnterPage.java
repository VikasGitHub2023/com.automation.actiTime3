package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.driver.DriverManager;

public class EnterPage extends DriverManager{
  
	@FindBy(id="container_tasks")WebElement addTask;
	
	public EnterPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnNewTask() {
		addTask.click();
    }
}