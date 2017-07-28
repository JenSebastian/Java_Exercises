package com.siriuscom.phones;

import java.util.LinkedList;
import java.util.Queue;

public class Driver {

	public static void main(String[] args) {
		Phone a = new Nexus("Red", 1);
		Phone b = new iPhone("Gray", 2);
		Phone c = new Sony("black", 4);
		Phone d = new Samsung("white", 3);
		Phone e = new Micromax("rosegold", 2);
		Phone f = new Samsung("green", 3);	
		Phone g = new Micromax("yellow", 4);
		Phone h = new iPhone("brown", 9);
		Phone i = new Micromax("teal", 2);
		Phone j = new Nexus("navy", 3);
		
//		
//		Phone[] batch = {a, b, c, d, e};
//		Phone[] batch2 = {f, g, h, i, j};
//		
//		Phone[][] batches = {batch, batch2};
		
		LinkedList<Phone> phones = new LinkedList<>();
		phones.add(a);
		phones.add(b);
		phones.add(c);
		phones.add(d);
		phones.add(e);

	
		QualityChecker quality = new QualityChecker();
			quality.checkQuality(phones);
			
		phones.clear();
		
		phones.add(f);
		phones.add(g);
		phones.add(h);
		phones.add(i);
		phones.add(j);
		
		quality.checkQuality(phones);


	}

}
