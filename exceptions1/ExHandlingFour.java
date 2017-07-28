package com.siriuscom.exceptions;

import java.util.Scanner;
/*
 *  Write a program to take care of Number Format Exception if users enters values other that 
 *  integer for calculating average of marks ten students. Do not allow program to terminate but
 *   again continue with program after giving respective messgae to User. In the same program 
 *   wrte your own exception classes to tale care of Negative values and values out of range i.e
 *    other than in the range of 0-100 and do not allow program to terminate to terminate.

 */

public class ExceptionHandlingFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(count < 10) {
			try {
				System.out.println("Enter students marks");
				int marks = getNextNumber(sc);
				count++;
			} catch (NegativeNumberException nne) {
				System.out.println("You entered a negative number");
			} catch (OutOfRangeNumberException oore) {
				System.out.println("You entered an out of range number");
			} catch (Exception e) {
				System.out.println("Enter a valid number");
			}
			
		}
	}
	
	
	public static int getNextNumber(Scanner sc) throws Exception {
		String value = sc.nextLine();
		int averageValue = Integer.parseInt(value);
		
		if (averageValue < 0) {
			throw new NegativeNumberException();
		} else if (averageValue > 100){
			throw new OutOfRangeNumberException();
		} else {
			return averageValue;
		}
	}
	
	
}


class NegativeNumberException extends Exception {
	
}

class OutOfRangeNumberException extends Exception {
	
}
