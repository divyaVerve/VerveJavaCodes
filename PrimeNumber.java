package com.vstl;

import java.util.Scanner;

public class PrimeNumber {

	public void checkPrimeNumber()
	{
		 int intNum;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");
			intNum=sc.nextInt();
			sc.close();
		    boolean flag = false;
		    for (int index = 2; index <= intNum / 2; ++index) {
		      // condition for non prime number
		      if (intNum % index == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(intNum + " is a prime number.");
		    else
		      System.out.println(intNum + " is not a prime number.");
	}
	public static void main(String[] args) {
		PrimeNumber objPrimeNumber=new PrimeNumber();
		objPrimeNumber.checkPrimeNumber();
	}

}
