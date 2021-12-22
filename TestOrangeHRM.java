package com.orangeHRM.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.orangeHRM.pageFactory.OrangeHRM;


public class TestOrangeHRM extends BaseTest{

	OrangeHRM objOrangeHRM;
	Utilities objUtilities;
	
	@BeforeClass
    public void beforeMethod() 
    {
    	this.initialiseMeEnvironment();
    	objOrangeHRM=new OrangeHRM(this);
    	objUtilities=new Utilities();
    }
	
	@Test(priority=1)
	public void TC_001()
	{
		objOrangeHRM.verifyLoginPage();
	}
	
	@Test(priority=2)
	public void TC_002()
	{
		objOrangeHRM.verifyPIMSearch();
	}
	
	@Test(priority=3)
	public void TC_003()
	{
		objOrangeHRM.verifyPIMReset();
	}
	
	@Test(priority=4)
	public void TC_004()
	{
		objOrangeHRM.verifyDelete();
	}
	
	@Test(priority=5)
	public void TC_005()
	{
		String strName1=objUtilities.getRandomFirstName()+objUtilities.getRandomStrings(2);
		objOrangeHRM.enterFirstName(strName1);
		String strName2=objUtilities.getRandomFirstName()+objUtilities.getRandomStrings(2);
		objOrangeHRM.enterMiddleName(strName2);
		String strName3=objUtilities.getRandomFirstName()+objUtilities.getRandomStrings(2);
		objOrangeHRM.enterLastName(strName3);
	} 
	
	@AfterClass
	public void afterMethod() throws InterruptedException
	{
		this.tearDown();
	}

}
