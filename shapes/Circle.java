package com.siriuscom.shapes;

public class Circle implements Shape2D<Double>{

	private int radius;
	private double pi;
	
	public Circle(int radius, double pi) { 
		this.radius = radius;
		this.pi = pi;
	}
	
	
	@Override
	public Double calculateArea() {
		double areaCircle = (pi * (radius*radius));
		return areaCircle;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public double getPi() {
		return pi;
	}


	public void setPi(double pi) {
		this.pi = pi;
	}


}
