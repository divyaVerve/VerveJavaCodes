package com.abstraction.interfaceEx;

public class Amazon implements BaseTest {
	
	public Amazon()
	{
		System.out.println("Open Amazon Application");
	}

	@Override
	public void addToCart() {
		// TODO Auto-generated method stub
		System.out.println("Search product on Amazon");
		System.out.println("Select product you want to add");
		System.out.println("Click on Add To Cart:");
	}

	@Override
	public void buyNow() {
		// TODO Auto-generated method stub
		System.out.println("Select product:");
		System.out.println("click on buy now");
	}

}
