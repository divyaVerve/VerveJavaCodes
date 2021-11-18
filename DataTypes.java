package javaBasics;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value:");
		r=sc.nextInt();
		sc.close();
		System.out.println("Area of square="+(r*r));
		System.out.println("Area of Circle="+(3.14*r*r));
	}

}
