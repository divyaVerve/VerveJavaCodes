package com.generic;

import java.util.Random;

public class Utilities {
	 Random random = new Random();
	
 public String getRandomFirstName()
 {
	 
	 String[] strArray = { "Divya", "Sonali", "Nikhil", "Pradnya","Tanush", "Kanchan", "Soham", "Rahul" };
	 int intRes = random.nextInt(strArray.length);
	return strArray[intRes];
	 
    
 }
 public String getRandomSurname()
 {
	 
	 String[] strArray = { "Bulgunde", "Patil", "Pujari", "Aavate","Kakde", "Naik", "Kote", "Wankar" };
     int intRes = random.nextInt(strArray.length);
     return strArray[intRes];
    
 }
 public String getRandomStrings(int length)
 {
   String strValue ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPZXCVBNMLKJHGFDSA";
   String randomString="";
   for(int index=0;index < length ;index++)
   {
       int rnum= (int) Math.floor((Math.random()*strValue.length()));
       randomString +=strValue.substring(rnum, rnum+1);
   }
   return randomString;
 }
  //Email
  
 public String getRandomEmaiId() 
 {
	 String names[] = { "@gmail.com"};
	 String strEmailormobile = (names[new Random().nextInt(names.length)]);
	 return strEmailormobile;
 }
 public String getRandomNumber()
 {
	
	 String names[] = { "9"};
	 String strEmailormobile = (names[new Random().nextInt(names.length)]);
	 return strEmailormobile;
 }
 public long getRandomMobileNumber(int length)
 {
	 
	 char[]Number=new char[9];
	 Number[0]=(char) ((char)random.nextInt(9)+'1');
	 for(int index=1;index<Number.length;index++)
	 {
		 Number[index]=(char)(random.nextInt(10)+'0');
	 }
	
	  return Long.parseLong(new String(Number));
	  
 }

 public void getNewPassword()
 {
	// String[] strArray = { "Verve@567", "Tech#34", "priya#765", "87home","dream6@", "10690", "S@fg56", "hkh@@" };
	// int intRes = random.nextInt(strArray.length);
    // System.out.println(strArray[intRes]);
	 String strPassword="Verve@57";
	 System.out.println(strPassword);
 }
 public void getRandomDay()
 {
	 int intMax=31;
	 int intMin=1;
     int intRes = random.nextInt(intMax-intMin)+intMin;
     System.out.println(intRes);
 }
 public void getRanDomMonth()
 {
	 String[] strArray = { "Jan", "Feb", "Mar", "Apr","May", "Jun", "Jul","Aug","Sep","Oct","Nov","Dec"};
	 int intRes = random.nextInt(strArray.length);
     System.out.println( strArray[intRes]);
 }
 public void getRandomYear()
 {
	 int intMax=2017;
	 int intMin=1905;
     int intRes = random.nextInt(intMax-intMin)+intMin;
     System.out.println(intRes);
 }
 public void getRandomGender()
 {
	 String[] strArray = {"Female","Male"};
	 int intRes = random.nextInt(strArray.length);
     System.out.println( strArray[intRes]);
 }
 
	 
}




