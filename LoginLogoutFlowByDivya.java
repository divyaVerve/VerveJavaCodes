package com.flows;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.flows.commonFlows.CommonFlow;
import com.generic.Pojo;
import com.pageFactory.DashboardPage;
import com.pageFactory.LoginPage;
import com.pageFactory.LoginPageByDivya;
import com.popupFactory.ConfirmLogOffPopUpPage;
import com.popupFactory.SelectRolePopUpPage;

import ru.yandex.qatools.allure.annotations.Step;

public class LoginLogoutFlowByDivya {

	// Global Variable
		private Pojo objPojo;
		private String strUniqueKey = "";
		private String testData = "", testData_2 = "";
		private Integer intTestData = null;
		private Integer intTestData_1 = null;
		private String strReturnVal = "";
		private String strReturnVal_1 = "";
		private int intReturnVal = 0;
		private boolean blnReturnStatus = false;
		private double dblReturnVal = 0.0;
		private List<WebElement> listReturnElement;
		private WebElement weReturnElement;
		private int intRow = 0;
		private int intColumn = 0;

		// Reference object of Pages
		private LoginPageByDivya objLoginPageByDivya;
		private CommonFlow objCommonFlow;
		private SelectRolePopUpPage objSelectRolePopUpPage;
		private DashboardPage objDashboardPage;
		private ConfirmLogOffPopUpPage objConfirmLogOffPopUpPage;

		// Constructor of class
		public LoginLogoutFlowByDivya(Pojo pojo) {
			this.objPojo = pojo;
			objLoginPageByDivya = new LoginPageByDivya(objPojo);
			objCommonFlow = new CommonFlow(objPojo);
			objSelectRolePopUpPage = new SelectRolePopUpPage(objPojo);
			objDashboardPage = new DashboardPage(objPojo);
			objConfirmLogOffPopUpPage = new ConfirmLogOffPopUpPage(objPojo);
		}
		
		@Step("Login into the system.")
		public void doLoginWithExcelParameter() {
			//testData=objPojo.getObjUtilities().dpString("firstName");
			//System.out.println("My First Name:"+testData);
			//testData=objPojo.getObjUtilities().dpString("lastName");
			//System.out.println("My Surname:"+testData);
			testData = objPojo.getObjUtilities().dpString("userid");
			if (!testData.equals(""))
				objLoginPageByDivya.setUserID(testData);
			testData = objPojo.getObjUtilities().dpString("userpasswd");
			if (!testData.equals(""))
				objLoginPageByDivya.setPassword(testData);
			testData = objPojo.getObjUtilities().dpString("LoginWithOption");
			if(!testData.equals(""))
			objLoginPageByDivya.selectLoginWithOptions(testData);
			objLoginPageByDivya.clickGetStarted();
			objPojo.getObjWrapperFunctions().waitFor(2);
			if(objLoginPageByDivya.isInvalidPasswordErrorMsgDisplayed())
			{
				objPojo.getObjUtilities().logReporter("Getting Invalid password error message displayed", true);
				
			} 
			else	if(objLoginPageByDivya.isInvalidUsernameErrorMsgDisplayed())
			{
				objPojo.getObjUtilities().logReporter("Getting Invalid Username error message displayed", true);
				
			}
			else	if(objLoginPageByDivya.isInvalidUsernameAndPasswordErrorMsgDisplayed())
			{
				objPojo.getObjUtilities().logReporter("Getting Invalid Username and Password error message displayed", true);
			}
			else if(objLoginPageByDivya.isBlankUsernameErrorMsgDisplayed()&& objLoginPageByDivya.isBlankPasswordErrorMsgDisplayed())
			{
				objPojo.getObjUtilities().logReporter("Getting Blank Username and Password", true);
			}
			else if(objLoginPageByDivya.isBlankPasswordErrorMsgDisplayed())
			{
				objPojo.getObjUtilities().logReporter("Getting Blank Password", true);
			} 
			else if(objLoginPageByDivya.isBlankUsernameErrorMsgDisplayed())
			{
				objPojo.getObjUtilities().logReporter("Getting Blank Username", true);
			}
			
			else {
			objSelectRolePopUpPage.verifySelectRolePopupPageIsDisplayed();
			testData = objPojo.getObjUtilities().dpString("SelectUserRole");
			if(!testData.equals(""))
				objSelectRolePopUpPage.selectUserRole(testData);
			objSelectRolePopUpPage.clickProceedOnSelectRolePopupPage();
			 objPojo.getObjWrapperFunctions().waitForLoaderToDisappear();
			testData = objPojo.getObjUtilities().dpString("loginTitle");
			if(!testData.equals(""))
				objLoginPageByDivya.verifyUserLoggedIn(testData);
			}
		}
			
		@Step("Logout eMedicareSync application")
		public void doLogout(){
			if(objDashboardPage.isCloseCrossButtonIsDisplayed())
				//objDashboardPage.clickCrossCloseButton();
				
			objDashboardPage.clickUserIcon();
			if(objDashboardPage.isLogOffPopUpIsDisplayed()){
				//objDashboardPage.clickLogOff();
				objLoginPageByDivya.clickLogout();
				objDashboardPage.verifyPageHeaderIsDisplayed("Confirm Log Off");
				objConfirmLogOffPopUpPage.clickYesOrNoOnConfirmLogOffPopupPage("Yes");
			}else {
				objDashboardPage.clickUserIcon();
				//objDashboardPage.clickLogOff();
				objLoginPageByDivya.clickLogout();
				objDashboardPage.verifyPageHeaderIsDisplayed("Confirm Log Off");
				objConfirmLogOffPopUpPage.clickYesOrNoOnConfirmLogOffPopupPage("Yes");
			}
			
		}

}
