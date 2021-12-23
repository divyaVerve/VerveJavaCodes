package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class MyAccountHomePage {

private BaseTest objBaseTest;
private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	
	public MyAccountHomePage(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}
	
	//Locator
	By loc_txtUserName=By.xpath("//a[@title='View my customer account']");
	By loc_inpSearch=By.xpath("//input[@id='search_query_top']");
	By loc_btnSearch=By.xpath("//button[@name='submit_search']");
	
	
	public void verifyUserIsLoggedInSucessfully()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().verifyPageIsDisplayed(loc_txtUserName));
	}
	public void setTextInSearch(String strSearch)
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpSearch, strSearch));
	}
	public void clickOnSearch()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnSearch));
	}
	
	
}
