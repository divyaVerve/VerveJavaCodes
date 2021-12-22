package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public void displayStudentData()
	{
		Set<String> objSet =new HashSet<String>();
		objSet.add("Aarav");
		objSet.add("divya");
		objSet.add("Kanchan");
		objSet.add("Vihan");
		objSet.add("Neha");
		
		System.out.println("Set data:"+objSet.toString());
		System.out.println("Size of set:"+objSet.size());
		System.out.println("Check contain or not:"+objSet.contains("Kanchan"));
		System.out.println("Set is empty or not:"+objSet.isEmpty());
		System.out.println("Remove from set:"+objSet.remove("divya"));
		System.out.println("Add to set:"+objSet.add("Aarav"));
		System.out.println("Add to set:"+objSet.add("Pradnya"));
		System.out.println("Set data:"+objSet.toString());
	}
}
