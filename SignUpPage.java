package com.pageFactory;

import com.generic.SeleniumWrapperFunctions;

public class SignUpPage extends SeleniumWrapperFunctions {

	public void verifySignUpPageIsDisplayed()
	{
		System.out.println("Signup page is displayed:");
	}
	public void setFirstName(String strName)
	{
		System.out.print("Enter the FirstName:");
		this.setText(strName);
	}
	public void setSurname(String strName1)
	{
		System.out.print("Enter the Surname:");
		this.setText(strName1);
	}
	public void setMobileNumber(String intNum1)
	{
		System.out.println("Enter Mobile Number:");
		this.setText(intNum1);
	}
	public void setEmailId(String strEmail)
	{
		System.out.println("Enter Email id:");
		this.setText(strEmail);
	}
	public void setNewPassword()
	{
		System.out.println("Enter New Password:");
	}
	public void selectDay()
	{
		System.out.println("Select Day:");
		
	}
	public void selectMonth()
	{
		System.out.println("Select Month:");
	}
	public void selectYear()
	{
		System.out.println("Select Year:");
	}
	
	public void selectGender()
	{
		System.out.println("Select Gender:");
		
	}
	public void clickOnSignUpButton()
	{
		System.out.println("Click on Signup button:");
		System.out.println("Signup sucessfully");
	}
}
