package com.siriuscom.shapes;

public class Rectangle implements Shape2D<Integer> {

	private int length;
	private int width;
	
	public Rectangle() {
		int length = 3;
		int width = 4;
	}
	
	@Override
	public Integer calculateArea() {
		return (length * width);
		
	}

}
