package com.abstraction.abstractClass;

public class TestBaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BaseTest objBaseTest1=new NetBanking();
       objBaseTest1.payment();
       objBaseTest1.tearDown();
       System.out.println("--------------------------------------------");
       BaseTest objBaseTest2=new GooglePay();
       objBaseTest2.payment();
       objBaseTest2.tearDown();
	}

}
