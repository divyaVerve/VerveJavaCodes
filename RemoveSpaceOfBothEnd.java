package com.vstl;

public class RemoveSpaceOfBothEnd {

	public void display()
	{
		String strVal = new String(" Verve Square ");
	      System.out.println("String: "+strVal);
	      System.out.print("Result after removing spaces of both end:" );
	      System.out.println(strVal.trim() );
	}
	public static void main(String[] args) {
		RemoveSpaceOfBothEnd objRemoveSpaceOfBothEnd=new RemoveSpaceOfBothEnd();
		objRemoveSpaceOfBothEnd.display();

	}

}
