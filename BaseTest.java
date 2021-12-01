package com.generic;

public class BaseTest {
	public void initialiseMeEnvironment()
	{
		System.out.println("Open URL:www.facebook.com");
	}
	
	public void tearDown()
	{
		System.out.println("Close the browser");
	}

}
