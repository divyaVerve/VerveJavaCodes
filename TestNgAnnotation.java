package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	
//Pre-condition
	
@BeforeSuite	
public void setUp()
{
	System.out.println("Setup system property for chrome");
}
@BeforeClass
public void launchBrowser()
{
	System.out.println("Launch chrome browser");
}
@BeforeTest
public void login()
{
	System.out.println("Login to app");
}
@BeforeMethod
public void enterURL()
{
	System.out.println("Enter URL");
}

//Test cases
@Test
public void googleTitleTest()
{
	System.out.println("Google title test");
}

//Post-condition
@AfterMethod
public void logout()
{
	System.out.println("Logout from app");
}
@AfterTest
public void deleteAllCookies()
{
	System.out.println("Delete all cookies");
}
@AfterClass
public void closeBrowser()
{
	System.out.println("Close Browser");
}
@AfterSuite
public void generateTestReport()
{
	System.out.println("Generate test report:");
}
}
