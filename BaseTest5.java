package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest5 {
	public static WebDriver driver=null;
	public String strURL="https://www.cleartrip.com/";
	
	private SeleniumWrapperFunction5 objSeleniumWrapperFunction5;
	public SeleniumWrapperFunction5 getObjSeleniumWrapperFunctions() {
		return objSeleniumWrapperFunction5;
	}

	public void setObjSeleniumWrapperFunctions(SeleniumWrapperFunction5 objSeleniumWrapperFunctions) {
		this.objSeleniumWrapperFunction5 = objSeleniumWrapperFunctions;
}

	public void initialiseMeEnvironment()
	{
		System.setProperty("webdriver.chrome.driver","C://Automation Training//CleartripTB//externalResource//driver//chromedriver.exe" );
		driver=new ChromeDriver();
		objSeleniumWrapperFunction5=new SeleniumWrapperFunction5(this);
		this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunction5);
		driver.get(strURL);
		System.out.println("Open URL:"+strURL);
		driver.manage().window().maximize();
		System.out.println("Title:"+driver.getTitle());
		System.out.println("Current URL:"+driver.getCurrentUrl());
}
	public WebDriver getDriver()
	{
		return driver;
	}
	public SeleniumWrapperFunction5 getObjSeleniumWrapperFunction5()
	{
		return objSeleniumWrapperFunction5;
		
	}
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}