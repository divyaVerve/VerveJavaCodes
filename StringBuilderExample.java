package com.vstl;

public class StringBuilderExample {
	public void doAppend()
	{
		
		StringBuilder objStringBuilder=new StringBuilder("Manual");  
		objStringBuilder.append("Testing");
		System.out.println(objStringBuilder);
	}
	public void doInsert()
	{   StringBuilder objStringBuilder=new StringBuilder("Manual");  
	    objStringBuilder.insert(3,"Java");
		System.out.println(objStringBuilder);
	}
	public void doDelete()
	{   StringBuilder objStringBuilder=new StringBuilder("Manual");  
	    objStringBuilder.delete(1,3);  
		System.out.println(objStringBuilder);
	}
	public void doReverse()
	{ 
		StringBuilder objStringBuilder=new StringBuilder("Manual");   
		objStringBuilder.reverse();  
		System.out.println(objStringBuilder); 
	}


}
