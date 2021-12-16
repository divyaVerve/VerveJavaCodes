package com.testNG;

import org.testng.annotations.Test;

public class FirstTestNgScripts {

	@Test(priority=1,description="This test case will verify login functionality")
	public void loginApplication()
	{
		System.out.println("Open Login Application");
	}
	@Test(priority=2,description="This test case will add certain items in basket")
	public void selectItems()
	{
		System.out.println("Items selected");
	}
	@Test(priority=3,description="This test case will perform checkout operation")
	public void checkOut()
	{
		System.out.println("Check out completed");
	}
}
