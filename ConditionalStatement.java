package com.vstl;

import java.util.Scanner;

public class ConditionalStatement {

	public void doNestedIf()
	{
		/* Display Grade using Nested if-else
		   if intStuMark>=35 : pass
		   if intStuMark>=50 : Grade c
		   if intStuMark>=75 : Grade B
		   if intStuMark>=90 : Grade A
		 
		 */
		 int intStuMark;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Marks of Student:");
		 intStuMark=sc.nextInt();
		 
		 if(intStuMark>=35)
		 {
			 if(intStuMark>=50)
			 {
				 if(intStuMark>=75)
				 {
					if(intStuMark>=90)
					{
						System.out.println("Student Grade:A");
					}
					else
					System.out.println("Student Grade:B");
				 }
				 else
					 System.out.println("Student Grade:C");
			 }
		 }
		 else
		 {
			 System.out.println("Student is Fail:");
		 }
		 sc.close();
	}
}
