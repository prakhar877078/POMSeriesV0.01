package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginPageTitleTest() {
		String actualTitle = loginpage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test
	public void loginPageURLTest() {
		String actualURL = loginpage.getLoginPageURL();
		Assert.assertTrue(actualURL.contains("route=account/login"));
	}
	
	@Test
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(loginpage.isForgotPwdLinkExist());
	}
	
	@Test
	public void loginTest() {
		loginpage.doLogin("sushantpandeybth@gmail.com", "Prakhar@12345");
		Assert.assertTrue(accPage.isLogoutLinkExist());
		}

}
