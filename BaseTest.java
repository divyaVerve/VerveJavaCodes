package com.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static WebDriver driver=null;
	public Properties objConfig;
	public String strURL="";
	//public String strURL="https://the-internet.herokuapp.com/";
	//public String strURL="https://www.facebook.com/";
	
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	public void setObjSeleniumWrapperFunctions(SeleniumWrapperFunctions objSeleniumWrapperFunctions) {
		this.objSeleniumWrapperFunctions = objSeleniumWrapperFunctions;
	}
	public void initialiseMeEnvironment()
	{
		this.loadConfigProperties();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		objSeleniumWrapperFunctions=new SeleniumWrapperFunctions(this);
		this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunctions);
		strURL=objConfig.getProperty("AUT_URL");
		driver.get(strURL);
		driver.manage().window().maximize();
		objSeleniumWrapperFunctions.setImplicitlyWait(10);
		System.out.println("Open URL:"+strURL);
		//driver.manage().window().maximize();
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
	public void failed(String testMethodName) 
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("C:/Automation Training/AutomationPractice/screenshots/"+"failshot_"+this.getClass().getName()+"_"+".jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	//Reusable generic method
	public void loadConfigProperties()
	{
		try
		{
		objConfig=new Properties();
		objConfig.load(new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties"));
	} catch (Exception exception){
		System.out.println("I got Exception:"+exception.getMessage());
	}
	}
}
