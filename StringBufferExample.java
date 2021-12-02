package com.vstl;

public class StringBufferExample {
	public void doAppend()
	{
		
		StringBuffer objStringBuffer=new StringBuffer("Automation");  
		objStringBuffer.append("Testing");
		System.out.println(objStringBuffer);
	}
	public void doInsert()
	{   StringBuffer objStringBuffer=new StringBuffer("Automation"); 
		objStringBuffer.insert(3,"Java");
		System.out.println(objStringBuffer);
	}
	public void doDelete()
	{   StringBuffer objStringBuffer=new StringBuffer("Automation"); 
    	objStringBuffer.delete(1,3);  
		System.out.println(objStringBuffer);
	}
	public void doReverse()
	{ 
		StringBuffer objStringBuffer=new StringBuffer("Automation"); 
		objStringBuffer.reverse();  
		System.out.println(objStringBuffer); 
	}

}
