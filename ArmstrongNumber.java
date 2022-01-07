package com.vstl;

import java.util.Scanner;

public class ArmstrongNumber {

	public void checkArmstrong()
	{
		 int intNum1;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number:");
		 intNum1=sc.nextInt();
		 sc.close();
		 int  intVal, temp, total = 0;

		 intVal = intNum1;
	        while (intVal != 0)
	        {
	            temp = intVal % 10;
	            total = total + temp*temp*temp;
	            intVal /= 10;
	        }

	        if(total == intNum1)
	            System.out.println(intNum1 + " is an Armstrong number");
	        else
	            System.out.println(intNum1 + " is not an Armstrong number");
	}
	public static void main(String[] args) {
		ArmstrongNumber objArmstrongNumber=new ArmstrongNumber();
		objArmstrongNumber.checkArmstrong();
	}

}
