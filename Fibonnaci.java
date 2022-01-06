package com.vstl;

public class Fibonnaci {

	public void dofibonnaci()
	{
	 int intNum1=0,intNum2=1,intNum3,index,count=10;    
	 System.out.print(intNum1+" "+intNum2);//printing 0 and 1    
	    
	 for(index=2;index<count;++index)//loop starts from 2 because 0 and 1 are already printed    
	 {    
		 intNum3=intNum1+intNum2;    
	  System.out.print(" "+intNum3);    
	  intNum1=intNum2;    
	  intNum2=intNum3;  
	 }
    }
}
