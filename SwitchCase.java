package com.vstl;

import java.util.Scanner;



public class SwitchCase {
	public void doSwitchCase()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice:");
		int intChoice=sc.nextInt();
	    double doubleRadius=10;
	    double doubleLen=10;
	    double doubleBre=20;
		
		 switch(intChoice)
		 {
		 case 1:
			 System.out.println("Area of Circle:"+(3.14*doubleRadius*doubleRadius));
			 break;
		 case 2:
			 System.out.println("Area of Reactangle:"+(doubleLen*doubleBre));
			 break;
		 case 3:
			 System.out.println("Area of Square:"+(doubleRadius*doubleRadius));
			 break;
		 case 4:
			 System.out.println("Average:"+(doubleRadius+doubleLen+doubleBre)/3);
			 break;
		  default:
			  System.out.println("Enter valid choice:");
			  break;
		 }
			sc.close();	 
		 }
		
	}


