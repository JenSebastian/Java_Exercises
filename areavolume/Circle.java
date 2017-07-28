package com.siriuscom.areavolume;

public class Circle implements AreaVolumeCalculator{

	private int radius;
	private double pi;
	
	public Circle() {
		this.radius = 2;
		this.pi = 3.14;
	}


	@Override
	public void calculateArea() {
		System.out.println(pi * (radius*radius));
		
	}

	@Override
	public void calculateVolume() {
		System.out.println(4 * pi* (radius*radius*radius));
		
	}

}
