package com.vstl;

import java.util.Scanner;

public class Factorial {
	
	public void doFactorial()
	{
		 int i,fact=1;  
		 int intNum1;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number:");
		 intNum1=sc.nextInt();
		 sc.close(); 
		 for(i=1;i<=intNum1;i++){    
		      fact=fact*i;    
		 }    
		 System.out.println("Factorial of "+intNum1+" is: "+fact); 
	}

	public static void main(String[] args) {
		Factorial objFactorial=new Factorial();
		objFactorial.doFactorial();
	}

}
