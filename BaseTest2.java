package com.encapsulation;

public class BaseTest2 extends Season{
  
	public void doDisplay(String strSeason,int intTemp,int intHumidity)
	{
		System.out.println("Enter Season:"+strSeason);
		this.setStrSeason(strSeason);
		System.out.println("Enter temp:"+intTemp);
		this.setIntTemp(intTemp);
		System.out.println("Enter Humidity:"+intHumidity);
		this.setIntHumidity(intHumidity);
	}
}
