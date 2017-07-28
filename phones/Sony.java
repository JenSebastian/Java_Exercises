package com.siriuscom.phones;

public class Sony extends Phone{

	public Sony(String color, int numOfCameras) {							//constructor
		super(color, numOfCameras);	
		
	}
	
	public void setColorAndNumOfCameras() {            //overriding
		System.out.println("Sony is " + this.getColor() + " and has " + this.getNumOfCameras() + " cameras.");
	}


}
