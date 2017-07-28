package com.siriuscom.phones;

public class Samsung extends Phone{

	public Samsung(String color, int numOfCameras) {							//constructor
		super(color, numOfCameras);	
		
	}
	
	public void setColorAndNumOfCameras() {            //overriding
		System.out.println("Samsung is " + this.getColor() + " and has " + this.getNumOfCameras() + " cameras.");
	}
	

}
