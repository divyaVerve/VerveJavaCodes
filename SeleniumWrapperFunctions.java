package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunctions{
 
	public BaseTest objBaseTest;
	
	public SeleniumWrapperFunctions(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}
	public String setText(By locator,String strInputValue)
	{
		objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
		System.out.println(strInputValue);
		return strInputValue;
	}
	public void click(By locator)
	{
		objBaseTest.getDriver().findElement(locator).click();
		System.out.println("click");
	}
	public void selectByValue(By locator,String strValue )
	{
		Select selVal=new Select(objBaseTest.getDriver().findElement(locator));
		selVal.selectByValue(strValue);
	}
}
