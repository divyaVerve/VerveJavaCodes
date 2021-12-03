package com.inheritance;

public class TestJavaInheritance extends JavaInheritance {
	
	
	public void verifyHomePageHeaderIsDisplayed()
	{
		System.out.println("Home page is displayed");
	}
	
	public void verifyHomePageIsDisplayed()
	{
	this.doLogin("Divya", "divya123");
	this.verifyHomePageHeaderIsDisplayed();
	this.doLogout();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJavaInheritance objTestJavaInheritance=new TestJavaInheritance();
		objTestJavaInheritance.verifyHomePageIsDisplayed();

	}

}
