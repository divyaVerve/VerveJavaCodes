package com.orangeHRM.pageFactory;

import org.openqa.selenium.By;


import com.generic.BaseTest;

public class OrangeHRM {

public BaseTest objBaseTest;
	
	public OrangeHRM(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}


//Locators for login page:
By loc_inpUsename=By.xpath("//input[@id='txtUsername']");
By  loc_inpPassword=By.xpath("//input[@id='txtPassword']");
By loc_btnLogin=By.xpath("//input[@id='btnLogin']");

//Locators for PIM 
By loc_linkPIM=By.xpath("//b[text()='PIM']");
By loc_inpEmpName=By.xpath("//input[@name='empsearch[employee_name][empName]']");
By loc_inpEmpId=By.xpath("//input[@id='empsearch_id']");
By loc_inpSupervisor=By.xpath("//input[@id='empsearch_supervisor_name']");
By loc_drpEmpStatus=By.xpath("//select[@id='empsearch_employee_status']");
By loc_drpInclude=By.xpath("//select[@id='empsearch_termination']");
By loc_drpJobTitle=By.xpath("//select[@id='empsearch_job_title']");
By loc_drpSubUnit=By.xpath("//select[@id='empsearch_sub_unit']");

By loc_chkbox=By.xpath("//input[@id='ohrmList_chkSelectRecord_55']");
By loc_btnDialogDel=By.xpath("//input[@id='dialogDeleteBtn']");

By loc_inpFirstName=By.xpath("//input[@id='firstName']");
By loc_inpMiddleName=By.xpath("//input[@id='middleName']");
By loc_inpLastName=By.xpath("//input[@id='lastName']");

By loc_btnSearch=By.xpath("//input[@id='searchBtn']");
By loc_btnReset=By.xpath("//input[@id='resetBtn']");
By loc_btnAdd=By.xpath("//input[@id='btnAdd']");
By loc_btnDelete=By.xpath("//input[@id='btnDelete']");

public void verifyLoginPage()
{
	objBaseTest.getObjSeleniumWrapperFunctions().setText( loc_inpUsename, "Admin");
	objBaseTest.getObjSeleniumWrapperFunctions().setText( loc_inpPassword,"admin123");
	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnLogin);
}
public void verifyPIMSearch()
{
	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkPIM);
	objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpEmpName,"Admin");
	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnSearch);
}
public void verifyPIMReset()
{
	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnReset);
}
public void verifyDelete()
{
	
	objBaseTest.getObjSeleniumWrapperFunctions().setExplicitWait(loc_chkbox);
	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_chkbox);
	//objBaseTest.getObjSeleniumWrapperFunctions().setExplicitWait(loc_btnDelete);
	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnDelete);
	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnDialogDel);
}
public void clickOnAdd()
{
objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnAdd);
	
}
public void enterFirstName(String strFirstName)
{
	objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstName, strFirstName);
}
public void enterMiddleName(String strMiddleName)
{
	objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstName, strMiddleName);
}
public void enterLastName(String strLastName)
{
	objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstName, strLastName);
}
















}