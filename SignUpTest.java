package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.SignUpPage;

public class SignUpTest extends BaseTest{
	SignUpPage objSignUpPage;
	Utilities objUtilities;
	
	@BeforeClass
    public void beforeMethod() 
    {
    	this.initialiseMeEnvironment();
    	objSignUpPage=new SignUpPage(this);
    	objUtilities=new Utilities();
    }
	
	@Test
	public void TCID_100() throws InterruptedException
	{
		
		objSignUpPage.clickOnCreateNewAccount();
		objSignUpPage.verifySignUpPageIsDisplayed();
		//objSignUpPage.verifyFirstName();
		String strName=objUtilities.getRandomFirstName()+objUtilities.getRandomStrings(2);
    	objSignUpPage.setFirstName(strName);
    	String strSurname=objUtilities.getRandomSurname()+objUtilities.getRandomStrings(2);
  	    objSignUpPage.setSurname(strSurname);
  	    String strVal1=objUtilities.getRandomStrings(6) + objUtilities.getRandomEmaiId();
		objSignUpPage.setEmailId(strVal1);
		objSignUpPage.reEnterEmail(strVal1);
		String strPassword=objUtilities.getNewPassword();
		objSignUpPage.setNewPassword(strPassword);
		objSignUpPage.selectDay("7");
		objSignUpPage.selectMonth("May");
		objSignUpPage.selectYear("1995");
		objSignUpPage.selectGender();
		objSignUpPage.clickOnSignUpButton();
	}

	@AfterClass
	public void afterMethod() throws InterruptedException
	{
		this.tearDown();
	}

}
