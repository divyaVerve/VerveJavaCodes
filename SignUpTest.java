package com.scripts;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.SignUpPage;

public class SignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseTest objBaseTest=new BaseTest();
		SignUpPage objSignUpPage=new SignUpPage();
		Utilities objUtilities=new  Utilities();
		objBaseTest.initialiseMeEnvironment();
		objSignUpPage.verifySignUpPageIsDisplayed();
		objSignUpPage.setFirstName();
	    objUtilities.getRandomFirstName();
		objSignUpPage.setSurname();
		objUtilities.getRandomSurname();
		objSignUpPage.setMobileNumberOrEmailId();
		objUtilities.getRandomMobileNumOrEmailId();
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
		objBaseTest.tearDown();
	}

}

