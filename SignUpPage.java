package com.fbAssignment.pageFactory;

import java.util.Scanner;

public class SignUpPage {
	Scanner scannerSc=new Scanner(System.in);
	
 
	public void verifySignUpPageIsDisplayed()
	{
		System.out.println("Signup page is displayed:");
	}
	public void setFirstName()
	{
		System.out.println("Enter the FirstName:");
		String strName1=scannerSc.next();
		System.out.println("FirstName:"+strName1);
		
	}
	public void setSurname()
	{
		System.out.println("Enter the Surname:");
		String strName2=scannerSc.next();
		System.out.println("FirstName:"+strName2);
	}
	public void setMobileNumber()
	{
		System.out.println("Enter Mobile Number:");
		 long longNum=scannerSc.nextLong();
		System.out.println("Mobile Number:"+longNum);
	}
	public void setEmail_id()
	{
		System.out.println("Enter Email id:");
		String strEmail=scannerSc.next();
		System.out.println("Email Id:"+strEmail);
	}
	public void setPassword()
	{
		System.out.println("Enter Password:");
		String strPassword=scannerSc.next();
		System.out.println("Email password:"+strPassword);
	}
	public void setDate()
	{
		System.out.println("Enter date:");
		int intDate=scannerSc.nextInt();
		System.out.println("Enter Month:");
		String strMonth=scannerSc.next();
		System.out.println("Enter Year:");
		int intYear=scannerSc.nextInt();
		System.out.println(intDate+"-"+strMonth+"-"+intYear);
	}
	public void setGender()
	{
		System.out.println("Select Gender:");
		String strGender=scannerSc.next();
		System.out.println("Gender:"+strGender);
	}
	public void verifySignupButton()
	{
		System.out.println("Click on Signup button:");
		System.out.println("Facebook Account created sucessfully");
	}
}
