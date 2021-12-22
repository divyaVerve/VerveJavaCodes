package com.collection;

import java.util.List;

public class TestListExample {

	public static void main(String[] args) {
		ListExample objListExample=new ListExample();
		objListExample.displayStuData();
		
		System.out.println("===================================");
		
		List<String> list=objListExample.getStudentDetails();
		for(int index=0;index<list.size();index++)
		{
			if(list.get(index).equals("Pratik")){
				System.out.println("Test Passed:");
				break;
			}else {
				System.out.println("Test Failed:");
			}
		}
		System.out.println("==================================");
		objListExample.displayStudentDataUsingIteration();
	}

	
}
