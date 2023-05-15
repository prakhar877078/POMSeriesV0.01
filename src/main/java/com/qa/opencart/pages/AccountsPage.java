package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	
	AccountsPage(WebDriver driver){
		this.driver = driver;
	}
	
	private By logoutLink = By.linkText("Logout");
	private By accHeaders = By.xpath("//div[@id='content']/h2");
	private By search = By.name("search");
	
	public String getAccPageTitle() {
		String title = driver.getTitle();
		System.out.println("Acc page title :"+title);
		return title;
	}
	
	public String getAccPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Acc page url :"+url);
		return url;
	}
	
	public boolean isLogoutLinkExist() {
		return driver.findElement(logoutLink).isDisplayed();
	}
	
	public List<String> getAccountsPageHeadersList() {
		List<WebElement>accHeadersList = driver.findElements(accHeaders);
		List<String>accHeadersValList = new ArrayList<String>();
		
		for(WebElement e : accHeadersList) {
			String text = e.getText();
			accHeadersValList.add(text);
		}
		return accHeadersValList;
	}

}
