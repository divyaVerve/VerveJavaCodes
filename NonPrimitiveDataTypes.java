package javaBasics;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String
        String strName="Verve Square Technology";
        System.out.println("Company Name="+strName);
        
        //Array : to store similar data types values in a variable.
        int array[]=new int[3];
        array[0]=20;
        array[1]=40;
        array[2]=78;
       
        //print all the values of array using for loop. 
        for(int j=0;j<array.length;j++)
        {
        	System.out.println(array[j]);
        }
       
         //Two dimentional array
        char twoArray[][]=new char[3][4];
        //first row
        twoArray[0][0]='A';
        twoArray[0][1]='B';
        twoArray[0][2]='C';
        twoArray[0][3]='D';
        
        //first row
        twoArray[1][0]='E';
        twoArray[1][1]='F';
        twoArray[1][2]='G';
        twoArray[1][3]='I';
        
        //first row
        twoArray[2][0]='K';
        twoArray[2][1]='L';
        twoArray[2][2]='M';
        twoArray[2][3]='N';
        
        //print all the values of array using for loop
        for(int row=0;row<twoArray.length;row++)
        {
        	for(int col=0;col<twoArray[0].length;col++)
        	{
        		System.out.println(twoArray[row][col]);
        	}
        }
	}

}
