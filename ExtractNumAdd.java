package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="Wg8nnj3f67";
    Pattern val=Pattern.compile("[0-9]");
    Matcher match=val.matcher(str);
    int intSum=0;
    while(match.find())
    {
    	intSum=intSum+Integer.parseInt(match.group());
    }
    System.out.println("Sum of extracted numbers:"+intSum);
	}

}
