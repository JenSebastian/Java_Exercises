package com.siriuscom.generics;

import java.util.Arrays;
import java.util.List;

public class MaximalElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 10, 35, 33, 65, 88, 56, 2, 4);
		System.out.println(getMaximalElement(list, 0, 4));
	}
	
	public static int getMaximalElement(List<Integer> list, int begin, int end) {
		int max = Integer.MIN_VALUE;
		
		for (int i = begin; i <= end; i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;
	}

}
