package com.vstl;

public class StringMethod {
	public void equalsExample()
	{
		String strVal1="Verve-square-technology";  
		String strVal2="Verve-square-technology";  
		String strVal3="VERVE-SQUARE-TECHNOLOGY";  
		String strVal4="Verve technology";  
		System.out.println(strVal1.equals(strVal2)); 
		System.out.println(strVal1.equals(strVal3));
		System.out.println(strVal1.equals(strVal4));
		System.out.println("==========================================");
	}
	public void doEqualIgnorance()
	{
		String strVal1="Verve-square-technology";  
		String strVal2="VERVE-SQUARE-TECHNOLOGY";  
		String strVal3="Verve technology"; 
		System.out.println(strVal1.equalsIgnoreCase(strVal2)); 
		System.out.println(strVal1.equalsIgnoreCase(strVal3));
		System.out.println("==========================================");
	}
	public void doContainsExample()
	{
		String strVal="Java is platform independent";  
		System.out.println(strVal.contains("platform"));  
		System.out.println(strVal.contains("JAVA"));  
		System.out.println(strVal.contains(" "));  
		System.out.println("==========================================");
	}
	public void doConcatExample()
	{
	    String strVal1 = "Verve";  
        String strVal2 = "Square";  
        String strVal3 = "Technology";  
        // Concatenating Space among strings  
        String strVal4 = strVal1.concat(" ").concat(strVal2).concat(" ").concat(strVal3);  
        System.out.println(strVal4);  
        System.out.println("==========================================");
	}
	public void doLength()
	{
		String strVal1="Automation";
		System.out.println("string length is: "+strVal1.length());	
		System.out.println("==========================================");
	}
	public void toLowerCase()
	{
		String strVal="JAVA IS PLATFORM INDEPENDENT";  
		String strLower=strVal.toLowerCase();  
		System.out.println(strLower);
		System.out.println("==========================================");
	}
	public void toUpperCase()
	{
		String strVal="java is platform independent";  
		String strUpper=strVal.toUpperCase();  
		System.out.println(strUpper);
		System.out.println("==========================================");
	}
	
	
}


