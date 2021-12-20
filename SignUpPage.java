package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;

public class SignUpPage{

	 public BaseTest objBaseTest;
	
	public SignUpPage(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}
	
	
    public void clickOnCreateNewAccount()
	{
		By loc_clickNewAccount=By.xpath("//a[starts-with(@id,'u_0_2')]");
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickNewAccount);
	}
    public void verifySignUpPageIsDisplayed() throws InterruptedException
	{
    	Thread.sleep(2000);
		By loc_txtSignUp=By.xpath("//div[text()='Sign Up']");
		String strAccountText=objBaseTest.getObjSeleniumWrapperFunctions().getText(loc_txtSignUp);
		Assert.assertTrue(strAccountText.equals("Sign Up"));
	}
     public void setFirstName(String str_FirstName) {
    	By loc_inpFirstName=By.xpath("//div[@id='fullname_field']//input[@name='firstname']"); 
    	System.out.println("First Name is : ");
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstName, str_FirstName));
    	//objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstame, str_FirstName);
    	System.out.println("Test Script Pass");
    	System.out.println("===================================================================");
    	}
public void setSurname(String strSurname)
	{
		By loc_inpSurname=By.xpath("//input[@name='lastname']");
		System.out.println("Surname is:");
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpSurname, strSurname));
    	System.out.println("Test Script Pass");
    	System.out.println("===================================================================");
		//objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpSurname, strSurname);
	}
    public void setEmailId(String strEmail)
	{
		By loc_inpEmail=By.xpath("//input[@name='reg_email__']");
		System.out.println("Email is:");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpEmail, strEmail));
		System.out.println("Test Script Pass");
    	System.out.println("===================================================================");
		//objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpEmail,strEmail);
	}
	public void reEnterEmail(String strEmail)
	{
		By loc_inpReEmail=By.xpath("//input[@name='reg_email_confirmation__']");
		System.out.println("ReEnter Email:");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpReEmail, strEmail));
		System.out.println("Test Script Pass");
    	System.out.println("===================================================================");
		//objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpReEmail,strEmail);
	}
	public void setNewPassword(String strPassword)
	{
		By loc_inpPassword=By.xpath("//input[@id='password_step_input']");
		System.out.println("New Password");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpPassword, strPassword));
		System.out.println("Test Script Pass");
    	System.out.println("===================================================================");
		//objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpPassword,strPassword);
	}
	public void selectDay(String strDay)
	{
		By loc_inpSelectDay=By.xpath("//select[@id='day']");
		System.out.println("Day");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setDropDown(loc_inpSelectDay, strDay));
		System.out.println("Test Script Pass");
    	System.out.println("===================================================================");
		//objBaseTest.getObjSeleniumWrapperFunctions().selectByValue(loc_inpSelectDay,strDay);
	}
	public void selectMonth(String strMonth)
	{
		By loc_inpSelectMonth=By.xpath("//select[@id='month']");
		System.out.println("Month");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setDropDown(loc_inpSelectMonth,strMonth));
		System.out.println("Test Script Pass");
    	System.out.println("===================================================================");
		//objBaseTest.getObjSeleniumWrapperFunctions().selectByValue(loc_inpSelectMonth,strMonth);
	}
	public void selectYear(String strYear)
	{
		By loc_inpSelectYear=By.xpath("//select[@name='birthday_year']");
		System.out.println("Year");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setDropDown(loc_inpSelectYear,strYear));
		System.out.println("Test Script Pass");
    	System.out.println("===================================================================");
		//objBaseTest.getObjSeleniumWrapperFunctions().selectByValue(loc_inpSelectYear,strYear);
	}
	public void selectGender()
	{
		By loc_clickOnGender=By.xpath("//span[@data-name='gender_wrapper']//span//following-sibling::input[@value='1']");
		System.out.println("Gender:");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickOnGender));
		System.out.println("Test Script Pass");
    	System.out.println("===================================================================");
		//objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickNewAccount);
	}
	public void clickOnSignUpButton()
	{
		By loc_clickOnSignupButton=By.xpath("//button[@name='websubmit']");
		System.out.println("Click:");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickOnSignupButton));
		System.out.println("Test Script Pass");
    	System.out.println("===================================================================");
		//objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickOnSignupButton);
    }
}
