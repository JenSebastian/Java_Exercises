package com.siriuscom.phones;

import java.util.LinkedList;
import java.util.Queue;

public class QualityChecker {

	public void checkQuality(LinkedList<Phone> phones) {
		if (phones.size() == 5) {
			for (int i = 0; i < phones.size(); i++) {
				phones.get(i).setColorAndNumOfCameras();
			}
		}
		System.out.println("------");
	}
}
