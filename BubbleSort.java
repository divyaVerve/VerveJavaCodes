package com.vstl;

public class BubbleSort {

	  void bubbleSort(int array[])
	    {
	        int intNum = array.length;
	        for (int i = 0; i < intNum-1; i++)
	            for (int j = 0; j < intNum-i-1; j++)
	                if (array[j] > array[j+1])
	                {
	                   
	                    int temp = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = temp;
	                }
	    }
	 
	    /* Prints the array */
	    void printArray(int array[])
	    {
	        int intNum = array.length;
	        for (int i=0; i<intNum; ++i)
	            System.out.print(array[i] + " ");
	        System.out.println();
	    }
}
