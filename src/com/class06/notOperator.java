package com.class06;

public class notOperator {

	public static void main(String[] args) {
		
		boolean rain=false;
		if (!rain) {
			System.out.println("I will go to the park");
		}
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		boolean traffic=true;
		
		if (!traffic) {
			System.out.println("I will come on time");
		}
		 String day="Friday";
		 
		 if (!day.equals("Friday")) {
			 System.out.println("Today is not Friday");
		 }
		
		 boolean homework=false;
		 if(!homework) {
			 System.out.println("I will be happy");
		 }
		 
		 
	}

}