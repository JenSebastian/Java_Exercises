package com.siriuscom.library;

public class Newspaper extends Media {
	
	private String newspaperState;
	
	public Newspaper(String newspaperState, int idNumber, String name) {
		this.newspaperState = newspaperState;
		super.idNumber = idNumber;
		super.name = name;
		
	}

}
