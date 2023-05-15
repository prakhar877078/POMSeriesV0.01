package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public WebDriver driver;
	
	
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser Name is :"+browserName);
		
		if(browserName.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.trim().equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else {
			System.out.println("Please pass the right browser...."+browserName);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		return driver;
	}

}
