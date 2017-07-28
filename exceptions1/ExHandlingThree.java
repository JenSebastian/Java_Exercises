package com.siriuscom.exceptions;

import java.util.Scanner;

/*Write a program such that user is repeatedly asked for the numerator and the divisor. 
 * For each set of data, the program prints out the result or an informative error message 
 * if there is problem
	a. The Program continues looping, even if there is problem
	b. Exit the loop when data entered for the numerator start with characters "q" or "Q". 
	Don't print out an error message in this case
*/

public class ExceptionHandingThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Enter your numerator");
				int numerator = getNextNumber(sc);
				System.out.println("Enter your divisor");
				int divisor = getNextNumber(sc);
				System.out.println("Answer is: " + numerator/divisor);
			} catch (ArithmeticException ae) {
				System.out.println("Divisor cannot be 0");
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter valid numbers");
			} catch (Exception e) {
				break;
			}
			
		}
		
		sc.close();
		
	}
	
	public static int getNextNumber(Scanner sc) throws Exception {
		String value = sc.nextLine();
		if ("q".equalsIgnoreCase(value)) {
			throw new Exception("Quit");
		} else {
			return Integer.parseInt(value);
		}
	}
}
