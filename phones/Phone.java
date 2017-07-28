package com.siriuscom.phones;

public class Phone {

	private int numOfCameras;				
	private String color;
	
	public Phone(String color, int numOfCameras) {						//Constructor
		this.setColor(color);
		this.setNumOfCameras(numOfCameras);
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getNumOfCameras() {
		return numOfCameras;
	}

	public void setNumOfCameras(int numOfCameras) {
		this.numOfCameras = numOfCameras;
	}

	public void setColorAndNumOfCameras() {			
		System.out.println("Phone is " + this.getColor() + " and has " + this.getNumOfCameras() + " camera");
	}


	
}
