package com.abstraction.abstractClass;

public abstract class BaseTest {

	public abstract void payment();
	
	public void tearDown()
	{
		System.out.println("close application");
	}
}
