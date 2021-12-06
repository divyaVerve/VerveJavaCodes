package com.superKey;

public class SuperChildClass extends SuperParentClass{
int intDuration;

public SuperChildClass(int intId,String strSubName,int intMarks,int intDuration)
{
	super(intId,strSubName,intMarks);
	this.intDuration=intDuration;
}


public void display()
{
	System.out.println("Subject Id:"+intId+"\n"+"Subject Name:"+strSubName+"\n"+"Marks:"+intMarks+"\n"+"Time in minutes:"+intDuration+"");
}
}
