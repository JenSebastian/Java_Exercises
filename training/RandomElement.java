package com.siriuscom.training;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomElement {

	
	
	public void printRandomArg(ArrayList<Integer> numArray) {
		
		Collections.shuffle(numArray);
		for (Integer i : numArray) {
			System.out.println(i);
		}
			
	}
}
