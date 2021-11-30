package com.generic;

import java.util.Random;

public class Utilities {
	 Random random = new Random();
	
 public void getRandomFirstName()
 {
	 
	 String[] strArray = { "Divya", "Sonali", "Nikhil", "Pradnya","Tanush", "Kanchan", "Soham", "Rahul" };
	 int intRes = random.nextInt(strArray.length);
     System.out.println( strArray[intRes]);
 }
 public void getRandomSurname()
 {
	 
	 String[] strArray = { "Bulgunde", "Patil", "Pujari", "Aavate","Kakde", "Naik", "Kote", "Wankar" };
     int intRes = random.nextInt(strArray.length);
     System.out.println(strArray[intRes]);
 }
 public void getRandomMobileNumOrEmailId()
 {
	 String[] strArray = { "neha.patil@gmail.com", "pradnya.wankar@gmail.com", "8421521218", "rahul.kote@gmail.com","9730815169", "9518977336", "kanchan.dhande@gmail.com" };
     int intRes = random.nextInt(strArray.length);
     System.out.println(strArray[intRes]);
 }
 public void getNewPassword()
 {
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

