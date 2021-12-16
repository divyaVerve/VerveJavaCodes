package com.reverse;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strArray[]="This is an easy Java Program".split(" ");
		String strRev=" ";
		for(int index=strArray.length-1;index>=0;index--)
		{
			strRev += strArray[index]+" ";
		}
		System.out.println("Reverse String:"+strRev);
	}

}
