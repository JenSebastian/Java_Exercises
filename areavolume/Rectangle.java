package com.siriuscom.areavolume;

public class Rectangle implements AreaVolumeCalculator {

	private int length;
	private int width;
	private int height;
	
	public Rectangle() {
		this.length = 3;
		this.width = 5;
		this.height = 2;
	}
	
	@Override
	public void calculateArea() {
		System.out.println(length*width);
		
	}

	@Override
	public void calculateVolume() {
		System.out.println(length*width*height);
		
	}

}
