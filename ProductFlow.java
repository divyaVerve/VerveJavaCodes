package com.flows;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.pageFactory.MyAccountHomePage;
import com.pageFactory.ProductPage;

public class ProductFlow {
	private BaseTest objBaseTest;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	private ProductPage objProductPage;
	public ProductFlow(BaseTest basetest)
	{
		this.objBaseTest=basetest;
		objProductPage=new ProductPage(objBaseTest);
	}
	 public void doClickOnProduct()
	 {
		 objProductPage.clickOnProduct();
	 }
	 public void doClickOnAddToCart()
	 {
		objProductPage.clickOnAddToCart();
	 } 
}
