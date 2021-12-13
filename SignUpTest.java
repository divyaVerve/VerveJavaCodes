package com.scripts;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.SignUpPage;

public class SignUpTest extends BaseTest{
	SignUpPage objSignUpPage;
	Utilities objUtilities;
    public void beforeMethod() 
    {
    	this.initialiseMeEnvironment();
    	objSignUpPage=new SignUpPage(this);
    	objUtilities=new Utilities();
     }
    public void verifySignUpPage() throws InterruptedException
    {
    	objSignUpPage.clickOnCreateNewAccount();
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
		objSignUpPage.selectMonth("5");
		objSignUpPage.selectYear("1995");
		objSignUpPage.selectGender();
		objSignUpPage.clickOnSignUpButton();
    }
	public void afterMethod() throws InterruptedException
	{
		this.tearDown();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SignUpTest objSignUpTest=new SignUpTest();
		objSignUpTest.beforeMethod();
		objSignUpTest.verifySignUpPage();
	    objSignUpTest.afterMethod();
	}
}
