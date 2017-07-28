package com.siriuscom.fruitland;

import java.util.Arrays;
import java.util.List;

/*
 * Write a generic method to count the number of elements in a collection that have a 
 * specific property (for example, odd integers, prime numbers, palindromes).
 * 
 */



public class SpecificProperty {  				

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1, 3, 2, 5);
		int primeNumbers = 0;
		int oddNumbers = 0;
		for (int i : list) {
			if(isPrime(i)) {
				primeNumbers++;
			}
			if (isOdd(i)) {
				oddNumbers++;
			}
		}
		System.out.println("Prime: " + primeNumbers + ". Odds: " + oddNumbers);
		
		
	}
	
	public static boolean isPrime(int number) {						//checking for prime
		 
	    if (number%2==0) {
	    	return false;									
	    }  	
	    for(int i=3; i*i <= number; i+=2) {					 
	        if(number%i==0)
	        	return false;
	    }  
	    return true;
	}
	
	public static boolean isOdd(int number) {						//checking if odd
		if (number%2==0) {
	    	return false;									
	    }
		return true; 
	}

}
