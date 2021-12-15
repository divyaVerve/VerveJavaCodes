package com.abstraction.interfaceEx;

public class TestBestTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BaseTest objBaseTest1=new  Flipkart();
     objBaseTest1.addToCart();
     objBaseTest1.buyNow();
     System.out.println("===========================================");
     BaseTest objBaseTest2=new  Amazon();
     objBaseTest2.addToCart();
     objBaseTest2.buyNow();
	}

}
