package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.Pojo;

public class DashboardPageByDivya {

	// Global Variables
		private Pojo objPojo;
		private String strUniqueKey = "";
		private String testData = "", testData_2 = "";
		private Integer intTestData = null;
		private String strReturnVal = "";
		private int intReturnVal = 0;
		private boolean blnReturnStatus = false;
		private double dblReturnVal = 0.0;
		private List<WebElement> listReturnElement;
		private WebElement weReturnElement;
		private int intRow = 0;
		private int intColumn = 0;
		
		public DashboardPageByDivya(Pojo pojo) {
			this.objPojo = pojo;
		}
		// headers
		By loc_iconUserIcon=By.xpath("//div[@class='hero-img img-circle pull-left']/img[@alt='eMedicareSync']");
		By loc_lnkLogOff=By.xpath("//a[text()='Log off']");
		By loc_iconMenuItem=By.xpath("//ul[@id='menu']/li[@class='sidebar-toggle']/div[@type='button' and @class='navbar-toggle']");
		By loc_iconClose=By.xpath("//ul[@id='menu']/li/div[@type='button']");
		By loc_hdrofEachPage = By.xpath("//span[@class='logo-mini']//child::img[@src='/Content/css/custom-theme/images/eMedicareSync-logo.png' and @title='eMedicareSync']//following::h1");
	
		

		public void clickUserIcon(){
			objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_iconUserIcon);
			objPojo.getObjUtilities().logReporter("click on 'User Icon' button ", objPojo.getObjWrapperFunctions().click(loc_iconUserIcon));
		}

		public void clickLogOff(){
			objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_lnkLogOff);
			objPojo.getObjUtilities().logReporter("click on 'log off' link to logout the application ", objPojo.getObjWrapperFunctions().click(loc_lnkLogOff));
		} 
		public void verifyPageHeaderIsDisplayed(String strPageHeader){
			By locator=By.xpath("//span[text()='"+strPageHeader+"']");
			objPojo.getObjWrapperFunctions().checkElementDisplayed(locator);
			objPojo.getObjUtilities().logReporter("Verify '"+strPageHeader+"' page header is displayed.", objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
		}
		public boolean isMenuItemIconIsDisplayed(){
			return objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_iconMenuItem);
		}
		public void clickMenuItemIconOnDashboardPage(){
			objPojo.getObjUtilities().logReporter("click menu item icon on dashboard page", objPojo.getObjWrapperFunctions().click(loc_iconMenuItem));
		}
		public void verifyAllMenuItemsIsDisplayedOnDashboardPage(String strMenuItemName){
			By locator = By.xpath("//span[contains(text(),'"+strMenuItemName+"')]");
			objPojo.getObjWrapperFunctions().checkElementDisplayed(locator);
			objPojo.getObjUtilities().logReporter("Verify menu item : '"+strMenuItemName+"' is displayed on dashboard page .",objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
		}
		
		public boolean isCloseCrossButtonIsDisplayed(){
			return objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_iconClose);
		}

		public void clickCrossCloseButton(){
			objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_iconClose);
			objPojo.getObjUtilities().logReporter("click on 'cross close' button ", objPojo.getObjWrapperFunctions().click(loc_iconClose));
		}
		public boolean isLogOffPopUpIsDisplayed(){
			return objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_iconMenuItem);
		}
		
}
