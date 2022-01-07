package com.vstl;

public class ReverseString {

	public void doReverse()
	{
		
		String strArray[]="This is an easy Java Program".split(" ");
		
		String strRev=" ";
		for(int index=strArray.length-1;index>=0;index--)
		{
			strRev += strArray[index]+" ";
		}
		System.out.println("Reverse String:"+strRev);
	}
	
	public static void main(String[] args) {
		
		ReverseString objReverseString=new ReverseString();
		objReverseString.doReverse();
	}

}
