package com.siriuscom.shapes;

public class Square implements Shape2D<Integer>{
	private int length;
	private int width;
	
	public Square() {
		int length = 5;
		int width = 6;
	}

	@Override
	public Integer calculateArea() {
		return (length * width);
	
	}
	
	
}
