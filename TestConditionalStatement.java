package com.vstl;

import java.util.Scanner;

public class TestConditionalStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice:");
		int intChoice=sc.nextInt();
		
		switch(intChoice)
		{
		case 1:
			ConditionalStatement objConditionalStatement=new ConditionalStatement();
			objConditionalStatement.doNestedIf();
			break;
		case 2:
			SwitchCase objSwitchCase =new SwitchCase();
			objSwitchCase.doSwitchCase();
			break;

		}
		
		sc.close();
	}

}
