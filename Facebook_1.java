package com.accessModifiers;

public class Facebook_1 {
  public String strPost="public";
  private int intPassword=751995;
  protected String strWeb="Facebook";
  String strBio="Profile";
  
  public void doDisplay1()
  {
	  System.out.println("Post on facebook:"+strPost);
	  System.out.println("Enter password:"+intPassword);
	  System.out.println("Enter link:"+strWeb);
	  System.out.println("Enter Bio:"+strBio);
  }
}
