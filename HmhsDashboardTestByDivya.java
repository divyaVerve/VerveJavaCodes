package com.scripts.dashboard;

import java.lang.reflect.Method;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.flows.DashboardFlowByDivya;
import com.flows.LoginLogoutFlowByDivya;
import com.flows.commonFlows.CommonFlow;
import com.generic.BaseTest;
import com.pageFactory.LoginPageByDivya;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

public class HmhsDashboardTestByDivya extends BaseTest{

	// Global variables
	private CommonFlow objCommonFlow;
	private LoginPageByDivya objLoginPageByDivya;
	private DashboardFlowByDivya objDashboardFlowByDivya;
	private LoginLogoutFlowByDivya objLoginLogoutFlowByDivya;
	private String testCaseID="";

	// Initialize Flows
	public void initializeFlowsAndPages() {
		objCommonFlow = new CommonFlow(this);
		objLoginPageByDivya=new LoginPageByDivya(this);
		objLoginLogoutFlowByDivya = new LoginLogoutFlowByDivya(this);
		objDashboardFlowByDivya = new DashboardFlowByDivya(this);
	}

	@BeforeClass(groups = { "P1", "P2", "P3" })
	public void initializeEnvironment() {
		this.initializeWebEnvironment("excel/DRB");
		this.initializeFlowsAndPages();
		/* Resource Name has to be before login */
		objCommonFlow.setResourceName("Khushbu Borole");
		//objLoginLogoutFlow.doLogin();
	}

	@AfterClass(groups = { "P1", "P2", "P3" })
	public void tearDownEnvironment() {
		this.tearDownWebEnvironment();
		objCommonFlow = null;
		objLoginPageByDivya=null;

	}
	
	@BeforeMethod(groups = { "P1", "P2", "P3" })
	public void redirect_Me_To_HomePage_On_SH_Application(Method method) {
		testCaseID = method.getName();
		this.startTestExecutionVideoRecording(testCaseID);
		this.getObjWrapperFunctions().waitFor(5);
		System.out.println("Video Recording Started ....!!");
	}
	
	@AfterMethod
	public void stopVideoRecording(){
		this.stopTestExecutionVideoRecording();
		this.getObjWrapperFunctions().waitFor(5);
		objLoginLogoutFlowByDivya.doLogout();
		System.out.println("Video Recording Stopped ....!!");
	}
	

	@Title("TCID_01_VerifyMenuItemsListOnDashboard")
	@Description("To verify all the menu items in the left menu bar on Dashboard ")
	@Test(priority = 1, groups = { "P1" })
	public void TCID_01_VerifyMenuItemsListOnDashboard() {
		this.loadTestData("TCID_01_VerifyMenuItemsListOnDashboard");
		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
			throw new SkipException("Run Mode 'No'");
		}
		objCommonFlow.openAUT_URL();
		objLoginLogoutFlowByDivya.doLoginWithExcelParameter();
		objDashboardFlowByDivya.verifyAllMenuItemsListOnDashboard();
	//	objDashboardFlow.clickOnMenuItemAndVerifyPageHeader();
		
	}
}
