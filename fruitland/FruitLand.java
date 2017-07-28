package com.siriuscom.fruitland;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FruitLand {

	public static void main(String[] args) {
		
		int currentDate = getCurrentDate();
		int n = 0;
		
		if (isEven(currentDate)) {
			n = currentDate/2;
		} else if (isPrime(currentDate)) {
			n = currentDate;
		} else {
			n = (currentDate+1)/2;
		}
		System.out.println("Today's number of random sailors: " + n);
	}
	

	public static boolean isPrime(int number) {
		 
	    if (number%2 == 0) {
	    	return false;							// check if n is a multiple of 2
	    }  	
	    for(int i=3; i*i <= number; i+=2) {					 // if not, then just check the odds
	        if(number%i==0)
	        	return false;
	    }  
	    return true;
	}
	
	public static boolean isEven(int number) {
		if (number%2 == 0) {
	    	return true;									
	    }
		return false; 
	}
	
	public static int getCurrentDate() {
		
		Calendar calendar = new GregorianCalendar();
		return calendar.get(Calendar.DATE);
	
		
		
	}
}
