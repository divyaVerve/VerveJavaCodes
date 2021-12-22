package com.collection;

import java.util.Hashtable;

public class TestHashTableExample {

	public static void main(String[] args) {
		HashTableExample objHashTableExample=new HashTableExample();
		Hashtable<String,String> testData;
		testData=objHashTableExample.registerUser();
		
		System.out.println("Set FirstName:"+testData.get("FirstName:"));
        System.out.println("Set Surname:"+testData.get("Surname:"));
        System.out.println("Set Email id:"+testData.get("EmailId:"));
        System.out.println("Set Caste:"+testData.get("Caste:"));
	}

}
