package com.poly.methodOverriding;

public class IndianBank extends Bank{
	public IndianBank()
	{
		System.out.println("Indian Bank Fixed Deposit:");
	}
	public void getRateOfInterest(int intVal)
	{
		System.out.println("Rate of Interest of Indian bank:"+intVal+"%");
	}
}
