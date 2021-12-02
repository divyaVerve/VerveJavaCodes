package com.vstl;

public class Variable {
	int intNumber1 = 50; // instance variable
	static int intNumber2 = 100; // static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable objVariable = new Variable();
		System.out.println("First Number:" + objVariable.intNumber1);

		int intNumber3 = 90; // local variable
		System.out.println("Second Number:" + intNumber2);
		System.out.println("Third Number:" + intNumber3);
	}

}
