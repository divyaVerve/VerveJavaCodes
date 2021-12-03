package com.scripts;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.SignUpPage;

public class SignUpTest extends BaseTest{
    public void beforeMethod()
    {
    	this.initialiseMeEnvironment();
    }
	public void afterMethod()
	{
		this.tearDown();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BaseTest objBaseTest=new BaseTest();
		SignUpPage objSignUpPage=new SignUpPage();
		Utilities objUtilities=new  Utilities();
		SignUpTest objSignUpTest=new SignUpTest();
		//objBaseTest.initialiseMeEnvironment();
		objSignUpTest.initialiseMeEnvironment();
		objSignUpPage.verifySignUpPageIsDisplayed();
		
	    String strName=objUtilities.getRandomFirstName()+objUtilities.getRandomStrings(3);
	    objSignUpPage.setFirstName(strName);
	    
	    
	    String strSurname=objUtilities.getRandomSurname()+objUtilities.getRandomStrings(3);
	    objSignUpPage.setSurname(strSurname);
		
		
		String longNum1=objUtilities.getRandomNumber()+objUtilities.getRandomMobileNumber(9);
		objSignUpPage.setMobileNumber(longNum1);
		
		String strVal1=objUtilities.getRandomStrings(6) + objUtilities.getRandomEmaiId();
		objSignUpPage.setEmailId(strVal1);
		
		objSignUpPage.setNewPassword();
		objUtilities.getNewPassword();
		objSignUpPage.selectDay();
		objUtilities.getRandomDay();
		objSignUpPage.selectMonth();
		objUtilities.getRanDomMonth();
		objSignUpPage.selectYear();
		objUtilities.getRandomYear();
		objSignUpPage.selectGender();
		objUtilities.getRandomGender();
		objSignUpPage.clickOnSignUpButton();
		objSignUpTest.afterMethod();
		//objBaseTest.tearDown();
		
	}

}
