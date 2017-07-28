package com.siriuscom.library;

public class Video extends Media {

	private int videoLength;
	private int videoRating;
	
	public Video(int videoLength, int videoRating, int idNumber, String name) {
		this.videoLength = videoLength;
		this.videoRating = videoRating;
		super.idNumber = idNumber;
		super.name = name;
		
	}
	
}
