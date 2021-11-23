package com.vstl;

public class TypeConversion {
    
	public int dosubtraction(int intValue1,int intValue2)
	{

		int intSubtraction = intValue2 - intValue1;
		System.out.println("Subtraction:"+intSubtraction);
		return intSubtraction;
		
		
	}
	public void doConversion()
	{
		 double doubleNum=102.23;
	     float floatNum=(float)doubleNum;    //converting double data type into float data type
	     long longNum=(long)floatNum;        //converting float data type into long data type
	     int intNum=(int)longNum;            //converting long data type into int data type
	     char charVal=(char)intNum;          //converting int data type into char data type
	     short shortNum=(short)charVal;      //converting char data type into short data type
	     byte byteNum=(byte)shortNum;        //converting short data type into byte data type
	     
	     System.out.println("Before coversion:"+doubleNum);
	     System.out.println("After conversion into float:"+floatNum);
	     System.out.println("After conversion into long:"+longNum);
	     System.out.println("After conversion into int:"+intNum);
	     System.out.println("After conversion into char:"+charVal);
	     System.out.println("After conversion into short:"+shortNum);
	     System.out.println("After conversion into byte:"+byteNum);
	}
}
