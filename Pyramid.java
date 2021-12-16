package com.practice;

public class Pyramid {

	public static void main(String[] args) {
		int intVal1, intVal2, row = 3;       
		//Outer loop work for rows  
		for (intVal1=0; intVal1<row; intVal1++)   
		{  
		//inner loop work for space      
		for (intVal2=row-intVal1; intVal2>1; intVal2--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (intVal2=0; intVal2<=intVal1; intVal2++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}  

	}

}
