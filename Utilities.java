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
	 
	 String[] strArray = {"Patil", "Pujari", "Aavate","Kakde", "Naik", "Kote", "Wankar"};
     int intRes = random.nextInt(strArray.length);
     return strArray[intRes];
    
 }
 public String getRandomStrings(int length)
 {
   String strValue ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstvuwxyz";
   String randomString="";
   for(int index=0;index < length ;index++)
   {
       int intNum= (int) Math.floor((Math.random()*strValue.length()));
       randomString +=strValue.substring(intNum, intNum+1);
   }
   return randomString;
 }
  //Email
  
 public String getRandomEmaiId() 
 {
	 String names[] = {"@gmail.com","@yahoo.com","@verve-square.com"};
	 String strEmail = (names[new Random().nextInt(names.length)]);
	 return strEmail;
 }
 public String getRandomNumber()
 {
	 String strMobileNum[]={"9","8","7"};
	 String strNum=strMobileNum[new Random().nextInt(strMobileNum.length)];
	return strNum;
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
	 int intMax=2016;
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




