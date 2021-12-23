package com.flows;

import java.util.Hashtable;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.pageFactory.LoginPage;
import com.pageFactory.MyAccountHomePage;

public class MyAccountFlow {

	private BaseTest objBaseTest;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	private LoginPage objLoginPage;
	private MyAccountHomePage objMyAccountHomePage;
	public Hashtable<String, String> objHashtable;
	private String testData="";
	
	public MyAccountFlow(BaseTest basetest)
	{
		this.objBaseTest=basetest;
		objMyAccountHomePage=new MyAccountHomePage(objBaseTest);
	}
	public Hashtable<String, String> createSearchData()
	{
		objHashtable.put("Search","Dress");
		//objHashtable.put("Search","t-shirts");
		System.out.println("Hashtable testdata:"+objHashtable.toString());
		return objHashtable;
	}
	public void doSearch()
	{
		testData=objHashtable.get("Search");
		if(!testData.equals(""))
			objMyAccountHomePage.setTextInSearch(testData);
		objMyAccountHomePage.clickOnSearch();
		
	} 
}
