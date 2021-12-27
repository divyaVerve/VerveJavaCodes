package com.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

	@Test(dataProvider="getData")
	public void doSignIn(String strUsername,String strPassword)
	{
		System.out.println("Username:"+strUsername+"Password:"+strPassword);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[3][2];
		
		data[0][0]="Divya123@gmail.com";
		data[0][1]="Divya12";
		
		data[1][0]="Kanchan123@gmail.com";
		data[1][1]="kanch12";
		
		data[2][0]="Pradnya123@gmail.com";
		data[2][1]="pra12";
		
		
		return data;
		
	}
	
}
