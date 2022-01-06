package com.vstl;

import java.util.Arrays;

public class EqualityOfArray {

	public void checkEqualityOfArray()
	{
		 int array1[] = {7, 8, 3};
	     int array2[] = {7, 8, 3};
	      if (Arrays.equals(array1, array2)) 
	    	  System.out.println("Array are Equal");
	      else 
	    	  System.out.println("Array are Not Equal");
	}
	
	public static void main(String[] args) {
		EqualityOfArray objEqualityOfArray=new EqualityOfArray();
		objEqualityOfArray.checkEqualityOfArray();
		
	}

}
