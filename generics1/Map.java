package com.siriuscom.generics;
/*
 3. Create a generic class that stores a Key and a Value and call it a Map.
  This will have one method called toString that will return a strign thats hows the key and 
  the value. Teh Key and the value can be of any type. test your calls by adding the following 
  three years and an associcated iconic car to  to a seperate instance of each. You woll end up 
  with three instances of Map storing the following data:


|| Year || Car ||
|| 1989 || GT-R ||
|| 1969 || Capri ||

 */

public class Map<K,V> {

	private K key;
	private V value;
	
	public Map (K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public String toString() {
		
		String kvPair = "||" + key + " || " + value + "||";
		return kvPair;
		
	}
}
