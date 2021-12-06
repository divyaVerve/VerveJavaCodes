package com.poly.methodOverriding;

public class CannaraBank extends Bank{
	public CannaraBank()
	{
		System.out.println("Cannara Bank Fixed Deposit:");
	}

	public void getRateOfInterest(int intVal)
	{
		System.out.println("Rate of Interest of Cannara bank:"+intVal+"%");
	}
}
