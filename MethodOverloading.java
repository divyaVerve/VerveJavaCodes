package com.poly.methodOverloading;

public class MethodOverloading {

	public void calculateArea()
	{
		System.out.println("Area");
	}
	public void calculateArea(int length,int breadth)
	{
		System.out.println("Area of Rectangle:"+(length*breadth));
	}
	public void calculateArea(int radius)
	{
		System.out.println("Area of circle:"+(3.14*radius*radius));
	}
	public void calculateArea(float side)
	{
		System.out.println("Area of square:"+(side*side));
	}
}
