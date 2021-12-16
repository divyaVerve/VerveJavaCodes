package com.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int intNum1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		intNum1=sc.nextInt();
		sc.close();
		int intRev = 0;
		int intTemp=intNum1;
		while (intNum1 > 0) {
			int intNum2 = intNum1 % 10;
			intRev = intRev * 10 + intNum2;
			intNum1 = intNum1 / 10;

		}
		System.out.println("Reverse Number:" + intRev);
		if(intTemp==intRev)
			 System.out.println("Number is palindrome");
			else
				System.out.println("Number is not palindrome");
	}

}
