package com.abstraction.interfaceEx;

public class Flipkart implements BaseTest{

	
	public Flipkart()
	{
		System.out.println("Open Flipcart Application");
	}
		
	@Override
	public void addToCart() {
		// TODO Auto-generated method stub
		System.out.println("Search product on Flipkart");
		System.out.println("Select product you want to add");
		System.out.println("Click on Add To Cart:");
	}

	@Override
	public void buyNow() {
		System.out.println("Select product:");
		System.out.println("click on buy now");
		System.out.println("Make payment");
		// TODO Auto-generated method stub
		
	}

}
