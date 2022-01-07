package com.vstl;

import java.util.Scanner;

public class PrimeNumber1 {

	public void displayPrimeNumber()
	{
		Scanner scanner = new Scanner(System.in);
	      int index =0;
	      int intNum =0;
	      //Empty String
	      String  primeNumbers = "";
	      System.out.println("Enter the value of n:");
	      int n = scanner.nextInt();
	      scanner.close();
	      for (index = 1; index <= n; index++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(intNum =index; intNum>=1; intNum--)
	         {
		    if(index%intNum==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + index + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);
		
	}
	public static void main(String[] args) {
		PrimeNumber1 objPrimeNumber1=new PrimeNumber1();
		objPrimeNumber1.displayPrimeNumber();
	}

}
