package com.siriuscom.exceptions;

/*
 * Write a program to check whether a derived class constructor can catch exception 
 * thrown by base class constructor?
 */

public class ExceptionHandlingTwo {

}



class BaseException {
	
	public BaseException() throws Exception {
		
	}
}

class DerivedException extends BaseException {
	
	public DerivedException() {
		super();

		try {
			//NO, because super call must be the first line 
		} catch (Exception e) {
			System.out.println("Exception caught");
		} 
	}
}
