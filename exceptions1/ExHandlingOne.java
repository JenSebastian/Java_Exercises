package com.siriuscom.exceptions;

import java.io.IOException;

/*
 * Create a class with a method throwing an object of class IOException. 
 * Neither catch this object nor use throws clause. Test and see the result.
 */


public class ExceptionHandingOne {

	public static void main(String[] args) {
		exceptionMethod();
	}
	
	
	public static void exceptionMethod() {
		
		throw new IOException("IO Error"); 
	}
}
