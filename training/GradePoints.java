package com.siriuscom.training;

public class GradePoints {

	public static void main(String[] args) {
		
		int point = 91;
		
		if (point<49.5) {
			System.out.println(5.0);
			return;
		} else if (point > 49.5 && point < 59.5) {
			System.out.println(4.7);
			return;
		} else if (point > 60 && point < 64.5) {
			System.out.println(4.0);
			return;
		} else if (point > 65 && point < 69.5) {
			System.out.println(3.7);
			return;
		} else if (point > 70 && point < 74.5) {
			System.out.println(3.3);
			return;
		} else if (point > 75 && point < 80) {
			System.out.println(3.0);
			return;
		} else if (point > 80 && point < 84.5) {
			System.out.println(2.7);
			return;
		} else if (point > 85 && point < 89.5) {
			System.out.println(2.3);
			return;
		} else if (point > 90 && point < 94.5) {
			System.out.println(2.0);
			return;
		} else if (point > 95 && point < 99.5) {
			System.out.println(1.7);
			return;
		} else if (point > 100 && point < 104.5) {
			System.out.println(1.3);
			return;
		} else if (point > 105 && point < 120) {
			System.out.println(1.0);
			return;
			
		}

	}

	
}
