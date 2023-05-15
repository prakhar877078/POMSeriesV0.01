package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//1. private By locators:
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	
	
	//2. page constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//3. page actions/methods
	public String getLoginPageTitle() {
		String title = driver.getTitle();
		System.out.println("Login Page title:"+title);
		return title;
	}
	
	public String getLoginPageURL() {
		String url = driver.getTitle();
		System.out.println("Login Page title:"+url);
		return url;
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void doLogin(String un, String pwd) {
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
	}

}
