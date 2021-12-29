package com.scripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportScreenshotTest {

	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest  extentTest;
	
	@BeforeTest
	public void setExtent()
	{
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",true);
		extent.addSystemInfo("Host Name","Divya");
		
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
		extent.close();
	}
	
	public static String getScreenshot(WebDriver driver,String screenshotName) throws IOException
	{
		String dataName=new SimpleDateFormat("yyyyMMddmmss").format(new Date());
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/FailedTestScreenshots/"+screenshotName +dataName+".png";
		File finalDestination=new File(destination);
		FileUtils.copyFile(source,finalDestination);
		return destination;
	
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php/");
	}
	
	@Test
	public void automationPracticeTitleTest()
	{
		extentTest=extent.startTest("ExtentReportScreenshotTest");
		String title=driver.getTitle();
		System.out.println("title");
		Assert.assertEquals(title,"Http/fghh");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE){
			extentTest.log(LogStatus.FAIL,"Test case failed is:"+result.getName());
			extentTest.log(LogStatus.FAIL,"Test case failed is:"+result.getThrowable());
			
			String screenshotPath=ExtentReportScreenshotTest.getScreenshot(driver,result.getName());
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(screenshotPath));
		}else if(result.getStatus()==ITestResult.SKIP){
			extentTest.log(LogStatus.SKIP,"Test case skipped is:"+result.getName());
		}else if(result.getStatus()==ITestResult.SUCCESS){
			extentTest.log(LogStatus.PASS,"Test case Passed is:"+result.getName());
		}
		extent.endTest(extentTest);
		driver.quit();
	}
}
