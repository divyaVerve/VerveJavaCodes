package com.generic;

import java.util.Random;

public class Utilities5 {

	 Random random = new Random();
	 public String getRandomFromCityName() {
		 String names[] = { "Nagpur" };
		 String strname = (names[new Random().nextInt(names.length)]);
		 return strname;
		 }
		 //Random ToCity
		 public String getRandomToCityName() {
		 String names[] = {"Pune" };
		 String toCity = (names[new Random().nextInt(names.length)]);
		 return toCity;



		 }
}
