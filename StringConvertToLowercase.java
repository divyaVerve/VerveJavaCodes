package com.vstl;

public class StringConvertToLowercase {

	public void doConvertInLowerCase()
	{
		String strVal = "VERVE SQUARE Technology";
        String lowerStr = strVal.toLowerCase();
        System.out.println("Original String: " + strVal);
        System.out.println("String in lowercase: " + lowerStr);
	}
	public static void main(String[] args) {
		StringConvertToLowercase objStringConvertToLowercase=new StringConvertToLowercase();
		objStringConvertToLowercase.doConvertInLowerCase();

	}
}
