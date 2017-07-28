package com.siriuscom.training;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 5, 234, 12};
		Integer elem = 3;
		
		
		ElementArray a = new ElementArray();
		System.out.println(a.compareElements(array, elem));
		System.out.println("--------");
		
		
		
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		numList.add(6);
		
		RandomElement random = new RandomElement();
		random.printRandomArg(numList);
		
		System.out.println("Stream:");
		
		numList.stream().forEach((i) -> {
			System.out.println(i);	
				
		});
		
	}

}
