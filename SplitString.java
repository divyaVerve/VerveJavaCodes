package com.vstl;

public class SplitString {

	public void doSplit()
	{
		String s1="Verve Square technology";  
		String[] words=s1.split("\\s");    
		for(String w:words){  
		System.out.println(w);
		}
	}
	public static void main(String[] args) {
		SplitString objSplitString=new SplitString();
		objSplitString.doSplit();

	}

}
