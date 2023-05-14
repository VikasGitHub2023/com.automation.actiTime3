package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.driver.DriverManager;

public class LoginPage extends DriverManager{
//.................Page Elements...............................//	
	@FindBy(id="username")WebElement usernameTextBox;
	@FindBy(name="pwd")WebElement passwordTextBox;
	@FindBy(xpath ="//div[text()='Login '] ")WebElement logIn;
	@FindBy(className="atLogoImg")WebElement logo;
	@FindBy(linkText ="actiTIME Inc.")WebElement actiTimeLink;
	
//...................Page Initialization (class).................//
	//create a constructor //
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
//.........................Page Actions/Functions................//
	
	public void enterUsername(String username) {
		usernameTextBox.clear();
		usernameTextBox.sendKeys(username);
	}
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	public void clickLogin() {
		logIn.click();
	}
    public boolean IsImagePresrent() {
    	return logo.isDisplayed();
    }
    public boolean isactiLinkPresent() {
	     return actiTimeLink.isDisplayed();
    }
	public String getLoginPageTitle() {
		 return driver.getTitle();
	}
}
