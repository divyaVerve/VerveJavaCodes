package com.accessModifiers;

public class Facebook_2{

	Facebook_1 objFacebook_1=new Facebook_1();
	public void doDisplay2()
	{
		 System.out.println("Post on facebook:"+objFacebook_1.strPost);
		 System.out.println("Enter link:"+objFacebook_1.strWeb);
		  System.out.println("Enter Bio:"+objFacebook_1.strBio);
		  
	//we cannot able to accesss password because it is private 
		// System.out.println("Enter password:"+objFacebook_1.strPassword);
		  
	}
}
