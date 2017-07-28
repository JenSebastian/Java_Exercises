package com.siriuscom.library;

public class Book extends Media{

	private String publisher;
	private int numOfPages;
	
	public Book(String publisher, int numOfPages, int idNumber, String name) {
		this.publisher = publisher;
		this.numOfPages = numOfPages;
		super.idNumber = idNumber;
		super.name = name;
		
	}
	
	public String toString() {
		return publisher + ", " + numOfPages + ", " + idNumber + ", " + name;
		
	}
}
