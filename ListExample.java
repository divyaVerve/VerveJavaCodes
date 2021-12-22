package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListExample {

	public void displayStuData()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Aarav");
		list.add("divya");
		list.add("Kanchan");
		list.add("Vihan");
		list.add("Neha");
		
		System.out.println("Student List Data:"+list.toString());
		System.out.println("Student Name:"+list.get(3));
		System.out.println("Remove:"+list.remove(2));
		System.out.println("Student List Data:"+list.toString());
		System.out.println("Size:"+list.size());
		System.out.println("Add new Student:"+list.add("priya"));
		System.out.println("Contains:"+list.contains("Aarav"));
		System.out.println("Add new Student:"+list.add("divya"));
		System.out.println("Student List Data:"+list.toString());
	}
	
	public List<String> getStudentDetails(){
		List<String> list=new ArrayList<>();
		list.add("Sneha");
		list.add("Patil");
		list.add("Grade:A");
		
		list.add("Pratik");
		list.add("Dhande");
		list.add("Grade:B");
		
	return list;
	}
	
	public void displayStudentDataUsingIteration()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Aarav");
		list.add("divya");
		list.add("Kanchan");
		list.add("Vihan");
		list.add("Neha");
		
		Iterator<String> itr=list.iterator();
		while (itr.hasNext()) {
			String string=(String) itr.next();
			System.out.println("Student Data:"+string);
		}
	}
}
