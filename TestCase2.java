package com.regression;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

	@Test
	public void validateTitles()
	{
		System.out.println("Beginning");
		String expected_title="Yahoo.com";
		String actual_title="Yahoo.com";
		
		
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actual_title, expected_title);
		
		System.out.println("Validating image");
		softAssert.assertAll();
	}
}
