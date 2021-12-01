package com.vstl;

public class TypesofConstructor {
    int value1,value2,value3;
	
    TypesofConstructor(int intNum1,int intNum2,int intNum3)
	{
		value1=intNum1;
		value2=intNum2;
		value3=intNum3;
	}
	public void doCalculate()
	{
		System.out.println("Avrage of numbers:"+(value1+value2+value3)/3);
	}
}
