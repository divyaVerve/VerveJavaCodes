package com.vstl;

import java.util.Scanner;

public class SwapWithoutVariable {

	public void doRevese()
	{
		 System.out.println("Enter the value of x and y");  
	        Scanner sc = new Scanner(System.in);  
	        /*Define variables*/  
	        int intNum1 = sc.nextInt();  
	        int intNum2 = sc.nextInt();  
	        sc.close();
	        System.out.println("before swapping numbers: "+intNum1 +" "+ intNum2);  
	       /*Swapping*/  
	        intNum1 = intNum1 + intNum2;   
	        intNum2 = intNum1 - intNum2;   
	        intNum1 = intNum1 - intNum2;   
	        System.out.println("After swapping: "+intNum1 +"  " + intNum2);   
	}
	public static void main(String[] args) {
		SwapWithoutVariable objSwapWithoutVariable=new SwapWithoutVariable();
		objSwapWithoutVariable.doRevese();
	}

}
