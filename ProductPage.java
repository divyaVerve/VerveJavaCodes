package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class ProductPage {

	private BaseTest objBaseTest;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
		
		public ProductPage(BaseTest baseTest)
		{
			this.objBaseTest=baseTest;
		}
		
		//Locators
		By loc_drpdownSortBy=By.xpath("//select[@id='selectProductSort']");
		By loc_txtProduct=By.xpath("//a[@title='Printed Chiffon Dress']");
		By loc_btnAddToCart=By.xpath("//button[@name='Submit']");
		
		public void verifySortBy(String strSort)
		{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().selectDropDownOption(loc_drpdownSortBy, strSort));
		}
		public void clickOnProduct()
		{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().doDoubleClick(loc_txtProduct));
		}
		public void clickOnAddToCart()
		{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnAddToCart));
		}
}
