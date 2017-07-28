package com.siriuscom.phones;

public class Micromax extends Phone {

	public Micromax(String color, int numOfCameras) {							//constructor
		super(color, numOfCameras);	
		
	}
	
	public void setColorAndNumOfCameras() {            //overriding
		System.out.println("Micromax is " + this.getColor() + " and has " + this.getNumOfCameras() + " cameras.");
	}
	
	
}
