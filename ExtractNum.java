package com.practice;

public class ExtractNum {

	public static void main(String[] args) {
		String str="rhgh56hf89";

    String nums = str.replaceAll("[^0-9 ]", "").replaceAll(" +", " ").trim();
    System.out.println("add:"+nums);
	}

}
