package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.LoginLogoutFlow;
import com.flows.MyAccountFlow;
import com.flows.ProductFlow;
import com.generic.BaseTest;
//import com.generic.Utilities;
import com.pageFactory.LoginPage;
import com.pageFactory.MyAccountHomePage;
import com.pageFactory.ProductPage;


public class LoginLogoutTest extends BaseTest{

	private LoginPage objLoginPage;
	private LoginLogoutFlow objLoginLogoutFlow;
	private MyAccountHomePage objMyAccountHomePage;
	private MyAccountFlow objMyAccountFlow;
	private ProductPage objProductPage;
	private ProductFlow objProductFlow;
	
	public void initializeWebPageAndFlows()
	{
		objLoginPage=new LoginPage(this);
		objLoginLogoutFlow=new LoginLogoutFlow(this);
		objMyAccountHomePage=new MyAccountHomePage(this);
		objMyAccountFlow=new MyAccountFlow(this);
		objProductPage=new ProductPage(this);
		objProductFlow=new ProductFlow(this);
	}
	
	
	@BeforeClass
    public void initializePreRequisiteAndEnv() 
    {
    	this.initialiseMeEnvironment();
    	this.initializeWebPageAndFlows();
    }
	
	@Test(priority=1)
	public void TCID_101_verifySignInFunctionality() 
	{
		
		objLoginPage.clickOnLinkSignIn();
		objLoginPage.getAllLinksOnSignInPage();
		objLoginPage.verifySignInPageIsDisplayed();
	//	objLoginLogoutFlow.verifySignInTextIsDisplayed();
		objLoginLogoutFlow.doLogin();
		objMyAccountHomePage.verifyUserIsLoggedInSucessfully();
	}
	@Test(priority=2)
	public void TCID_102_verifySearchFunctionality()
	{
		objMyAccountFlow.doSearch();
	}
	@Test(priority=3)
	public void TCID_103_verifySortBy()
	{
		objProductPage.verifySortBy("Price: Lowest first");
	 
	}
	@Test(priority=4)
	public void TCID_104_verifyProduct()
	{
		objProductFlow.doClickOnProduct();
	}
	@Test(priority=5)
	public void TCID_105_verifyAddToCart()
	{
		objProductFlow.doClickOnAddToCart();
		
	}
	
	
	
	@AfterClass
	public void afterMethodWebEnv() throws InterruptedException
	{
		this.tearDown();
	} 
	
}
