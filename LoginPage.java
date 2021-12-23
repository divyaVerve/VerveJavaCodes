package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;

public class LoginPage {

public BaseTest objBaseTest;
	
	public LoginPage(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}
	
	//locators for login page
	//By loc_imgLogo=By.xpath("");
	By loc_txtAlreadyReg=By.xpath("//h3[text()='Already registered?']");
	By loc_linkLogin=By.xpath("//a[@title='Log in to your customer account']");
	By loc_inpEmailId=By.xpath("//input[@id='email']");
	By loc_inpPassword=By.xpath("//input[@id='passwd']");
	By loc_btnSignIn=By.xpath("//button[@id='SubmitLogin']");
	
	public void clickOnLinkSignIn()
	{
		
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkLogin));
	}
	
	public void verifySignInPageIsDisplayed() 
	{
		
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().verifyPageIsDisplayed(loc_txtAlreadyReg));
	}
	public void setEmailAddress(String strEmail) 
	{
		
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpEmailId, strEmail));
	}
	public void setPassword(String strPassword)
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpPassword, strPassword));
	}
	public void clickOnSignInButton()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnSignIn));
	}
	
}
