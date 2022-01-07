package com.vstl;

import java.util.Scanner;

public class SwapUsingThirdVariable {

	public void doSwap()
	{
		 int intFirst, intSecond, intTemp;// x and y are to swap   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       intFirst = sc.nextInt();  
	       intSecond = sc.nextInt();  
	       sc.close();
	       System.out.println("before swapping numbers: "+intFirst +"  "+ intSecond);  
	       /*swapping */  
	       intTemp = intFirst;  
	       intFirst = intSecond;  
	       intSecond = intTemp;  
	       System.out.println("After swapping: "+intFirst +"   " + intSecond);  
	       System.out.println( );  
	}
	public static void main(String[] args) {
		
		SwapUsingThirdVariable objSwapUsingThirdVariable=new SwapUsingThirdVariable();
		objSwapUsingThirdVariable.doSwap();
	}

}
