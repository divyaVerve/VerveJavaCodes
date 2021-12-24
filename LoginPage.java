package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

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
		Reporter.log("Verify Sign In page is displayed.",true);
	}
	public void setEmailAddress(String strEmail) 
	{
		
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpEmailId, strEmail));
		Reporter.log("Set Email Id.",true);
	}
	public void setPassword(String strPassword)
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpPassword, strPassword));
		Reporter.log("Set Password.",true);
	}
	public void clickOnSignInButton()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnSignIn));
		Reporter.log("Click on Sign In button.",true);
	}
	
	public void getAllLinksOnSignInPage()
	{
		objBaseTest.getObjSeleniumWrapperFunctions().setImplicitlyWait(5);
		List<WebElement> allLinkList=objBaseTest.getDriver().findElements(By.tagName("a"));
		System.out.println("Link list size:"+allLinkList.size());
		for(WebElement webElement : allLinkList) {
			Reporter.log("All Links-"+webElement.getText(),true);
		}
	}
	
	/*public String getSignInButtonText()
	{
		String strLoginText=objBaseTest.getDriver().findElement(loc_btnSignIn).getAttribute("value");
		System.out.println("strLoginText:"+strLoginText);
		return strLoginText;
		
	} */
}
