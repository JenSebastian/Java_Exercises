package com.siriuscom.phones;

public class Nexus extends Phone {

	
	public Nexus(String color, int numOfCameras) {							//constructor
		super(color, numOfCameras);	
		
	}


	public void setColorAndNumOfCameras() {            //overriding
		System.out.println("Nexus is " + this.getColor() + " and has " + this.getNumOfCameras() + " cameras.");
	}
	
}
