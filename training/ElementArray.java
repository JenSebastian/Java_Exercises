package com.siriuscom.training;

public class ElementArray<T extends Comparable<T>> {

	public int compareElements(T[] array, T elem) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(elem) > 0) {
				count++;
			}
		}
		return count;
		
	}
	
}



//#4
// 1. List -- random class -- employeeList.get(new Random().nextInt(list.size())); 
// 2. Set -- create an array, create hashset called "set" -- set.add(each name), duplicate names will not be added 
// 3. List -- ArrayList -- Collections.frequency(employeeArray, "Jen"))
// 4. Queue -- queue.add()-- queue.remove() -- will pop the first person that was added
