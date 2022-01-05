package com.script.HighlightColor;

import org.testng.annotations.Test;

import com.generic.Utility;

public class TestUtility {

	public Utility objUtility=new Utility();
	@Test
	public void verifyColor() throws Exception
	{
		//String strColor=objUtility.getColorOfCell(1, 1);
		//System.out.println("InVerifyColor:"+strColor);
		objUtility.readHighlightFromExcel();
	}
}
