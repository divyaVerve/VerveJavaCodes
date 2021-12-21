package com.herokuApp.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.herokuapp.pageFactory.HeroKuApp;


public class TestHeroKuApp extends BaseTest{

	HeroKuApp objHeroKuApp;
	Utilities objUtilities;
	
	@BeforeClass
    public void beforeMethod() 
    {
    	this.initialiseMeEnvironment();
    	objHeroKuApp=new HeroKuApp(this);
    	objUtilities=new Utilities();
    }
	@Test(priority=1)
	public void verifyBasic()
	{
		objHeroKuApp.verifyBasicAuth();
	}
@Test(priority=5)
	public void verifyFrameModule()
	{
		objHeroKuApp.verifyFrame();
	}
    @Test(priority=4)
   public void verifyselectDrop()
   {
    	objHeroKuApp.verifyDropDown();
   }
	
	@Test(priority=3)
	public void verifyHerokuApp() 
	{
		objHeroKuApp.verifyDragAndDrop();
		
	}
	
	@AfterClass
	public void afterMethod() throws InterruptedException
	{
		this.tearDown();
	}
	
	
	

}
