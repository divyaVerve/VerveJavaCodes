package com.vstl;

import java.util.Scanner;

public class ReverseNumber {

	public void doReverse()
	{
		 int intNum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		intNum=sc.nextInt();
		sc.close();
				int reverse = 0;  
		while(intNum != 0)   
		{  
		int remainder = intNum % 10;  
		reverse = reverse * 10 + remainder;  
		intNum = intNum/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}
	public static void main(String[] args) {
		ReverseNumber objReverseNumber=new ReverseNumber();
		objReverseNumber.doReverse();

	}

}
