package com.vstl;

import java.util.Scanner;

public class LargestNumber {

	public void displayLargestNumber()
	{
		//int intNum1 = 10, intNum2 = 20, intNum3 = 7;
		int intNum1,intNum2,intNum3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		intNum1=sc.nextInt();
		System.out.println("Enter Second number:");
		intNum2=sc.nextInt();
		System.out.println("Enter Third number:");
		intNum3=sc.nextInt();
        sc.close();
	      if( intNum1 >= intNum2 && intNum1 >= intNum3)
	          System.out.println(intNum1+" is the largest Number");

	      else if (intNum2 >= intNum1 && intNum2 >= intNum3)
	          System.out.println(intNum2+" is the largest Number");

	      else
	          System.out.println(intNum3+" is the largest Number");
	}
	public static void main(String[] args) {
		LargestNumber objLargestNumber=new LargestNumber();
		objLargestNumber.displayLargestNumber();

	}

}
