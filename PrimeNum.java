package com.practice;

public class PrimeNum {

	public static void main(String[] args) {
		 int intNum = 27;
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

}
