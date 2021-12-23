package com.flows;

import java.util.Hashtable;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.pageFactory.LoginPage;
import com.pageFactory.MyAccountHomePage;

public class LoginLogoutFlow {

	private BaseTest objBaseTest;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	private LoginPage objLoginPage;
	private MyAccountHomePage objMyAccountHomePage;
	public Hashtable<String, String> objHashtable;
	private String testData="";
	
	public Hashtable<String, String> createValidUserCredentials()
	{
		objHashtable.put("Email address","divdreambulgunde@gmail.com");
		objHashtable.put("Password", "divya123");
		System.out.println("Hashtable testdata:"+objHashtable.toString());
		return objHashtable;
	}
	
	public Hashtable<String, String> createSearchData()
	{
		objHashtable.put("Search","Dress");
		//objHashtable.put("Search","t-shirts");
		System.out.println("Hashtable testdata:"+objHashtable.toString());
		return objHashtable;
	}
	
	public LoginLogoutFlow(BaseTest basetest)
	{
		this.objBaseTest=basetest;
		objLoginPage=new LoginPage(objBaseTest);
		objMyAccountHomePage=new MyAccountHomePage(objBaseTest);
		objHashtable=new Hashtable<String, String>();
		this.createValidUserCredentials();
		this.createSearchData();
	}
	
	public void doLogin(){
		testData=objHashtable.get("Email address");
		if(!testData.equals(""))
			objLoginPage.setEmailAddress(testData);
		testData=objHashtable.get("Password");
		if(!testData.equals(""))
			objLoginPage.setPassword(testData);
		objLoginPage.clickOnSignInButton();
	}
	/* public void doSearch()
	{
		testData=objHashtable.get("Search");
		if(!testData.equals(""))
			objMyAccountHomePage.setTextInSearch(testData);
		objMyAccountHomePage.clickOnSearch();
		
	} 
	 public void doClickOnProduct()
	 {
		 objMyAccountHomePage.clickOnProduct();
	 }
	 public void doClickOnAddToCart()
	 {
		 objMyAccountHomePage.clickOnAddToCart();
	 } */
}
