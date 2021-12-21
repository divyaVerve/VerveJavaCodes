package com.exceptionHandling;

public class JavaExceptionHandling {

	
	public int accessArray()
	{
		 try {
	         int intArray[] = new int[5];
	         System.out.println("Access element three :" + intArray[6]);
	      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
	         System.out.println("Exception thrown  :" + arrayIndexOutOfBoundsException.getMessage());
	      } 
	     System.out.println("Out of the block");
		return 0;
	}
	public int divide(int intNum1,int intNum2)
	{
	int intResult=0;
	try{
		intResult=intNum1/intNum2;
		return intResult;
	}catch (ArithmeticException arithmeticException)
	{
		System.out.println("I got Exception:"+arithmeticException.getMessage());
		return intResult;
	}catch (NullPointerException nullPointerException)
	{
		System.out.println("I got Exception:"+nullPointerException.getMessage());
		return intResult;
	}
	}
	{
		
	}
}
