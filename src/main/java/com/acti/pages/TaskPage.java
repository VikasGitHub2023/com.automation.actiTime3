package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.driver.DriverManager;

public class TaskPage extends DriverManager{
	
	
	@FindBy(xpath="//div[@class='title ellipsis']")WebElement addNewButton;
	@FindBy(xpath="//div[@class='item createNewCustomer']")WebElement addNewCustomer;
	@FindBy(xpath = "//div[@class=\"customerNameDiv\"]/input")WebElement enterNewCustomerNameBox;
	@FindBy(xpath="//textarea[contains(@placeholder,\"Enter Customer Description\")]")WebElement descriptionBox;
	@FindBy(xpath="//div[@class=\"emptySelection\"]")WebElement copyProjectsDropDown;
	@FindBy(xpath="//div[@class=\"itemRow cpItemRow \"][1]")WebElement bigBangCompany;
	@FindBy(xpath="//div[@class=\"components_button withPlusIcon\"]")WebElement createCustomerButton;
	
	
	
	public TaskPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public String taskPageTitle() {
		return driver.getTitle();
	}
	public void addNewButton() {
		addNewButton.click();
	}
	public void selectNewCustomer() {
		addNewCustomer.click();
	}
	public void enterNewCustomerNameBlock(String Name) {
		enterNewCustomerNameBox.sendKeys(Name);
	}
	public void customerDescriptionBox(String Description) {
		descriptionBox.sendKeys(Description);
	}
	public void projectFromCustomer() {
		copyProjectsDropDown.click();
	}
	public void selectBigBangCompany() {
		bigBangCompany.click();
	}
	public void createCustomerButton() {
		createCustomerButton.click();
	}



}
