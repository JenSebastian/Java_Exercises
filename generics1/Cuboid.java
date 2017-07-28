package com.siriuscom.generics;

/*
1. Create a generic class called Cuboid that will store three dimension of a cuboid. 
Add methods to set and get the length, breadth and Height. Add a method public String toString 
that will return all the dimensions. The type of the dimensions will be decided at construction 
of cuboid instance.

2. Modify the Generic class Cubiod  so that it only accepts Numbers. Add a method with th following definition and complete its body.

public double getVolume(){
    
}

*/

public class Cuboid<T extends Number> {
	
	private T length;
	private T breadth;
	private T height;
	
	public Cuboid(T length, T breadth, T height) {
		this.setLength(length);
		this.setBreadth(breadth);
		this.setHeight(height);
	}
	
	
	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getBreadth() {
		return breadth;
	}

	public void setBreadth(T breadth) {
		this.breadth = breadth;
	}

	public T getHeight() {
		return height;
	}

	public void setHeight(T height) {
		this.height = height;
	}
	
	
	
	public double getVolume(double length, double breadth, double height){
		double volumeOfCuboid =  length *  breadth *  height;
		return volumeOfCuboid;
	    
	}
	
	public String toString() {
		return length + " * " + breadth + " * " + height;
	}
	

}
