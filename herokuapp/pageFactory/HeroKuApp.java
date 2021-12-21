package com.herokuapp.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;

public class HeroKuApp {

	public BaseTest objBaseTest;
	
	public HeroKuApp(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}
	//locators of autitentication
	By loc_linkBasicAuth=By.xpath("//a[text()='Basic Auth']");
	
	//locators of frame
	By loc_linkFrame=By.xpath("//a[text()='Frames']");
	By loc_linkNestedFrame=By.xpath("//a[text()='Nested Frames']");
	By loc_linkIFrame=By.xpath("//a[text()='iFrame']");
	
	//locators of DropDown
	By loc_linkDropDown=By.xpath("//a[text()='Dropdown']");
	By loc_DropDown=By.xpath("//select[@id='dropdown']");
	
	//locators of drag and drop
	By loc_linkDragDrop=By.xpath("//a[text()='Drag and Drop']");
	By loc_txtDragDrop=By.xpath("//h3[text()='Drag and Drop']");
	By loc_dragA=By.xpath("//h3[text()='Drag and Drop']/following::div[@id='column-a']");
	By loc_dropB=By.xpath("//h3[text()='Drag and Drop']/following::div[@id='column-b']");
	
	public void verifyBasicAuth()
	{
	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkBasicAuth);
	
	objBaseTest.getObjSeleniumWrapperFunctions().navigateToBack();
	}
	public void verifyFrame()
	{
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkFrame);
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkNestedFrame);
		objBaseTest.getObjSeleniumWrapperFunctions().navigateToBack();
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkIFrame);
		objBaseTest.getObjSeleniumWrapperFunctions().navigateToBack();
		objBaseTest.getObjSeleniumWrapperFunctions().navigateToBack();
		
	}
	public void verifyDropDown()
	{
		
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkDropDown);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().selectDropDownOption(loc_DropDown,"Option 2"));
		objBaseTest.getObjSeleniumWrapperFunctions().navigateToBack();
		objBaseTest.getObjSeleniumWrapperFunctions().setExplicitWait(loc_linkDropDown);
		
	}
	
	public void verifyDragAndDrop() 
	{
		objBaseTest.getObjSeleniumWrapperFunctions().navigateToRefresh();
		//objBaseTest.getDriver().navigate().back();
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkDragDrop);
		String strDragDrop=objBaseTest.getObjSeleniumWrapperFunctions().getText(loc_txtDragDrop);
		Assert.assertTrue(strDragDrop.equals("Drag and Drop"));
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().dragAndDrop(loc_dragA,loc_dropB));
		objBaseTest.getObjSeleniumWrapperFunctions().navigateToBack();
	}
	
}
