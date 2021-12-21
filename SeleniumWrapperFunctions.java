package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public boolean isSelected(By locator)
	{
	try{
	
		boolean strVal= objBaseTest.getDriver().findElement(locator).isSelected();
	return strVal;
	}
	catch(Exception exception)
	{
	System.out.println("I got exception : "+exception.getMessage());
	exception.printStackTrace();
	return false;
	}
	}

	public boolean dragAndDrop(By fromLocator,By toLocator)
	{
		try{
			WebElement from=objBaseTest.getDriver().findElement(fromLocator);
			WebElement to=objBaseTest.getDriver().findElement(toLocator);
			Actions act=new Actions(objBaseTest.getDriver()) ;
			
			act.dragAndDrop(from, to).build().perform();
			return true;
		} catch(Exception e) {
			System.out.println("I got exception:"+e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	public boolean selectDropDownOption(By locator,String strDropDownOption)
	{
		try{
			WebElement dropDown=objBaseTest.getDriver().findElement(locator);
			Select selectDropDown=new Select(dropDown);
			selectDropDown.selectByVisibleText(strDropDownOption);
			
			return true;
			}
			catch(Exception exception)
			{
			System.out.println("I got exception : "+exception.getMessage());
			exception.printStackTrace();
			return false;
			}
	}
	public WebElement setExplicitWait(By locator)
	{
		try{
		 WebDriverWait wait = new WebDriverWait(objBaseTest.getDriver(), 5);
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 return element;
		}catch (Exception exception){
			System.out.println("I got exception:"+exception.getMessage());
			exception.printStackTrace();
			return null;
		}
		
	}
	public void navigateToBack()
	{
		try{
			objBaseTest.getDriver().navigate().back();
			
		}catch (Exception exception){
			System.out.println("I got exception:"+exception.getMessage());
			exception.printStackTrace();
			
		}
		
	}
	public void navigateToRefresh()
	{
		try{
			objBaseTest.getDriver().navigate().refresh();
			
		}catch (Exception exception){
			System.out.println("I got exception:"+exception.getMessage());
			exception.printStackTrace();
			
		}
	}
	public void navigateToForword()
	{
		try{
			objBaseTest.getDriver().navigate().forward();
			
		}catch (Exception exception){
			System.out.println("I got exception:"+exception.getMessage());
			exception.printStackTrace();
			
		}
	}
}
