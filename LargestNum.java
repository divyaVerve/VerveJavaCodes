package com.practice;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		int intNum1,intNum2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number:");
		intNum1=sc.nextInt();
		System.out.println("Enter second Number:");
		intNum2=sc.nextInt();
		sc.close();
		if(intNum1!=intNum2)
		{
			if(intNum1>intNum2)
			    System.out.println("First Number is Largest:"+intNum1);
			
			else
				System.out.println("Second Number is Largest"+intNum2);
		}
		else
		{
			System.out.println("Both Number are equal");
		}
	}

}
