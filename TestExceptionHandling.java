package com.exceptionHandling;

public class TestExceptionHandling {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExceptionHandling objJavaExceptionHandling=new JavaExceptionHandling();
		objJavaExceptionHandling.accessArray();
		
		int intResultVal=objJavaExceptionHandling.divide(56, 0);
		System.out.println("Division:"+intResultVal);
	}

}
