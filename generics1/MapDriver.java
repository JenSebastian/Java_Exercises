package com.siriuscom.generics;

public class GenericsDriver {

	public static void main(String[] args) {
		Map map = new Map("Year", "Car");
		Map map2 = new Map(1989, "GT-R");
		Map map3 = new Map(1969, "Capri");
		
		System.out.println(map);
		System.out.println(map2);
		System.out.println(map3);

	}

}
