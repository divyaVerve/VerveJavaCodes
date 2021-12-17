package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.BaseTest5;

public class SearchFlights {

	 public BaseTest5 objBaseTest5;
	 public SearchFlights(BaseTest5 baseTest5)
	 {
		 this.objBaseTest5=baseTest5;
	 }
	 public void enterSource(String strSource) throws InterruptedException
		{
		   Thread.sleep(2000);
			By loc_enterSource=By.xpath("//div/h4[text()='From']/following-sibling::div//input");
			objBaseTest5.getObjSeleniumWrapperFunction5().setText(loc_enterSource,strSource );
			
			//By loc_inpSelectDay=By.xpath("p[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']");
			//objBaseTest5.getObjSeleniumWrapperFunctions().selectByValue(loc_inpSelectDay);
			////p[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']
		}
	 public void fromCity(String str)
	 {
		 By loc_fromCity=By.xpath("p[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']");
			objBaseTest5.getObjSeleniumWrapperFunction5().doSelectByVisibleText(loc_fromCity,str);
	 }
}
