package com.accessSpecifiers;

import com.accessModifiers.Facebook_1;

public class Facebook_3 extends Facebook_1{

	Facebook_1 objFacebook_1=new Facebook_1();
	public void doDisplay3()
	{
		System.out.println("Post on facebook:"+objFacebook_1.strPost);
		 System.out.println("Enter link:"+this.strWeb);
		 
 //we cannot able to access password and bio beacause they are private and default
		//System.out.println("Enter password:"+objFacebook_1.intPassword);
	   //System.out.println("Enter Bio:"+this.strBio);
	}
}
