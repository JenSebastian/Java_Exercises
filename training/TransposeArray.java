package com.siriuscom.training;

public class TransposeArray {

	public static void main(String[] args) {
		int[][] myArray = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.print("\n");
		
		}
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		if (myArray.length > 0) {
			for (int i = 0; i < myArray[0].length; i++) {
				for (int j = 0; j < myArray.length; j++) {
					System.out.print(myArray[j][i] + " ");
				}
				System.out.print("\n");
			}
		}

	}

}
