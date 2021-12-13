package com.pageFactory;

import org.openqa.selenium.By;
import com.generic.BaseTest;

public class SignUpPage{

	 public BaseTest objBaseTest;
	
	public SignUpPage(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}
	public void verifySignUpPageIsDisplayed()
	{
		System.out.println("Signup page is displayed:");
	}
    public void clickOnCreateNewAccount()
	{
		By loc_clickNewAccount=By.xpath("//a[starts-with(@id,'u_0_2')]");
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickNewAccount);
	}
	public void setFirstName(String strFirstName) throws InterruptedException
	{
		Thread.sleep(2000);
		By loc_inpFirstName=By.xpath("//div[@id='reg_form_box']//input[@name='firstname']");
		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstName, strFirstName);
	}
	public void setSurname(String strSurname)
	{
		By loc_inpSurname=By.xpath("//input[@name='lastname']");
		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpSurname, strSurname);
	}
    public void setEmailId(String strEmail)
	{
		By loc_inpEmail=By.xpath("//input[@name='reg_email__']");
		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpEmail,strEmail);
	}
	public void reEnterEmail(String strEmail)
	{
		By loc_inpReEmail=By.xpath("//input[@name='reg_email_confirmation__']");
		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpReEmail,strEmail);
	}
	public void setNewPassword(String strPassword)
	{
		By loc_inpPassword=By.xpath("//input[@id='password_step_input']");
		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpPassword,strPassword);
	}
	public void selectDay(String strDay)
	{
		By loc_inpSelectDay=By.xpath("//select[@id='day']");
		objBaseTest.getObjSeleniumWrapperFunctions().selectByValue(loc_inpSelectDay,strDay);
	}
	public void selectMonth(String strMonth)
	{
		By loc_inpSelectMonth=By.xpath("//select[@id='month']");
		objBaseTest.getObjSeleniumWrapperFunctions().selectByValue(loc_inpSelectMonth,strMonth);
	}
	public void selectYear(String strYear)
	{
		By loc_inpSelectYear=By.xpath("//select[@name='birthday_year']");
		objBaseTest.getObjSeleniumWrapperFunctions().selectByValue(loc_inpSelectYear,strYear);
	}
	public void selectGender()
	{
		By loc_clickNewAccount=By.xpath("//span[@data-name='gender_wrapper']//span//following-sibling::input[@value='1']");
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickNewAccount);
	}
	public void clickOnSignUpButton()
	{
		By loc_clickNewAccount=By.xpath("//button[@name='websubmit']");
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickNewAccount);
    }
}
