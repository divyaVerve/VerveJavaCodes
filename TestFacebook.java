package com.accessTest;

import com.accessModifiers.Facebook_2;
import com.accessSpecifiers.Facebook_3;

public class TestFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook_3 objFacebook_3=new Facebook_3();
		Facebook_2 objFacebook_2=new Facebook_2();
		System.out.println("Within the class");
		objFacebook_3.doDisplay1();
		System.out.println("============================================");
		System.out.println("Within the Package");
		objFacebook_2.doDisplay2();
		System.out.println("============================================");
		System.out.println("Outside the Package");
		objFacebook_3.doDisplay3();
		
	}

}
