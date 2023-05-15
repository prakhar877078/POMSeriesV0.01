package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class AccountsPageTest extends BaseTest{
	
	@BeforeClass
	public void accPageSetup() {
		accPage = loginpage.doLogin("sushantpandeybth@gmail.com", "Prakhar@12345");
	}
	
	@Test
	public void accPageTitleTest() {
		String accTitle = accPage.getAccPageTitle();
		Assert.assertEquals(accTitle, "My Account");
	}
	
	@Test
	public void accPageURLTest() {
		String accURL = accPage.getAccPageURL();
		Assert.assertTrue(accURL.contains("route=account/account"));
	}
	
	@Test
	public void isLogoutLinkExistTest() {
		Assert.assertTrue(accPage.isLogoutLinkExist());
	}
	
	@Test
	public void accPageHeadersTest() {
		List<String>actualAccPageHeadersList = accPage.getAccountsPageHeadersList();
		System.out.println("Acc Page Headers List: "+actualAccPageHeadersList);
		Assert.assertEquals(actualAccPageHeadersList.size(), 4);
	}
}
