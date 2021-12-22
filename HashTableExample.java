package com.collection;

import java.util.Hashtable;

public class HashTableExample {

	public Hashtable<String,String> objHashTable;
	
	public HashTableExample(){
		objHashTable=new Hashtable<String,String>();
	}
	public Hashtable<String,String> registerUser()
	{
		objHashTable.put("FirstName:","Divya");
		objHashTable.put("Surname:","Bulgunde");
		objHashTable.put("EmailId:","divya@gmail.com");
		objHashTable.put("Caste:","OBC");
		System.out.println("Hashtable test data:"+objHashTable.toString());
		return objHashTable;
	}
}
