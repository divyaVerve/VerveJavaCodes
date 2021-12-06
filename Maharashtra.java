package com.poly.methodOverriding;

public class Maharashtra extends Bank {
	public Maharashtra()
	{
		System.out.println("Maharashtra Bank Fixed Deposite:");
	}
	public void getRateOfInterest(int intVal)
	{
		System.out.println("Rate of Interest of Maharashtra bank:"+intVal+"%");
	}
}