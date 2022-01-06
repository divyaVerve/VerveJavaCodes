package com.vstl;

public class LargestFirstTwoNumber {

	public void displayLargestTwoNumber()
	{
		int intArray[] = {2, 5, 14, 1, 26, 65, 123, 6};
		  // Assign lowest possible int value
		  int firstNum = Integer.MIN_VALUE;
		  int secondNum = Integer.MIN_VALUE;
		  
		  for(int i = 0; i < intArray.length; i++){
		   if(firstNum < intArray[i]){
		    secondNum = firstNum;
		    firstNum = intArray[i];
		   }else if(secondNum < intArray[i]){
		    secondNum = intArray[i];
		   } 
		  }
		  System.out.println("Top two numbers : First -  " 
		     + firstNum + " Second " + secondNum);
		 }
	
	public static void main(String[] args) {
		
		LargestFirstTwoNumber objLargestFirstTwoNumber=new LargestFirstTwoNumber();
		objLargestFirstTwoNumber.displayLargestTwoNumber();
	}

}
