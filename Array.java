package com.vstl;

import java.util.Scanner;

public class Array {
	public void array()
	{
		String strEmpName[]=new String[3];
		String strDept[]=new String[3];
		int intWorkHr[]=new int[3];
		Scanner scannerSc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Name of Employee:");
			strEmpName[i]=scannerSc.next();
			System.out.println("Enter Name of Department:");
			strDept[i]=scannerSc.next();
			System.out.println("Enter Working hours:");
			intWorkHr[i]=scannerSc.nextInt();
		}
		
		for(int j=0;j<3;j++)
		{
			System.out.println(strEmpName[j]);
			System.out.println(strDept[j]);
			System.out.println(intWorkHr[j]);
			
		}
		
		
		scannerSc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	  Scanner scannerSc=new Scanner(System.in);
		 System.out.println("Enter size of Array:");
		 int intSize=scannerSc.nextInt();
		 int intArray[]=new int[intSize];
		 
         System.out.println("Enter the Elements:");
		 for(int i=0;i<intSize;i++)
		 {
			 
			 intArray[i]=scannerSc.nextInt();
		 }
		 
		 scannerSc.close();
		 System.out.println("Printing all elements of array:");
		 for(int i=0;i<intArray.length;i++)
		 {
			 System.out.println(intArray[i]);
		 }  */
	}

 
}
