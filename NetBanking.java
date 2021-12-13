package com.abstraction.abstractClass;

public class NetBanking extends BaseTest {

	public NetBanking()
	{
		System.out.println("Payment through NetBanking");
	}
	
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Login to net banking portal");
		System.out.println("Navigate to the Transfer Funds option");
		System.out.println("Select the method of transfer:");
		System.out.println("Select the beneficiary");
		System.out.println("Enter the amount which you wish to transfer:");
	}

}
