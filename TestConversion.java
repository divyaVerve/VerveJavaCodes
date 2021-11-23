package com.vstl;

public class TestConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeConversion objTypeConversion = new TypeConversion();
		objTypeConversion.dosubtraction(20, 50);

		String strValue = "30";
		int intNumber3 = Integer.parseInt(strValue);
		objTypeConversion.dosubtraction(5, intNumber3);

		objTypeConversion.doConversion();

	}

}