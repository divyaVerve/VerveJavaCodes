package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.Pojo;

public class LoginPageByDivya {
	
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

		public LoginPageByDivya(Pojo pojo) {
			this.objPojo = pojo;
		}

		By loc_hdreMedicareSync=By.xpath("//div[@class='text-center client-logo']//img[@title='eMedicareSync'][@alt='eMedicareSync']");
		By loc_inpUsername = By.xpath("//input[@id='UserName']");
		By loc_inpPassword = By.xpath("//input[@id='Password']");
		By loc_drpDashboard = By.xpath("//select[@id='StartIN']");
		By loc_btnGetStarted = By.xpath("//button[text()='Get Started']");
		By loc_linkLogOff=By.xpath("//a[text()='Log off']");
		By loc_errorMessageForBlankPassword=By.xpath("//span[text()='The Password field is required.']");
		By loc_errorMessageForBlankUsername=By.xpath("//span[text()='The User name field is required.']");
		By loc_errorMessageInvalidUesrnameOrPassword=By.xpath("//ul/li[text()='Invalid username or password...Try Again!!!']");
		By loc_errorMessageInvalidPassword=By.xpath("//ul/li[text()='Invalid password...Try Again!!!']");
		
		public void verifyUserIsOneMedicareSyncLoginPage()
		{
			objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_hdreMedicareSync);
			objPojo.getObjUtilities().logReporter("Verify user is on the login page of eMedicareSync", objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_hdreMedicareSync));
		}
		public void setUserID(String userID)
		{
			objPojo.getObjUtilities().logReporter("Set user name", userID, objPojo.getObjWrapperFunctions().setText(loc_inpUsername, userID));
		}
		public void setPassword(String password) {
			objPojo.getObjUtilities().logReporter("Set password", password,objPojo.getObjWrapperFunctions().setText(loc_inpPassword, password));
		}
		public void selectLoginWithOptions(String strLoginWithOption) {
			objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_drpDashboard);
			objPojo.getObjUtilities().logReporter("user select the login option with '"+strLoginWithOption+"' .",objPojo.getObjWrapperFunctions().selectDropDownOption(loc_drpDashboard, strLoginWithOption, "Text"));
		}
	    public void clickGetStarted() {
			objPojo.getObjUtilities().logReporter("Click 'Get Started' button",objPojo.getObjWrapperFunctions().click(loc_btnGetStarted));
		
		  }
	    public void verifyUserLoggedIn(String strTitle){
	    	objPojo.getObjUtilities().logReporter("Verify user login is successfull by using page title",objPojo.getDriver().getTitle(),strTitle,objPojo.getDriver().getTitle().toLowerCase().contains(strTitle.toLowerCase()));
	    }
	    
	    public boolean isInvalidPasswordErrorMsgDisplayed()
	    {
	    	return objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_errorMessageInvalidPassword);
	    }
	    public void verifyInvalidPasswordErrorMsgDisplayed()
	    {
	    	objPojo.getObjUtilities().logReporter("Verify Invalid Password message is displayed sucessfully",objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_errorMessageInvalidPassword));
	    }
	    public boolean isInvalidUsernameErrorMsgDisplayed()
	    {
	    	return objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_errorMessageInvalidUesrnameOrPassword);
	    }
	    public void verifyInvalidUsernameErrorMsgDisplayed()
	    {
	    	objPojo.getObjUtilities().logReporter("Verify Invalid Password message is displayed sucessfully",objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_errorMessageInvalidUesrnameOrPassword));
	    }
	    public boolean isInvalidUsernameAndPasswordErrorMsgDisplayed()
	    {
	    	return objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_errorMessageInvalidUesrnameOrPassword);
	    }
	    public void verifyInvalidUsernameAndPasswordErrorMsgDisplayed()
	    {
	    	objPojo.getObjUtilities().logReporter("Verify Invalid Password message is displayed sucessfully",objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_errorMessageInvalidUesrnameOrPassword));
	    }
	    public boolean isBlankPasswordErrorMsgDisplayed()
	    {
	    	return objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_errorMessageForBlankPassword);
	    } 
	    public boolean isBlankUsernameErrorMsgDisplayed()
	    {
	    	return objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_errorMessageForBlankUsername);
	    }
	  
	    public void clickLogout(){
	    	objPojo.getObjUtilities().logReporter("Click 'Logout' button",objPojo.getObjWrapperFunctions().click(loc_linkLogOff));
	    }
}
