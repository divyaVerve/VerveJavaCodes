package com.vstl;

import java.util.Scanner;

public class ForLoop {

	public void doForLoop()

	{
		Scanner scannerSc = new Scanner(System.in);
		System.out.println("Enter number:");
	    int intNum=scannerSc.nextInt();

		for (int index = 1; index <= 10; index++) {
			System.out.println(intNum + "*" + index + "=" + intNum * index);
		}
		scannerSc.close();
		
	}

}
	

