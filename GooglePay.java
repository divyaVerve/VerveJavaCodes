package com.abstraction.abstractClass;

public class GooglePay extends BaseTest{

	public GooglePay()
	{
		System.out.println("Payment through GooglePay");
	}
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Open GooglePay app");
		System.out.println("Enter Pin");
		System.out.println("Click on New payment");
		System.out.println("Enter mobile number");
		System.out.println("Enter Amount");
	}

}
