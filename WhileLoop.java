package com.vstl;

public class WhileLoop {

	public void doReverseNum(int intNum1) {

		int intRev = 0,intTemp=intNum1;
		while (intNum1 > 0) {
			int intNum2 = intNum1 % 10;
			intRev = intRev * 10 + intNum2;
			intNum1 = intNum1 / 10;

		}
		System.out.println("Reverse Number:" + intRev);
		if(intTemp==intRev)
			 System.out.println("Number is palindrome");
			else
				System.out.println("Number is not palindrome");

	}

}
