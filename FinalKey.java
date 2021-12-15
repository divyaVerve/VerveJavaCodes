package com.finalKeyword;

public class FinalKey {

	final double doublePI=3.14;
	
	public void calPerimeter(int intRadius)
	{
		System.out.println("Perimeter of circle:"+(2*doublePI*intRadius));
	}
	public void calArea(int intRadius)
	{
		System.out.println("Area of circle:"+(doublePI*intRadius*intRadius));
	}
}
