package com.generic;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrapperFunctions {

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

	public boolean verifyIsSelected(By locator)
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

	public boolean verifyPageIsDisplayed(By locator)
	{
	try{
	
		boolean strVal= objBaseTest.getDriver().findElement(locator).isDisplayed();
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
	public boolean doDoubleClick(By locator)
	{
		try{
			WebElement dlClick=objBaseTest.getDriver().findElement(locator);
			Actions act=new Actions(objBaseTest.getDriver()) ;
			act.doubleClick(dlClick).perform();
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
		 WebDriverWait wait = new WebDriverWait(objBaseTest.getDriver(), 10);
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 return element;
		}catch (Exception exception){
			System.out.println("I got exception:"+exception.getMessage());
			exception.printStackTrace();
			return null;
		}
		
	}
	public boolean navigateToBack()
	{
		try{
			objBaseTest.getDriver().navigate().back();
			return true;
		}catch (Exception exception){
			System.out.println("I got exception:"+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
		
	}
	public boolean navigateToRefresh()
	{
		try{
			objBaseTest.getDriver().navigate().refresh();
			return true;
		}catch (Exception exception){
			System.out.println("I got exception:"+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	public boolean navigateToForword()
	{
		try{
			objBaseTest.getDriver().navigate().forward();
			return true;
		}catch (Exception exception){
			System.out.println("I got exception:"+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	public boolean setImplicitlyWait(int waitTime)
	{
		try{
	    objBaseTest.getDriver().manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		return true;
    	}catch (Exception exception){
		System.out.println("I got exception:"+exception.getMessage());
		exception.printStackTrace();
		return false;
	}
	}
	
	public boolean fluentWait(By locator)
	{
    try
	{
	Wait<WebDriver> objWait=new FluentWait<WebDriver>(objBaseTest.getDriver())
	.withTimeout(Duration.ofSeconds(10))
	.pollingEvery(Duration.ofSeconds(2))
	.withMessage("Your desired element is not found")
	.ignoring(NoSuchElementException.class);
	objWait.until(ExpectedConditions.presenceOfElementLocated(locator));
	return true;
    }
	catch(Exception exception)
	{
	System.out.println("I got exception : "+exception.getMessage());
	return false;
	}
	}
}
