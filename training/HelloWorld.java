package com.siriuscom.training;

/**
 * @author IEUser
 *
 */
public class HelloWorld {

	String msg;   //declare var with type - view every var as a state of an obj - string is not primitive, its an obj
				  // types of var, this is instance var - holds value for an instance of an obj. thers static, etc
	static int numOfMsg = 0; // static var: it will be shared across all the instances of a class, if u change the valye in a particular instance of an object, it will be automatically chagned in other instances
	
	
	
	
	public static void main(String[] args) {
		
		
		
		//System.out.println("hello World");
		
		numOfMsg++; //displays and then increments.
		++numOfMsg; //pre increment will change it and assign it back to memory - increments and then displays
		//+numOfMsg; //it will negate the value; if the numOfMsg is positive it will make it negative
		//&& // if the first statement is false, it wont execute at all
		//System.out.println((10 < 9)? "true" : "false"); //simple if else condition - not used often
		//switch and if else, performnce wise, swithc is better
		//enhanced for loops; just provide the var and list: for (int item : numbers)
		
	}

}
