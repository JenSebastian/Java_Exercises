package com.siriuscom.phones;

public class iPhone extends Phone{
	
	public iPhone(String color, int numOfCameras) {							//constructor
		super(color, numOfCameras);	
		
	}
	
	public void setColorAndNumOfCameras() {            //overriding
		System.out.println("iPhone is " + this.getColor() + " and has " + this.getNumOfCameras() + " cameras.");
	}



}
