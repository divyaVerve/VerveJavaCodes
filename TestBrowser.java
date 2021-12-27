package com.vstl.paralleltest;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser extends BaseTest{

	@Parameters({"browserName"})
	@Test
	public void display(String browser) throws InterruptedException{
		Date date=new Date();
		System.out.println("Browser name:"+browser+"--"+date);
		Thread.sleep(2000);
		driver=getDriver(browser);
		driver.get("https://www.google.com/");
		driver.quit();
	}
}
