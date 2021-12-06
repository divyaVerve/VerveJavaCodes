package com.poly.methodOverloading;

public class TestMeyhodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading objMethodOverloading=new MethodOverloading();
		objMethodOverloading.calculateArea();
		objMethodOverloading.calculateArea(20, 10);
		objMethodOverloading.calculateArea(10);
		objMethodOverloading.calculateArea(12.5f);
	}
}