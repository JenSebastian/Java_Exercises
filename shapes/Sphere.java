package com.siriuscom.shapes;

public class Sphere implements Shape3D<Double>{

	private int radius;
	private double pi;
	
	public Sphere() { 
		this.radius = 2;
		this.pi = 3.14;
	}
	
	
	@Override
	public Double calculateArea() {
		double areaSphere = (pi * (radius*radius));
		return areaSphere;
	}

	@Override
	public Double calculateVolume() {
		return (4*pi * (radius*radius));
		
	}

}
