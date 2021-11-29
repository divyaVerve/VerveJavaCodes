package com.fbAssignment.scripts;

import com.fbAssignment.pageFactory.SignUpPage;

public class SignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignUpPage objSignUpPage=new SignUpPage();
		objSignUpPage.verifySignUpPageIsDisplayed();
		objSignUpPage.setFirstName();
	    objSignUpPage.setSurname();
	    objSignUpPage.setMobileNumber();
	    objSignUpPage.setEmail_id();
	    objSignUpPage.setPassword();
	    objSignUpPage.setDate();
	    objSignUpPage.setGender();
	    objSignUpPage.verifySignupButton(); 
	}

}
