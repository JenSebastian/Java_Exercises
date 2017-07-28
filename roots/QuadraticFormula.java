package com.siriuscom.roots;

public class QuadraticFormula {

	public static void main(String[] args) {
		printRoots(1, 3, -4);
		

	}
	
	public static void printRoots(double a, double b, double c) {
		double root1 = (-b + Math.sqrt(b*b - (4*a*c)))/ (2 * a);
		double root2 = (-b - Math.sqrt(b*b - (4*a*c)))/ (2 * a);
		System.out.println("Root1= " + root1 + " Root2= " + root2);

		
	}

}
