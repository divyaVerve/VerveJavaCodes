package com.encapsulation.scripts;

import com.encapsulation.BaseTest2;

public class TestBaseTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseTest2 objBaseTest2=new BaseTest2();
		objBaseTest2.doDisplay("Winter", 31, 40);
		System.out.println("==================================");
		System.out.println("get season name from season:"+objBaseTest2.getStrSeason());
		System.out.println("get season temperature from season:"+objBaseTest2.getIntTemp());
		System.out.println("get season humidity from season:"+objBaseTest2.getIntHumidity());
	}

}
