package com.poly.methodOverriding;

public class TestMethodOverriding{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank objBank=new Bank();
		objBank.getRateOfInterest(10);
		System.out.println("=======================================");
		CannaraBank objCannaraBank=new CannaraBank(); 
		objCannaraBank.getRateOfInterest(9);
		System.out.println("=======================================");
		IndianBank objIndianBank=new IndianBank();
		objIndianBank.getRateOfInterest(7);
		System.out.println("=======================================");
		Maharashtra objMaharashtra=new Maharashtra();
		objMaharashtra.getRateOfInterest(8);
	}

}
