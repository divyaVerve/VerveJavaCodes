package com.generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
 
	public static WebDriver driver=null;
	public String strURL="https://www.facebook.com";
	
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	public void setObjSeleniumWrapperFunctions(SeleniumWrapperFunctions objSeleniumWrapperFunctions) {
		this.objSeleniumWrapperFunctions = objSeleniumWrapperFunctions;
	}
	public void initialiseMeEnvironment()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		objSeleniumWrapperFunctions=new SeleniumWrapperFunctions(this);
		this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunctions);
		driver.get(strURL);
		System.out.println("Open URL:"+strURL);
		driver.manage().window().maximize();
		System.out.println("Title:"+driver.getTitle());
		System.out.println("Current URL:"+driver.getCurrentUrl());
		try{
			Thread.sleep(2000);
		}catch (InterruptedException e){
			e.printStackTrace();
			}
	}
	public WebDriver getDriver()
	{
		return driver;
	}
	public SeleniumWrapperFunctions getObjSeleniumWrapperFunctions()
	{
		return objSeleniumWrapperFunctions;
		
	}
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}
