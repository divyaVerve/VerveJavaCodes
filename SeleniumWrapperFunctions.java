package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunctions{
 
	public BaseTest objBaseTest;
	
	public SeleniumWrapperFunctions(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}
	
	public boolean setText(By locator,String strInputValue)
	{
		try {
			objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
			return true;
		} catch (Exception exception) {
			System.out.println("I got Exception:"+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
		
		//System.out.println(strInputValue);
	//	return strInputValue;
	}
	public String getText(By locator){
		try {
			String strRuturnVal=objBaseTest.getDriver().findElement(locator).getText();
			return strRuturnVal;
		}catch (Exception exception){
			System.out.println("I got Exception:"+exception.getMessage());
			return null;
		}
	}
	/*public void click(By locator)
	{
		objBaseTest.getDriver().findElement(locator).click();
		System.out.println("click");
	} */
	
	public boolean click(By locator)
	{
		try{
			objBaseTest.getDriver().findElement(locator).click();
			return true;
		}catch (Exception exception){
			System.out.println("I got exception:"+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	public void selectByValue(By locator,String strValue )
	{
		Select selVal=new Select(objBaseTest.getDriver().findElement(locator));
		selVal.selectByValue(strValue);
	}
	public boolean setDropDown(By locator,String strDate)
	{
	try{
	WebElement dropDown=objBaseTest.getDriver().findElement(locator);
	Select selectDropDown=new Select(dropDown);
	selectDropDown.selectByVisibleText(strDate);
	return true;
	}
	catch(Exception exception)
	{
	System.out.println("I got exception : "+exception.getMessage());
	exception.printStackTrace();
	return false;
	}
	}
}
